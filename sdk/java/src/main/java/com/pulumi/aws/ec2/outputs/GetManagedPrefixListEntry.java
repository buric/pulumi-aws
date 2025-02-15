// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetManagedPrefixListEntry {
    private final String cidr;
    private final String description;

    @CustomType.Constructor
    private GetManagedPrefixListEntry(
        @CustomType.Parameter("cidr") String cidr,
        @CustomType.Parameter("description") String description) {
        this.cidr = cidr;
        this.description = description;
    }

    public String cidr() {
        return this.cidr;
    }
    public String description() {
        return this.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagedPrefixListEntry defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cidr;
        private String description;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagedPrefixListEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
    	      this.description = defaults.description;
        }

        public Builder cidr(String cidr) {
            this.cidr = Objects.requireNonNull(cidr);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }        public GetManagedPrefixListEntry build() {
            return new GetManagedPrefixListEntry(cidr, description);
        }
    }
}
