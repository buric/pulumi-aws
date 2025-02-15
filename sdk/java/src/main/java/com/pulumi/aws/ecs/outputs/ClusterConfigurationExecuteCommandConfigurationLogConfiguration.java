// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterConfigurationExecuteCommandConfigurationLogConfiguration {
    /**
     * @return Whether or not to enable encryption on the CloudWatch logs. If not specified, encryption will be disabled.
     * 
     */
    private final @Nullable Boolean cloudWatchEncryptionEnabled;
    /**
     * @return The name of the CloudWatch log group to send logs to.
     * 
     */
    private final @Nullable String cloudWatchLogGroupName;
    /**
     * @return Whether or not to enable encryption on the logs sent to S3. If not specified, encryption will be disabled.
     * 
     */
    private final @Nullable Boolean s3BucketEncryptionEnabled;
    /**
     * @return The name of the S3 bucket to send logs to.
     * 
     */
    private final @Nullable String s3BucketName;
    /**
     * @return An optional folder in the S3 bucket to place logs in.
     * 
     */
    private final @Nullable String s3KeyPrefix;

    @CustomType.Constructor
    private ClusterConfigurationExecuteCommandConfigurationLogConfiguration(
        @CustomType.Parameter("cloudWatchEncryptionEnabled") @Nullable Boolean cloudWatchEncryptionEnabled,
        @CustomType.Parameter("cloudWatchLogGroupName") @Nullable String cloudWatchLogGroupName,
        @CustomType.Parameter("s3BucketEncryptionEnabled") @Nullable Boolean s3BucketEncryptionEnabled,
        @CustomType.Parameter("s3BucketName") @Nullable String s3BucketName,
        @CustomType.Parameter("s3KeyPrefix") @Nullable String s3KeyPrefix) {
        this.cloudWatchEncryptionEnabled = cloudWatchEncryptionEnabled;
        this.cloudWatchLogGroupName = cloudWatchLogGroupName;
        this.s3BucketEncryptionEnabled = s3BucketEncryptionEnabled;
        this.s3BucketName = s3BucketName;
        this.s3KeyPrefix = s3KeyPrefix;
    }

    /**
     * @return Whether or not to enable encryption on the CloudWatch logs. If not specified, encryption will be disabled.
     * 
     */
    public Optional<Boolean> cloudWatchEncryptionEnabled() {
        return Optional.ofNullable(this.cloudWatchEncryptionEnabled);
    }
    /**
     * @return The name of the CloudWatch log group to send logs to.
     * 
     */
    public Optional<String> cloudWatchLogGroupName() {
        return Optional.ofNullable(this.cloudWatchLogGroupName);
    }
    /**
     * @return Whether or not to enable encryption on the logs sent to S3. If not specified, encryption will be disabled.
     * 
     */
    public Optional<Boolean> s3BucketEncryptionEnabled() {
        return Optional.ofNullable(this.s3BucketEncryptionEnabled);
    }
    /**
     * @return The name of the S3 bucket to send logs to.
     * 
     */
    public Optional<String> s3BucketName() {
        return Optional.ofNullable(this.s3BucketName);
    }
    /**
     * @return An optional folder in the S3 bucket to place logs in.
     * 
     */
    public Optional<String> s3KeyPrefix() {
        return Optional.ofNullable(this.s3KeyPrefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterConfigurationExecuteCommandConfigurationLogConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean cloudWatchEncryptionEnabled;
        private @Nullable String cloudWatchLogGroupName;
        private @Nullable Boolean s3BucketEncryptionEnabled;
        private @Nullable String s3BucketName;
        private @Nullable String s3KeyPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterConfigurationExecuteCommandConfigurationLogConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatchEncryptionEnabled = defaults.cloudWatchEncryptionEnabled;
    	      this.cloudWatchLogGroupName = defaults.cloudWatchLogGroupName;
    	      this.s3BucketEncryptionEnabled = defaults.s3BucketEncryptionEnabled;
    	      this.s3BucketName = defaults.s3BucketName;
    	      this.s3KeyPrefix = defaults.s3KeyPrefix;
        }

        public Builder cloudWatchEncryptionEnabled(@Nullable Boolean cloudWatchEncryptionEnabled) {
            this.cloudWatchEncryptionEnabled = cloudWatchEncryptionEnabled;
            return this;
        }
        public Builder cloudWatchLogGroupName(@Nullable String cloudWatchLogGroupName) {
            this.cloudWatchLogGroupName = cloudWatchLogGroupName;
            return this;
        }
        public Builder s3BucketEncryptionEnabled(@Nullable Boolean s3BucketEncryptionEnabled) {
            this.s3BucketEncryptionEnabled = s3BucketEncryptionEnabled;
            return this;
        }
        public Builder s3BucketName(@Nullable String s3BucketName) {
            this.s3BucketName = s3BucketName;
            return this;
        }
        public Builder s3KeyPrefix(@Nullable String s3KeyPrefix) {
            this.s3KeyPrefix = s3KeyPrefix;
            return this;
        }        public ClusterConfigurationExecuteCommandConfigurationLogConfiguration build() {
            return new ClusterConfigurationExecuteCommandConfigurationLogConfiguration(cloudWatchEncryptionEnabled, cloudWatchLogGroupName, s3BucketEncryptionEnabled, s3BucketName, s3KeyPrefix);
        }
    }
}
