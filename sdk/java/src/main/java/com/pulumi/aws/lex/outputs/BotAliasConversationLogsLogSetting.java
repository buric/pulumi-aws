// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BotAliasConversationLogsLogSetting {
    /**
     * @return The destination where logs are delivered. Options are `CLOUDWATCH_LOGS` or `S3`.
     * 
     */
    private final String destination;
    /**
     * @return The Amazon Resource Name (ARN) of the key used to encrypt audio logs in an S3 bucket. This can only be specified when `destination` is set to `S3`. Must be between 20 and 2048 characters in length.
     * 
     */
    private final @Nullable String kmsKeyArn;
    /**
     * @return The type of logging that is enabled. Options are `AUDIO` or `TEXT`.
     * 
     */
    private final String logType;
    /**
     * @return The Amazon Resource Name (ARN) of the CloudWatch Logs log group or S3 bucket where the logs are delivered. Must be less than or equal to 2048 characters in length.
     * 
     */
    private final String resourceArn;
    /**
     * @return The prefix of the S3 object key for `AUDIO` logs or the log stream name for `TEXT` logs.
     * 
     */
    private final @Nullable String resourcePrefix;

    @CustomType.Constructor
    private BotAliasConversationLogsLogSetting(
        @CustomType.Parameter("destination") String destination,
        @CustomType.Parameter("kmsKeyArn") @Nullable String kmsKeyArn,
        @CustomType.Parameter("logType") String logType,
        @CustomType.Parameter("resourceArn") String resourceArn,
        @CustomType.Parameter("resourcePrefix") @Nullable String resourcePrefix) {
        this.destination = destination;
        this.kmsKeyArn = kmsKeyArn;
        this.logType = logType;
        this.resourceArn = resourceArn;
        this.resourcePrefix = resourcePrefix;
    }

    /**
     * @return The destination where logs are delivered. Options are `CLOUDWATCH_LOGS` or `S3`.
     * 
     */
    public String destination() {
        return this.destination;
    }
    /**
     * @return The Amazon Resource Name (ARN) of the key used to encrypt audio logs in an S3 bucket. This can only be specified when `destination` is set to `S3`. Must be between 20 and 2048 characters in length.
     * 
     */
    public Optional<String> kmsKeyArn() {
        return Optional.ofNullable(this.kmsKeyArn);
    }
    /**
     * @return The type of logging that is enabled. Options are `AUDIO` or `TEXT`.
     * 
     */
    public String logType() {
        return this.logType;
    }
    /**
     * @return The Amazon Resource Name (ARN) of the CloudWatch Logs log group or S3 bucket where the logs are delivered. Must be less than or equal to 2048 characters in length.
     * 
     */
    public String resourceArn() {
        return this.resourceArn;
    }
    /**
     * @return The prefix of the S3 object key for `AUDIO` logs or the log stream name for `TEXT` logs.
     * 
     */
    public Optional<String> resourcePrefix() {
        return Optional.ofNullable(this.resourcePrefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasConversationLogsLogSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String destination;
        private @Nullable String kmsKeyArn;
        private String logType;
        private String resourceArn;
        private @Nullable String resourcePrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAliasConversationLogsLogSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.logType = defaults.logType;
    	      this.resourceArn = defaults.resourceArn;
    	      this.resourcePrefix = defaults.resourcePrefix;
        }

        public Builder destination(String destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        public Builder kmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }
        public Builder logType(String logType) {
            this.logType = Objects.requireNonNull(logType);
            return this;
        }
        public Builder resourceArn(String resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }
        public Builder resourcePrefix(@Nullable String resourcePrefix) {
            this.resourcePrefix = resourcePrefix;
            return this;
        }        public BotAliasConversationLogsLogSetting build() {
            return new BotAliasConversationLogsLogSetting(destination, kmsKeyArn, logType, resourceArn, resourcePrefix);
        }
    }
}
