// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apprunner.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceHealthCheckConfiguration {
    /**
     * @return The number of consecutive checks that must succeed before App Runner decides that the service is healthy. Defaults to 1. Minimum value of 1. Maximum value of 20.
     * 
     */
    private final @Nullable Integer healthyThreshold;
    /**
     * @return The time interval, in seconds, between health checks. Defaults to 5. Minimum value of 1. Maximum value of 20.
     * 
     */
    private final @Nullable Integer interval;
    /**
     * @return The URL to send requests to for health checks. Defaults to `/`. Minimum length of 0. Maximum length of 51200.
     * 
     */
    private final @Nullable String path;
    /**
     * @return The IP protocol that App Runner uses to perform health checks for your service. Valid values: `TCP`, `HTTP`. Defaults to `TCP`. If you set protocol to `HTTP`, App Runner sends health check requests to the HTTP path specified by `path`.
     * 
     */
    private final @Nullable String protocol;
    /**
     * @return The time, in seconds, to wait for a health check response before deciding it failed. Defaults to 2. Minimum value of  1. Maximum value of 20.
     * 
     */
    private final @Nullable Integer timeout;
    /**
     * @return The number of consecutive checks that must fail before App Runner decides that the service is unhealthy. Defaults to 5. Minimum value of  1. Maximum value of 20.
     * 
     */
    private final @Nullable Integer unhealthyThreshold;

    @CustomType.Constructor
    private ServiceHealthCheckConfiguration(
        @CustomType.Parameter("healthyThreshold") @Nullable Integer healthyThreshold,
        @CustomType.Parameter("interval") @Nullable Integer interval,
        @CustomType.Parameter("path") @Nullable String path,
        @CustomType.Parameter("protocol") @Nullable String protocol,
        @CustomType.Parameter("timeout") @Nullable Integer timeout,
        @CustomType.Parameter("unhealthyThreshold") @Nullable Integer unhealthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        this.interval = interval;
        this.path = path;
        this.protocol = protocol;
        this.timeout = timeout;
        this.unhealthyThreshold = unhealthyThreshold;
    }

    /**
     * @return The number of consecutive checks that must succeed before App Runner decides that the service is healthy. Defaults to 1. Minimum value of 1. Maximum value of 20.
     * 
     */
    public Optional<Integer> healthyThreshold() {
        return Optional.ofNullable(this.healthyThreshold);
    }
    /**
     * @return The time interval, in seconds, between health checks. Defaults to 5. Minimum value of 1. Maximum value of 20.
     * 
     */
    public Optional<Integer> interval() {
        return Optional.ofNullable(this.interval);
    }
    /**
     * @return The URL to send requests to for health checks. Defaults to `/`. Minimum length of 0. Maximum length of 51200.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return The IP protocol that App Runner uses to perform health checks for your service. Valid values: `TCP`, `HTTP`. Defaults to `TCP`. If you set protocol to `HTTP`, App Runner sends health check requests to the HTTP path specified by `path`.
     * 
     */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }
    /**
     * @return The time, in seconds, to wait for a health check response before deciding it failed. Defaults to 2. Minimum value of  1. Maximum value of 20.
     * 
     */
    public Optional<Integer> timeout() {
        return Optional.ofNullable(this.timeout);
    }
    /**
     * @return The number of consecutive checks that must fail before App Runner decides that the service is unhealthy. Defaults to 5. Minimum value of  1. Maximum value of 20.
     * 
     */
    public Optional<Integer> unhealthyThreshold() {
        return Optional.ofNullable(this.unhealthyThreshold);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceHealthCheckConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer healthyThreshold;
        private @Nullable Integer interval;
        private @Nullable String path;
        private @Nullable String protocol;
        private @Nullable Integer timeout;
        private @Nullable Integer unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceHealthCheckConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.interval = defaults.interval;
    	      this.path = defaults.path;
    	      this.protocol = defaults.protocol;
    	      this.timeout = defaults.timeout;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        public Builder healthyThreshold(@Nullable Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Builder interval(@Nullable Integer interval) {
            this.interval = interval;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder timeout(@Nullable Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder unhealthyThreshold(@Nullable Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }        public ServiceHealthCheckConfiguration build() {
            return new ServiceHealthCheckConfiguration(healthyThreshold, interval, path, protocol, timeout, unhealthyThreshold);
        }
    }
}
