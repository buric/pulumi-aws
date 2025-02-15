// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.eks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterVpcConfig {
    /**
     * @return Cluster security group that was created by Amazon EKS for the cluster. Managed node groups use this security group for control-plane-to-data-plane communication.
     * 
     */
    private final @Nullable String clusterSecurityGroupId;
    /**
     * @return Whether the Amazon EKS private API server endpoint is enabled. Default is `false`.
     * 
     */
    private final @Nullable Boolean endpointPrivateAccess;
    /**
     * @return Whether the Amazon EKS public API server endpoint is enabled. Default is `true`.
     * 
     */
    private final @Nullable Boolean endpointPublicAccess;
    /**
     * @return List of CIDR blocks. Indicates which CIDR blocks can access the Amazon EKS public API server endpoint when enabled. EKS defaults this to a list with `0.0.0.0/0`. This provider will only perform drift detection of its value when present in a configuration.
     * 
     */
    private final @Nullable List<String> publicAccessCidrs;
    /**
     * @return List of security group IDs for the cross-account elastic network interfaces that Amazon EKS creates to use to allow communication between your worker nodes and the Kubernetes control plane.
     * 
     */
    private final @Nullable List<String> securityGroupIds;
    /**
     * @return List of subnet IDs. Must be in at least two different availability zones. Amazon EKS creates cross-account elastic network interfaces in these subnets to allow communication between your worker nodes and the Kubernetes control plane.
     * 
     */
    private final List<String> subnetIds;
    /**
     * @return ID of the VPC associated with your cluster.
     * 
     */
    private final @Nullable String vpcId;

    @CustomType.Constructor
    private ClusterVpcConfig(
        @CustomType.Parameter("clusterSecurityGroupId") @Nullable String clusterSecurityGroupId,
        @CustomType.Parameter("endpointPrivateAccess") @Nullable Boolean endpointPrivateAccess,
        @CustomType.Parameter("endpointPublicAccess") @Nullable Boolean endpointPublicAccess,
        @CustomType.Parameter("publicAccessCidrs") @Nullable List<String> publicAccessCidrs,
        @CustomType.Parameter("securityGroupIds") @Nullable List<String> securityGroupIds,
        @CustomType.Parameter("subnetIds") List<String> subnetIds,
        @CustomType.Parameter("vpcId") @Nullable String vpcId) {
        this.clusterSecurityGroupId = clusterSecurityGroupId;
        this.endpointPrivateAccess = endpointPrivateAccess;
        this.endpointPublicAccess = endpointPublicAccess;
        this.publicAccessCidrs = publicAccessCidrs;
        this.securityGroupIds = securityGroupIds;
        this.subnetIds = subnetIds;
        this.vpcId = vpcId;
    }

    /**
     * @return Cluster security group that was created by Amazon EKS for the cluster. Managed node groups use this security group for control-plane-to-data-plane communication.
     * 
     */
    public Optional<String> clusterSecurityGroupId() {
        return Optional.ofNullable(this.clusterSecurityGroupId);
    }
    /**
     * @return Whether the Amazon EKS private API server endpoint is enabled. Default is `false`.
     * 
     */
    public Optional<Boolean> endpointPrivateAccess() {
        return Optional.ofNullable(this.endpointPrivateAccess);
    }
    /**
     * @return Whether the Amazon EKS public API server endpoint is enabled. Default is `true`.
     * 
     */
    public Optional<Boolean> endpointPublicAccess() {
        return Optional.ofNullable(this.endpointPublicAccess);
    }
    /**
     * @return List of CIDR blocks. Indicates which CIDR blocks can access the Amazon EKS public API server endpoint when enabled. EKS defaults this to a list with `0.0.0.0/0`. This provider will only perform drift detection of its value when present in a configuration.
     * 
     */
    public List<String> publicAccessCidrs() {
        return this.publicAccessCidrs == null ? List.of() : this.publicAccessCidrs;
    }
    /**
     * @return List of security group IDs for the cross-account elastic network interfaces that Amazon EKS creates to use to allow communication between your worker nodes and the Kubernetes control plane.
     * 
     */
    public List<String> securityGroupIds() {
        return this.securityGroupIds == null ? List.of() : this.securityGroupIds;
    }
    /**
     * @return List of subnet IDs. Must be in at least two different availability zones. Amazon EKS creates cross-account elastic network interfaces in these subnets to allow communication between your worker nodes and the Kubernetes control plane.
     * 
     */
    public List<String> subnetIds() {
        return this.subnetIds;
    }
    /**
     * @return ID of the VPC associated with your cluster.
     * 
     */
    public Optional<String> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterVpcConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clusterSecurityGroupId;
        private @Nullable Boolean endpointPrivateAccess;
        private @Nullable Boolean endpointPublicAccess;
        private @Nullable List<String> publicAccessCidrs;
        private @Nullable List<String> securityGroupIds;
        private List<String> subnetIds;
        private @Nullable String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterVpcConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterSecurityGroupId = defaults.clusterSecurityGroupId;
    	      this.endpointPrivateAccess = defaults.endpointPrivateAccess;
    	      this.endpointPublicAccess = defaults.endpointPublicAccess;
    	      this.publicAccessCidrs = defaults.publicAccessCidrs;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder clusterSecurityGroupId(@Nullable String clusterSecurityGroupId) {
            this.clusterSecurityGroupId = clusterSecurityGroupId;
            return this;
        }
        public Builder endpointPrivateAccess(@Nullable Boolean endpointPrivateAccess) {
            this.endpointPrivateAccess = endpointPrivateAccess;
            return this;
        }
        public Builder endpointPublicAccess(@Nullable Boolean endpointPublicAccess) {
            this.endpointPublicAccess = endpointPublicAccess;
            return this;
        }
        public Builder publicAccessCidrs(@Nullable List<String> publicAccessCidrs) {
            this.publicAccessCidrs = publicAccessCidrs;
            return this;
        }
        public Builder publicAccessCidrs(String... publicAccessCidrs) {
            return publicAccessCidrs(List.of(publicAccessCidrs));
        }
        public Builder securityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }
        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = vpcId;
            return this;
        }        public ClusterVpcConfig build() {
            return new ClusterVpcConfig(clusterSecurityGroupId, endpointPrivateAccess, endpointPublicAccess, publicAccessCidrs, securityGroupIds, subnetIds, vpcId);
        }
    }
}
