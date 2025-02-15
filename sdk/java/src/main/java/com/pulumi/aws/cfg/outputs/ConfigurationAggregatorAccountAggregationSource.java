// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cfg.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConfigurationAggregatorAccountAggregationSource {
    /**
     * @return List of 12-digit account IDs of the account(s) being aggregated.
     * 
     */
    private final List<String> accountIds;
    /**
     * @return If true, aggregate existing AWS Config regions and future regions.
     * 
     */
    private final @Nullable Boolean allRegions;
    /**
     * @return List of source regions being aggregated.
     * 
     */
    private final @Nullable List<String> regions;

    @CustomType.Constructor
    private ConfigurationAggregatorAccountAggregationSource(
        @CustomType.Parameter("accountIds") List<String> accountIds,
        @CustomType.Parameter("allRegions") @Nullable Boolean allRegions,
        @CustomType.Parameter("regions") @Nullable List<String> regions) {
        this.accountIds = accountIds;
        this.allRegions = allRegions;
        this.regions = regions;
    }

    /**
     * @return List of 12-digit account IDs of the account(s) being aggregated.
     * 
     */
    public List<String> accountIds() {
        return this.accountIds;
    }
    /**
     * @return If true, aggregate existing AWS Config regions and future regions.
     * 
     */
    public Optional<Boolean> allRegions() {
        return Optional.ofNullable(this.allRegions);
    }
    /**
     * @return List of source regions being aggregated.
     * 
     */
    public List<String> regions() {
        return this.regions == null ? List.of() : this.regions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationAggregatorAccountAggregationSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> accountIds;
        private @Nullable Boolean allRegions;
        private @Nullable List<String> regions;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationAggregatorAccountAggregationSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountIds = defaults.accountIds;
    	      this.allRegions = defaults.allRegions;
    	      this.regions = defaults.regions;
        }

        public Builder accountIds(List<String> accountIds) {
            this.accountIds = Objects.requireNonNull(accountIds);
            return this;
        }
        public Builder accountIds(String... accountIds) {
            return accountIds(List.of(accountIds));
        }
        public Builder allRegions(@Nullable Boolean allRegions) {
            this.allRegions = allRegions;
            return this;
        }
        public Builder regions(@Nullable List<String> regions) {
            this.regions = regions;
            return this;
        }
        public Builder regions(String... regions) {
            return regions(List.of(regions));
        }        public ConfigurationAggregatorAccountAggregationSource build() {
            return new ConfigurationAggregatorAccountAggregationSource(accountIds, allRegions, regions);
        }
    }
}
