// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.datasync.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LocationSmbMountOptions {
    /**
     * @return The specific SMB version that you want DataSync to use for mounting your SMB share. Valid values: `AUTOMATIC`, `SMB2`, and `SMB3`. Default: `AUTOMATIC`
     * 
     */
    private final @Nullable String version;

    @CustomType.Constructor
    private LocationSmbMountOptions(@CustomType.Parameter("version") @Nullable String version) {
        this.version = version;
    }

    /**
     * @return The specific SMB version that you want DataSync to use for mounting your SMB share. Valid values: `AUTOMATIC`, `SMB2`, and `SMB3`. Default: `AUTOMATIC`
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationSmbMountOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationSmbMountOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.version = defaults.version;
        }

        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }        public LocationSmbMountOptions build() {
            return new LocationSmbMountOptions(version);
        }
    }
}
