package com.ScreenControl;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: ScreenControl.proto")
public final class ScreenControlServiceGrpc {

  private ScreenControlServiceGrpc() {}

  public static final String SERVICE_NAME = "ScreenControlService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ScreenControl.ScreenControl.ScreenStatusRequest,
      com.ScreenControl.ScreenControl.ScreenStatusResponse> getScreenStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScreenStatus",
      requestType = com.ScreenControl.ScreenControl.ScreenStatusRequest.class,
      responseType = com.ScreenControl.ScreenControl.ScreenStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ScreenControl.ScreenControl.ScreenStatusRequest,
      com.ScreenControl.ScreenControl.ScreenStatusResponse> getScreenStatusMethod() {
    io.grpc.MethodDescriptor<com.ScreenControl.ScreenControl.ScreenStatusRequest, com.ScreenControl.ScreenControl.ScreenStatusResponse> getScreenStatusMethod;
    if ((getScreenStatusMethod = ScreenControlServiceGrpc.getScreenStatusMethod) == null) {
      synchronized (ScreenControlServiceGrpc.class) {
        if ((getScreenStatusMethod = ScreenControlServiceGrpc.getScreenStatusMethod) == null) {
          ScreenControlServiceGrpc.getScreenStatusMethod = getScreenStatusMethod = 
              io.grpc.MethodDescriptor.<com.ScreenControl.ScreenControl.ScreenStatusRequest, com.ScreenControl.ScreenControl.ScreenStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ScreenControlService", "ScreenStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ScreenControl.ScreenControl.ScreenStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ScreenControl.ScreenControl.ScreenStatusResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ScreenControlServiceMethodDescriptorSupplier("ScreenStatus"))
                  .build();
          }
        }
     }
     return getScreenStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ScreenControl.ScreenControl.TurnScreenONRequest,
      com.ScreenControl.ScreenControl.TurnScreenONResponse> getTurnScreenONMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TurnScreenON",
      requestType = com.ScreenControl.ScreenControl.TurnScreenONRequest.class,
      responseType = com.ScreenControl.ScreenControl.TurnScreenONResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ScreenControl.ScreenControl.TurnScreenONRequest,
      com.ScreenControl.ScreenControl.TurnScreenONResponse> getTurnScreenONMethod() {
    io.grpc.MethodDescriptor<com.ScreenControl.ScreenControl.TurnScreenONRequest, com.ScreenControl.ScreenControl.TurnScreenONResponse> getTurnScreenONMethod;
    if ((getTurnScreenONMethod = ScreenControlServiceGrpc.getTurnScreenONMethod) == null) {
      synchronized (ScreenControlServiceGrpc.class) {
        if ((getTurnScreenONMethod = ScreenControlServiceGrpc.getTurnScreenONMethod) == null) {
          ScreenControlServiceGrpc.getTurnScreenONMethod = getTurnScreenONMethod = 
              io.grpc.MethodDescriptor.<com.ScreenControl.ScreenControl.TurnScreenONRequest, com.ScreenControl.ScreenControl.TurnScreenONResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ScreenControlService", "TurnScreenON"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ScreenControl.ScreenControl.TurnScreenONRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ScreenControl.ScreenControl.TurnScreenONResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ScreenControlServiceMethodDescriptorSupplier("TurnScreenON"))
                  .build();
          }
        }
     }
     return getTurnScreenONMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ScreenControl.ScreenControl.AllScreenStopRequest,
      com.ScreenControl.ScreenControl.AllScreenStopResponse> getAllScreenStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllScreenStop",
      requestType = com.ScreenControl.ScreenControl.AllScreenStopRequest.class,
      responseType = com.ScreenControl.ScreenControl.AllScreenStopResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ScreenControl.ScreenControl.AllScreenStopRequest,
      com.ScreenControl.ScreenControl.AllScreenStopResponse> getAllScreenStopMethod() {
    io.grpc.MethodDescriptor<com.ScreenControl.ScreenControl.AllScreenStopRequest, com.ScreenControl.ScreenControl.AllScreenStopResponse> getAllScreenStopMethod;
    if ((getAllScreenStopMethod = ScreenControlServiceGrpc.getAllScreenStopMethod) == null) {
      synchronized (ScreenControlServiceGrpc.class) {
        if ((getAllScreenStopMethod = ScreenControlServiceGrpc.getAllScreenStopMethod) == null) {
          ScreenControlServiceGrpc.getAllScreenStopMethod = getAllScreenStopMethod = 
              io.grpc.MethodDescriptor.<com.ScreenControl.ScreenControl.AllScreenStopRequest, com.ScreenControl.ScreenControl.AllScreenStopResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ScreenControlService", "AllScreenStop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ScreenControl.ScreenControl.AllScreenStopRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ScreenControl.ScreenControl.AllScreenStopResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ScreenControlServiceMethodDescriptorSupplier("AllScreenStop"))
                  .build();
          }
        }
     }
     return getAllScreenStopMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ScreenControlServiceStub newStub(io.grpc.Channel channel) {
    return new ScreenControlServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ScreenControlServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ScreenControlServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ScreenControlServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ScreenControlServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ScreenControlServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void screenStatus(com.ScreenControl.ScreenControl.ScreenStatusRequest request,
        io.grpc.stub.StreamObserver<com.ScreenControl.ScreenControl.ScreenStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getScreenStatusMethod(), responseObserver);
    }

    /**
     */
    public void turnScreenON(com.ScreenControl.ScreenControl.TurnScreenONRequest request,
        io.grpc.stub.StreamObserver<com.ScreenControl.ScreenControl.TurnScreenONResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTurnScreenONMethod(), responseObserver);
    }

