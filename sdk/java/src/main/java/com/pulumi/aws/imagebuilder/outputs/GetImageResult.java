// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.outputs;

import com.pulumi.aws.imagebuilder.outputs.GetImageImageTestsConfiguration;
import com.pulumi.aws.imagebuilder.outputs.GetImageOutputResource;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetImageResult {
    private final String arn;
    /**
     * @return Build version Amazon Resource Name (ARN) of the image. This will always have the `#.#.#/#` suffix.
     * 
     */
    private final String buildVersionArn;
    /**
     * @return Amazon Resource Name (ARN) of the container recipe.
     * 
     */
    private final String containerRecipeArn;
    /**
     * @return Date the image was created.
     * 
     */
    private final String dateCreated;
    /**
     * @return Amazon Resource Name (ARN) of the Image Builder Distribution Configuration.
     * 
     */
    private final String distributionConfigurationArn;
    /**
     * @return Whether additional information about the image being created is collected.
     * 
     */
    private final Boolean enhancedImageMetadataEnabled;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return Amazon Resource Name (ARN) of the image recipe.
     * 
     */
    private final String imageRecipeArn;
    /**
     * @return List of an object with image tests configuration.
     * 
     */
    private final List<GetImageImageTestsConfiguration> imageTestsConfigurations;
    /**
     * @return Amazon Resource Name (ARN) of the Image Builder Infrastructure Configuration.
     * 
     */
    private final String infrastructureConfigurationArn;
    /**
     * @return Name of the AMI.
     * 
     */
    private final String name;
    /**
     * @return Operating System version of the image.
     * 
     */
    private final String osVersion;
    /**
     * @return List of objects with resources created by the image.
     * 
     */
    private final List<GetImageOutputResource> outputResources;
    /**
     * @return Platform of the image.
     * 
     */
    private final String platform;
    /**
     * @return Key-value map of resource tags for the image.
     * 
     */
    private final Map<String,String> tags;
    /**
     * @return Version of the image.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private GetImageResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("buildVersionArn") String buildVersionArn,
        @CustomType.Parameter("containerRecipeArn") String containerRecipeArn,
        @CustomType.Parameter("dateCreated") String dateCreated,
        @CustomType.Parameter("distributionConfigurationArn") String distributionConfigurationArn,
        @CustomType.Parameter("enhancedImageMetadataEnabled") Boolean enhancedImageMetadataEnabled,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("imageRecipeArn") String imageRecipeArn,
        @CustomType.Parameter("imageTestsConfigurations") List<GetImageImageTestsConfiguration> imageTestsConfigurations,
        @CustomType.Parameter("infrastructureConfigurationArn") String infrastructureConfigurationArn,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("osVersion") String osVersion,
        @CustomType.Parameter("outputResources") List<GetImageOutputResource> outputResources,
        @CustomType.Parameter("platform") String platform,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("version") String version) {
        this.arn = arn;
        this.buildVersionArn = buildVersionArn;
        this.containerRecipeArn = containerRecipeArn;
        this.dateCreated = dateCreated;
        this.distributionConfigurationArn = distributionConfigurationArn;
        this.enhancedImageMetadataEnabled = enhancedImageMetadataEnabled;
        this.id = id;
        this.imageRecipeArn = imageRecipeArn;
        this.imageTestsConfigurations = imageTestsConfigurations;
        this.infrastructureConfigurationArn = infrastructureConfigurationArn;
        this.name = name;
        this.osVersion = osVersion;
        this.outputResources = outputResources;
        this.platform = platform;
        this.tags = tags;
        this.version = version;
    }

    public String arn() {
        return this.arn;
    }
    /**
     * @return Build version Amazon Resource Name (ARN) of the image. This will always have the `#.#.#/#` suffix.
     * 
     */
    public String buildVersionArn() {
        return this.buildVersionArn;
    }
    /**
     * @return Amazon Resource Name (ARN) of the container recipe.
     * 
     */
    public String containerRecipeArn() {
        return this.containerRecipeArn;
    }
    /**
     * @return Date the image was created.
     * 
     */
    public String dateCreated() {
        return this.dateCreated;
    }
    /**
     * @return Amazon Resource Name (ARN) of the Image Builder Distribution Configuration.
     * 
     */
    public String distributionConfigurationArn() {
        return this.distributionConfigurationArn;
    }
    /**
     * @return Whether additional information about the image being created is collected.
     * 
     */
    public Boolean enhancedImageMetadataEnabled() {
        return this.enhancedImageMetadataEnabled;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Amazon Resource Name (ARN) of the image recipe.
     * 
     */
    public String imageRecipeArn() {
        return this.imageRecipeArn;
    }
    /**
     * @return List of an object with image tests configuration.
     * 
     */
    public List<GetImageImageTestsConfiguration> imageTestsConfigurations() {
        return this.imageTestsConfigurations;
    }
    /**
     * @return Amazon Resource Name (ARN) of the Image Builder Infrastructure Configuration.
     * 
     */
    public String infrastructureConfigurationArn() {
        return this.infrastructureConfigurationArn;
    }
    /**
     * @return Name of the AMI.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Operating System version of the image.
     * 
     */
    public String osVersion() {
        return this.osVersion;
    }
    /**
     * @return List of objects with resources created by the image.
     * 
     */
    public List<GetImageOutputResource> outputResources() {
        return this.outputResources;
    }
    /**
     * @return Platform of the image.
     * 
     */
    public String platform() {
        return this.platform;
    }
    /**
     * @return Key-value map of resource tags for the image.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return Version of the image.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String buildVersionArn;
        private String containerRecipeArn;
        private String dateCreated;
        private String distributionConfigurationArn;
        private Boolean enhancedImageMetadataEnabled;
        private String id;
        private String imageRecipeArn;
        private List<GetImageImageTestsConfiguration> imageTestsConfigurations;
        private String infrastructureConfigurationArn;
        private String name;
        private String osVersion;
        private List<GetImageOutputResource> outputResources;
        private String platform;
        private Map<String,String> tags;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.buildVersionArn = defaults.buildVersionArn;
    	      this.containerRecipeArn = defaults.containerRecipeArn;
    	      this.dateCreated = defaults.dateCreated;
    	      this.distributionConfigurationArn = defaults.distributionConfigurationArn;
    	      this.enhancedImageMetadataEnabled = defaults.enhancedImageMetadataEnabled;
    	      this.id = defaults.id;
    	      this.imageRecipeArn = defaults.imageRecipeArn;
    	      this.imageTestsConfigurations = defaults.imageTestsConfigurations;
    	      this.infrastructureConfigurationArn = defaults.infrastructureConfigurationArn;
    	      this.name = defaults.name;
    	      this.osVersion = defaults.osVersion;
    	      this.outputResources = defaults.outputResources;
    	      this.platform = defaults.platform;
    	      this.tags = defaults.tags;
    	      this.version = defaults.version;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder buildVersionArn(String buildVersionArn) {
            this.buildVersionArn = Objects.requireNonNull(buildVersionArn);
            return this;
        }
        public Builder containerRecipeArn(String containerRecipeArn) {
            this.containerRecipeArn = Objects.requireNonNull(containerRecipeArn);
            return this;
        }
        public Builder dateCreated(String dateCreated) {
            this.dateCreated = Objects.requireNonNull(dateCreated);
            return this;
        }
        public Builder distributionConfigurationArn(String distributionConfigurationArn) {
            this.distributionConfigurationArn = Objects.requireNonNull(distributionConfigurationArn);
            return this;
        }
        public Builder enhancedImageMetadataEnabled(Boolean enhancedImageMetadataEnabled) {
            this.enhancedImageMetadataEnabled = Objects.requireNonNull(enhancedImageMetadataEnabled);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder imageRecipeArn(String imageRecipeArn) {
            this.imageRecipeArn = Objects.requireNonNull(imageRecipeArn);
            return this;
        }
        public Builder imageTestsConfigurations(List<GetImageImageTestsConfiguration> imageTestsConfigurations) {
            this.imageTestsConfigurations = Objects.requireNonNull(imageTestsConfigurations);
            return this;
        }
        public Builder imageTestsConfigurations(GetImageImageTestsConfiguration... imageTestsConfigurations) {
            return imageTestsConfigurations(List.of(imageTestsConfigurations));
        }
        public Builder infrastructureConfigurationArn(String infrastructureConfigurationArn) {
            this.infrastructureConfigurationArn = Objects.requireNonNull(infrastructureConfigurationArn);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder osVersion(String osVersion) {
            this.osVersion = Objects.requireNonNull(osVersion);
            return this;
        }
        public Builder outputResources(List<GetImageOutputResource> outputResources) {
            this.outputResources = Objects.requireNonNull(outputResources);
            return this;
        }
        public Builder outputResources(GetImageOutputResource... outputResources) {
            return outputResources(List.of(outputResources));
        }
        public Builder platform(String platform) {
            this.platform = Objects.requireNonNull(platform);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public GetImageResult build() {
            return new GetImageResult(arn, buildVersionArn, containerRecipeArn, dateCreated, distributionConfigurationArn, enhancedImageMetadataEnabled, id, imageRecipeArn, imageTestsConfigurations, infrastructureConfigurationArn, name, osVersion, outputResources, platform, tags, version);
        }
    }
}
