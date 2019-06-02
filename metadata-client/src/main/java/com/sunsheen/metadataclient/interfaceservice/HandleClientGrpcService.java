package com.sunsheen.metadataclient.interfaceservice;

import com.sunsheen.metadataclient.interfaceservice.common.ClientServiceHandler;
import com.sunsheen.metadatacom.grpc.common.GrpcResultVO;
import com.sunsheen.metadatacom.grpc.service.grpccommon.*;
import com.sunsheen.metadatacom.grpc.service.handle.HandleServiceGrpc;
import io.grpc.Channel;
import lombok.extern.slf4j.Slf4j;
import net.devh.springboot.autoconfigure.grpc.client.GrpcClient;
import org.springframework.stereotype.Service;

/**
 * @description: grpc客户端之按资料编码检索总控处理表接口
 * @author: zhangxuejiao
 * @createDate: 2019/5/30 17:37
 */
@Slf4j
@Service
public class HandleClientGrpcService {

    @GrpcClient("local-grpc-server")
    private Channel serverChannel;

    /**
     * 按资料编码检索总控处理表接口
     * @param userId 用户id
     * @param pwd 用户密码
     * @param interfaceId 接口名
     * @param datumCode 资料编码
     * @return
     */
    public GrpcResultVO getHandleByDatumCode(String userId, String pwd, String interfaceId, String datumCode){
        HandleServiceGrpc.HandleServiceBlockingStub blockingStub = HandleServiceGrpc.newBlockingStub(serverChannel);

        // 传参对象赋值
        UserPwdRequest buildUserPwdRequest = UserPwdRequest.newBuilder()
                .setUserId(userId)
                .setPwd(pwd)
                .setInterfaceId(interfaceId)
                .build();
        // 获取grpc服务端数据
        ResponseData responseData = blockingStub.getHandleByDatumCode(DatumCodeRequest.newBuilder()
                .setUserPwdRequest(buildUserPwdRequest)
                .setDatumCode(datumCode)
                .build());

        // 对获取数据进行解析返回
        GrpcResultVO grpcResultVO = ClientServiceHandler.getFinalResult(responseData);
        return grpcResultVO;
    }
}
