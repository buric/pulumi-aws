// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteActionTargetVirtualServiceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class GatewayRouteSpecHttpRouteActionTargetArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayRouteSpecHttpRouteActionTargetArgs Empty = new GatewayRouteSpecHttpRouteActionTargetArgs();

    /**
     * The virtual service gateway route target.
     * 
     */
    @Import(name="virtualService", required=true)
    private Output<GatewayRouteSpecHttpRouteActionTargetVirtualServiceArgs> virtualService;

    /**
     * @return The virtual service gateway route target.
     * 
     */
    public Output<GatewayRouteSpecHttpRouteActionTargetVirtualServiceArgs> virtualService() {
        return this.virtualService;
    }

    private GatewayRouteSpecHttpRouteActionTargetArgs() {}

    private GatewayRouteSpecHttpRouteActionTargetArgs(GatewayRouteSpecHttpRouteActionTargetArgs $) {
        this.virtualService = $.virtualService;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayRouteSpecHttpRouteActionTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayRouteSpecHttpRouteActionTargetArgs $;

        public Builder() {
            $ = new GatewayRouteSpecHttpRouteActionTargetArgs();
        }

        public Builder(GatewayRouteSpecHttpRouteActionTargetArgs defaults) {
            $ = new GatewayRouteSpecHttpRouteActionTargetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param virtualService The virtual service gateway route target.
         * 
         * @return builder
         * 
         */
        public Builder virtualService(Output<GatewayRouteSpecHttpRouteActionTargetVirtualServiceArgs> virtualService) {
            $.virtualService = virtualService;
            return this;
        }

        /**
         * @param virtualService The virtual service gateway route target.
         * 
         * @return builder
         * 
         */
        public Builder virtualService(GatewayRouteSpecHttpRouteActionTargetVirtualServiceArgs virtualService) {
            return virtualService(Output.of(virtualService));
        }

        public GatewayRouteSpecHttpRouteActionTargetArgs build() {
            $.virtualService = Objects.requireNonNull($.virtualService, "expected parameter 'virtualService' to be non-null");
            return $;
        }
    }

}
