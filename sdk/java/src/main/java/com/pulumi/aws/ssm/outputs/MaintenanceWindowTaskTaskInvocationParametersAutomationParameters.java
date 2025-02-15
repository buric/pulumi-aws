// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm.outputs;

import com.pulumi.aws.ssm.outputs.MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MaintenanceWindowTaskTaskInvocationParametersAutomationParameters {
    /**
     * @return The version of an Automation document to use during task execution.
     * 
     */
    private final @Nullable String documentVersion;
    /**
     * @return The parameters for the RUN_COMMAND task execution. Documented below.
     * 
     */
    private final @Nullable List<MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter> parameters;

    @CustomType.Constructor
    private MaintenanceWindowTaskTaskInvocationParametersAutomationParameters(
        @CustomType.Parameter("documentVersion") @Nullable String documentVersion,
        @CustomType.Parameter("parameters") @Nullable List<MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter> parameters) {
        this.documentVersion = documentVersion;
        this.parameters = parameters;
    }

    /**
     * @return The version of an Automation document to use during task execution.
     * 
     */
    public Optional<String> documentVersion() {
        return Optional.ofNullable(this.documentVersion);
    }
    /**
     * @return The parameters for the RUN_COMMAND task execution. Documented below.
     * 
     */
    public List<MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter> parameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceWindowTaskTaskInvocationParametersAutomationParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String documentVersion;
        private @Nullable List<MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceWindowTaskTaskInvocationParametersAutomationParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.documentVersion = defaults.documentVersion;
    	      this.parameters = defaults.parameters;
        }

        public Builder documentVersion(@Nullable String documentVersion) {
            this.documentVersion = documentVersion;
            return this;
        }
        public Builder parameters(@Nullable List<MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter... parameters) {
            return parameters(List.of(parameters));
        }        public MaintenanceWindowTaskTaskInvocationParametersAutomationParameters build() {
            return new MaintenanceWindowTaskTaskInvocationParametersAutomationParameters(documentVersion, parameters);
        }
    }
}
