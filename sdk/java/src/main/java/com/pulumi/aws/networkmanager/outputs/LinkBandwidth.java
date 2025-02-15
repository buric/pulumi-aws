// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LinkBandwidth {
    /**
     * @return Download speed in Mbps.
     * 
     */
    private final @Nullable Integer downloadSpeed;
    /**
     * @return Upload speed in Mbps.
     * 
     */
    private final @Nullable Integer uploadSpeed;

    @CustomType.Constructor
    private LinkBandwidth(
        @CustomType.Parameter("downloadSpeed") @Nullable Integer downloadSpeed,
        @CustomType.Parameter("uploadSpeed") @Nullable Integer uploadSpeed) {
        this.downloadSpeed = downloadSpeed;
        this.uploadSpeed = uploadSpeed;
    }

    /**
     * @return Download speed in Mbps.
     * 
     */
    public Optional<Integer> downloadSpeed() {
        return Optional.ofNullable(this.downloadSpeed);
    }
    /**
     * @return Upload speed in Mbps.
     * 
     */
    public Optional<Integer> uploadSpeed() {
        return Optional.ofNullable(this.uploadSpeed);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkBandwidth defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer downloadSpeed;
        private @Nullable Integer uploadSpeed;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkBandwidth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.downloadSpeed = defaults.downloadSpeed;
    	      this.uploadSpeed = defaults.uploadSpeed;
        }

        public Builder downloadSpeed(@Nullable Integer downloadSpeed) {
            this.downloadSpeed = downloadSpeed;
            return this;
        }
        public Builder uploadSpeed(@Nullable Integer uploadSpeed) {
            this.uploadSpeed = uploadSpeed;
            return this;
        }        public LinkBandwidth build() {
            return new LinkBandwidth(downloadSpeed, uploadSpeed);
        }
    }
}
