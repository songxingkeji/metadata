package com.sunsheen.metadataserver.interfaceservice.grpc;

import com.sunsheen.metadatacom.grpc.service.grpccommon.*;
import com.sunsheen.metadatacom.grpc.service.handle.HandleServiceGrpc;
import com.sunsheen.metadataserver.interfaceservice.common.ServerServiceHandler;
import com.sunsheen.metadataserver.interfaceservice.service.InterfaceServiceService;
import com.sunsheen.metadataserver.systemmanage.usermanage.service.TsUserService;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.springboot.autoconfigure.grpc.server.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description: grpc服务端之按资料编码检索总控处理表接口
 * @author: zhangxuejiao
 * @createDate: 2019/5/30 17:38
 */
@Slf4j
@GrpcService(HandleServiceGrpc.class)
public class HandleServerGrpcService extends HandleServiceGrpc.HandleServiceImplBase {

    @Autowired
    private InterfaceServiceService interfaceServiceService;

    @Autowired
    private TsUserService tsUserService;

    /**
     * <pre>
     * 按资料编码检索总控处理表接口
     * </pre>
     */
    @Override
    public void getHandleByDatumCode(DatumCodeRequest request, StreamObserver<ResponseData> responseObserver) {
        ServerServiceHandler<DatumCodeRequest> serverServiceHandler = new ServerServiceHandler();
        serverServiceHandler.getDbData(request, responseObserver, interfaceServiceService, tsUserService);
    }
}
