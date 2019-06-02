package com.sunsheen.metadataserver.interfaceservice.grpc;

import com.sunsheen.metadatacom.grpc.service.datumtypehyp.DatumtypehypServiceGrpc;
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
 * @description: grpc服务端之血缘关系信息接口
 * @author: zhangxuejiao
 * @createDate: 2019/5/30 17:33
 */
@Slf4j
@GrpcService(DatumtypehypServiceGrpc.class)
public class DatumtypehypServerGrpcService extends DatumtypehypServiceGrpc.DatumtypehypServiceImplBase {

    @Autowired
    private InterfaceServiceService interfaceServiceService;

    @Autowired
    private TsUserService tsUserService;

    /**
     * <pre>
     * 检索所有的血缘关系信息接口
     * </pre>
     */
    @Override
    public void getDatumtypehyp(UserPwdRequest request, StreamObserver<ResponseData> responseObserver) {
        ServerServiceHandler<UserPwdRequest> serverServiceHandler = new ServerServiceHandler();
        serverServiceHandler.getDbData(request, responseObserver, interfaceServiceService, tsUserService);
    }
}
