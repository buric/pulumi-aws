// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.outputs;

import com.pulumi.aws.glue.outputs.CatalogDatabaseCreateTableDefaultPermissionPrincipal;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CatalogDatabaseCreateTableDefaultPermission {
    /**
     * @return The permissions that are granted to the principal.
     * 
     */
    private final @Nullable List<String> permissions;
    /**
     * @return The principal who is granted permissions.. See `principal` below.
     * 
     */
    private final @Nullable CatalogDatabaseCreateTableDefaultPermissionPrincipal principal;

    @CustomType.Constructor
    private CatalogDatabaseCreateTableDefaultPermission(
        @CustomType.Parameter("permissions") @Nullable List<String> permissions,
        @CustomType.Parameter("principal") @Nullable CatalogDatabaseCreateTableDefaultPermissionPrincipal principal) {
        this.permissions = permissions;
        this.principal = principal;
    }

    /**
     * @return The permissions that are granted to the principal.
     * 
     */
    public List<String> permissions() {
        return this.permissions == null ? List.of() : this.permissions;
    }
    /**
     * @return The principal who is granted permissions.. See `principal` below.
     * 
     */
    public Optional<CatalogDatabaseCreateTableDefaultPermissionPrincipal> principal() {
        return Optional.ofNullable(this.principal);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CatalogDatabaseCreateTableDefaultPermission defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> permissions;
        private @Nullable CatalogDatabaseCreateTableDefaultPermissionPrincipal principal;

        public Builder() {
    	      // Empty
        }

        public Builder(CatalogDatabaseCreateTableDefaultPermission defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.permissions = defaults.permissions;
    	      this.principal = defaults.principal;
        }

        public Builder permissions(@Nullable List<String> permissions) {
            this.permissions = permissions;
            return this;
        }
        public Builder permissions(String... permissions) {
            return permissions(List.of(permissions));
        }
        public Builder principal(@Nullable CatalogDatabaseCreateTableDefaultPermissionPrincipal principal) {
            this.principal = principal;
            return this;
        }        public CatalogDatabaseCreateTableDefaultPermission build() {
            return new CatalogDatabaseCreateTableDefaultPermission(permissions, principal);
        }
    }
}
