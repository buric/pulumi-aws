// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.VirtualGatewaySpecListenerTlsValidationTrustFile;
import com.pulumi.aws.appmesh.outputs.VirtualGatewaySpecListenerTlsValidationTrustSds;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualGatewaySpecListenerTlsValidationTrust {
    /**
     * @return The TLS validation context trust for a local file certificate.
     * 
     */
    private final @Nullable VirtualGatewaySpecListenerTlsValidationTrustFile file;
    /**
     * @return The TLS validation context trust for a [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    private final @Nullable VirtualGatewaySpecListenerTlsValidationTrustSds sds;

    @CustomType.Constructor
    private VirtualGatewaySpecListenerTlsValidationTrust(
        @CustomType.Parameter("file") @Nullable VirtualGatewaySpecListenerTlsValidationTrustFile file,
        @CustomType.Parameter("sds") @Nullable VirtualGatewaySpecListenerTlsValidationTrustSds sds) {
        this.file = file;
        this.sds = sds;
    }

    /**
     * @return The TLS validation context trust for a local file certificate.
     * 
     */
    public Optional<VirtualGatewaySpecListenerTlsValidationTrustFile> file() {
        return Optional.ofNullable(this.file);
    }
    /**
     * @return The TLS validation context trust for a [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    public Optional<VirtualGatewaySpecListenerTlsValidationTrustSds> sds() {
        return Optional.ofNullable(this.sds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecListenerTlsValidationTrust defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VirtualGatewaySpecListenerTlsValidationTrustFile file;
        private @Nullable VirtualGatewaySpecListenerTlsValidationTrustSds sds;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecListenerTlsValidationTrust defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.file = defaults.file;
    	      this.sds = defaults.sds;
        }

        public Builder file(@Nullable VirtualGatewaySpecListenerTlsValidationTrustFile file) {
            this.file = file;
            return this;
        }
        public Builder sds(@Nullable VirtualGatewaySpecListenerTlsValidationTrustSds sds) {
            this.sds = sds;
            return this;
        }        public VirtualGatewaySpecListenerTlsValidationTrust build() {
            return new VirtualGatewaySpecListenerTlsValidationTrust(file, sds);
        }
    }
}
