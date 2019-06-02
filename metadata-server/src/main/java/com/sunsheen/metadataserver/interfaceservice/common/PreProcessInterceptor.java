package com.sunsheen.metadataserver.interfaceservice.common;

import com.google.common.collect.Maps;
import com.sunsheen.metadatacom.common.util.DateUtils;
import com.sunsheen.metadatacom.common.util.MD5Utils;
import com.sunsheen.metadatacom.grpc.common.GrpcResultEnum;
import com.sunsheen.metadatacom.grpc.common.GrpcResultVO;
import com.sunsheen.metadataserver.interfaceservice.service.*;
import com.sunsheen.metadataserver.systemmanage.usermanage.pojo.TsUserDO;
import com.sunsheen.metadataserver.systemmanage.usermanage.service.TsUserService;
import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @description: grpc服务校验拦截
 * @author: zhangxuejiao
 * @createDate: 2019/5/19 22:37
 */
public class PreProcessInterceptor {

    /**
     * 接口调用记录map集合
     */
    private Map<String, String> recordMap = Maps.newHashMap();

    /**
     * 登录用户身份校验
     * @param userId 登录用户名
     * @param pwd 密码
     * @return 结果集对象
     */
    public GrpcResultVO userSecurity(String userId, String pwd, TsUserService tsUserService){
        // 接口调用记录之调用开始时间
        String cInvokeStarttime = DateUtils.getDate("yyyy-MM-dd HH:mm:ss");
        recordMap.put("C_INVOKE_STARTTIME", cInvokeStarttime);

        // 结果集对象
        GrpcResultVO grpcResultVO = new GrpcResultVO();

        // 用户名缺失
        if (StringUtils.isBlank(userId)){
            grpcResultVO.setCode(GrpcResultEnum.MISSING_USERID.getCode());
            grpcResultVO.setMsg(GrpcResultEnum.MISSING_USERID.getMessage());
            return grpcResultVO;
        }
        // 密码缺失
        if (StringUtils.isBlank(pwd)){
            grpcResultVO.setCode(GrpcResultEnum.MISSING_PASSWORD.getCode());
            grpcResultVO.setMsg(GrpcResultEnum.MISSING_PASSWORD.getMessage());
            return grpcResultVO;
        }
        // 用户不正确
        TsUserDO tsUser = tsUserService.getTsUserByUserId(userId);
        if (tsUser == null){
            grpcResultVO.setCode(GrpcResultEnum.USERID_ERROR.getCode());
            grpcResultVO.setMsg(GrpcResultEnum.USERID_ERROR.getMessage());
            return grpcResultVO;
        }
        // 密码错误
        TsUserDO tsUser2 = tsUserService.getTsUserByUserIdAndPwd(userId, new MD5Utils().getMD5ofStr(pwd));
        if (tsUser2 == null){
            grpcResultVO.setCode(GrpcResultEnum.PASSWORD_ERROR.getCode());
            grpcResultVO.setMsg(GrpcResultEnum.PASSWORD_ERROR.getMessage());
            return grpcResultVO;
        }

        // 调用成功
        grpcResultVO.setCode(GrpcResultEnum.CALL_SUCCEED.getCode());
        grpcResultVO.setMsg(GrpcResultEnum.CALL_SUCCEED.getMessage());
        grpcResultVO.setData(tsUser2);
        return grpcResultVO;
    }

