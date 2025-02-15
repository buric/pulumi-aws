// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerConnectionPoolArgs;
import com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerHealthCheckArgs;
import com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerPortMappingArgs;
import com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualGatewaySpecListenerArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecListenerArgs Empty = new VirtualGatewaySpecListenerArgs();

    /**
     * The connection pool information for the listener.
     * 
     */
    @Import(name="connectionPool")
    private @Nullable Output<VirtualGatewaySpecListenerConnectionPoolArgs> connectionPool;

    /**
     * @return The connection pool information for the listener.
     * 
     */
    public Optional<Output<VirtualGatewaySpecListenerConnectionPoolArgs>> connectionPool() {
        return Optional.ofNullable(this.connectionPool);
    }

    /**
     * The health check information for the listener.
     * 
     */
    @Import(name="healthCheck")
    private @Nullable Output<VirtualGatewaySpecListenerHealthCheckArgs> healthCheck;

    /**
     * @return The health check information for the listener.
     * 
     */
    public Optional<Output<VirtualGatewaySpecListenerHealthCheckArgs>> healthCheck() {
        return Optional.ofNullable(this.healthCheck);
    }

    /**
     * The port mapping information for the listener.
     * 
     */
    @Import(name="portMapping", required=true)
    private Output<VirtualGatewaySpecListenerPortMappingArgs> portMapping;

    /**
     * @return The port mapping information for the listener.
     * 
     */
    public Output<VirtualGatewaySpecListenerPortMappingArgs> portMapping() {
        return this.portMapping;
    }

    /**
     * The Transport Layer Security (TLS) properties for the listener
     * 
     */
    @Import(name="tls")
    private @Nullable Output<VirtualGatewaySpecListenerTlsArgs> tls;

    /**
     * @return The Transport Layer Security (TLS) properties for the listener
     * 
     */
    public Optional<Output<VirtualGatewaySpecListenerTlsArgs>> tls() {
        return Optional.ofNullable(this.tls);
    }

    private VirtualGatewaySpecListenerArgs() {}

    private VirtualGatewaySpecListenerArgs(VirtualGatewaySpecListenerArgs $) {
        this.connectionPool = $.connectionPool;
        this.healthCheck = $.healthCheck;
        this.portMapping = $.portMapping;
        this.tls = $.tls;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualGatewaySpecListenerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualGatewaySpecListenerArgs $;

        public Builder() {
            $ = new VirtualGatewaySpecListenerArgs();
        }

        public Builder(VirtualGatewaySpecListenerArgs defaults) {
            $ = new VirtualGatewaySpecListenerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionPool The connection pool information for the listener.
         * 
         * @return builder
         * 
         */
        public Builder connectionPool(@Nullable Output<VirtualGatewaySpecListenerConnectionPoolArgs> connectionPool) {
            $.connectionPool = connectionPool;
            return this;
        }

        /**
         * @param connectionPool The connection pool information for the listener.
         * 
         * @return builder
         * 
         */
        public Builder connectionPool(VirtualGatewaySpecListenerConnectionPoolArgs connectionPool) {
            return connectionPool(Output.of(connectionPool));
        }

        /**
         * @param healthCheck The health check information for the listener.
         * 
         * @return builder
         * 
         */
        public Builder healthCheck(@Nullable Output<VirtualGatewaySpecListenerHealthCheckArgs> healthCheck) {
            $.healthCheck = healthCheck;
            return this;
        }

        /**
         * @param healthCheck The health check information for the listener.
         * 
         * @return builder
         * 
         */
        public Builder healthCheck(VirtualGatewaySpecListenerHealthCheckArgs healthCheck) {
            return healthCheck(Output.of(healthCheck));
        }

        /**
         * @param portMapping The port mapping information for the listener.
         * 
         * @return builder
         * 
         */
        public Builder portMapping(Output<VirtualGatewaySpecListenerPortMappingArgs> portMapping) {
            $.portMapping = portMapping;
            return this;
        }

        /**
         * @param portMapping The port mapping information for the listener.
         * 
         * @return builder
         * 
         */
        public Builder portMapping(VirtualGatewaySpecListenerPortMappingArgs portMapping) {
            return portMapping(Output.of(portMapping));
        }

        /**
         * @param tls The Transport Layer Security (TLS) properties for the listener
         * 
         * @return builder
         * 
         */
        public Builder tls(@Nullable Output<VirtualGatewaySpecListenerTlsArgs> tls) {
            $.tls = tls;
            return this;
        }

        /**
         * @param tls The Transport Layer Security (TLS) properties for the listener
         * 
         * @return builder
         * 
         */
        public Builder tls(VirtualGatewaySpecListenerTlsArgs tls) {
            return tls(Output.of(tls));
        }

        public VirtualGatewaySpecListenerArgs build() {
            $.portMapping = Objects.requireNonNull($.portMapping, "expected parameter 'portMapping' to be non-null");
            return $;
        }
    }

}
