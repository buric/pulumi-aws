// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.outputs;

import com.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfiguration;
import com.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationRunConfigurationFlinkRunConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationApplicationConfigurationRunConfiguration {
    /**
     * @return The restore behavior of a restarting application.
     * 
     */
    private final @Nullable ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfiguration applicationRestoreConfiguration;
    /**
     * @return The starting parameters for a Flink-based Kinesis Data Analytics application.
     * 
     */
    private final @Nullable ApplicationApplicationConfigurationRunConfigurationFlinkRunConfiguration flinkRunConfiguration;

    @CustomType.Constructor
    private ApplicationApplicationConfigurationRunConfiguration(
        @CustomType.Parameter("applicationRestoreConfiguration") @Nullable ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfiguration applicationRestoreConfiguration,
        @CustomType.Parameter("flinkRunConfiguration") @Nullable ApplicationApplicationConfigurationRunConfigurationFlinkRunConfiguration flinkRunConfiguration) {
        this.applicationRestoreConfiguration = applicationRestoreConfiguration;
        this.flinkRunConfiguration = flinkRunConfiguration;
    }

    /**
     * @return The restore behavior of a restarting application.
     * 
     */
    public Optional<ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfiguration> applicationRestoreConfiguration() {
        return Optional.ofNullable(this.applicationRestoreConfiguration);
    }
    /**
     * @return The starting parameters for a Flink-based Kinesis Data Analytics application.
     * 
     */
    public Optional<ApplicationApplicationConfigurationRunConfigurationFlinkRunConfiguration> flinkRunConfiguration() {
        return Optional.ofNullable(this.flinkRunConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationRunConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfiguration applicationRestoreConfiguration;
        private @Nullable ApplicationApplicationConfigurationRunConfigurationFlinkRunConfiguration flinkRunConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationRunConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationRestoreConfiguration = defaults.applicationRestoreConfiguration;
    	      this.flinkRunConfiguration = defaults.flinkRunConfiguration;
        }

        public Builder applicationRestoreConfiguration(@Nullable ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfiguration applicationRestoreConfiguration) {
            this.applicationRestoreConfiguration = applicationRestoreConfiguration;
            return this;
        }
        public Builder flinkRunConfiguration(@Nullable ApplicationApplicationConfigurationRunConfigurationFlinkRunConfiguration flinkRunConfiguration) {
            this.flinkRunConfiguration = flinkRunConfiguration;
            return this;
        }        public ApplicationApplicationConfigurationRunConfiguration build() {
            return new ApplicationApplicationConfigurationRunConfiguration(applicationRestoreConfiguration, flinkRunConfiguration);
        }
    }
}
