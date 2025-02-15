// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudhsmv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterClusterCertificate {
    private final @Nullable String awsHardwareCertificate;
    private final @Nullable String clusterCertificate;
    private final @Nullable String clusterCsr;
    private final @Nullable String hsmCertificate;
    private final @Nullable String manufacturerHardwareCertificate;

    @CustomType.Constructor
    private ClusterClusterCertificate(
        @CustomType.Parameter("awsHardwareCertificate") @Nullable String awsHardwareCertificate,
        @CustomType.Parameter("clusterCertificate") @Nullable String clusterCertificate,
        @CustomType.Parameter("clusterCsr") @Nullable String clusterCsr,
        @CustomType.Parameter("hsmCertificate") @Nullable String hsmCertificate,
        @CustomType.Parameter("manufacturerHardwareCertificate") @Nullable String manufacturerHardwareCertificate) {
        this.awsHardwareCertificate = awsHardwareCertificate;
        this.clusterCertificate = clusterCertificate;
        this.clusterCsr = clusterCsr;
        this.hsmCertificate = hsmCertificate;
        this.manufacturerHardwareCertificate = manufacturerHardwareCertificate;
    }

    public Optional<String> awsHardwareCertificate() {
        return Optional.ofNullable(this.awsHardwareCertificate);
    }
    public Optional<String> clusterCertificate() {
        return Optional.ofNullable(this.clusterCertificate);
    }
    public Optional<String> clusterCsr() {
        return Optional.ofNullable(this.clusterCsr);
    }
    public Optional<String> hsmCertificate() {
        return Optional.ofNullable(this.hsmCertificate);
    }
    public Optional<String> manufacturerHardwareCertificate() {
        return Optional.ofNullable(this.manufacturerHardwareCertificate);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterCertificate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String awsHardwareCertificate;
        private @Nullable String clusterCertificate;
        private @Nullable String clusterCsr;
        private @Nullable String hsmCertificate;
        private @Nullable String manufacturerHardwareCertificate;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsHardwareCertificate = defaults.awsHardwareCertificate;
    	      this.clusterCertificate = defaults.clusterCertificate;
    	      this.clusterCsr = defaults.clusterCsr;
    	      this.hsmCertificate = defaults.hsmCertificate;
    	      this.manufacturerHardwareCertificate = defaults.manufacturerHardwareCertificate;
        }

        public Builder awsHardwareCertificate(@Nullable String awsHardwareCertificate) {
            this.awsHardwareCertificate = awsHardwareCertificate;
            return this;
        }
        public Builder clusterCertificate(@Nullable String clusterCertificate) {
            this.clusterCertificate = clusterCertificate;
            return this;
        }
        public Builder clusterCsr(@Nullable String clusterCsr) {
            this.clusterCsr = clusterCsr;
            return this;
        }
        public Builder hsmCertificate(@Nullable String hsmCertificate) {
            this.hsmCertificate = hsmCertificate;
            return this;
        }
        public Builder manufacturerHardwareCertificate(@Nullable String manufacturerHardwareCertificate) {
            this.manufacturerHardwareCertificate = manufacturerHardwareCertificate;
            return this;
        }        public ClusterClusterCertificate build() {
            return new ClusterClusterCertificate(awsHardwareCertificate, clusterCertificate, clusterCsr, hsmCertificate, manufacturerHardwareCertificate);
        }
    }
}
