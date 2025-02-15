// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class IntentFulfillmentActivityCodeHook {
    /**
     * @return The version of the request-response that you want Amazon Lex to use
     * to invoke your Lambda function. For more information, see
     * [Using Lambda Functions](https://docs.aws.amazon.com/lex/latest/dg/using-lambda.html). Must be less than or equal to 5 characters in length.
     * 
     */
    private final String messageVersion;
    /**
     * @return The Amazon Resource Name (ARN) of the Lambda function.
     * 
     */
    private final String uri;

    @CustomType.Constructor
    private IntentFulfillmentActivityCodeHook(
        @CustomType.Parameter("messageVersion") String messageVersion,
        @CustomType.Parameter("uri") String uri) {
        this.messageVersion = messageVersion;
        this.uri = uri;
    }

    /**
     * @return The version of the request-response that you want Amazon Lex to use
     * to invoke your Lambda function. For more information, see
     * [Using Lambda Functions](https://docs.aws.amazon.com/lex/latest/dg/using-lambda.html). Must be less than or equal to 5 characters in length.
     * 
     */
    public String messageVersion() {
        return this.messageVersion;
    }
    /**
     * @return The Amazon Resource Name (ARN) of the Lambda function.
     * 
     */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntentFulfillmentActivityCodeHook defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String messageVersion;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(IntentFulfillmentActivityCodeHook defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageVersion = defaults.messageVersion;
    	      this.uri = defaults.uri;
        }

        public Builder messageVersion(String messageVersion) {
            this.messageVersion = Objects.requireNonNull(messageVersion);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }        public IntentFulfillmentActivityCodeHook build() {
            return new IntentFulfillmentActivityCodeHook(messageVersion, uri);
        }
    }
}
