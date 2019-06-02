package com.sunsheen.metadataserver.interfaceservice.common;

import com.google.common.collect.Maps;
import com.google.protobuf.Any;
import com.sunsheen.metadatacom.common.util.DateUtils;
import com.sunsheen.metadatacom.grpc.common.GrpcResultEnum;
import com.sunsheen.metadatacom.grpc.common.GrpcResultVO;
import com.sunsheen.metadatacom.grpc.service.grpccommon.*;
import com.sunsheen.metadataserver.interfaceservice.service.InterfaceServiceService;
import com.sunsheen.metadataserver.systemmanage.usermanage.pojo.TsUserDO;
import com.sunsheen.metadataserver.systemmanage.usermanage.service.TsUserService;
import io.grpc.stub.StreamObserver;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @description: grpc服务端获取数据公共类
 * @author: zhangxuejiao
 * @createDate: 2019/5/30 16:59
 */
public class ServerServiceHandler<T> implements Serializable {

    /**
     * gprc服务端获取数据
     * @param t 传参对象
     * @param responseObserver
     * @param interfaceServiceService 对内服务接口
     * @param tsUserService 用户业务层接口
     */
    public void getDbData(T t, StreamObserver<ResponseData> responseObserver,
                        InterfaceServiceService interfaceServiceService, TsUserService tsUserService){
        // 1.初始化对象
        // grpc响应结果对象
        ResponseData.Builder builderResponseData = ResponseData.newBuilder();

        // 用户校验拦截器对象
        PreProcessInterceptor preProcessInterceptor = new PreProcessInterceptor();
        // 登录用户身份校验结果对象
        GrpcResultVO userResultVO = new GrpcResultVO();
        // sql相关的表结构信息对象
        GrpcResultVO sqlResultVO = new GrpcResultVO();
        // 返回的数据库数据信息对象
        List<Map<String, Object>> dbDataList = new ArrayList<>();

        // 接口调用记录map集合
        Map<String, String> recordMap = Maps.newHashMap();

        // 2.判断传参类型
        if (t instanceof DatumCodeRequest){
            DatumCodeRequest request = (DatumCodeRequest) t;
            // 1) 获取登录用户身份校验结果
            userResultVO = preProcessInterceptor.userSecurity(request.getUserPwdRequest().getUserId(), request.getUserPwdRequest().getPwd(), tsUserService);
            // 2) 获取sql相关的表结构信息
            TsUserDO tsUserDO = (TsUserDO) userResultVO.getData();
            sqlResultVO = preProcessInterceptor.accessAuthorize(tsUserDO.getTsUserId(), request.getUserPwdRequest().getInterfaceId(), interfaceServiceService);
            // 3) 获取数据信息
            Map<String, Object> sqlData = (Map<String, Object>) sqlResultVO.getData();
            String tableName = (String) sqlData.get("tableName");
            List<String> sqlColumns = (List<String>) sqlData.get("sqlColumns");
            List<Map<String, String>> sqlParams = (List<Map<String, String>>) sqlData.get("sqlParams");
            recordMap = (Map<String, String>) sqlData.get("recordMap");
            sqlParams.get(0).put("VALUE", request.getDatumCode());
            dbDataList = interfaceServiceService.getDbData(tableName, sqlColumns, sqlParams);
        }else if (t instanceof UserPwdRequest){
            UserPwdRequest request = (UserPwdRequest) t;
            // 1) 获取登录用户身份校验结果
            userResultVO = preProcessInterceptor.userSecurity(request.getUserId(), request.getPwd(), tsUserService);
            // 2) 获取sql相关的表结构信息
            TsUserDO tsUserDO = (TsUserDO) userResultVO.getData();
            sqlResultVO = preProcessInterceptor.accessAuthorize(tsUserDO.getTsUserId(), request.getInterfaceId(), interfaceServiceService);
            // 3) 获取数据信息
            Map<String, Object> sqlData = (Map<String, Object>) sqlResultVO.getData();
            String tableName = (String) sqlData.get("tableName");
            List<String> sqlColumns = (List<String>) sqlData.get("sqlColumns");
            List<Map<String, String>> sqlParams = (List<Map<String, String>>) sqlData.get("sqlParams");
            recordMap = (Map<String, String>) sqlData.get("recordMap");
            dbDataList = interfaceServiceService.getDbData(tableName, sqlColumns, sqlParams);
        }

        // 3.登录用户身份校验
        if (userResultVO.getCode().equals(GrpcResultEnum.CALL_SUCCEED.getCode())){
            builderResponseData.setReturnCode(GrpcResultEnum.CALL_SUCCEED.getCode());

            // sql相关的表结构信息校验
            if (sqlResultVO.getCode().equals(GrpcResultEnum.CALL_SUCCEED.getCode())){
                DbData.Builder builderDbData = DbData.newBuilder();
                // 获取数据存储方式转换（proto中的Any）
                dbDataList.forEach(x -> {
                    TableMap.Builder builderTableMap = TableMap.newBuilder();
                    Map<String, Any> anyMap = Maps.newHashMap();
                    Set<Map.Entry<String, Object>> entrySet = x.entrySet();
                    entrySet.forEach(y -> {
                        if (y.getKey().equals("version")){
                            IntResponse.Builder builderIntResponse = IntResponse.newBuilder();
                            if (y.getValue() != null){
                                IntResponse intResponse = builderIntResponse.setIntValue(Integer.parseInt(y.getValue().toString())).build();
                                anyMap.put(y.getKey(), Any.pack(intResponse));
                            }else{
                                anyMap.put(y.getKey(), Any.pack(builderIntResponse.build()));
                            }
                        }else if (y.getKey().contains("DATE")){
                            LongResponse.Builder builderLongResponse = LongResponse.newBuilder();
                            if (y.getValue() != null){
                                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                String timeStr = sdf.format(y.getValue());
                                long timeLong = 0;
                                try {
                                    timeLong = sdf.parse(timeStr).getTime();
                                } catch (ParseException e) {
                                    e.printStackTrace();
                                }

                                LongResponse longResponse = builderLongResponse.setLongValue(timeLong).build();
                                anyMap.put(y.getKey(), Any.pack(longResponse));
                            }else {
                                anyMap.put(y.getKey(), Any.pack(builderLongResponse.build()));
                            }
                        }else {
                            StringResponse.Builder builderStringResponse = StringResponse.newBuilder();
                            if (y.getValue() != null){
                                StringResponse stringResponse = builderStringResponse.setStringValue((String) y.getValue()).build();
                                anyMap.put(y.getKey(), Any.pack(stringResponse));
                            }else {
                                anyMap.put(y.getKey(), Any.pack(builderStringResponse.build()));
                            }
                        }
                    });
                    builderTableMap.putAllMapAny(anyMap);
                    builderDbData.addTableMap(builderTableMap);
                });
                builderResponseData.setDbData(builderDbData);
            }else {
                builderResponseData.setReturnCode(sqlResultVO.getCode());
            }
        }else {
            builderResponseData.setReturnCode(userResultVO.getCode());
        }

        responseObserver.onNext(builderResponseData.build());
        responseObserver.onCompleted();

        // 接口调用记录之调用结束时间
        recordMap.put("C_INVOKE_ENDTIME", DateUtils.getDate("yyyy-MM-dd HH:mm:ss"));
        recordMap.put("C_DATA_NUM", String.valueOf(dbDataList.size()));
        recordMap.put("C_STATUS", String.valueOf(builderResponseData.getReturnCode()));
        interfaceServiceService.saveRecord(recordMap);
    }
}
