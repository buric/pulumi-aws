// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TopicRuleErrorActionSns {
    /**
     * @return The message format of the message to publish. Accepted values are &#34;JSON&#34; and &#34;RAW&#34;.
     * 
     */
    private final @Nullable String messageFormat;
    /**
     * @return The ARN of the IAM role that grants access.
     * 
     */
    private final String roleArn;
    /**
     * @return The ARN of the SNS topic.
     * 
     */
    private final String targetArn;

    @CustomType.Constructor
    private TopicRuleErrorActionSns(
        @CustomType.Parameter("messageFormat") @Nullable String messageFormat,
        @CustomType.Parameter("roleArn") String roleArn,
        @CustomType.Parameter("targetArn") String targetArn) {
        this.messageFormat = messageFormat;
        this.roleArn = roleArn;
        this.targetArn = targetArn;
    }

    /**
     * @return The message format of the message to publish. Accepted values are &#34;JSON&#34; and &#34;RAW&#34;.
     * 
     */
    public Optional<String> messageFormat() {
        return Optional.ofNullable(this.messageFormat);
    }
    /**
     * @return The ARN of the IAM role that grants access.
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }
    /**
     * @return The ARN of the SNS topic.
     * 
     */
    public String targetArn() {
        return this.targetArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleErrorActionSns defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String messageFormat;
        private String roleArn;
        private String targetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleErrorActionSns defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageFormat = defaults.messageFormat;
    	      this.roleArn = defaults.roleArn;
    	      this.targetArn = defaults.targetArn;
        }

        public Builder messageFormat(@Nullable String messageFormat) {
            this.messageFormat = messageFormat;
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder targetArn(String targetArn) {
            this.targetArn = Objects.requireNonNull(targetArn);
            return this;
        }        public TopicRuleErrorActionSns build() {
            return new TopicRuleErrorActionSns(messageFormat, roleArn, targetArn);
        }
    }
}
