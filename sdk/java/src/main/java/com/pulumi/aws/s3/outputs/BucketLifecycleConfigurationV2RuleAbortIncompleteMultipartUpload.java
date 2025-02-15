// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketLifecycleConfigurationV2RuleAbortIncompleteMultipartUpload {
    /**
     * @return The number of days after which Amazon S3 aborts an incomplete multipart upload.
     * 
     */
    private final @Nullable Integer daysAfterInitiation;

    @CustomType.Constructor
    private BucketLifecycleConfigurationV2RuleAbortIncompleteMultipartUpload(@CustomType.Parameter("daysAfterInitiation") @Nullable Integer daysAfterInitiation) {
        this.daysAfterInitiation = daysAfterInitiation;
    }

    /**
     * @return The number of days after which Amazon S3 aborts an incomplete multipart upload.
     * 
     */
    public Optional<Integer> daysAfterInitiation() {
        return Optional.ofNullable(this.daysAfterInitiation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleConfigurationV2RuleAbortIncompleteMultipartUpload defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer daysAfterInitiation;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleConfigurationV2RuleAbortIncompleteMultipartUpload defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysAfterInitiation = defaults.daysAfterInitiation;
        }

        public Builder daysAfterInitiation(@Nullable Integer daysAfterInitiation) {
            this.daysAfterInitiation = daysAfterInitiation;
            return this;
        }        public BucketLifecycleConfigurationV2RuleAbortIncompleteMultipartUpload build() {
            return new BucketLifecycleConfigurationV2RuleAbortIncompleteMultipartUpload(daysAfterInitiation);
        }
    }
}