    /**
     */
    public void allScreenStop(com.ScreenControl.ScreenControl.AllScreenStopRequest request,
        io.grpc.stub.StreamObserver<com.ScreenControl.ScreenControl.AllScreenStopResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllScreenStopMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getScreenStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.ScreenControl.ScreenControl.ScreenStatusRequest,
                com.ScreenControl.ScreenControl.ScreenStatusResponse>(
                  this, METHODID_SCREEN_STATUS)))
          .addMethod(
            getTurnScreenONMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.ScreenControl.ScreenControl.TurnScreenONRequest,
                com.ScreenControl.ScreenControl.TurnScreenONResponse>(
                  this, METHODID_TURN_SCREEN_ON)))
          .addMethod(
            getAllScreenStopMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.ScreenControl.ScreenControl.AllScreenStopRequest,
                com.ScreenControl.ScreenControl.AllScreenStopResponse>(
                  this, METHODID_ALL_SCREEN_STOP)))
          .build();
    }
  }

  /**
   */
  public static final class ScreenControlServiceStub extends io.grpc.stub.AbstractStub<ScreenControlServiceStub> {
    private ScreenControlServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ScreenControlServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScreenControlServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ScreenControlServiceStub(channel, callOptions);
    }

    /**
     */
    public void screenStatus(com.ScreenControl.ScreenControl.ScreenStatusRequest request,
        io.grpc.stub.StreamObserver<com.ScreenControl.ScreenControl.ScreenStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getScreenStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void turnScreenON(com.ScreenControl.ScreenControl.TurnScreenONRequest request,
        io.grpc.stub.StreamObserver<com.ScreenControl.ScreenControl.TurnScreenONResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTurnScreenONMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void allScreenStop(com.ScreenControl.ScreenControl.AllScreenStopRequest request,
        io.grpc.stub.StreamObserver<com.ScreenControl.ScreenControl.AllScreenStopResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllScreenStopMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ScreenControlServiceBlockingStub extends io.grpc.stub.AbstractStub<ScreenControlServiceBlockingStub> {
    private ScreenControlServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ScreenControlServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScreenControlServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ScreenControlServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.ScreenControl.ScreenControl.ScreenStatusResponse screenStatus(com.ScreenControl.ScreenControl.ScreenStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getScreenStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ScreenControl.ScreenControl.TurnScreenONResponse turnScreenON(com.ScreenControl.ScreenControl.TurnScreenONRequest request) {
      return blockingUnaryCall(
          getChannel(), getTurnScreenONMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ScreenControl.ScreenControl.AllScreenStopResponse allScreenStop(com.ScreenControl.ScreenControl.AllScreenStopRequest request) {
      return blockingUnaryCall(
          getChannel(), getAllScreenStopMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ScreenControlServiceFutureStub extends io.grpc.stub.AbstractStub<ScreenControlServiceFutureStub> {
    private ScreenControlServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ScreenControlServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScreenControlServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ScreenControlServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ScreenControl.ScreenControl.ScreenStatusResponse> screenStatus(
        com.ScreenControl.ScreenControl.ScreenStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getScreenStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ScreenControl.ScreenControl.TurnScreenONResponse> turnScreenON(
        com.ScreenControl.ScreenControl.TurnScreenONRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTurnScreenONMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ScreenControl.ScreenControl.AllScreenStopResponse> allScreenStop(
        com.ScreenControl.ScreenControl.AllScreenStopRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAllScreenStopMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SCREEN_STATUS = 0;
  private static final int METHODID_TURN_SCREEN_ON = 1;
  private static final int METHODID_ALL_SCREEN_STOP = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ScreenControlServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ScreenControlServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SCREEN_STATUS:
          serviceImpl.screenStatus((com.ScreenControl.ScreenControl.ScreenStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.ScreenControl.ScreenControl.ScreenStatusResponse>) responseObserver);
          break;
        case METHODID_TURN_SCREEN_ON:
          serviceImpl.turnScreenON((com.ScreenControl.ScreenControl.TurnScreenONRequest) request,
              (io.grpc.stub.StreamObserver<com.ScreenControl.ScreenControl.TurnScreenONResponse>) responseObserver);
          break;
        case METHODID_ALL_SCREEN_STOP:
          serviceImpl.allScreenStop((com.ScreenControl.ScreenControl.AllScreenStopRequest) request,
              (io.grpc.stub.StreamObserver<com.ScreenControl.ScreenControl.AllScreenStopResponse>) responseObserver);
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

  private static abstract class ScreenControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ScreenControlServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ScreenControl.ScreenControl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ScreenControlService");
    }
  }

  private static final class ScreenControlServiceFileDescriptorSupplier
      extends ScreenControlServiceBaseDescriptorSupplier {
    ScreenControlServiceFileDescriptorSupplier() {}
  }

  private static final class ScreenControlServiceMethodDescriptorSupplier
      extends ScreenControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ScreenControlServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ScreenControlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ScreenControlServiceFileDescriptorSupplier())
              .addMethod(getScreenStatusMethod())
              .addMethod(getTurnScreenONMethod())
              .addMethod(getAllScreenStopMethod())
              .build();
        }
      }
    }
    return result;
  }
}
