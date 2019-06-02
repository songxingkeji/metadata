package com.sunsheen.metadataclient.interfaceservice;

import com.sunsheen.metadataclient.interfaceservice.common.ClientServiceHandler;
import com.sunsheen.metadatacom.grpc.common.GrpcResultVO;
import com.sunsheen.metadatacom.grpc.service.datumtypehyp.DatumtypehypServiceGrpc;
import com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData;
import com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest;
import io.grpc.Channel;
import lombok.extern.slf4j.Slf4j;
import net.devh.springboot.autoconfigure.grpc.client.GrpcClient;
import org.springframework.stereotype.Service;

/**
 * @description: grpc客户端之血缘关系信息接口
 * @author: zhangxuejiao
 * @createDate: 2019/5/30 17:34
 */
@Slf4j
@Service
public class DatumtypehypClientGrpcService {

    @GrpcClient("local-grpc-server")
    private Channel serverChannel;

    /**
     * 检索所有的血缘关系信息接口
     * @param userId 用户id
     * @param pwd 用户密码
     * @param interfaceId 接口名
     * @return
     */
    public GrpcResultVO getDatumtypehyp(String userId, String pwd, String interfaceId){
        DatumtypehypServiceGrpc.DatumtypehypServiceBlockingStub blockingStub = DatumtypehypServiceGrpc.newBlockingStub(serverChannel);

        // 获取grpc服务端数据
        ResponseData responseData = blockingStub.getDatumtypehyp(UserPwdRequest.newBuilder()
                .setUserId(userId)
                .setPwd(pwd)
                .setInterfaceId(interfaceId)
                .build());

        // 对获取数据进行解析返回
        GrpcResultVO grpcResultVO = ClientServiceHandler.getFinalResult(responseData);
        return grpcResultVO;
    }
}
