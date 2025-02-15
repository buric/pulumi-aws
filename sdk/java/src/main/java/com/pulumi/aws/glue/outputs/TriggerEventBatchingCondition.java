// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TriggerEventBatchingCondition {
    /**
     * @return Number of events that must be received from Amazon EventBridge before EventBridge  event trigger fires.
     * 
     */
    private final Integer batchSize;
    /**
     * @return Window of time in seconds after which EventBridge event trigger fires. Window starts when first event is received. Default value is `900`.
     * 
     */
    private final @Nullable Integer batchWindow;

    @CustomType.Constructor
    private TriggerEventBatchingCondition(
        @CustomType.Parameter("batchSize") Integer batchSize,
        @CustomType.Parameter("batchWindow") @Nullable Integer batchWindow) {
        this.batchSize = batchSize;
        this.batchWindow = batchWindow;
    }

    /**
     * @return Number of events that must be received from Amazon EventBridge before EventBridge  event trigger fires.
     * 
     */
    public Integer batchSize() {
        return this.batchSize;
    }
    /**
     * @return Window of time in seconds after which EventBridge event trigger fires. Window starts when first event is received. Default value is `900`.
     * 
     */
    public Optional<Integer> batchWindow() {
        return Optional.ofNullable(this.batchWindow);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerEventBatchingCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer batchSize;
        private @Nullable Integer batchWindow;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerEventBatchingCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.batchSize = defaults.batchSize;
    	      this.batchWindow = defaults.batchWindow;
        }

        public Builder batchSize(Integer batchSize) {
            this.batchSize = Objects.requireNonNull(batchSize);
            return this;
        }
        public Builder batchWindow(@Nullable Integer batchWindow) {
            this.batchWindow = batchWindow;
            return this;
        }        public TriggerEventBatchingCondition build() {
            return new TriggerEventBatchingCondition(batchSize, batchWindow);
        }
    }
}
