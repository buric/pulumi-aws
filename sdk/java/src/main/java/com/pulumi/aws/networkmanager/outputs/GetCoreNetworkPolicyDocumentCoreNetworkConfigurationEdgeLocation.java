// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocation {
    /**
     * @return The ASN of the Core Network Edge in an AWS Region. By default, the ASN will be a single integer automatically assigned from `asn_ranges`
     * 
     */
    private final @Nullable Integer asn;
    /**
     * @return The local CIDR blocks for this Core Network Edge for AWS Transit Gateway Connect attachments. By default, this CIDR block will be one or more optional IPv4 and IPv6 CIDR prefixes auto-assigned from `inside_cidr_blocks`.
     * 
     */
    private final @Nullable List<String> insideCidrBlocks;
    private final String location;

    @CustomType.Constructor
    private GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocation(
        @CustomType.Parameter("asn") @Nullable Integer asn,
        @CustomType.Parameter("insideCidrBlocks") @Nullable List<String> insideCidrBlocks,
        @CustomType.Parameter("location") String location) {
        this.asn = asn;
        this.insideCidrBlocks = insideCidrBlocks;
        this.location = location;
    }

    /**
     * @return The ASN of the Core Network Edge in an AWS Region. By default, the ASN will be a single integer automatically assigned from `asn_ranges`
     * 
     */
    public Optional<Integer> asn() {
        return Optional.ofNullable(this.asn);
    }
    /**
     * @return The local CIDR blocks for this Core Network Edge for AWS Transit Gateway Connect attachments. By default, this CIDR block will be one or more optional IPv4 and IPv6 CIDR prefixes auto-assigned from `inside_cidr_blocks`.
     * 
     */
    public List<String> insideCidrBlocks() {
        return this.insideCidrBlocks == null ? List.of() : this.insideCidrBlocks;
    }
    public String location() {
        return this.location;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer asn;
        private @Nullable List<String> insideCidrBlocks;
        private String location;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asn = defaults.asn;
    	      this.insideCidrBlocks = defaults.insideCidrBlocks;
    	      this.location = defaults.location;
        }

        public Builder asn(@Nullable Integer asn) {
            this.asn = asn;
            return this;
        }
        public Builder insideCidrBlocks(@Nullable List<String> insideCidrBlocks) {
            this.insideCidrBlocks = insideCidrBlocks;
            return this;
        }
        public Builder insideCidrBlocks(String... insideCidrBlocks) {
            return insideCidrBlocks(List.of(insideCidrBlocks));
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }        public GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocation build() {
            return new GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocation(asn, insideCidrBlocks, location);
        }
    }
}
