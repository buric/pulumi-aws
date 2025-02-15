// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DistributionOriginCustomOriginConfig {
    /**
     * @return The HTTP port the custom origin listens on.
     * 
     */
    private final Integer httpPort;
    /**
     * @return The HTTPS port the custom origin listens on.
     * 
     */
    private final Integer httpsPort;
    /**
     * @return The Custom KeepAlive timeout, in seconds. By default, AWS enforces a limit of `60`. But you can request an [increase](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-request-timeout).
     * 
     */
    private final @Nullable Integer originKeepaliveTimeout;
    /**
     * @return The origin protocol policy to apply to
     * your origin. One of `http-only`, `https-only`, or `match-viewer`.
     * 
     */
    private final String originProtocolPolicy;
    /**
     * @return The Custom Read timeout, in seconds. By default, AWS enforces a limit of `60`. But you can request an [increase](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-request-timeout).
     * 
     */
    private final @Nullable Integer originReadTimeout;
    /**
     * @return The SSL/TLS protocols that you want
     * CloudFront to use when communicating with your origin over HTTPS. A list of
     * one or more of `SSLv3`, `TLSv1`, `TLSv1.1`, and `TLSv1.2`.
     * 
     */
    private final List<String> originSslProtocols;

    @CustomType.Constructor
    private DistributionOriginCustomOriginConfig(
        @CustomType.Parameter("httpPort") Integer httpPort,
        @CustomType.Parameter("httpsPort") Integer httpsPort,
        @CustomType.Parameter("originKeepaliveTimeout") @Nullable Integer originKeepaliveTimeout,
        @CustomType.Parameter("originProtocolPolicy") String originProtocolPolicy,
        @CustomType.Parameter("originReadTimeout") @Nullable Integer originReadTimeout,
        @CustomType.Parameter("originSslProtocols") List<String> originSslProtocols) {
        this.httpPort = httpPort;
        this.httpsPort = httpsPort;
        this.originKeepaliveTimeout = originKeepaliveTimeout;
        this.originProtocolPolicy = originProtocolPolicy;
        this.originReadTimeout = originReadTimeout;
        this.originSslProtocols = originSslProtocols;
    }

    /**
     * @return The HTTP port the custom origin listens on.
     * 
     */
    public Integer httpPort() {
        return this.httpPort;
    }
    /**
     * @return The HTTPS port the custom origin listens on.
     * 
     */
    public Integer httpsPort() {
        return this.httpsPort;
    }
    /**
     * @return The Custom KeepAlive timeout, in seconds. By default, AWS enforces a limit of `60`. But you can request an [increase](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-request-timeout).
     * 
     */
    public Optional<Integer> originKeepaliveTimeout() {
        return Optional.ofNullable(this.originKeepaliveTimeout);
    }
    /**
     * @return The origin protocol policy to apply to
     * your origin. One of `http-only`, `https-only`, or `match-viewer`.
     * 
     */
    public String originProtocolPolicy() {
        return this.originProtocolPolicy;
    }
    /**
     * @return The Custom Read timeout, in seconds. By default, AWS enforces a limit of `60`. But you can request an [increase](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-request-timeout).
     * 
     */
    public Optional<Integer> originReadTimeout() {
        return Optional.ofNullable(this.originReadTimeout);
    }
    /**
     * @return The SSL/TLS protocols that you want
     * CloudFront to use when communicating with your origin over HTTPS. A list of
     * one or more of `SSLv3`, `TLSv1`, `TLSv1.1`, and `TLSv1.2`.
     * 
     */
    public List<String> originSslProtocols() {
        return this.originSslProtocols;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOriginCustomOriginConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer httpPort;
        private Integer httpsPort;
        private @Nullable Integer originKeepaliveTimeout;
        private String originProtocolPolicy;
        private @Nullable Integer originReadTimeout;
        private List<String> originSslProtocols;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOriginCustomOriginConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpPort = defaults.httpPort;
    	      this.httpsPort = defaults.httpsPort;
    	      this.originKeepaliveTimeout = defaults.originKeepaliveTimeout;
    	      this.originProtocolPolicy = defaults.originProtocolPolicy;
    	      this.originReadTimeout = defaults.originReadTimeout;
    	      this.originSslProtocols = defaults.originSslProtocols;
        }

        public Builder httpPort(Integer httpPort) {
            this.httpPort = Objects.requireNonNull(httpPort);
            return this;
        }
        public Builder httpsPort(Integer httpsPort) {
            this.httpsPort = Objects.requireNonNull(httpsPort);
            return this;
        }
        public Builder originKeepaliveTimeout(@Nullable Integer originKeepaliveTimeout) {
            this.originKeepaliveTimeout = originKeepaliveTimeout;
            return this;
        }
        public Builder originProtocolPolicy(String originProtocolPolicy) {
            this.originProtocolPolicy = Objects.requireNonNull(originProtocolPolicy);
            return this;
        }
        public Builder originReadTimeout(@Nullable Integer originReadTimeout) {
            this.originReadTimeout = originReadTimeout;
            return this;
        }
        public Builder originSslProtocols(List<String> originSslProtocols) {
            this.originSslProtocols = Objects.requireNonNull(originSslProtocols);
            return this;
        }
        public Builder originSslProtocols(String... originSslProtocols) {
            return originSslProtocols(List.of(originSslProtocols));
        }        public DistributionOriginCustomOriginConfig build() {
            return new DistributionOriginCustomOriginConfig(httpPort, httpsPort, originKeepaliveTimeout, originProtocolPolicy, originReadTimeout, originSslProtocols);
        }
    }
}
