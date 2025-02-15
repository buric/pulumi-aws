// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCoreNetworkPolicyDocumentAttachmentPolicyCondition {
    /**
     * @return string value
     * 
     */
    private final @Nullable String key;
    /**
     * @return Valid values include: `equals`, `not-equals`, `contains`, `begins-with`.
     * 
     */
    private final @Nullable String operator;
    /**
     * @return Valid values include: `account-id`, `any`, `tag-value`, `tag-exists`, `resource-id`, `region`, `attachment-type`.
     * 
     */
    private final String type;
    /**
     * @return string value
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private GetCoreNetworkPolicyDocumentAttachmentPolicyCondition(
        @CustomType.Parameter("key") @Nullable String key,
        @CustomType.Parameter("operator") @Nullable String operator,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("value") @Nullable String value) {
        this.key = key;
        this.operator = operator;
        this.type = type;
        this.value = value;
    }

    /**
     * @return string value
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    /**
     * @return Valid values include: `equals`, `not-equals`, `contains`, `begins-with`.
     * 
     */
    public Optional<String> operator() {
        return Optional.ofNullable(this.operator);
    }
    /**
     * @return Valid values include: `account-id`, `any`, `tag-value`, `tag-exists`, `resource-id`, `region`, `attachment-type`.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return string value
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCoreNetworkPolicyDocumentAttachmentPolicyCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String key;
        private @Nullable String operator;
        private String type;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCoreNetworkPolicyDocumentAttachmentPolicyCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.operator = defaults.operator;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        public Builder operator(@Nullable String operator) {
            this.operator = operator;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public GetCoreNetworkPolicyDocumentAttachmentPolicyCondition build() {
            return new GetCoreNetworkPolicyDocumentAttachmentPolicyCondition(key, operator, type, value);
        }
    }
}
