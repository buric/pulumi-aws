// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class RouteSpecHttp2RouteActionWeightedTargetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteSpecHttp2RouteActionWeightedTargetArgs Empty = new RouteSpecHttp2RouteActionWeightedTargetArgs();

    /**
     * The virtual node to associate with the weighted target. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="virtualNode", required=true)
    private Output<String> virtualNode;

    /**
     * @return The virtual node to associate with the weighted target. Must be between 1 and 255 characters in length.
     * 
     */
    public Output<String> virtualNode() {
        return this.virtualNode;
    }

    /**
     * The relative weight of the weighted target. An integer between 0 and 100.
     * 
     */
    @Import(name="weight", required=true)
    private Output<Integer> weight;

    /**
     * @return The relative weight of the weighted target. An integer between 0 and 100.
     * 
     */
    public Output<Integer> weight() {
        return this.weight;
    }

    private RouteSpecHttp2RouteActionWeightedTargetArgs() {}

    private RouteSpecHttp2RouteActionWeightedTargetArgs(RouteSpecHttp2RouteActionWeightedTargetArgs $) {
        this.virtualNode = $.virtualNode;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteSpecHttp2RouteActionWeightedTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteSpecHttp2RouteActionWeightedTargetArgs $;

        public Builder() {
            $ = new RouteSpecHttp2RouteActionWeightedTargetArgs();
        }

        public Builder(RouteSpecHttp2RouteActionWeightedTargetArgs defaults) {
            $ = new RouteSpecHttp2RouteActionWeightedTargetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param virtualNode The virtual node to associate with the weighted target. Must be between 1 and 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder virtualNode(Output<String> virtualNode) {
            $.virtualNode = virtualNode;
            return this;
        }

        /**
         * @param virtualNode The virtual node to associate with the weighted target. Must be between 1 and 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder virtualNode(String virtualNode) {
            return virtualNode(Output.of(virtualNode));
        }

        /**
         * @param weight The relative weight of the weighted target. An integer between 0 and 100.
         * 
         * @return builder
         * 
         */
        public Builder weight(Output<Integer> weight) {
            $.weight = weight;
            return this;
        }

        /**
         * @param weight The relative weight of the weighted target. An integer between 0 and 100.
         * 
         * @return builder
         * 
         */
        public Builder weight(Integer weight) {
            return weight(Output.of(weight));
        }

        public RouteSpecHttp2RouteActionWeightedTargetArgs build() {
            $.virtualNode = Objects.requireNonNull($.virtualNode, "expected parameter 'virtualNode' to be non-null");
            $.weight = Objects.requireNonNull($.weight, "expected parameter 'weight' to be non-null");
            return $;
        }
    }

}
