// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.efs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FileSystemLifecyclePolicy {
    /**
     * @return Indicates how long it takes to transition files to the IA storage class. Valid values: `AFTER_7_DAYS`, `AFTER_14_DAYS`, `AFTER_30_DAYS`, `AFTER_60_DAYS`, or `AFTER_90_DAYS`.
     * 
     */
    private final @Nullable String transitionToIa;
    /**
     * @return Describes the policy used to transition a file from infequent access storage to primary storage. Valid values: `AFTER_1_ACCESS`.
     * 
     */
    private final @Nullable String transitionToPrimaryStorageClass;

    @CustomType.Constructor
    private FileSystemLifecyclePolicy(
        @CustomType.Parameter("transitionToIa") @Nullable String transitionToIa,
        @CustomType.Parameter("transitionToPrimaryStorageClass") @Nullable String transitionToPrimaryStorageClass) {
        this.transitionToIa = transitionToIa;
        this.transitionToPrimaryStorageClass = transitionToPrimaryStorageClass;
    }

    /**
     * @return Indicates how long it takes to transition files to the IA storage class. Valid values: `AFTER_7_DAYS`, `AFTER_14_DAYS`, `AFTER_30_DAYS`, `AFTER_60_DAYS`, or `AFTER_90_DAYS`.
     * 
     */
    public Optional<String> transitionToIa() {
        return Optional.ofNullable(this.transitionToIa);
    }
    /**
     * @return Describes the policy used to transition a file from infequent access storage to primary storage. Valid values: `AFTER_1_ACCESS`.
     * 
     */
    public Optional<String> transitionToPrimaryStorageClass() {
        return Optional.ofNullable(this.transitionToPrimaryStorageClass);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileSystemLifecyclePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String transitionToIa;
        private @Nullable String transitionToPrimaryStorageClass;

        public Builder() {
    	      // Empty
        }

        public Builder(FileSystemLifecyclePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.transitionToIa = defaults.transitionToIa;
    	      this.transitionToPrimaryStorageClass = defaults.transitionToPrimaryStorageClass;
        }

        public Builder transitionToIa(@Nullable String transitionToIa) {
            this.transitionToIa = transitionToIa;
            return this;
        }
        public Builder transitionToPrimaryStorageClass(@Nullable String transitionToPrimaryStorageClass) {
            this.transitionToPrimaryStorageClass = transitionToPrimaryStorageClass;
            return this;
        }        public FileSystemLifecyclePolicy build() {
            return new FileSystemLifecyclePolicy(transitionToIa, transitionToPrimaryStorageClass);
        }
    }
}
