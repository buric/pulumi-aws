// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DistributionRestrictionsGeoRestriction {
    /**
     * @return The [ISO 3166-1-alpha-2 codes][4] for which you
     * want CloudFront either to distribute your content (`whitelist`) or not
     * distribute your content (`blacklist`).
     * 
     */
    private final @Nullable List<String> locations;
    /**
     * @return The method that you want to use to restrict
     * distribution of your content by country: `none`, `whitelist`, or
     * `blacklist`.
     * 
     */
    private final String restrictionType;

    @CustomType.Constructor
    private DistributionRestrictionsGeoRestriction(
        @CustomType.Parameter("locations") @Nullable List<String> locations,
        @CustomType.Parameter("restrictionType") String restrictionType) {
        this.locations = locations;
        this.restrictionType = restrictionType;
    }

    /**
     * @return The [ISO 3166-1-alpha-2 codes][4] for which you
     * want CloudFront either to distribute your content (`whitelist`) or not
     * distribute your content (`blacklist`).
     * 
     */
    public List<String> locations() {
        return this.locations == null ? List.of() : this.locations;
    }
    /**
     * @return The method that you want to use to restrict
     * distribution of your content by country: `none`, `whitelist`, or
     * `blacklist`.
     * 
     */
    public String restrictionType() {
        return this.restrictionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionRestrictionsGeoRestriction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> locations;
        private String restrictionType;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionRestrictionsGeoRestriction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locations = defaults.locations;
    	      this.restrictionType = defaults.restrictionType;
        }

        public Builder locations(@Nullable List<String> locations) {
            this.locations = locations;
            return this;
        }
        public Builder locations(String... locations) {
            return locations(List.of(locations));
        }
        public Builder restrictionType(String restrictionType) {
            this.restrictionType = Objects.requireNonNull(restrictionType);
            return this;
        }        public DistributionRestrictionsGeoRestriction build() {
            return new DistributionRestrictionsGeoRestriction(locations, restrictionType);
        }
    }
}
