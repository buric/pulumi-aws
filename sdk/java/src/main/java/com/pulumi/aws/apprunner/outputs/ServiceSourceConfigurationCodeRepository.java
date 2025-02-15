// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apprunner.outputs;

import com.pulumi.aws.apprunner.outputs.ServiceSourceConfigurationCodeRepositoryCodeConfiguration;
import com.pulumi.aws.apprunner.outputs.ServiceSourceConfigurationCodeRepositorySourceCodeVersion;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceSourceConfigurationCodeRepository {
    /**
     * @return Configuration for building and running the service from a source code repository. See Code Configuration below for more details.
     * 
     */
    private final @Nullable ServiceSourceConfigurationCodeRepositoryCodeConfiguration codeConfiguration;
    /**
     * @return The location of the repository that contains the source code.
     * 
     */
    private final String repositoryUrl;
    /**
     * @return The version that should be used within the source code repository. See Source Code Version below for more details.
     * 
     */
    private final ServiceSourceConfigurationCodeRepositorySourceCodeVersion sourceCodeVersion;

    @CustomType.Constructor
    private ServiceSourceConfigurationCodeRepository(
        @CustomType.Parameter("codeConfiguration") @Nullable ServiceSourceConfigurationCodeRepositoryCodeConfiguration codeConfiguration,
        @CustomType.Parameter("repositoryUrl") String repositoryUrl,
        @CustomType.Parameter("sourceCodeVersion") ServiceSourceConfigurationCodeRepositorySourceCodeVersion sourceCodeVersion) {
        this.codeConfiguration = codeConfiguration;
        this.repositoryUrl = repositoryUrl;
        this.sourceCodeVersion = sourceCodeVersion;
    }

    /**
     * @return Configuration for building and running the service from a source code repository. See Code Configuration below for more details.
     * 
     */
    public Optional<ServiceSourceConfigurationCodeRepositoryCodeConfiguration> codeConfiguration() {
        return Optional.ofNullable(this.codeConfiguration);
    }
    /**
     * @return The location of the repository that contains the source code.
     * 
     */
    public String repositoryUrl() {
        return this.repositoryUrl;
    }
    /**
     * @return The version that should be used within the source code repository. See Source Code Version below for more details.
     * 
     */
    public ServiceSourceConfigurationCodeRepositorySourceCodeVersion sourceCodeVersion() {
        return this.sourceCodeVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceSourceConfigurationCodeRepository defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServiceSourceConfigurationCodeRepositoryCodeConfiguration codeConfiguration;
        private String repositoryUrl;
        private ServiceSourceConfigurationCodeRepositorySourceCodeVersion sourceCodeVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceSourceConfigurationCodeRepository defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeConfiguration = defaults.codeConfiguration;
    	      this.repositoryUrl = defaults.repositoryUrl;
    	      this.sourceCodeVersion = defaults.sourceCodeVersion;
        }

        public Builder codeConfiguration(@Nullable ServiceSourceConfigurationCodeRepositoryCodeConfiguration codeConfiguration) {
            this.codeConfiguration = codeConfiguration;
            return this;
        }
        public Builder repositoryUrl(String repositoryUrl) {
            this.repositoryUrl = Objects.requireNonNull(repositoryUrl);
            return this;
        }
        public Builder sourceCodeVersion(ServiceSourceConfigurationCodeRepositorySourceCodeVersion sourceCodeVersion) {
            this.sourceCodeVersion = Objects.requireNonNull(sourceCodeVersion);
            return this;
        }        public ServiceSourceConfigurationCodeRepository build() {
            return new ServiceSourceConfigurationCodeRepository(codeConfiguration, repositoryUrl, sourceCodeVersion);
        }
    }
}
