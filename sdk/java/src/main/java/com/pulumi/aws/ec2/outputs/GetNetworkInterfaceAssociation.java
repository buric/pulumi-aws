// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNetworkInterfaceAssociation {
    /**
     * @return The allocation ID.
     * 
     */
    private final String allocationId;
    /**
     * @return The association ID.
     * 
     */
    private final String associationId;
    /**
     * @return The carrier IP address associated with the network interface. This attribute is only set when the network interface is in a subnet which is associated with a Wavelength Zone.
     * 
     */
    private final String carrierIp;
    /**
     * @return The customer-owned IP address.
     * 
     */
    private final String customerOwnedIp;
    /**
     * @return The ID of the Elastic IP address owner.
     * 
     */
    private final String ipOwnerId;
    /**
     * @return The public DNS name.
     * 
     */
    private final String publicDnsName;
    /**
     * @return The address of the Elastic IP address bound to the network interface.
     * 
     */
    private final String publicIp;

    @CustomType.Constructor
    private GetNetworkInterfaceAssociation(
        @CustomType.Parameter("allocationId") String allocationId,
        @CustomType.Parameter("associationId") String associationId,
        @CustomType.Parameter("carrierIp") String carrierIp,
        @CustomType.Parameter("customerOwnedIp") String customerOwnedIp,
        @CustomType.Parameter("ipOwnerId") String ipOwnerId,
        @CustomType.Parameter("publicDnsName") String publicDnsName,
        @CustomType.Parameter("publicIp") String publicIp) {
        this.allocationId = allocationId;
        this.associationId = associationId;
        this.carrierIp = carrierIp;
        this.customerOwnedIp = customerOwnedIp;
        this.ipOwnerId = ipOwnerId;
        this.publicDnsName = publicDnsName;
        this.publicIp = publicIp;
    }

    /**
     * @return The allocation ID.
     * 
     */
    public String allocationId() {
        return this.allocationId;
    }
    /**
     * @return The association ID.
     * 
     */
    public String associationId() {
        return this.associationId;
    }
    /**
     * @return The carrier IP address associated with the network interface. This attribute is only set when the network interface is in a subnet which is associated with a Wavelength Zone.
     * 
     */
    public String carrierIp() {
        return this.carrierIp;
    }
    /**
     * @return The customer-owned IP address.
     * 
     */
    public String customerOwnedIp() {
        return this.customerOwnedIp;
    }
    /**
     * @return The ID of the Elastic IP address owner.
     * 
     */
    public String ipOwnerId() {
        return this.ipOwnerId;
    }
    /**
     * @return The public DNS name.
     * 
     */
    public String publicDnsName() {
        return this.publicDnsName;
    }
    /**
     * @return The address of the Elastic IP address bound to the network interface.
     * 
     */
    public String publicIp() {
        return this.publicIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkInterfaceAssociation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String allocationId;
        private String associationId;
        private String carrierIp;
        private String customerOwnedIp;
        private String ipOwnerId;
        private String publicDnsName;
        private String publicIp;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkInterfaceAssociation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationId = defaults.allocationId;
    	      this.associationId = defaults.associationId;
    	      this.carrierIp = defaults.carrierIp;
    	      this.customerOwnedIp = defaults.customerOwnedIp;
    	      this.ipOwnerId = defaults.ipOwnerId;
    	      this.publicDnsName = defaults.publicDnsName;
    	      this.publicIp = defaults.publicIp;
        }

        public Builder allocationId(String allocationId) {
            this.allocationId = Objects.requireNonNull(allocationId);
            return this;
        }
        public Builder associationId(String associationId) {
            this.associationId = Objects.requireNonNull(associationId);
            return this;
        }
        public Builder carrierIp(String carrierIp) {
            this.carrierIp = Objects.requireNonNull(carrierIp);
            return this;
        }
        public Builder customerOwnedIp(String customerOwnedIp) {
            this.customerOwnedIp = Objects.requireNonNull(customerOwnedIp);
            return this;
        }
        public Builder ipOwnerId(String ipOwnerId) {
            this.ipOwnerId = Objects.requireNonNull(ipOwnerId);
            return this;
        }
        public Builder publicDnsName(String publicDnsName) {
            this.publicDnsName = Objects.requireNonNull(publicDnsName);
            return this;
        }
        public Builder publicIp(String publicIp) {
            this.publicIp = Objects.requireNonNull(publicIp);
            return this;
        }        public GetNetworkInterfaceAssociation build() {
            return new GetNetworkInterfaceAssociation(allocationId, associationId, carrierIp, customerOwnedIp, ipOwnerId, publicDnsName, publicIp);
        }
    }
}
