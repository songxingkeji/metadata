package com.sunsheen.metadataclient.interfaceservice.common;

import com.google.common.collect.Maps;
import com.google.protobuf.InvalidProtocolBufferException;
import com.sunsheen.metadatacom.grpc.common.GrpcResultVO;
import com.sunsheen.metadatacom.grpc.service.grpccommon.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @description: grpc客户端获取数据公共类
 * @author: zhangxuejiao
 * @createDate: 2019/5/30 16:51
 */
public class ClientServiceHandler implements Serializable {

    /**
     * 将gprc服务端结果数据进行解析返回
     * @param responseData gprc服务端结果响应对象
     * @return
     */
    public static GrpcResultVO getFinalResult(ResponseData responseData){
        // 结果集对象
        GrpcResultVO grpcResultVO = new GrpcResultVO();
        grpcResultVO.setCode(responseData.getReturnCode());
        // 返回数据映射对象
        List<Map<String, Object>> newDbData = new ArrayList<>();

        // 调用成功
        if (responseData.getReturnCode() == 0){
            responseData.getDbData().getTableMapList().forEach(x -> {
                Map<String, Object> dataMap = Maps.newHashMap();
                x.getMapAnyMap().forEach((k, v) -> {
                    if (k.equals("version")){
                        try {
                            dataMap.put(k, v.unpack(IntResponse.class).getIntValue());
                        } catch (InvalidProtocolBufferException e) {
                            e.printStackTrace();
                        }
                    }else if (k.contains("DATE")){
                        try {
                            dataMap.put(k, v.unpack(LongResponse.class).getLongValue());
                        } catch (InvalidProtocolBufferException e) {
                            e.printStackTrace();
                        }
                    }else {
                        try {
                            dataMap.put(k, v.unpack(StringResponse.class).getStringValue());
                        } catch (InvalidProtocolBufferException e) {
                            e.printStackTrace();
                        }
                    }
                });
                newDbData.add(dataMap);
            });
            grpcResultVO.setData(newDbData);
            System.out.println(newDbData.size()+"=====66666666=======");
        }

        return grpcResultVO;
    }
}
