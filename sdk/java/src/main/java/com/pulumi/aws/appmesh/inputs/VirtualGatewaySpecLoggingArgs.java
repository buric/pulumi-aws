// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecLoggingAccessLogArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualGatewaySpecLoggingArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecLoggingArgs Empty = new VirtualGatewaySpecLoggingArgs();

    /**
     * The access log configuration for a virtual gateway.
     * 
     */
    @Import(name="accessLog")
    private @Nullable Output<VirtualGatewaySpecLoggingAccessLogArgs> accessLog;

    /**
     * @return The access log configuration for a virtual gateway.
     * 
     */
    public Optional<Output<VirtualGatewaySpecLoggingAccessLogArgs>> accessLog() {
        return Optional.ofNullable(this.accessLog);
    }

    private VirtualGatewaySpecLoggingArgs() {}

    private VirtualGatewaySpecLoggingArgs(VirtualGatewaySpecLoggingArgs $) {
        this.accessLog = $.accessLog;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualGatewaySpecLoggingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualGatewaySpecLoggingArgs $;

        public Builder() {
            $ = new VirtualGatewaySpecLoggingArgs();
        }

        public Builder(VirtualGatewaySpecLoggingArgs defaults) {
            $ = new VirtualGatewaySpecLoggingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessLog The access log configuration for a virtual gateway.
         * 
         * @return builder
         * 
         */
        public Builder accessLog(@Nullable Output<VirtualGatewaySpecLoggingAccessLogArgs> accessLog) {
            $.accessLog = accessLog;
            return this;
        }

        /**
         * @param accessLog The access log configuration for a virtual gateway.
         * 
         * @return builder
         * 
         */
        public Builder accessLog(VirtualGatewaySpecLoggingAccessLogArgs accessLog) {
            return accessLog(Output.of(accessLog));
        }

        public VirtualGatewaySpecLoggingArgs build() {
            return $;
        }
    }

}
