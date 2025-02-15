// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputArgs Empty = new ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputArgs();

    /**
     * The ARN of the destination Lambda function to write to.
     * 
     */
    @Import(name="resourceArn", required=true)
    private Output<String> resourceArn;

    /**
     * @return The ARN of the destination Lambda function to write to.
     * 
     */
    public Output<String> resourceArn() {
        return this.resourceArn;
    }

    private ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputArgs() {}

    private ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputArgs(ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputArgs $) {
        this.resourceArn = $.resourceArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputArgs $;

        public Builder() {
            $ = new ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputArgs();
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputArgs defaults) {
            $ = new ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceArn The ARN of the destination Lambda function to write to.
         * 
         * @return builder
         * 
         */
        public Builder resourceArn(Output<String> resourceArn) {
            $.resourceArn = resourceArn;
            return this;
        }

        /**
         * @param resourceArn The ARN of the destination Lambda function to write to.
         * 
         * @return builder
         * 
         */
        public Builder resourceArn(String resourceArn) {
            return resourceArn(Output.of(resourceArn));
        }

        public ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputArgs build() {
            $.resourceArn = Objects.requireNonNull($.resourceArn, "expected parameter 'resourceArn' to be non-null");
            return $;
        }
    }

}
