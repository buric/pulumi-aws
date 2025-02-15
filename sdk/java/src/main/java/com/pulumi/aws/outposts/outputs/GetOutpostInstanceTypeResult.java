// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.outposts.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetOutpostInstanceTypeResult {
    private final String arn;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String instanceType;
    private final @Nullable List<String> preferredInstanceTypes;

    @CustomType.Constructor
    private GetOutpostInstanceTypeResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("instanceType") String instanceType,
        @CustomType.Parameter("preferredInstanceTypes") @Nullable List<String> preferredInstanceTypes) {
        this.arn = arn;
        this.id = id;
        this.instanceType = instanceType;
        this.preferredInstanceTypes = preferredInstanceTypes;
    }

    public String arn() {
        return this.arn;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String instanceType() {
        return this.instanceType;
    }
    public List<String> preferredInstanceTypes() {
        return this.preferredInstanceTypes == null ? List.of() : this.preferredInstanceTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOutpostInstanceTypeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String id;
        private String instanceType;
        private @Nullable List<String> preferredInstanceTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOutpostInstanceTypeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
    	      this.instanceType = defaults.instanceType;
    	      this.preferredInstanceTypes = defaults.preferredInstanceTypes;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public Builder preferredInstanceTypes(@Nullable List<String> preferredInstanceTypes) {
            this.preferredInstanceTypes = preferredInstanceTypes;
            return this;
        }
        public Builder preferredInstanceTypes(String... preferredInstanceTypes) {
            return preferredInstanceTypes(List.of(preferredInstanceTypes));
        }        public GetOutpostInstanceTypeResult build() {
            return new GetOutpostInstanceTypeResult(arn, id, instanceType, preferredInstanceTypes);
        }
    }
}
