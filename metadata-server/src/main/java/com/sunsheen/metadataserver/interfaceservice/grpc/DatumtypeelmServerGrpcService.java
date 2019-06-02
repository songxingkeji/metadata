package com.sunsheen.metadataserver.interfaceservice.grpc;

import com.sunsheen.metadatacom.grpc.service.datumtypeelm.DatumtypeelmServiceGrpc;
import com.sunsheen.metadatacom.grpc.service.grpccommon.DatumCodeRequest;
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
 * @description: grpc服务端之资料编码与数据元关系数据接口
 * @author: zhangxuejiao
 * @createDate: 2019/5/30 17:38
 */
@Slf4j
@GrpcService(DatumtypeelmServiceGrpc.class)
public class DatumtypeelmServerGrpcService extends DatumtypeelmServiceGrpc.DatumtypeelmServiceImplBase {

    @Autowired
    private InterfaceServiceService interfaceServiceService;

    @Autowired
    private TsUserService tsUserService;

    /**
     * <pre>
     * 获取全部的资料编码与数据元关系数据接口
     * </pre>
     */
    public void getDatumtypeelm(UserPwdRequest request, StreamObserver<ResponseData> responseObserver) {
        ServerServiceHandler<UserPwdRequest> serverServiceHandler = new ServerServiceHandler();
        serverServiceHandler.getDbData(request, responseObserver, interfaceServiceService, tsUserService);
    }

    /**
     * <pre>
     * 获取指定资料编码与数据元的关系数据接口
     * </pre>
     */
    public void getElementsInfoByDatumCode(DatumCodeRequest request, StreamObserver<ResponseData> responseObserver) {
        ServerServiceHandler<DatumCodeRequest> serverServiceHandler = new ServerServiceHandler();
        serverServiceHandler.getDbData(request, responseObserver, interfaceServiceService, tsUserService);
    }

}
