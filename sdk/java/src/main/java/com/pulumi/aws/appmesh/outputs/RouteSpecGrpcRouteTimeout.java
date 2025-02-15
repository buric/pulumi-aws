// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.RouteSpecGrpcRouteTimeoutIdle;
import com.pulumi.aws.appmesh.outputs.RouteSpecGrpcRouteTimeoutPerRequest;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RouteSpecGrpcRouteTimeout {
    /**
     * @return The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
     */
    private final @Nullable RouteSpecGrpcRouteTimeoutIdle idle;
    /**
     * @return The per request timeout.
     * 
     */
    private final @Nullable RouteSpecGrpcRouteTimeoutPerRequest perRequest;

    @CustomType.Constructor
    private RouteSpecGrpcRouteTimeout(
        @CustomType.Parameter("idle") @Nullable RouteSpecGrpcRouteTimeoutIdle idle,
        @CustomType.Parameter("perRequest") @Nullable RouteSpecGrpcRouteTimeoutPerRequest perRequest) {
        this.idle = idle;
        this.perRequest = perRequest;
    }

    /**
     * @return The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
     */
    public Optional<RouteSpecGrpcRouteTimeoutIdle> idle() {
        return Optional.ofNullable(this.idle);
    }
    /**
     * @return The per request timeout.
     * 
     */
    public Optional<RouteSpecGrpcRouteTimeoutPerRequest> perRequest() {
        return Optional.ofNullable(this.perRequest);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecGrpcRouteTimeout defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RouteSpecGrpcRouteTimeoutIdle idle;
        private @Nullable RouteSpecGrpcRouteTimeoutPerRequest perRequest;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecGrpcRouteTimeout defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idle = defaults.idle;
    	      this.perRequest = defaults.perRequest;
        }

        public Builder idle(@Nullable RouteSpecGrpcRouteTimeoutIdle idle) {
            this.idle = idle;
            return this;
        }
        public Builder perRequest(@Nullable RouteSpecGrpcRouteTimeoutPerRequest perRequest) {
            this.perRequest = perRequest;
            return this;
        }        public RouteSpecGrpcRouteTimeout build() {
            return new RouteSpecGrpcRouteTimeout(idle, perRequest);
        }
    }
}
