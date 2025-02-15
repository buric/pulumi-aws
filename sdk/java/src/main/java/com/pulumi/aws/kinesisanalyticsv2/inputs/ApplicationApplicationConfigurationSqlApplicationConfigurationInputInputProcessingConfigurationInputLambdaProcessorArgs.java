// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationInputLambdaProcessorArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationInputLambdaProcessorArgs Empty = new ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationInputLambdaProcessorArgs();

    /**
     * The ARN of the Lambda function that operates on records in the stream.
     * 
     */
    @Import(name="resourceArn", required=true)
    private Output<String> resourceArn;

    /**
     * @return The ARN of the Lambda function that operates on records in the stream.
     * 
     */
    public Output<String> resourceArn() {
        return this.resourceArn;
    }

    private ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationInputLambdaProcessorArgs() {}

    private ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationInputLambdaProcessorArgs(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationInputLambdaProcessorArgs $) {
        this.resourceArn = $.resourceArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationInputLambdaProcessorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationInputLambdaProcessorArgs $;

        public Builder() {
            $ = new ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationInputLambdaProcessorArgs();
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationInputLambdaProcessorArgs defaults) {
            $ = new ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationInputLambdaProcessorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceArn The ARN of the Lambda function that operates on records in the stream.
         * 
         * @return builder
         * 
         */
        public Builder resourceArn(Output<String> resourceArn) {
            $.resourceArn = resourceArn;
            return this;
        }

        /**
         * @param resourceArn The ARN of the Lambda function that operates on records in the stream.
         * 
         * @return builder
         * 
         */
        public Builder resourceArn(String resourceArn) {
            return resourceArn(Output.of(resourceArn));
        }

        public ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationInputLambdaProcessorArgs build() {
            $.resourceArn = Objects.requireNonNull($.resourceArn, "expected parameter 'resourceArn' to be non-null");
            return $;
        }
    }

}
