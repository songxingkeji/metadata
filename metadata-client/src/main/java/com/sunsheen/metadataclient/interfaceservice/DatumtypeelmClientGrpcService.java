package com.sunsheen.metadataclient.interfaceservice;

import com.sunsheen.metadataclient.interfaceservice.common.ClientServiceHandler;
import com.sunsheen.metadatacom.grpc.common.GrpcResultVO;
import com.sunsheen.metadatacom.grpc.service.datumtypeelm.DatumtypeelmServiceGrpc;
import com.sunsheen.metadatacom.grpc.service.grpccommon.DatumCodeRequest;
import com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData;
import com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest;
import io.grpc.Channel;
import lombok.extern.slf4j.Slf4j;
import net.devh.springboot.autoconfigure.grpc.client.GrpcClient;
import org.springframework.stereotype.Service;

/**
 * @description: grpc客户端之资料编码与数据元关系数据接口
 * @author: zhangxuejiao
 * @createDate: 2019/5/30 17:36
 */
@Slf4j
@Service
public class DatumtypeelmClientGrpcService {

    @GrpcClient("local-grpc-server")
    private Channel serverChannel;

    /**
     * 获取全部的资料编码与数据元关系数据接口
     * @param userId 用户id
     * @param pwd 用户密码
     * @param interfaceId 接口名
     * @return
     */
    public GrpcResultVO getDatumtypeelm(String userId, String pwd, String interfaceId){
        DatumtypeelmServiceGrpc.DatumtypeelmServiceBlockingStub blockingStub = DatumtypeelmServiceGrpc.newBlockingStub(serverChannel);

        // 获取grpc服务端数据
        ResponseData responseData = blockingStub.getDatumtypeelm(UserPwdRequest.newBuilder()
                .setUserId(userId)
                .setPwd(pwd)
                .setInterfaceId(interfaceId)
                .build());

        // 对获取数据进行解析返回
        GrpcResultVO grpcResultVO = ClientServiceHandler.getFinalResult(responseData);
        return grpcResultVO;
    }

    /**
     * 获取指定资料编码与数据元的关系数据接口
     * @param userId 用户id
     * @param pwd 用户密码
     * @param interfaceId 接口名
     * @param datumCode 资料编码
     * @return
     */
    public GrpcResultVO getElementsInfoByDatumCode(String userId, String pwd, String interfaceId, String datumCode){
        DatumtypeelmServiceGrpc.DatumtypeelmServiceBlockingStub blockingStub = DatumtypeelmServiceGrpc.newBlockingStub(serverChannel);

        // 传参对象赋值
        UserPwdRequest buildUserPwdRequest = UserPwdRequest.newBuilder()
                .setUserId(userId)
                .setPwd(pwd)
                .setInterfaceId(interfaceId)
                .build();
        // 获取grpc服务端数据
        ResponseData responseData = blockingStub.getElementsInfoByDatumCode(DatumCodeRequest.newBuilder()
                .setUserPwdRequest(buildUserPwdRequest)
                .setDatumCode(datumCode)
                .build());

        // 对获取数据进行解析返回
        GrpcResultVO grpcResultVO = ClientServiceHandler.getFinalResult(responseData);
        return grpcResultVO;
    }
}
