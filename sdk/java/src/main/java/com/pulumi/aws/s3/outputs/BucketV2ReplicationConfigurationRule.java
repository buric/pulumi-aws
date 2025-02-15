// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.outputs;

import com.pulumi.aws.s3.outputs.BucketV2ReplicationConfigurationRuleDestination;
import com.pulumi.aws.s3.outputs.BucketV2ReplicationConfigurationRuleFilter;
import com.pulumi.aws.s3.outputs.BucketV2ReplicationConfigurationRuleSourceSelectionCriteria;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketV2ReplicationConfigurationRule {
    /**
     * @return Whether delete markers are replicated. The only valid value is `Enabled`. To disable, omit this argument. This argument is only valid with V2 replication configurations (i.e., when `filter` is used).
     * 
     */
    private final @Nullable String deleteMarkerReplicationStatus;
    /**
     * @return Specifies the destination for the rule (documented below).
     * 
     */
    private final List<BucketV2ReplicationConfigurationRuleDestination> destinations;
    /**
     * @return Filter that identifies subset of objects to which the replication rule applies (documented below).
     * 
     */
    private final @Nullable List<BucketV2ReplicationConfigurationRuleFilter> filters;
    /**
     * @return Unique identifier for the rule. Must be less than or equal to 255 characters in length.
     * 
     */
    private final @Nullable String id;
    /**
     * @return Object keyname prefix identifying one or more objects to which the rule applies. Must be less than or equal to 1024 characters in length.
     * 
     */
    private final @Nullable String prefix;
    /**
     * @return The priority associated with the rule. Priority should only be set if `filter` is configured. If not provided, defaults to `0`. Priority must be unique between multiple rules.
     * 
     */
    private final @Nullable Integer priority;
    /**
     * @return Specifies special object selection criteria (documented below).
     * 
     */
    private final @Nullable List<BucketV2ReplicationConfigurationRuleSourceSelectionCriteria> sourceSelectionCriterias;
    /**
     * @return The status of the rule. Either `Enabled` or `Disabled`. The rule is ignored if status is not Enabled.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private BucketV2ReplicationConfigurationRule(
        @CustomType.Parameter("deleteMarkerReplicationStatus") @Nullable String deleteMarkerReplicationStatus,
        @CustomType.Parameter("destinations") List<BucketV2ReplicationConfigurationRuleDestination> destinations,
        @CustomType.Parameter("filters") @Nullable List<BucketV2ReplicationConfigurationRuleFilter> filters,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("prefix") @Nullable String prefix,
        @CustomType.Parameter("priority") @Nullable Integer priority,
        @CustomType.Parameter("sourceSelectionCriterias") @Nullable List<BucketV2ReplicationConfigurationRuleSourceSelectionCriteria> sourceSelectionCriterias,
        @CustomType.Parameter("status") String status) {
        this.deleteMarkerReplicationStatus = deleteMarkerReplicationStatus;
        this.destinations = destinations;
        this.filters = filters;
        this.id = id;
        this.prefix = prefix;
        this.priority = priority;
        this.sourceSelectionCriterias = sourceSelectionCriterias;
        this.status = status;
    }

    /**
     * @return Whether delete markers are replicated. The only valid value is `Enabled`. To disable, omit this argument. This argument is only valid with V2 replication configurations (i.e., when `filter` is used).
     * 
     */
    public Optional<String> deleteMarkerReplicationStatus() {
        return Optional.ofNullable(this.deleteMarkerReplicationStatus);
    }
    /**
     * @return Specifies the destination for the rule (documented below).
     * 
     */
    public List<BucketV2ReplicationConfigurationRuleDestination> destinations() {
        return this.destinations;
    }
    /**
     * @return Filter that identifies subset of objects to which the replication rule applies (documented below).
     * 
     */
    public List<BucketV2ReplicationConfigurationRuleFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return Unique identifier for the rule. Must be less than or equal to 255 characters in length.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Object keyname prefix identifying one or more objects to which the rule applies. Must be less than or equal to 1024 characters in length.
     * 
     */
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }
    /**
     * @return The priority associated with the rule. Priority should only be set if `filter` is configured. If not provided, defaults to `0`. Priority must be unique between multiple rules.
     * 
     */
    public Optional<Integer> priority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * @return Specifies special object selection criteria (documented below).
     * 
     */
    public List<BucketV2ReplicationConfigurationRuleSourceSelectionCriteria> sourceSelectionCriterias() {
        return this.sourceSelectionCriterias == null ? List.of() : this.sourceSelectionCriterias;
    }
    /**
     * @return The status of the rule. Either `Enabled` or `Disabled`. The rule is ignored if status is not Enabled.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketV2ReplicationConfigurationRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String deleteMarkerReplicationStatus;
        private List<BucketV2ReplicationConfigurationRuleDestination> destinations;
        private @Nullable List<BucketV2ReplicationConfigurationRuleFilter> filters;
        private @Nullable String id;
        private @Nullable String prefix;
        private @Nullable Integer priority;
        private @Nullable List<BucketV2ReplicationConfigurationRuleSourceSelectionCriteria> sourceSelectionCriterias;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketV2ReplicationConfigurationRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteMarkerReplicationStatus = defaults.deleteMarkerReplicationStatus;
    	      this.destinations = defaults.destinations;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.prefix = defaults.prefix;
    	      this.priority = defaults.priority;
    	      this.sourceSelectionCriterias = defaults.sourceSelectionCriterias;
    	      this.status = defaults.status;
        }

        public Builder deleteMarkerReplicationStatus(@Nullable String deleteMarkerReplicationStatus) {
            this.deleteMarkerReplicationStatus = deleteMarkerReplicationStatus;
            return this;
        }
        public Builder destinations(List<BucketV2ReplicationConfigurationRuleDestination> destinations) {
            this.destinations = Objects.requireNonNull(destinations);
            return this;
        }
        public Builder destinations(BucketV2ReplicationConfigurationRuleDestination... destinations) {
            return destinations(List.of(destinations));
        }
        public Builder filters(@Nullable List<BucketV2ReplicationConfigurationRuleFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(BucketV2ReplicationConfigurationRuleFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }
        public Builder priority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }
        public Builder sourceSelectionCriterias(@Nullable List<BucketV2ReplicationConfigurationRuleSourceSelectionCriteria> sourceSelectionCriterias) {
            this.sourceSelectionCriterias = sourceSelectionCriterias;
            return this;
        }
        public Builder sourceSelectionCriterias(BucketV2ReplicationConfigurationRuleSourceSelectionCriteria... sourceSelectionCriterias) {
            return sourceSelectionCriterias(List.of(sourceSelectionCriterias));
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public BucketV2ReplicationConfigurationRule build() {
            return new BucketV2ReplicationConfigurationRule(deleteMarkerReplicationStatus, destinations, filters, id, prefix, priority, sourceSelectionCriterias, status);
        }
    }
}
