// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.aws.cloudfront.outputs.FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItem;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfiles {
    private final @Nullable List<FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItem> items;

    @CustomType.Constructor
    private FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfiles(@CustomType.Parameter("items") @Nullable List<FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItem> items) {
        this.items = items;
    }

    public List<FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItem> items() {
        return this.items == null ? List.of() : this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfiles defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItem> items;

        public Builder() {
    	      // Empty
        }

        public Builder(FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfiles defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(@Nullable List<FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItem> items) {
            this.items = items;
            return this;
        }
        public Builder items(FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItem... items) {
            return items(List.of(items));
        }        public FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfiles build() {
            return new FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfiles(items);
        }
    }
}
