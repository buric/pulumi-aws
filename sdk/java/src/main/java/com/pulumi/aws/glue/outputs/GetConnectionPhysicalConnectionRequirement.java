// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetConnectionPhysicalConnectionRequirement {
    private final String availabilityZone;
    private final List<String> securityGroupIdLists;
    private final String subnetId;

    @CustomType.Constructor
    private GetConnectionPhysicalConnectionRequirement(
        @CustomType.Parameter("availabilityZone") String availabilityZone,
        @CustomType.Parameter("securityGroupIdLists") List<String> securityGroupIdLists,
        @CustomType.Parameter("subnetId") String subnetId) {
        this.availabilityZone = availabilityZone;
        this.securityGroupIdLists = securityGroupIdLists;
        this.subnetId = subnetId;
    }

    public String availabilityZone() {
        return this.availabilityZone;
    }
    public List<String> securityGroupIdLists() {
        return this.securityGroupIdLists;
    }
    public String subnetId() {
        return this.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionPhysicalConnectionRequirement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String availabilityZone;
        private List<String> securityGroupIdLists;
        private String subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectionPhysicalConnectionRequirement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.securityGroupIdLists = defaults.securityGroupIdLists;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder availabilityZone(String availabilityZone) {
            this.availabilityZone = Objects.requireNonNull(availabilityZone);
            return this;
        }
        public Builder securityGroupIdLists(List<String> securityGroupIdLists) {
            this.securityGroupIdLists = Objects.requireNonNull(securityGroupIdLists);
            return this;
        }
        public Builder securityGroupIdLists(String... securityGroupIdLists) {
            return securityGroupIdLists(List.of(securityGroupIdLists));
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }        public GetConnectionPhysicalConnectionRequirement build() {
            return new GetConnectionPhysicalConnectionRequirement(availabilityZone, securityGroupIdLists, subnetId);
        }
    }
}
