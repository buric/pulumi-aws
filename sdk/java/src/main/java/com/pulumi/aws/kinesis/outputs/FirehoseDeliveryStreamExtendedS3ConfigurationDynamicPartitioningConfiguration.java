// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfiguration {
    /**
     * @return Enables or disables [dynamic partitioning](https://docs.aws.amazon.com/firehose/latest/dev/dynamic-partitioning.html). Defaults to `false`.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * @return Total amount of seconds Firehose spends on retries. Valid values between 0 and 7200. Default is 300.
     * 
     */
    private final @Nullable Integer retryDuration;

    @CustomType.Constructor
    private FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfiguration(
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("retryDuration") @Nullable Integer retryDuration) {
        this.enabled = enabled;
        this.retryDuration = retryDuration;
    }

    /**
     * @return Enables or disables [dynamic partitioning](https://docs.aws.amazon.com/firehose/latest/dev/dynamic-partitioning.html). Defaults to `false`.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Total amount of seconds Firehose spends on retries. Valid values between 0 and 7200. Default is 300.
     * 
     */
    public Optional<Integer> retryDuration() {
        return Optional.ofNullable(this.retryDuration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable Integer retryDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.retryDuration = defaults.retryDuration;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder retryDuration(@Nullable Integer retryDuration) {
            this.retryDuration = retryDuration;
            return this;
        }        public FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfiguration build() {
            return new FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfiguration(enabled, retryDuration);
        }
    }
}
