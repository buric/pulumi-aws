// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2transitgateway.outputs;

import com.pulumi.aws.ec2transitgateway.outputs.GetPeeringAttachmentFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetPeeringAttachmentResult {
    private final @Nullable List<GetPeeringAttachmentFilter> filters;
    private final String id;
    /**
     * @return Identifier of the peer AWS account
     * 
     */
    private final String peerAccountId;
    /**
     * @return Identifier of the peer AWS region
     * 
     */
    private final String peerRegion;
    /**
     * @return Identifier of the peer EC2 Transit Gateway
     * 
     */
    private final String peerTransitGatewayId;
    private final Map<String,String> tags;
    /**
     * @return Identifier of the local EC2 Transit Gateway
     * 
     */
    private final String transitGatewayId;

    @CustomType.Constructor
    private GetPeeringAttachmentResult(
        @CustomType.Parameter("filters") @Nullable List<GetPeeringAttachmentFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("peerAccountId") String peerAccountId,
        @CustomType.Parameter("peerRegion") String peerRegion,
        @CustomType.Parameter("peerTransitGatewayId") String peerTransitGatewayId,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("transitGatewayId") String transitGatewayId) {
        this.filters = filters;
        this.id = id;
        this.peerAccountId = peerAccountId;
        this.peerRegion = peerRegion;
        this.peerTransitGatewayId = peerTransitGatewayId;
        this.tags = tags;
        this.transitGatewayId = transitGatewayId;
    }

    public List<GetPeeringAttachmentFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return Identifier of the peer AWS account
     * 
     */
    public String peerAccountId() {
        return this.peerAccountId;
    }
    /**
     * @return Identifier of the peer AWS region
     * 
     */
    public String peerRegion() {
        return this.peerRegion;
    }
    /**
     * @return Identifier of the peer EC2 Transit Gateway
     * 
     */
    public String peerTransitGatewayId() {
        return this.peerTransitGatewayId;
    }
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return Identifier of the local EC2 Transit Gateway
     * 
     */
    public String transitGatewayId() {
        return this.transitGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPeeringAttachmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetPeeringAttachmentFilter> filters;
        private String id;
        private String peerAccountId;
        private String peerRegion;
        private String peerTransitGatewayId;
        private Map<String,String> tags;
        private String transitGatewayId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPeeringAttachmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.peerAccountId = defaults.peerAccountId;
    	      this.peerRegion = defaults.peerRegion;
    	      this.peerTransitGatewayId = defaults.peerTransitGatewayId;
    	      this.tags = defaults.tags;
    	      this.transitGatewayId = defaults.transitGatewayId;
        }

        public Builder filters(@Nullable List<GetPeeringAttachmentFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetPeeringAttachmentFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder peerAccountId(String peerAccountId) {
            this.peerAccountId = Objects.requireNonNull(peerAccountId);
            return this;
        }
        public Builder peerRegion(String peerRegion) {
            this.peerRegion = Objects.requireNonNull(peerRegion);
            return this;
        }
        public Builder peerTransitGatewayId(String peerTransitGatewayId) {
            this.peerTransitGatewayId = Objects.requireNonNull(peerTransitGatewayId);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder transitGatewayId(String transitGatewayId) {
            this.transitGatewayId = Objects.requireNonNull(transitGatewayId);
            return this;
        }        public GetPeeringAttachmentResult build() {
            return new GetPeeringAttachmentResult(filters, id, peerAccountId, peerRegion, peerTransitGatewayId, tags, transitGatewayId);
        }
    }
}
