// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dependency_entry.proto

package com.mogujie.jarvis.protocol;

public final class DependencyEntryProtos {
  private DependencyEntryProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface DependencyEntryOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DependencyEntry)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required .DependencyEntry.DependencyOperator operator = 1;</code>
     */
    boolean hasOperator();
    /**
     * <code>required .DependencyEntry.DependencyOperator operator = 1;</code>
     */
    com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry.DependencyOperator getOperator();

    /**
     * <code>required int64 job_id = 2;</code>
     */
    boolean hasJobId();
    /**
     * <code>required int64 job_id = 2;</code>
     */
    long getJobId();

    /**
     * <code>optional int32 common_depend_strategy = 3 [default = 0];</code>
     */
    boolean hasCommonDependStrategy();
    /**
     * <code>optional int32 common_depend_strategy = 3 [default = 0];</code>
     */
    int getCommonDependStrategy();

    /**
     * <code>optional string offset_depend_strategy = 4 [default = ""];</code>
     */
    boolean hasOffsetDependStrategy();
    /**
     * <code>optional string offset_depend_strategy = 4 [default = ""];</code>
     */
    java.lang.String getOffsetDependStrategy();
    /**
     * <code>optional string offset_depend_strategy = 4 [default = ""];</code>
     */
    com.google.protobuf.ByteString
        getOffsetDependStrategyBytes();
  }
  /**
   * Protobuf type {@code DependencyEntry}
   */
  public static final class DependencyEntry extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:DependencyEntry)
      DependencyEntryOrBuilder {
    // Use DependencyEntry.newBuilder() to construct.
    private DependencyEntry(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private DependencyEntry(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final DependencyEntry defaultInstance;
    public static DependencyEntry getDefaultInstance() {
      return defaultInstance;
    }

    public DependencyEntry getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private DependencyEntry(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              int rawValue = input.readEnum();
              com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry.DependencyOperator value = com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry.DependencyOperator.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                operator_ = value;
              }
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              jobId_ = input.readInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              commonDependStrategy_ = input.readInt32();
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              offsetDependStrategy_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mogujie.jarvis.protocol.DependencyEntryProtos.internal_static_DependencyEntry_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mogujie.jarvis.protocol.DependencyEntryProtos.internal_static_DependencyEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry.class, com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry.Builder.class);
    }

    public static com.google.protobuf.Parser<DependencyEntry> PARSER =
        new com.google.protobuf.AbstractParser<DependencyEntry>() {
      public DependencyEntry parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DependencyEntry(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<DependencyEntry> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code DependencyEntry.DependencyOperator}
     */
    public enum DependencyOperator
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>ADD = 1;</code>
       */
      ADD(0, 1),
      /**
       * <code>UPDATE = 2;</code>
       */
      UPDATE(1, 2),
      /**
       * <code>REMOVE = 3;</code>
       */
      REMOVE(2, 3),
      ;

      /**
       * <code>ADD = 1;</code>
       */
      public static final int ADD_VALUE = 1;
      /**
       * <code>UPDATE = 2;</code>
       */
      public static final int UPDATE_VALUE = 2;
      /**
       * <code>REMOVE = 3;</code>
       */
      public static final int REMOVE_VALUE = 3;


      public final int getNumber() { return value; }

      public static DependencyOperator valueOf(int value) {
        switch (value) {
          case 1: return ADD;
          case 2: return UPDATE;
          case 3: return REMOVE;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<DependencyOperator>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<DependencyOperator>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<DependencyOperator>() {
              public DependencyOperator findValueByNumber(int number) {
                return DependencyOperator.valueOf(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry.getDescriptor().getEnumTypes().get(0);
      }

      private static final DependencyOperator[] VALUES = values();

      public static DependencyOperator valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private DependencyOperator(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:DependencyEntry.DependencyOperator)
    }

    private int bitField0_;
    public static final int OPERATOR_FIELD_NUMBER = 1;
    private com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry.DependencyOperator operator_;
    /**
     * <code>required .DependencyEntry.DependencyOperator operator = 1;</code>
     */
    public boolean hasOperator() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .DependencyEntry.DependencyOperator operator = 1;</code>
     */
    public com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry.DependencyOperator getOperator() {
      return operator_;
    }

    public static final int JOB_ID_FIELD_NUMBER = 2;
    private long jobId_;
    /**
     * <code>required int64 job_id = 2;</code>
     */
    public boolean hasJobId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int64 job_id = 2;</code>
     */
    public long getJobId() {
      return jobId_;
    }

    public static final int COMMON_DEPEND_STRATEGY_FIELD_NUMBER = 3;
    private int commonDependStrategy_;
    /**
     * <code>optional int32 common_depend_strategy = 3 [default = 0];</code>
     */
    public boolean hasCommonDependStrategy() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 common_depend_strategy = 3 [default = 0];</code>
     */
    public int getCommonDependStrategy() {
      return commonDependStrategy_;
    }

    public static final int OFFSET_DEPEND_STRATEGY_FIELD_NUMBER = 4;
    private java.lang.Object offsetDependStrategy_;
    /**
     * <code>optional string offset_depend_strategy = 4 [default = ""];</code>
     */
    public boolean hasOffsetDependStrategy() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional string offset_depend_strategy = 4 [default = ""];</code>
     */
    public java.lang.String getOffsetDependStrategy() {
      java.lang.Object ref = offsetDependStrategy_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          offsetDependStrategy_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string offset_depend_strategy = 4 [default = ""];</code>
     */
    public com.google.protobuf.ByteString
        getOffsetDependStrategyBytes() {
      java.lang.Object ref = offsetDependStrategy_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        offsetDependStrategy_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      operator_ = com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry.DependencyOperator.ADD;
      jobId_ = 0L;
      commonDependStrategy_ = 0;
      offsetDependStrategy_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasOperator()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasJobId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(1, operator_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, jobId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, commonDependStrategy_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getOffsetDependStrategyBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, operator_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, jobId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, commonDependStrategy_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getOffsetDependStrategyBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code DependencyEntry}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DependencyEntry)
        com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntryOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.mogujie.jarvis.protocol.DependencyEntryProtos.internal_static_DependencyEntry_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.mogujie.jarvis.protocol.DependencyEntryProtos.internal_static_DependencyEntry_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry.class, com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry.Builder.class);
      }

      // Construct using com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        operator_ = com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry.DependencyOperator.ADD;
        bitField0_ = (bitField0_ & ~0x00000001);
        jobId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        commonDependStrategy_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        offsetDependStrategy_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.mogujie.jarvis.protocol.DependencyEntryProtos.internal_static_DependencyEntry_descriptor;
      }

      public com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry getDefaultInstanceForType() {
        return com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry.getDefaultInstance();
      }

      public com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry build() {
        com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry buildPartial() {
        com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry result = new com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.operator_ = operator_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.jobId_ = jobId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.commonDependStrategy_ = commonDependStrategy_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.offsetDependStrategy_ = offsetDependStrategy_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry) {
          return mergeFrom((com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry other) {
        if (other == com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry.getDefaultInstance()) return this;
        if (other.hasOperator()) {
          setOperator(other.getOperator());
        }
        if (other.hasJobId()) {
          setJobId(other.getJobId());
        }
        if (other.hasCommonDependStrategy()) {
          setCommonDependStrategy(other.getCommonDependStrategy());
        }
        if (other.hasOffsetDependStrategy()) {
          bitField0_ |= 0x00000008;
          offsetDependStrategy_ = other.offsetDependStrategy_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasOperator()) {
          
          return false;
        }
        if (!hasJobId()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry.DependencyOperator operator_ = com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry.DependencyOperator.ADD;
      /**
       * <code>required .DependencyEntry.DependencyOperator operator = 1;</code>
       */
      public boolean hasOperator() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .DependencyEntry.DependencyOperator operator = 1;</code>
       */
      public com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry.DependencyOperator getOperator() {
        return operator_;
      }
      /**
       * <code>required .DependencyEntry.DependencyOperator operator = 1;</code>
       */
      public Builder setOperator(com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry.DependencyOperator value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        operator_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .DependencyEntry.DependencyOperator operator = 1;</code>
       */
      public Builder clearOperator() {
        bitField0_ = (bitField0_ & ~0x00000001);
        operator_ = com.mogujie.jarvis.protocol.DependencyEntryProtos.DependencyEntry.DependencyOperator.ADD;
        onChanged();
        return this;
      }

      private long jobId_ ;
      /**
       * <code>required int64 job_id = 2;</code>
       */
      public boolean hasJobId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int64 job_id = 2;</code>
       */
      public long getJobId() {
        return jobId_;
      }
      /**
       * <code>required int64 job_id = 2;</code>
       */
      public Builder setJobId(long value) {
        bitField0_ |= 0x00000002;
        jobId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 job_id = 2;</code>
       */
      public Builder clearJobId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        jobId_ = 0L;
        onChanged();
        return this;
      }

      private int commonDependStrategy_ ;
      /**
       * <code>optional int32 common_depend_strategy = 3 [default = 0];</code>
       */
      public boolean hasCommonDependStrategy() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int32 common_depend_strategy = 3 [default = 0];</code>
       */
      public int getCommonDependStrategy() {
        return commonDependStrategy_;
      }
      /**
       * <code>optional int32 common_depend_strategy = 3 [default = 0];</code>
       */
      public Builder setCommonDependStrategy(int value) {
        bitField0_ |= 0x00000004;
        commonDependStrategy_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 common_depend_strategy = 3 [default = 0];</code>
       */
      public Builder clearCommonDependStrategy() {
        bitField0_ = (bitField0_ & ~0x00000004);
        commonDependStrategy_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object offsetDependStrategy_ = "";
      /**
       * <code>optional string offset_depend_strategy = 4 [default = ""];</code>
       */
      public boolean hasOffsetDependStrategy() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional string offset_depend_strategy = 4 [default = ""];</code>
       */
      public java.lang.String getOffsetDependStrategy() {
        java.lang.Object ref = offsetDependStrategy_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            offsetDependStrategy_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string offset_depend_strategy = 4 [default = ""];</code>
       */
      public com.google.protobuf.ByteString
          getOffsetDependStrategyBytes() {
        java.lang.Object ref = offsetDependStrategy_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          offsetDependStrategy_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string offset_depend_strategy = 4 [default = ""];</code>
       */
      public Builder setOffsetDependStrategy(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        offsetDependStrategy_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string offset_depend_strategy = 4 [default = ""];</code>
       */
      public Builder clearOffsetDependStrategy() {
        bitField0_ = (bitField0_ & ~0x00000008);
        offsetDependStrategy_ = getDefaultInstance().getOffsetDependStrategy();
        onChanged();
        return this;
      }
      /**
       * <code>optional string offset_depend_strategy = 4 [default = ""];</code>
       */
      public Builder setOffsetDependStrategyBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        offsetDependStrategy_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:DependencyEntry)
    }

    static {
      defaultInstance = new DependencyEntry(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:DependencyEntry)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DependencyEntry_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_DependencyEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026dependency_entry.proto\"\324\001\n\017DependencyE" +
      "ntry\0225\n\010operator\030\001 \002(\0162#.DependencyEntry" +
      ".DependencyOperator\022\016\n\006job_id\030\002 \002(\003\022!\n\026c" +
      "ommon_depend_strategy\030\003 \001(\005:\0010\022 \n\026offset" +
      "_depend_strategy\030\004 \001(\t:\000\"5\n\022DependencyOp" +
      "erator\022\007\n\003ADD\020\001\022\n\n\006UPDATE\020\002\022\n\n\006REMOVE\020\003B" +
      "4\n\033com.mogujie.jarvis.protocolB\025Dependen" +
      "cyEntryProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_DependencyEntry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DependencyEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_DependencyEntry_descriptor,
        new java.lang.String[] { "Operator", "JobId", "CommonDependStrategy", "OffsetDependStrategy", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
