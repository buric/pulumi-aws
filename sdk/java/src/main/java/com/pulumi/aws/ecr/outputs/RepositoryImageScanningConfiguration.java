// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecr.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class RepositoryImageScanningConfiguration {
    /**
     * @return Indicates whether images are scanned after being pushed to the repository (true) or not scanned (false).
     * 
     */
    private final Boolean scanOnPush;

    @CustomType.Constructor
    private RepositoryImageScanningConfiguration(@CustomType.Parameter("scanOnPush") Boolean scanOnPush) {
        this.scanOnPush = scanOnPush;
    }

    /**
     * @return Indicates whether images are scanned after being pushed to the repository (true) or not scanned (false).
     * 
     */
    public Boolean scanOnPush() {
        return this.scanOnPush;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryImageScanningConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean scanOnPush;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryImageScanningConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scanOnPush = defaults.scanOnPush;
        }

        public Builder scanOnPush(Boolean scanOnPush) {
            this.scanOnPush = Objects.requireNonNull(scanOnPush);
            return this;
        }        public RepositoryImageScanningConfiguration build() {
            return new RepositoryImageScanningConfiguration(scanOnPush);
        }
    }
}
