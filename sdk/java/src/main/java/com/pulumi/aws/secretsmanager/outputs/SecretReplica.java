// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.secretsmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecretReplica {
    /**
     * @return ARN, Key ID, or Alias of the AWS KMS key within the region secret is replicated to. If one is not specified, then Secrets Manager defaults to using the AWS account&#39;s default KMS key (`aws/secretsmanager`) in the region or creates one for use if non-existent.
     * 
     */
    private final @Nullable String kmsKeyId;
    /**
     * @return Date that you last accessed the secret in the Region.
     * 
     */
    private final @Nullable String lastAccessedDate;
    /**
     * @return Region for replicating the secret.
     * 
     */
    private final String region;
    /**
     * @return Status can be `InProgress`, `Failed`, or `InSync`.
     * 
     */
    private final @Nullable String status;
    /**
     * @return Message such as `Replication succeeded` or `Secret with this name already exists in this region`.
     * 
     */
    private final @Nullable String statusMessage;

    @CustomType.Constructor
    private SecretReplica(
        @CustomType.Parameter("kmsKeyId") @Nullable String kmsKeyId,
        @CustomType.Parameter("lastAccessedDate") @Nullable String lastAccessedDate,
        @CustomType.Parameter("region") String region,
        @CustomType.Parameter("status") @Nullable String status,
        @CustomType.Parameter("statusMessage") @Nullable String statusMessage) {
        this.kmsKeyId = kmsKeyId;
        this.lastAccessedDate = lastAccessedDate;
        this.region = region;
        this.status = status;
        this.statusMessage = statusMessage;
    }

    /**
     * @return ARN, Key ID, or Alias of the AWS KMS key within the region secret is replicated to. If one is not specified, then Secrets Manager defaults to using the AWS account&#39;s default KMS key (`aws/secretsmanager`) in the region or creates one for use if non-existent.
     * 
     */
    public Optional<String> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }
    /**
     * @return Date that you last accessed the secret in the Region.
     * 
     */
    public Optional<String> lastAccessedDate() {
        return Optional.ofNullable(this.lastAccessedDate);
    }
    /**
     * @return Region for replicating the secret.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return Status can be `InProgress`, `Failed`, or `InSync`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return Message such as `Replication succeeded` or `Secret with this name already exists in this region`.
     * 
     */
    public Optional<String> statusMessage() {
        return Optional.ofNullable(this.statusMessage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretReplica defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kmsKeyId;
        private @Nullable String lastAccessedDate;
        private String region;
        private @Nullable String status;
        private @Nullable String statusMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretReplica defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.lastAccessedDate = defaults.lastAccessedDate;
    	      this.region = defaults.region;
    	      this.status = defaults.status;
    	      this.statusMessage = defaults.statusMessage;
        }

        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public Builder lastAccessedDate(@Nullable String lastAccessedDate) {
            this.lastAccessedDate = lastAccessedDate;
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder statusMessage(@Nullable String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }        public SecretReplica build() {
            return new SecretReplica(kmsKeyId, lastAccessedDate, region, status, statusMessage);
        }
    }
}
