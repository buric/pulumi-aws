// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VpcEndpointDnsOptions {
    /**
     * @return The DNS records created for the endpoint. Valid values are `ipv4`, `dualstack`, `service-defined`, and `ipv6`.
     * 
     */
    private final @Nullable String dnsRecordIpType;

    @CustomType.Constructor
    private VpcEndpointDnsOptions(@CustomType.Parameter("dnsRecordIpType") @Nullable String dnsRecordIpType) {
        this.dnsRecordIpType = dnsRecordIpType;
    }

    /**
     * @return The DNS records created for the endpoint. Valid values are `ipv4`, `dualstack`, `service-defined`, and `ipv6`.
     * 
     */
    public Optional<String> dnsRecordIpType() {
        return Optional.ofNullable(this.dnsRecordIpType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcEndpointDnsOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dnsRecordIpType;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcEndpointDnsOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsRecordIpType = defaults.dnsRecordIpType;
        }

        public Builder dnsRecordIpType(@Nullable String dnsRecordIpType) {
            this.dnsRecordIpType = dnsRecordIpType;
            return this;
        }        public VpcEndpointDnsOptions build() {
            return new VpcEndpointDnsOptions(dnsRecordIpType);
        }
    }
}
