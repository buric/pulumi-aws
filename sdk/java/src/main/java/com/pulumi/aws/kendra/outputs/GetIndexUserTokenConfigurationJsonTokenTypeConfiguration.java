// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kendra.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetIndexUserTokenConfigurationJsonTokenTypeConfiguration {
    /**
     * @return The group attribute field.
     * 
     */
    private final String groupAttributeField;
    /**
     * @return The user name attribute field.
     * 
     */
    private final String userNameAttributeField;

    @CustomType.Constructor
    private GetIndexUserTokenConfigurationJsonTokenTypeConfiguration(
        @CustomType.Parameter("groupAttributeField") String groupAttributeField,
        @CustomType.Parameter("userNameAttributeField") String userNameAttributeField) {
        this.groupAttributeField = groupAttributeField;
        this.userNameAttributeField = userNameAttributeField;
    }

    /**
     * @return The group attribute field.
     * 
     */
    public String groupAttributeField() {
        return this.groupAttributeField;
    }
    /**
     * @return The user name attribute field.
     * 
     */
    public String userNameAttributeField() {
        return this.userNameAttributeField;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIndexUserTokenConfigurationJsonTokenTypeConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String groupAttributeField;
        private String userNameAttributeField;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIndexUserTokenConfigurationJsonTokenTypeConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupAttributeField = defaults.groupAttributeField;
    	      this.userNameAttributeField = defaults.userNameAttributeField;
        }

        public Builder groupAttributeField(String groupAttributeField) {
            this.groupAttributeField = Objects.requireNonNull(groupAttributeField);
            return this;
        }
        public Builder userNameAttributeField(String userNameAttributeField) {
            this.userNameAttributeField = Objects.requireNonNull(userNameAttributeField);
            return this;
        }        public GetIndexUserTokenConfigurationJsonTokenTypeConfiguration build() {
            return new GetIndexUserTokenConfigurationJsonTokenTypeConfiguration(groupAttributeField, userNameAttributeField);
        }
    }
}
