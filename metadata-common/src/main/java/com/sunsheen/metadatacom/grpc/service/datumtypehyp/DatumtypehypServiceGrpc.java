package com.sunsheen.metadatacom.grpc.service.datumtypehyp;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.1)",
    comments = "Source: getDatumtypehyp.proto")
public final class DatumtypehypServiceGrpc {

  private DatumtypehypServiceGrpc() {}

  public static final String SERVICE_NAME = "datumtypehyp.DatumtypehypService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest,
      com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData> getGetDatumtypehypMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getDatumtypehyp",
      requestType = com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest.class,
      responseType = com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest,
      com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData> getGetDatumtypehypMethod() {
    io.grpc.MethodDescriptor<com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest, com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData> getGetDatumtypehypMethod;
    if ((getGetDatumtypehypMethod = DatumtypehypServiceGrpc.getGetDatumtypehypMethod) == null) {
      synchronized (DatumtypehypServiceGrpc.class) {
        if ((getGetDatumtypehypMethod = DatumtypehypServiceGrpc.getGetDatumtypehypMethod) == null) {
          DatumtypehypServiceGrpc.getGetDatumtypehypMethod = getGetDatumtypehypMethod = 
              io.grpc.MethodDescriptor.<com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest, com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "datumtypehyp.DatumtypehypService", "getDatumtypehyp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData.getDefaultInstance()))
                  .setSchemaDescriptor(new DatumtypehypServiceMethodDescriptorSupplier("getDatumtypehyp"))
                  .build();
          }
        }
     }
     return getGetDatumtypehypMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DatumtypehypServiceStub newStub(io.grpc.Channel channel) {
    return new DatumtypehypServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DatumtypehypServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DatumtypehypServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DatumtypehypServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DatumtypehypServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class DatumtypehypServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 检索所有的血缘关系信息接口
     * </pre>
     */
    public void getDatumtypehyp(com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest request,
        io.grpc.stub.StreamObserver<com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDatumtypehypMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetDatumtypehypMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest,
                com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData>(
                  this, METHODID_GET_DATUMTYPEHYP)))
          .build();
    }
  }

  /**
   */
  public static final class DatumtypehypServiceStub extends io.grpc.stub.AbstractStub<DatumtypehypServiceStub> {
    private DatumtypehypServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DatumtypehypServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatumtypehypServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DatumtypehypServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 检索所有的血缘关系信息接口
     * </pre>
     */
    public void getDatumtypehyp(com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest request,
        io.grpc.stub.StreamObserver<com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDatumtypehypMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DatumtypehypServiceBlockingStub extends io.grpc.stub.AbstractStub<DatumtypehypServiceBlockingStub> {
    private DatumtypehypServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DatumtypehypServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatumtypehypServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DatumtypehypServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 检索所有的血缘关系信息接口
     * </pre>
     */
    public com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData getDatumtypehyp(com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDatumtypehypMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DatumtypehypServiceFutureStub extends io.grpc.stub.AbstractStub<DatumtypehypServiceFutureStub> {
    private DatumtypehypServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DatumtypehypServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatumtypehypServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DatumtypehypServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 检索所有的血缘关系信息接口
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData> getDatumtypehyp(
        com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDatumtypehypMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DATUMTYPEHYP = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DatumtypehypServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DatumtypehypServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DATUMTYPEHYP:
          serviceImpl.getDatumtypehyp((com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest) request,
              (io.grpc.stub.StreamObserver<com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DatumtypehypServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DatumtypehypServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sunsheen.metadatacom.grpc.service.datumtypehyp.DatumtypehypProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DatumtypehypService");
    }
  }

  private static final class DatumtypehypServiceFileDescriptorSupplier
      extends DatumtypehypServiceBaseDescriptorSupplier {
    DatumtypehypServiceFileDescriptorSupplier() {}
  }

  private static final class DatumtypehypServiceMethodDescriptorSupplier
      extends DatumtypehypServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DatumtypehypServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DatumtypehypServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DatumtypehypServiceFileDescriptorSupplier())
              .addMethod(getGetDatumtypehypMethod())
              .build();
        }
      }
    }
    return result;
  }
}
