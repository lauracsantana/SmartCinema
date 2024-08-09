package com.StaffControl;

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
    comments = "Source: StaffControl.proto")
public final class StaffControlServiceGrpc {

  private StaffControlServiceGrpc() {}

  public static final String SERVICE_NAME = "StaffControlService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.StaffControl.StaffControl.StaffStatusRequest,
      com.StaffControl.StaffControl.StaffStatusResponse> getStaffStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StaffStatus",
      requestType = com.StaffControl.StaffControl.StaffStatusRequest.class,
      responseType = com.StaffControl.StaffControl.StaffStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.StaffControl.StaffControl.StaffStatusRequest,
      com.StaffControl.StaffControl.StaffStatusResponse> getStaffStatusMethod() {
    io.grpc.MethodDescriptor<com.StaffControl.StaffControl.StaffStatusRequest, com.StaffControl.StaffControl.StaffStatusResponse> getStaffStatusMethod;
    if ((getStaffStatusMethod = StaffControlServiceGrpc.getStaffStatusMethod) == null) {
      synchronized (StaffControlServiceGrpc.class) {
        if ((getStaffStatusMethod = StaffControlServiceGrpc.getStaffStatusMethod) == null) {
          StaffControlServiceGrpc.getStaffStatusMethod = getStaffStatusMethod = 
              io.grpc.MethodDescriptor.<com.StaffControl.StaffControl.StaffStatusRequest, com.StaffControl.StaffControl.StaffStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "StaffControlService", "StaffStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.StaffControl.StaffControl.StaffStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.StaffControl.StaffControl.StaffStatusResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StaffControlServiceMethodDescriptorSupplier("StaffStatus"))
                  .build();
          }
        }
     }
     return getStaffStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.StaffControl.StaffControl.StaffHoursRequest,
      com.StaffControl.StaffControl.StaffHoursResponse> getStreamStaffHoursMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamStaffHours",
      requestType = com.StaffControl.StaffControl.StaffHoursRequest.class,
      responseType = com.StaffControl.StaffControl.StaffHoursResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.StaffControl.StaffControl.StaffHoursRequest,
      com.StaffControl.StaffControl.StaffHoursResponse> getStreamStaffHoursMethod() {
    io.grpc.MethodDescriptor<com.StaffControl.StaffControl.StaffHoursRequest, com.StaffControl.StaffControl.StaffHoursResponse> getStreamStaffHoursMethod;
    if ((getStreamStaffHoursMethod = StaffControlServiceGrpc.getStreamStaffHoursMethod) == null) {
      synchronized (StaffControlServiceGrpc.class) {
        if ((getStreamStaffHoursMethod = StaffControlServiceGrpc.getStreamStaffHoursMethod) == null) {
          StaffControlServiceGrpc.getStreamStaffHoursMethod = getStreamStaffHoursMethod = 
              io.grpc.MethodDescriptor.<com.StaffControl.StaffControl.StaffHoursRequest, com.StaffControl.StaffControl.StaffHoursResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "StaffControlService", "StreamStaffHours"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.StaffControl.StaffControl.StaffHoursRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.StaffControl.StaffControl.StaffHoursResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StaffControlServiceMethodDescriptorSupplier("StreamStaffHours"))
                  .build();
          }
        }
     }
     return getStreamStaffHoursMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StaffControlServiceStub newStub(io.grpc.Channel channel) {
    return new StaffControlServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StaffControlServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StaffControlServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StaffControlServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StaffControlServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class StaffControlServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void staffStatus(com.StaffControl.StaffControl.StaffStatusRequest request,
        io.grpc.stub.StreamObserver<com.StaffControl.StaffControl.StaffStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStaffStatusMethod(), responseObserver);
    }

    /**
     */
    public void streamStaffHours(com.StaffControl.StaffControl.StaffHoursRequest request,
        io.grpc.stub.StreamObserver<com.StaffControl.StaffControl.StaffHoursResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStreamStaffHoursMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStaffStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.StaffControl.StaffControl.StaffStatusRequest,
                com.StaffControl.StaffControl.StaffStatusResponse>(
                  this, METHODID_STAFF_STATUS)))
          .addMethod(
            getStreamStaffHoursMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.StaffControl.StaffControl.StaffHoursRequest,
                com.StaffControl.StaffControl.StaffHoursResponse>(
                  this, METHODID_STREAM_STAFF_HOURS)))
          .build();
    }
  }

  /**
   */
  public static final class StaffControlServiceStub extends io.grpc.stub.AbstractStub<StaffControlServiceStub> {
    private StaffControlServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StaffControlServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StaffControlServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StaffControlServiceStub(channel, callOptions);
    }

    /**
     */
    public void staffStatus(com.StaffControl.StaffControl.StaffStatusRequest request,
        io.grpc.stub.StreamObserver<com.StaffControl.StaffControl.StaffStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStaffStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void streamStaffHours(com.StaffControl.StaffControl.StaffHoursRequest request,
        io.grpc.stub.StreamObserver<com.StaffControl.StaffControl.StaffHoursResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getStreamStaffHoursMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class StaffControlServiceBlockingStub extends io.grpc.stub.AbstractStub<StaffControlServiceBlockingStub> {
    private StaffControlServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StaffControlServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StaffControlServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StaffControlServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.StaffControl.StaffControl.StaffStatusResponse staffStatus(com.StaffControl.StaffControl.StaffStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getStaffStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.StaffControl.StaffControl.StaffHoursResponse> streamStaffHours(
        com.StaffControl.StaffControl.StaffHoursRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getStreamStaffHoursMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StaffControlServiceFutureStub extends io.grpc.stub.AbstractStub<StaffControlServiceFutureStub> {
    private StaffControlServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StaffControlServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StaffControlServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StaffControlServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.StaffControl.StaffControl.StaffStatusResponse> staffStatus(
        com.StaffControl.StaffControl.StaffStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStaffStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_STAFF_STATUS = 0;
  private static final int METHODID_STREAM_STAFF_HOURS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StaffControlServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StaffControlServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STAFF_STATUS:
          serviceImpl.staffStatus((com.StaffControl.StaffControl.StaffStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.StaffControl.StaffControl.StaffStatusResponse>) responseObserver);
          break;
        case METHODID_STREAM_STAFF_HOURS:
          serviceImpl.streamStaffHours((com.StaffControl.StaffControl.StaffHoursRequest) request,
              (io.grpc.stub.StreamObserver<com.StaffControl.StaffControl.StaffHoursResponse>) responseObserver);
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

  private static abstract class StaffControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StaffControlServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.StaffControl.StaffControl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StaffControlService");
    }
  }

  private static final class StaffControlServiceFileDescriptorSupplier
      extends StaffControlServiceBaseDescriptorSupplier {
    StaffControlServiceFileDescriptorSupplier() {}
  }

  private static final class StaffControlServiceMethodDescriptorSupplier
      extends StaffControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StaffControlServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (StaffControlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StaffControlServiceFileDescriptorSupplier())
              .addMethod(getStaffStatusMethod())
              .addMethod(getStreamStaffHoursMethod())
              .build();
        }
      }
    }
    return result;
  }
}
