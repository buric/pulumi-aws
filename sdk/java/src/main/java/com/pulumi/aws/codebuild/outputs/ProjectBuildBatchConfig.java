// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codebuild.outputs;

import com.pulumi.aws.codebuild.outputs.ProjectBuildBatchConfigRestrictions;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProjectBuildBatchConfig {
    /**
     * @return Specifies if the build artifacts for the batch build should be combined into a single artifact location.
     * 
     */
    private final @Nullable Boolean combineArtifacts;
    /**
     * @return Specifies the restrictions for the batch build.
     * 
     */
    private final @Nullable ProjectBuildBatchConfigRestrictions restrictions;
    /**
     * @return Specifies the service role ARN for the batch build project.
     * 
     */
    private final String serviceRole;
    /**
     * @return Specifies the maximum amount of time, in minutes, that the batch build must be completed in.
     * 
     */
    private final @Nullable Integer timeoutInMins;

    @CustomType.Constructor
    private ProjectBuildBatchConfig(
        @CustomType.Parameter("combineArtifacts") @Nullable Boolean combineArtifacts,
        @CustomType.Parameter("restrictions") @Nullable ProjectBuildBatchConfigRestrictions restrictions,
        @CustomType.Parameter("serviceRole") String serviceRole,
        @CustomType.Parameter("timeoutInMins") @Nullable Integer timeoutInMins) {
        this.combineArtifacts = combineArtifacts;
        this.restrictions = restrictions;
        this.serviceRole = serviceRole;
        this.timeoutInMins = timeoutInMins;
    }

    /**
     * @return Specifies if the build artifacts for the batch build should be combined into a single artifact location.
     * 
     */
    public Optional<Boolean> combineArtifacts() {
        return Optional.ofNullable(this.combineArtifacts);
    }
    /**
     * @return Specifies the restrictions for the batch build.
     * 
     */
    public Optional<ProjectBuildBatchConfigRestrictions> restrictions() {
        return Optional.ofNullable(this.restrictions);
    }
    /**
     * @return Specifies the service role ARN for the batch build project.
     * 
     */
    public String serviceRole() {
        return this.serviceRole;
    }
    /**
     * @return Specifies the maximum amount of time, in minutes, that the batch build must be completed in.
     * 
     */
    public Optional<Integer> timeoutInMins() {
        return Optional.ofNullable(this.timeoutInMins);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectBuildBatchConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean combineArtifacts;
        private @Nullable ProjectBuildBatchConfigRestrictions restrictions;
        private String serviceRole;
        private @Nullable Integer timeoutInMins;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectBuildBatchConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.combineArtifacts = defaults.combineArtifacts;
    	      this.restrictions = defaults.restrictions;
    	      this.serviceRole = defaults.serviceRole;
    	      this.timeoutInMins = defaults.timeoutInMins;
        }

        public Builder combineArtifacts(@Nullable Boolean combineArtifacts) {
            this.combineArtifacts = combineArtifacts;
            return this;
        }
        public Builder restrictions(@Nullable ProjectBuildBatchConfigRestrictions restrictions) {
            this.restrictions = restrictions;
            return this;
        }
        public Builder serviceRole(String serviceRole) {
            this.serviceRole = Objects.requireNonNull(serviceRole);
            return this;
        }
        public Builder timeoutInMins(@Nullable Integer timeoutInMins) {
            this.timeoutInMins = timeoutInMins;
            return this;
        }        public ProjectBuildBatchConfig build() {
            return new ProjectBuildBatchConfig(combineArtifacts, restrictions, serviceRole, timeoutInMins);
        }
    }
}