    /**
     * 获取sql 相关的表结构信息
     * @param userId 登录用户id，而非登录用户名
     * @param interfaceId 接口名
     * @return 结果集对象
     */
    public GrpcResultVO accessAuthorize(String userId, String interfaceId, InterfaceServiceService interfaceServiceService){
        // 结果集对象
        GrpcResultVO grpcResultVO = new GrpcResultVO();

        String cIntfTvId = "";
        Map<String, Object> tvInfo = interfaceServiceService.getIntfTvInfoByInterfaceId(interfaceId);
        Map<String, Object> tableInfo = interfaceServiceService.getIntfTableInfo(userId, interfaceId);
        // 处理请求的数据库中没有该接口信息，即接口名不正确
        if (tvInfo == null){
            grpcResultVO.setCode(GrpcResultEnum.INTERFACEID_ERROR.getCode());
            grpcResultVO.setMsg(GrpcResultEnum.INTERFACEID_ERROR.getMessage());
            return grpcResultVO;
        }

        // 用户可以使用哪个表的接口
        if (tableInfo == null){
            cIntfTvId = tvInfo.get("C_INTF_TV_ID").toString();
        }else {
            cIntfTvId = tableInfo.get("C_INTF_TV_ID").toString();
        }

        List<Map<String, String>> sqlParams = interfaceServiceService.getParamsByTvId(cIntfTvId);
        // 参数（条件字段）校验
        if (sqlParams.size() > 0){
            sqlParams.forEach(x -> {
                x.forEach((k, v) -> {
                    if (k.equals("C_PARAM_KEY") && StringUtils.isBlank(v)){
                        grpcResultVO.setCode(GrpcResultEnum.PARAMETER_VALUE_ERROR.getCode());
                        grpcResultVO.setMsg(GrpcResultEnum.PARAMETER_VALUE_ERROR.getMessage());
                    }
                });
            });
            if (grpcResultVO.getCode() != null && grpcResultVO.getCode() == GrpcResultEnum.PARAMETER_VALUE_ERROR.getCode()){
                return grpcResultVO;
            }
        }

        // 要使用增量接口必须使用给使用的用户进行赋权限，否则的话不允许访问增量接口，因为增量接口是基于版本进行控制的，每个用户取数据的最新版本不一样
        if(tableInfo == null){
            grpcResultVO.setCode(GrpcResultEnum.NO_ACCESS_AUTHORITY.getCode());
            grpcResultVO.setMsg(GrpcResultEnum.NO_ACCESS_AUTHORITY.getMessage());
            return grpcResultVO;
        }else {
            // 获取用户使用该接口的数据的版本
            String version = tableInfo.get("c_version") == null ? "" : tableInfo.get("c_version").toString();
            sqlParams.addAll(getIncreaseInfo(version));
        }

        // 返回sql相关的表结构数据
        String tableName = tableInfo == null ? tvInfo.get("C_TABLE_NAME").toString() : tableInfo.get("C_TABLE_NAME").toString();
        String tableId = tableInfo == null ? "" : tableInfo.get("C_INTF_TABLE_ID").toString();
        // 如果用户自定义了需要取的接口的数据的字段信息，则能查询到信息；若用户没有自定义接口的字段信息，则默认取走接口的所有字段信息
        List<String> sqlColumns = new ArrayList<>();
        if (StringUtils.isNotBlank(tableId)) {
            sqlColumns =  interfaceServiceService.getColumsByTableId(tableId);
        }

        Map<String, Object> paramMap = Maps.newHashMap();
        paramMap.put("tableName", tableName);
        paramMap.put("sqlColumns", sqlColumns);
        paramMap.put("sqlParams", sqlParams);

        // 接口使用记录参数
        recordMap.put("C_USER_ID", userId); // 用户id
        recordMap.put("C_INTF_TABLE_ID", tableId); // 用户对应的表ID
        recordMap.put("C_INTF_TV_ID", cIntfTvId); // tv表ID
        paramMap.put("recordMap", recordMap);

        // 调用成功
        grpcResultVO.setCode(GrpcResultEnum.CALL_SUCCEED.getCode());
        grpcResultVO.setMsg(GrpcResultEnum.CALL_SUCCEED.getMessage());
        grpcResultVO.setData(paramMap);
        return grpcResultVO;
    }

    private List<Map<String, String>> getIncreaseInfo(String version){
        List<Map<String, String>> result = new ArrayList<>();
        // 版本为空，表示第一次调用，直接返回所有数据
        if(StringUtils.isNotBlank(version)){
            Map<String, String> update = Maps.newHashMap();
            String[] valueArr = version.split("@");
            update.put("C_PARAM_KEY", "c_updated_date");
            update.put("C_PARAM_OPERATOR", ">=");
            update.put("C_VALUE_PREFIX", "");
            update.put("C_VALUE_SUFFIX", "");
            update.put("C_LOGIC", "AND");
            update.put("VALUE", valueArr[0]);
            result.add(update);

            update = Maps.newHashMap();
            update.put("C_PARAM_KEY", "version");
            update.put("C_PARAM_OPERATOR", ">");
            update.put("C_VALUE_PREFIX", "");
            update.put("C_VALUE_SUFFIX", "");
            update.put("C_LOGIC", "AND");
            update.put("VALUE", valueArr[1]);
            result.add(update);
        }
        return result;
    }

}
