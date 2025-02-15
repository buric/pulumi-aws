// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirehoseDeliveryStreamServerSideEncryption {
    /**
     * @return Whether to enable encryption at rest. Default is `false`.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * @return Amazon Resource Name (ARN) of the encryption key. Required when `key_type` is `CUSTOMER_MANAGED_CMK`.
     * 
     */
    private final @Nullable String keyArn;
    /**
     * @return Type of encryption key. Default is `AWS_OWNED_CMK`. Valid values are `AWS_OWNED_CMK` and `CUSTOMER_MANAGED_CMK`
     * 
     */
    private final @Nullable String keyType;

    @CustomType.Constructor
    private FirehoseDeliveryStreamServerSideEncryption(
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("keyArn") @Nullable String keyArn,
        @CustomType.Parameter("keyType") @Nullable String keyType) {
        this.enabled = enabled;
        this.keyArn = keyArn;
        this.keyType = keyType;
    }

    /**
     * @return Whether to enable encryption at rest. Default is `false`.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Amazon Resource Name (ARN) of the encryption key. Required when `key_type` is `CUSTOMER_MANAGED_CMK`.
     * 
     */
    public Optional<String> keyArn() {
        return Optional.ofNullable(this.keyArn);
    }
    /**
     * @return Type of encryption key. Default is `AWS_OWNED_CMK`. Valid values are `AWS_OWNED_CMK` and `CUSTOMER_MANAGED_CMK`
     * 
     */
    public Optional<String> keyType() {
        return Optional.ofNullable(this.keyType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamServerSideEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String keyArn;
        private @Nullable String keyType;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamServerSideEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.keyArn = defaults.keyArn;
    	      this.keyType = defaults.keyType;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder keyArn(@Nullable String keyArn) {
            this.keyArn = keyArn;
            return this;
        }
        public Builder keyType(@Nullable String keyType) {
            this.keyType = keyType;
            return this;
        }        public FirehoseDeliveryStreamServerSideEncryption build() {
            return new FirehoseDeliveryStreamServerSideEncryption(enabled, keyArn, keyType);
        }
    }
}
