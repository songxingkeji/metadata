package com.sunsheen.metadataserver.interfaceservice.grpc;

import com.sunsheen.metadatacom.grpc.service.element.ElementServiceGrpc;
import com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData;
import com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest;
import com.sunsheen.metadataserver.interfaceservice.common.ServerServiceHandler;
import com.sunsheen.metadataserver.interfaceservice.service.InterfaceServiceService;
import com.sunsheen.metadataserver.systemmanage.usermanage.service.TsUserService;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.springboot.autoconfigure.grpc.server.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description: grpc服务端之气象数据元数据获取接口
 * @author: zhangxuejiao
 * @createDate: 2019/5/30 17:38
 */
@Slf4j
@GrpcService(ElementServiceGrpc.class)
public class ElementServerGrpcService extends ElementServiceGrpc.ElementServiceImplBase {

    @Autowired
    private InterfaceServiceService interfaceServiceService;

    @Autowired
    private TsUserService tsUserService;

    /**
     * <pre>
     * 气象数据元数据获取接口
     * </pre>
     */
    @Override
    public void getElement(UserPwdRequest request, StreamObserver<ResponseData> responseObserver) {
        ServerServiceHandler<UserPwdRequest> serverServiceHandler = new ServerServiceHandler();
        serverServiceHandler.getDbData(request, responseObserver, interfaceServiceService, tsUserService);
    }
}
