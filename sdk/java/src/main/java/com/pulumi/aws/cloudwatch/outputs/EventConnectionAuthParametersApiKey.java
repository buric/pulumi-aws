// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EventConnectionAuthParametersApiKey {
    /**
     * @return Header Name.
     * 
     */
    private final String key;
    /**
     * @return Header Value. Created and stored in AWS Secrets Manager.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private EventConnectionAuthParametersApiKey(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("value") String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * @return Header Name.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Header Value. Created and stored in AWS Secrets Manager.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventConnectionAuthParametersApiKey defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(EventConnectionAuthParametersApiKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public EventConnectionAuthParametersApiKey build() {
            return new EventConnectionAuthParametersApiKey(key, value);
        }
    }
}
