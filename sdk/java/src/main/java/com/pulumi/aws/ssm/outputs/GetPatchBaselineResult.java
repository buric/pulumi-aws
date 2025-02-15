// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm.outputs;

import com.pulumi.aws.ssm.outputs.GetPatchBaselineApprovalRule;
import com.pulumi.aws.ssm.outputs.GetPatchBaselineGlobalFilter;
import com.pulumi.aws.ssm.outputs.GetPatchBaselineSource;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPatchBaselineResult {
    /**
     * @return A list of rules used to include patches in the baseline.
     * 
     */
    private final List<GetPatchBaselineApprovalRule> approvalRules;
    /**
     * @return A list of explicitly approved patches for the baseline.
     * 
     */
    private final List<String> approvedPatches;
    /**
     * @return The compliance level for approved patches.
     * 
     */
    private final String approvedPatchesComplianceLevel;
    /**
     * @return Indicates whether the list of approved patches includes non-security updates that should be applied to the instances.
     * 
     */
    private final Boolean approvedPatchesEnableNonSecurity;
    private final @Nullable Boolean defaultBaseline;
    /**
     * @return The description of the baseline.
     * 
     */
    private final String description;
    /**
     * @return A set of global filters used to exclude patches from the baseline.
     * 
     */
    private final List<GetPatchBaselineGlobalFilter> globalFilters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The name specified to identify the patch source.
     * 
     */
    private final String name;
    private final @Nullable String namePrefix;
    private final @Nullable String operatingSystem;
    private final String owner;
    /**
     * @return A list of rejected patches.
     * 
     */
    private final List<String> rejectedPatches;
    /**
     * @return The action specified to take on patches included in the `rejected_patches` list.
     * 
     */
    private final String rejectedPatchesAction;
    /**
     * @return Information about the patches to use to update the managed nodes, including target operating systems and source repositories.
     * 
     */
    private final List<GetPatchBaselineSource> sources;

    @CustomType.Constructor
    private GetPatchBaselineResult(
        @CustomType.Parameter("approvalRules") List<GetPatchBaselineApprovalRule> approvalRules,
        @CustomType.Parameter("approvedPatches") List<String> approvedPatches,
        @CustomType.Parameter("approvedPatchesComplianceLevel") String approvedPatchesComplianceLevel,
        @CustomType.Parameter("approvedPatchesEnableNonSecurity") Boolean approvedPatchesEnableNonSecurity,
        @CustomType.Parameter("defaultBaseline") @Nullable Boolean defaultBaseline,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("globalFilters") List<GetPatchBaselineGlobalFilter> globalFilters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("namePrefix") @Nullable String namePrefix,
        @CustomType.Parameter("operatingSystem") @Nullable String operatingSystem,
        @CustomType.Parameter("owner") String owner,
        @CustomType.Parameter("rejectedPatches") List<String> rejectedPatches,
        @CustomType.Parameter("rejectedPatchesAction") String rejectedPatchesAction,
        @CustomType.Parameter("sources") List<GetPatchBaselineSource> sources) {
        this.approvalRules = approvalRules;
        this.approvedPatches = approvedPatches;
        this.approvedPatchesComplianceLevel = approvedPatchesComplianceLevel;
        this.approvedPatchesEnableNonSecurity = approvedPatchesEnableNonSecurity;
        this.defaultBaseline = defaultBaseline;
        this.description = description;
        this.globalFilters = globalFilters;
        this.id = id;
        this.name = name;
        this.namePrefix = namePrefix;
        this.operatingSystem = operatingSystem;
        this.owner = owner;
        this.rejectedPatches = rejectedPatches;
        this.rejectedPatchesAction = rejectedPatchesAction;
        this.sources = sources;
    }

    /**
     * @return A list of rules used to include patches in the baseline.
     * 
     */
    public List<GetPatchBaselineApprovalRule> approvalRules() {
        return this.approvalRules;
    }
    /**
     * @return A list of explicitly approved patches for the baseline.
     * 
     */
    public List<String> approvedPatches() {
        return this.approvedPatches;
    }
    /**
     * @return The compliance level for approved patches.
     * 
     */
    public String approvedPatchesComplianceLevel() {
        return this.approvedPatchesComplianceLevel;
    }
    /**
     * @return Indicates whether the list of approved patches includes non-security updates that should be applied to the instances.
     * 
     */
    public Boolean approvedPatchesEnableNonSecurity() {
        return this.approvedPatchesEnableNonSecurity;
    }
    public Optional<Boolean> defaultBaseline() {
        return Optional.ofNullable(this.defaultBaseline);
    }
    /**
     * @return The description of the baseline.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return A set of global filters used to exclude patches from the baseline.
     * 
     */
    public List<GetPatchBaselineGlobalFilter> globalFilters() {
        return this.globalFilters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name specified to identify the patch source.
     * 
     */
    public String name() {
        return this.name;
    }
    public Optional<String> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }
    public Optional<String> operatingSystem() {
        return Optional.ofNullable(this.operatingSystem);
    }
    public String owner() {
        return this.owner;
    }
    /**
     * @return A list of rejected patches.
     * 
     */
    public List<String> rejectedPatches() {
        return this.rejectedPatches;
    }
    /**
     * @return The action specified to take on patches included in the `rejected_patches` list.
     * 
     */
    public String rejectedPatchesAction() {
        return this.rejectedPatchesAction;
    }
    /**
     * @return Information about the patches to use to update the managed nodes, including target operating systems and source repositories.
     * 
     */
    public List<GetPatchBaselineSource> sources() {
        return this.sources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPatchBaselineResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetPatchBaselineApprovalRule> approvalRules;
        private List<String> approvedPatches;
        private String approvedPatchesComplianceLevel;
        private Boolean approvedPatchesEnableNonSecurity;
        private @Nullable Boolean defaultBaseline;
        private String description;
        private List<GetPatchBaselineGlobalFilter> globalFilters;
        private String id;
        private String name;
        private @Nullable String namePrefix;
        private @Nullable String operatingSystem;
        private String owner;
        private List<String> rejectedPatches;
        private String rejectedPatchesAction;
        private List<GetPatchBaselineSource> sources;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPatchBaselineResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.approvalRules = defaults.approvalRules;
    	      this.approvedPatches = defaults.approvedPatches;
    	      this.approvedPatchesComplianceLevel = defaults.approvedPatchesComplianceLevel;
    	      this.approvedPatchesEnableNonSecurity = defaults.approvedPatchesEnableNonSecurity;
    	      this.defaultBaseline = defaults.defaultBaseline;
    	      this.description = defaults.description;
    	      this.globalFilters = defaults.globalFilters;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.operatingSystem = defaults.operatingSystem;
    	      this.owner = defaults.owner;
    	      this.rejectedPatches = defaults.rejectedPatches;
    	      this.rejectedPatchesAction = defaults.rejectedPatchesAction;
    	      this.sources = defaults.sources;
        }

        public Builder approvalRules(List<GetPatchBaselineApprovalRule> approvalRules) {
            this.approvalRules = Objects.requireNonNull(approvalRules);
            return this;
        }
        public Builder approvalRules(GetPatchBaselineApprovalRule... approvalRules) {
            return approvalRules(List.of(approvalRules));
        }
        public Builder approvedPatches(List<String> approvedPatches) {
            this.approvedPatches = Objects.requireNonNull(approvedPatches);
            return this;
        }
        public Builder approvedPatches(String... approvedPatches) {
            return approvedPatches(List.of(approvedPatches));
        }
        public Builder approvedPatchesComplianceLevel(String approvedPatchesComplianceLevel) {
            this.approvedPatchesComplianceLevel = Objects.requireNonNull(approvedPatchesComplianceLevel);
            return this;
        }
        public Builder approvedPatchesEnableNonSecurity(Boolean approvedPatchesEnableNonSecurity) {
            this.approvedPatchesEnableNonSecurity = Objects.requireNonNull(approvedPatchesEnableNonSecurity);
            return this;
        }
        public Builder defaultBaseline(@Nullable Boolean defaultBaseline) {
            this.defaultBaseline = defaultBaseline;
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder globalFilters(List<GetPatchBaselineGlobalFilter> globalFilters) {
            this.globalFilters = Objects.requireNonNull(globalFilters);
            return this;
        }
        public Builder globalFilters(GetPatchBaselineGlobalFilter... globalFilters) {
            return globalFilters(List.of(globalFilters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }
        public Builder operatingSystem(@Nullable String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }
        public Builder owner(String owner) {
            this.owner = Objects.requireNonNull(owner);
            return this;
        }
        public Builder rejectedPatches(List<String> rejectedPatches) {
            this.rejectedPatches = Objects.requireNonNull(rejectedPatches);
            return this;
        }
        public Builder rejectedPatches(String... rejectedPatches) {
            return rejectedPatches(List.of(rejectedPatches));
        }
        public Builder rejectedPatchesAction(String rejectedPatchesAction) {
            this.rejectedPatchesAction = Objects.requireNonNull(rejectedPatchesAction);
            return this;
        }
        public Builder sources(List<GetPatchBaselineSource> sources) {
            this.sources = Objects.requireNonNull(sources);
            return this;
        }
        public Builder sources(GetPatchBaselineSource... sources) {
            return sources(List.of(sources));
        }        public GetPatchBaselineResult build() {
            return new GetPatchBaselineResult(approvalRules, approvedPatches, approvedPatchesComplianceLevel, approvedPatchesEnableNonSecurity, defaultBaseline, description, globalFilters, id, name, namePrefix, operatingSystem, owner, rejectedPatches, rejectedPatchesAction, sources);
        }
    }
}
