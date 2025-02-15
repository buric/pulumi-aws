// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.outputs;

import com.pulumi.aws.s3.outputs.BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketReplicationConfigurationRuleSourceSelectionCriteria {
    /**
     * @return Match SSE-KMS encrypted objects (documented below). If specified, `replica_kms_key_id`
     * in `destination` must be specified as well.
     * 
     */
    private final @Nullable BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects sseKmsEncryptedObjects;

    @CustomType.Constructor
    private BucketReplicationConfigurationRuleSourceSelectionCriteria(@CustomType.Parameter("sseKmsEncryptedObjects") @Nullable BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects sseKmsEncryptedObjects) {
        this.sseKmsEncryptedObjects = sseKmsEncryptedObjects;
    }

    /**
     * @return Match SSE-KMS encrypted objects (documented below). If specified, `replica_kms_key_id`
     * in `destination` must be specified as well.
     * 
     */
    public Optional<BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects> sseKmsEncryptedObjects() {
        return Optional.ofNullable(this.sseKmsEncryptedObjects);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigurationRuleSourceSelectionCriteria defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects sseKmsEncryptedObjects;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigurationRuleSourceSelectionCriteria defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sseKmsEncryptedObjects = defaults.sseKmsEncryptedObjects;
        }

        public Builder sseKmsEncryptedObjects(@Nullable BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects sseKmsEncryptedObjects) {
            this.sseKmsEncryptedObjects = sseKmsEncryptedObjects;
            return this;
        }        public BucketReplicationConfigurationRuleSourceSelectionCriteria build() {
            return new BucketReplicationConfigurationRuleSourceSelectionCriteria(sseKmsEncryptedObjects);
        }
    }
}
