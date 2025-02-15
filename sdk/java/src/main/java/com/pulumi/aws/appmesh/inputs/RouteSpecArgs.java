// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteArgs;
import com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteArgs;
import com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteArgs;
import com.pulumi.aws.appmesh.inputs.RouteSpecTcpRouteArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RouteSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteSpecArgs Empty = new RouteSpecArgs();

    /**
     * The gRPC routing information for the route.
     * 
     */
    @Import(name="grpcRoute")
    private @Nullable Output<RouteSpecGrpcRouteArgs> grpcRoute;

    /**
     * @return The gRPC routing information for the route.
     * 
     */
    public Optional<Output<RouteSpecGrpcRouteArgs>> grpcRoute() {
        return Optional.ofNullable(this.grpcRoute);
    }

    /**
     * The HTTP/2 routing information for the route.
     * 
     */
    @Import(name="http2Route")
    private @Nullable Output<RouteSpecHttp2RouteArgs> http2Route;

    /**
     * @return The HTTP/2 routing information for the route.
     * 
     */
    public Optional<Output<RouteSpecHttp2RouteArgs>> http2Route() {
        return Optional.ofNullable(this.http2Route);
    }

    /**
     * The HTTP routing information for the route.
     * 
     */
    @Import(name="httpRoute")
    private @Nullable Output<RouteSpecHttpRouteArgs> httpRoute;

    /**
     * @return The HTTP routing information for the route.
     * 
     */
    public Optional<Output<RouteSpecHttpRouteArgs>> httpRoute() {
        return Optional.ofNullable(this.httpRoute);
    }

    /**
     * The priority for the route, between `0` and `1000`.
     * Routes are matched based on the specified value, where `0` is the highest priority.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return The priority for the route, between `0` and `1000`.
     * Routes are matched based on the specified value, where `0` is the highest priority.
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * The TCP routing information for the route.
     * 
     */
    @Import(name="tcpRoute")
    private @Nullable Output<RouteSpecTcpRouteArgs> tcpRoute;

    /**
     * @return The TCP routing information for the route.
     * 
     */
    public Optional<Output<RouteSpecTcpRouteArgs>> tcpRoute() {
        return Optional.ofNullable(this.tcpRoute);
    }

    private RouteSpecArgs() {}

    private RouteSpecArgs(RouteSpecArgs $) {
        this.grpcRoute = $.grpcRoute;
        this.http2Route = $.http2Route;
        this.httpRoute = $.httpRoute;
        this.priority = $.priority;
        this.tcpRoute = $.tcpRoute;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteSpecArgs $;

        public Builder() {
            $ = new RouteSpecArgs();
        }

        public Builder(RouteSpecArgs defaults) {
            $ = new RouteSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param grpcRoute The gRPC routing information for the route.
         * 
         * @return builder
         * 
         */
        public Builder grpcRoute(@Nullable Output<RouteSpecGrpcRouteArgs> grpcRoute) {
            $.grpcRoute = grpcRoute;
            return this;
        }

        /**
         * @param grpcRoute The gRPC routing information for the route.
         * 
         * @return builder
         * 
         */
        public Builder grpcRoute(RouteSpecGrpcRouteArgs grpcRoute) {
            return grpcRoute(Output.of(grpcRoute));
        }

        /**
         * @param http2Route The HTTP/2 routing information for the route.
         * 
         * @return builder
         * 
         */
        public Builder http2Route(@Nullable Output<RouteSpecHttp2RouteArgs> http2Route) {
            $.http2Route = http2Route;
            return this;
        }

        /**
         * @param http2Route The HTTP/2 routing information for the route.
         * 
         * @return builder
         * 
         */
        public Builder http2Route(RouteSpecHttp2RouteArgs http2Route) {
            return http2Route(Output.of(http2Route));
        }

        /**
         * @param httpRoute The HTTP routing information for the route.
         * 
         * @return builder
         * 
         */
        public Builder httpRoute(@Nullable Output<RouteSpecHttpRouteArgs> httpRoute) {
            $.httpRoute = httpRoute;
            return this;
        }

        /**
         * @param httpRoute The HTTP routing information for the route.
         * 
         * @return builder
         * 
         */
        public Builder httpRoute(RouteSpecHttpRouteArgs httpRoute) {
            return httpRoute(Output.of(httpRoute));
        }

        /**
         * @param priority The priority for the route, between `0` and `1000`.
         * Routes are matched based on the specified value, where `0` is the highest priority.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority The priority for the route, between `0` and `1000`.
         * Routes are matched based on the specified value, where `0` is the highest priority.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param tcpRoute The TCP routing information for the route.
         * 
         * @return builder
         * 
         */
        public Builder tcpRoute(@Nullable Output<RouteSpecTcpRouteArgs> tcpRoute) {
            $.tcpRoute = tcpRoute;
            return this;
        }

        /**
         * @param tcpRoute The TCP routing information for the route.
         * 
         * @return builder
         * 
         */
        public Builder tcpRoute(RouteSpecTcpRouteArgs tcpRoute) {
            return tcpRoute(Output.of(tcpRoute));
        }

        public RouteSpecArgs build() {
            return $;
        }
    }

}
