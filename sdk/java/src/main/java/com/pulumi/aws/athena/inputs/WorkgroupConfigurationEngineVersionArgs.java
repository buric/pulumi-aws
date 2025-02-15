// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.athena.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkgroupConfigurationEngineVersionArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkgroupConfigurationEngineVersionArgs Empty = new WorkgroupConfigurationEngineVersionArgs();

    /**
     * The engine version on which the query runs. If `selected_engine_version` is set to `AUTO`, the effective engine version is chosen by Athena.
     * 
     */
    @Import(name="effectiveEngineVersion")
    private @Nullable Output<String> effectiveEngineVersion;

    /**
     * @return The engine version on which the query runs. If `selected_engine_version` is set to `AUTO`, the effective engine version is chosen by Athena.
     * 
     */
    public Optional<Output<String>> effectiveEngineVersion() {
        return Optional.ofNullable(this.effectiveEngineVersion);
    }

    /**
     * The requested engine version. Defaults to `AUTO`.
     * 
     */
    @Import(name="selectedEngineVersion")
    private @Nullable Output<String> selectedEngineVersion;

    /**
     * @return The requested engine version. Defaults to `AUTO`.
     * 
     */
    public Optional<Output<String>> selectedEngineVersion() {
        return Optional.ofNullable(this.selectedEngineVersion);
    }

    private WorkgroupConfigurationEngineVersionArgs() {}

    private WorkgroupConfigurationEngineVersionArgs(WorkgroupConfigurationEngineVersionArgs $) {
        this.effectiveEngineVersion = $.effectiveEngineVersion;
        this.selectedEngineVersion = $.selectedEngineVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkgroupConfigurationEngineVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkgroupConfigurationEngineVersionArgs $;

        public Builder() {
            $ = new WorkgroupConfigurationEngineVersionArgs();
        }

        public Builder(WorkgroupConfigurationEngineVersionArgs defaults) {
            $ = new WorkgroupConfigurationEngineVersionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param effectiveEngineVersion The engine version on which the query runs. If `selected_engine_version` is set to `AUTO`, the effective engine version is chosen by Athena.
         * 
         * @return builder
         * 
         */
        public Builder effectiveEngineVersion(@Nullable Output<String> effectiveEngineVersion) {
            $.effectiveEngineVersion = effectiveEngineVersion;
            return this;
        }

        /**
         * @param effectiveEngineVersion The engine version on which the query runs. If `selected_engine_version` is set to `AUTO`, the effective engine version is chosen by Athena.
         * 
         * @return builder
         * 
         */
        public Builder effectiveEngineVersion(String effectiveEngineVersion) {
            return effectiveEngineVersion(Output.of(effectiveEngineVersion));
        }

        /**
         * @param selectedEngineVersion The requested engine version. Defaults to `AUTO`.
         * 
         * @return builder
         * 
         */
        public Builder selectedEngineVersion(@Nullable Output<String> selectedEngineVersion) {
            $.selectedEngineVersion = selectedEngineVersion;
            return this;
        }

        /**
         * @param selectedEngineVersion The requested engine version. Defaults to `AUTO`.
         * 
         * @return builder
         * 
         */
        public Builder selectedEngineVersion(String selectedEngineVersion) {
            return selectedEngineVersion(Output.of(selectedEngineVersion));
        }

        public WorkgroupConfigurationEngineVersionArgs build() {
            return $;
        }
    }

}
