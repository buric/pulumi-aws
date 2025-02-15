// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.RouteSpecHttpRouteTimeoutIdle;
import com.pulumi.aws.appmesh.outputs.RouteSpecHttpRouteTimeoutPerRequest;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RouteSpecHttpRouteTimeout {
    /**
     * @return The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
     */
    private final @Nullable RouteSpecHttpRouteTimeoutIdle idle;
    /**
     * @return The per request timeout.
     * 
     */
    private final @Nullable RouteSpecHttpRouteTimeoutPerRequest perRequest;

    @CustomType.Constructor
    private RouteSpecHttpRouteTimeout(
        @CustomType.Parameter("idle") @Nullable RouteSpecHttpRouteTimeoutIdle idle,
        @CustomType.Parameter("perRequest") @Nullable RouteSpecHttpRouteTimeoutPerRequest perRequest) {
        this.idle = idle;
        this.perRequest = perRequest;
    }

    /**
     * @return The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
     */
    public Optional<RouteSpecHttpRouteTimeoutIdle> idle() {
        return Optional.ofNullable(this.idle);
    }
    /**
     * @return The per request timeout.
     * 
     */
    public Optional<RouteSpecHttpRouteTimeoutPerRequest> perRequest() {
        return Optional.ofNullable(this.perRequest);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecHttpRouteTimeout defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RouteSpecHttpRouteTimeoutIdle idle;
        private @Nullable RouteSpecHttpRouteTimeoutPerRequest perRequest;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecHttpRouteTimeout defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idle = defaults.idle;
    	      this.perRequest = defaults.perRequest;
        }

        public Builder idle(@Nullable RouteSpecHttpRouteTimeoutIdle idle) {
            this.idle = idle;
            return this;
        }
        public Builder perRequest(@Nullable RouteSpecHttpRouteTimeoutPerRequest perRequest) {
            this.perRequest = perRequest;
            return this;
        }        public RouteSpecHttpRouteTimeout build() {
            return new RouteSpecHttpRouteTimeout(idle, perRequest);
        }
    }
}
