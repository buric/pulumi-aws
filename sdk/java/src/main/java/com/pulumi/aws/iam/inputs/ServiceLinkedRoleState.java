// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceLinkedRoleState extends com.pulumi.resources.ResourceArgs {

    public static final ServiceLinkedRoleState Empty = new ServiceLinkedRoleState();

    /**
     * The Amazon Resource Name (ARN) specifying the role.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) specifying the role.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The AWS service to which this role is attached. You use a string similar to a URL but without the `http://` in front. For example: `elasticbeanstalk.amazonaws.com`. To find the full list of services that support service-linked roles, check [the docs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html).
     * 
     */
    @Import(name="awsServiceName")
    private @Nullable Output<String> awsServiceName;

    /**
     * @return The AWS service to which this role is attached. You use a string similar to a URL but without the `http://` in front. For example: `elasticbeanstalk.amazonaws.com`. To find the full list of services that support service-linked roles, check [the docs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html).
     * 
     */
    public Optional<Output<String>> awsServiceName() {
        return Optional.ofNullable(this.awsServiceName);
    }

    /**
     * The creation date of the IAM role.
     * 
     */
    @Import(name="createDate")
    private @Nullable Output<String> createDate;

    /**
     * @return The creation date of the IAM role.
     * 
     */
    public Optional<Output<String>> createDate() {
        return Optional.ofNullable(this.createDate);
    }

    /**
     * Additional string appended to the role name. Not all AWS services support custom suffixes.
     * 
     */
    @Import(name="customSuffix")
    private @Nullable Output<String> customSuffix;

    /**
     * @return Additional string appended to the role name. Not all AWS services support custom suffixes.
     * 
     */
    public Optional<Output<String>> customSuffix() {
        return Optional.ofNullable(this.customSuffix);
    }

    /**
     * The description of the role.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the role.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the role.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the role.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The path of the role.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return The path of the role.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Key-value mapping of tags for the IAM role. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value mapping of tags for the IAM role. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * The stable and unique string identifying the role.
     * 
     */
    @Import(name="uniqueId")
    private @Nullable Output<String> uniqueId;

    /**
     * @return The stable and unique string identifying the role.
     * 
     */
    public Optional<Output<String>> uniqueId() {
        return Optional.ofNullable(this.uniqueId);
    }

    private ServiceLinkedRoleState() {}

    private ServiceLinkedRoleState(ServiceLinkedRoleState $) {
        this.arn = $.arn;
        this.awsServiceName = $.awsServiceName;
        this.createDate = $.createDate;
        this.customSuffix = $.customSuffix;
        this.description = $.description;
        this.name = $.name;
        this.path = $.path;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.uniqueId = $.uniqueId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceLinkedRoleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceLinkedRoleState $;

        public Builder() {
            $ = new ServiceLinkedRoleState();
        }

        public Builder(ServiceLinkedRoleState defaults) {
            $ = new ServiceLinkedRoleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) specifying the role.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Amazon Resource Name (ARN) specifying the role.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param awsServiceName The AWS service to which this role is attached. You use a string similar to a URL but without the `http://` in front. For example: `elasticbeanstalk.amazonaws.com`. To find the full list of services that support service-linked roles, check [the docs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html).
         * 
         * @return builder
         * 
         */
        public Builder awsServiceName(@Nullable Output<String> awsServiceName) {
            $.awsServiceName = awsServiceName;
            return this;
        }

        /**
         * @param awsServiceName The AWS service to which this role is attached. You use a string similar to a URL but without the `http://` in front. For example: `elasticbeanstalk.amazonaws.com`. To find the full list of services that support service-linked roles, check [the docs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html).
         * 
         * @return builder
         * 
         */
        public Builder awsServiceName(String awsServiceName) {
            return awsServiceName(Output.of(awsServiceName));
        }

        /**
         * @param createDate The creation date of the IAM role.
         * 
         * @return builder
         * 
         */
        public Builder createDate(@Nullable Output<String> createDate) {
            $.createDate = createDate;
            return this;
        }

        /**
         * @param createDate The creation date of the IAM role.
         * 
         * @return builder
         * 
         */
        public Builder createDate(String createDate) {
            return createDate(Output.of(createDate));
        }

        /**
         * @param customSuffix Additional string appended to the role name. Not all AWS services support custom suffixes.
         * 
         * @return builder
         * 
         */
        public Builder customSuffix(@Nullable Output<String> customSuffix) {
            $.customSuffix = customSuffix;
            return this;
        }

        /**
         * @param customSuffix Additional string appended to the role name. Not all AWS services support custom suffixes.
         * 
         * @return builder
         * 
         */
        public Builder customSuffix(String customSuffix) {
            return customSuffix(Output.of(customSuffix));
        }

        /**
         * @param description The description of the role.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the role.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The name of the role.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the role.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param path The path of the role.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The path of the role.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param tags Key-value mapping of tags for the IAM role. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value mapping of tags for the IAM role. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param uniqueId The stable and unique string identifying the role.
         * 
         * @return builder
         * 
         */
        public Builder uniqueId(@Nullable Output<String> uniqueId) {
            $.uniqueId = uniqueId;
            return this;
        }

        /**
         * @param uniqueId The stable and unique string identifying the role.
         * 
         * @return builder
         * 
         */
        public Builder uniqueId(String uniqueId) {
            return uniqueId(Output.of(uniqueId));
        }

        public ServiceLinkedRoleState build() {
            return $;
        }
    }

}
