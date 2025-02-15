// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect.inputs;

import com.pulumi.aws.connect.inputs.QueueOutboundCallerConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class QueueState extends com.pulumi.resources.ResourceArgs {

    public static final QueueState Empty = new QueueState();

    /**
     * The Amazon Resource Name (ARN) of the Queue.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the Queue.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Specifies the description of the Queue.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Specifies the description of the Queue.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies the identifier of the Hours of Operation.
     * 
     */
    @Import(name="hoursOfOperationId")
    private @Nullable Output<String> hoursOfOperationId;

    /**
     * @return Specifies the identifier of the Hours of Operation.
     * 
     */
    public Optional<Output<String>> hoursOfOperationId() {
        return Optional.ofNullable(this.hoursOfOperationId);
    }

    /**
     * Specifies the identifier of the hosting Amazon Connect Instance.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return Specifies the identifier of the hosting Amazon Connect Instance.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * Specifies the maximum number of contacts that can be in the queue before it is considered full. Minimum value of 0.
     * 
     */
    @Import(name="maxContacts")
    private @Nullable Output<Integer> maxContacts;

    /**
     * @return Specifies the maximum number of contacts that can be in the queue before it is considered full. Minimum value of 0.
     * 
     */
    public Optional<Output<Integer>> maxContacts() {
        return Optional.ofNullable(this.maxContacts);
    }

    /**
     * Specifies the name of the Queue.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Queue.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A block that defines the outbound caller ID name, number, and outbound whisper flow. The Outbound Caller Config block is documented below.
     * 
     */
    @Import(name="outboundCallerConfig")
    private @Nullable Output<QueueOutboundCallerConfigArgs> outboundCallerConfig;

    /**
     * @return A block that defines the outbound caller ID name, number, and outbound whisper flow. The Outbound Caller Config block is documented below.
     * 
     */
    public Optional<Output<QueueOutboundCallerConfigArgs>> outboundCallerConfig() {
        return Optional.ofNullable(this.outboundCallerConfig);
    }

    /**
     * The identifier for the Queue.
     * 
     */
    @Import(name="queueId")
    private @Nullable Output<String> queueId;

    /**
     * @return The identifier for the Queue.
     * 
     */
    public Optional<Output<String>> queueId() {
        return Optional.ofNullable(this.queueId);
    }

    /**
     * Specifies a list of quick connects ids that determine the quick connects available to agents who are working the queue.
     * 
     */
    @Import(name="quickConnectIds")
    private @Nullable Output<List<String>> quickConnectIds;

    /**
     * @return Specifies a list of quick connects ids that determine the quick connects available to agents who are working the queue.
     * 
     */
    public Optional<Output<List<String>>> quickConnectIds() {
        return Optional.ofNullable(this.quickConnectIds);
    }

    @Import(name="quickConnectIdsAssociateds")
    private @Nullable Output<List<String>> quickConnectIdsAssociateds;

    public Optional<Output<List<String>>> quickConnectIdsAssociateds() {
        return Optional.ofNullable(this.quickConnectIdsAssociateds);
    }

    /**
     * Specifies the description of the Queue. Valid values are `ENABLED`, `DISABLED`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Specifies the description of the Queue. Valid values are `ENABLED`, `DISABLED`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Tags to apply to the Queue. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Tags to apply to the Queue. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private QueueState() {}

    private QueueState(QueueState $) {
        this.arn = $.arn;
        this.description = $.description;
        this.hoursOfOperationId = $.hoursOfOperationId;
        this.instanceId = $.instanceId;
        this.maxContacts = $.maxContacts;
        this.name = $.name;
        this.outboundCallerConfig = $.outboundCallerConfig;
        this.queueId = $.queueId;
        this.quickConnectIds = $.quickConnectIds;
        this.quickConnectIdsAssociateds = $.quickConnectIdsAssociateds;
        this.status = $.status;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QueueState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QueueState $;

        public Builder() {
            $ = new QueueState();
        }

        public Builder(QueueState defaults) {
            $ = new QueueState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the Queue.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the Queue.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param description Specifies the description of the Queue.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Specifies the description of the Queue.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param hoursOfOperationId Specifies the identifier of the Hours of Operation.
         * 
         * @return builder
         * 
         */
        public Builder hoursOfOperationId(@Nullable Output<String> hoursOfOperationId) {
            $.hoursOfOperationId = hoursOfOperationId;
            return this;
        }

        /**
         * @param hoursOfOperationId Specifies the identifier of the Hours of Operation.
         * 
         * @return builder
         * 
         */
        public Builder hoursOfOperationId(String hoursOfOperationId) {
            return hoursOfOperationId(Output.of(hoursOfOperationId));
        }

        /**
         * @param instanceId Specifies the identifier of the hosting Amazon Connect Instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId Specifies the identifier of the hosting Amazon Connect Instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param maxContacts Specifies the maximum number of contacts that can be in the queue before it is considered full. Minimum value of 0.
         * 
         * @return builder
         * 
         */
        public Builder maxContacts(@Nullable Output<Integer> maxContacts) {
            $.maxContacts = maxContacts;
            return this;
        }

        /**
         * @param maxContacts Specifies the maximum number of contacts that can be in the queue before it is considered full. Minimum value of 0.
         * 
         * @return builder
         * 
         */
        public Builder maxContacts(Integer maxContacts) {
            return maxContacts(Output.of(maxContacts));
        }

        /**
         * @param name Specifies the name of the Queue.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Queue.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param outboundCallerConfig A block that defines the outbound caller ID name, number, and outbound whisper flow. The Outbound Caller Config block is documented below.
         * 
         * @return builder
         * 
         */
        public Builder outboundCallerConfig(@Nullable Output<QueueOutboundCallerConfigArgs> outboundCallerConfig) {
            $.outboundCallerConfig = outboundCallerConfig;
            return this;
        }

        /**
         * @param outboundCallerConfig A block that defines the outbound caller ID name, number, and outbound whisper flow. The Outbound Caller Config block is documented below.
         * 
         * @return builder
         * 
         */
        public Builder outboundCallerConfig(QueueOutboundCallerConfigArgs outboundCallerConfig) {
            return outboundCallerConfig(Output.of(outboundCallerConfig));
        }

        /**
         * @param queueId The identifier for the Queue.
         * 
         * @return builder
         * 
         */
        public Builder queueId(@Nullable Output<String> queueId) {
            $.queueId = queueId;
            return this;
        }

        /**
         * @param queueId The identifier for the Queue.
         * 
         * @return builder
         * 
         */
        public Builder queueId(String queueId) {
            return queueId(Output.of(queueId));
        }

        /**
         * @param quickConnectIds Specifies a list of quick connects ids that determine the quick connects available to agents who are working the queue.
         * 
         * @return builder
         * 
         */
        public Builder quickConnectIds(@Nullable Output<List<String>> quickConnectIds) {
            $.quickConnectIds = quickConnectIds;
            return this;
        }

        /**
         * @param quickConnectIds Specifies a list of quick connects ids that determine the quick connects available to agents who are working the queue.
         * 
         * @return builder
         * 
         */
        public Builder quickConnectIds(List<String> quickConnectIds) {
            return quickConnectIds(Output.of(quickConnectIds));
        }

        /**
         * @param quickConnectIds Specifies a list of quick connects ids that determine the quick connects available to agents who are working the queue.
         * 
         * @return builder
         * 
         */
        public Builder quickConnectIds(String... quickConnectIds) {
            return quickConnectIds(List.of(quickConnectIds));
        }

        public Builder quickConnectIdsAssociateds(@Nullable Output<List<String>> quickConnectIdsAssociateds) {
            $.quickConnectIdsAssociateds = quickConnectIdsAssociateds;
            return this;
        }

        public Builder quickConnectIdsAssociateds(List<String> quickConnectIdsAssociateds) {
            return quickConnectIdsAssociateds(Output.of(quickConnectIdsAssociateds));
        }

        public Builder quickConnectIdsAssociateds(String... quickConnectIdsAssociateds) {
            return quickConnectIdsAssociateds(List.of(quickConnectIdsAssociateds));
        }

        /**
         * @param status Specifies the description of the Queue. Valid values are `ENABLED`, `DISABLED`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Specifies the description of the Queue. Valid values are `ENABLED`, `DISABLED`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tags Tags to apply to the Queue. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags to apply to the Queue. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public QueueState build() {
            return $;
        }
    }

}
