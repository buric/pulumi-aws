// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2clientvpn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEndpointClientLoginBannerOption {
    private final String bannerText;
    private final Boolean enabled;

    @CustomType.Constructor
    private GetEndpointClientLoginBannerOption(
        @CustomType.Parameter("bannerText") String bannerText,
        @CustomType.Parameter("enabled") Boolean enabled) {
        this.bannerText = bannerText;
        this.enabled = enabled;
    }

    public String bannerText() {
        return this.bannerText;
    }
    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEndpointClientLoginBannerOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bannerText;
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEndpointClientLoginBannerOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bannerText = defaults.bannerText;
    	      this.enabled = defaults.enabled;
        }

        public Builder bannerText(String bannerText) {
            this.bannerText = Objects.requireNonNull(bannerText);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }        public GetEndpointClientLoginBannerOption build() {
            return new GetEndpointClientLoginBannerOption(bannerText, enabled);
        }
    }
}
