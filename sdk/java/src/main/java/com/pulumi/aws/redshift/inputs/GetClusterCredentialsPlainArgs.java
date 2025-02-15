// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshift.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClusterCredentialsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterCredentialsPlainArgs Empty = new GetClusterCredentialsPlainArgs();

    /**
     * Create a database user with the name specified for the user named in `db_user` if one does not exist.
     * 
     */
    @Import(name="autoCreate")
    private @Nullable Boolean autoCreate;

    /**
     * @return Create a database user with the name specified for the user named in `db_user` if one does not exist.
     * 
     */
    public Optional<Boolean> autoCreate() {
        return Optional.ofNullable(this.autoCreate);
    }

    /**
     * The unique identifier of the cluster that contains the database for which your are requesting credentials.
     * 
     */
    @Import(name="clusterIdentifier", required=true)
    private String clusterIdentifier;

    /**
     * @return The unique identifier of the cluster that contains the database for which your are requesting credentials.
     * 
     */
    public String clusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * A list of the names of existing database groups that the user named in `db_user` will join for the current session, in addition to any group memberships for an existing user. If not specified, a new user is added only to `PUBLIC`.
     * 
     */
    @Import(name="dbGroups")
    private @Nullable List<String> dbGroups;

    /**
     * @return A list of the names of existing database groups that the user named in `db_user` will join for the current session, in addition to any group memberships for an existing user. If not specified, a new user is added only to `PUBLIC`.
     * 
     */
    public Optional<List<String>> dbGroups() {
        return Optional.ofNullable(this.dbGroups);
    }

    /**
     * The name of a database that DbUser is authorized to log on to. If `db_name` is not specified, `db_user` can log on to any existing database.
     * 
     */
    @Import(name="dbName")
    private @Nullable String dbName;

    /**
     * @return The name of a database that DbUser is authorized to log on to. If `db_name` is not specified, `db_user` can log on to any existing database.
     * 
     */
    public Optional<String> dbName() {
        return Optional.ofNullable(this.dbName);
    }

    /**
     * The name of a database user. If a user name matching `db_user` exists in the database, the temporary user credentials have the same permissions as the  existing user. If `db_user` doesn&#39;t exist in the database and `auto_create` is `True`, a new user is created using the value for `db_user` with `PUBLIC` permissions.  If a database user matching the value for `db_user` doesn&#39;t exist and `not` is `False`, then the command succeeds but the connection attempt will fail because the user doesn&#39;t exist in the database.
     * 
     */
    @Import(name="dbUser", required=true)
    private String dbUser;

    /**
     * @return The name of a database user. If a user name matching `db_user` exists in the database, the temporary user credentials have the same permissions as the  existing user. If `db_user` doesn&#39;t exist in the database and `auto_create` is `True`, a new user is created using the value for `db_user` with `PUBLIC` permissions.  If a database user matching the value for `db_user` doesn&#39;t exist and `not` is `False`, then the command succeeds but the connection attempt will fail because the user doesn&#39;t exist in the database.
     * 
     */
    public String dbUser() {
        return this.dbUser;
    }

    /**
     * The number of seconds until the returned temporary password expires. Valid values are between `900` and `3600`. Default value is `900`.
     * 
     */
    @Import(name="durationSeconds")
    private @Nullable Integer durationSeconds;

    /**
     * @return The number of seconds until the returned temporary password expires. Valid values are between `900` and `3600`. Default value is `900`.
     * 
     */
    public Optional<Integer> durationSeconds() {
        return Optional.ofNullable(this.durationSeconds);
    }

    private GetClusterCredentialsPlainArgs() {}

    private GetClusterCredentialsPlainArgs(GetClusterCredentialsPlainArgs $) {
        this.autoCreate = $.autoCreate;
        this.clusterIdentifier = $.clusterIdentifier;
        this.dbGroups = $.dbGroups;
        this.dbName = $.dbName;
        this.dbUser = $.dbUser;
        this.durationSeconds = $.durationSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterCredentialsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterCredentialsPlainArgs $;

        public Builder() {
            $ = new GetClusterCredentialsPlainArgs();
        }

        public Builder(GetClusterCredentialsPlainArgs defaults) {
            $ = new GetClusterCredentialsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoCreate Create a database user with the name specified for the user named in `db_user` if one does not exist.
         * 
         * @return builder
         * 
         */
        public Builder autoCreate(@Nullable Boolean autoCreate) {
            $.autoCreate = autoCreate;
            return this;
        }

        /**
         * @param clusterIdentifier The unique identifier of the cluster that contains the database for which your are requesting credentials.
         * 
         * @return builder
         * 
         */
        public Builder clusterIdentifier(String clusterIdentifier) {
            $.clusterIdentifier = clusterIdentifier;
            return this;
        }

        /**
         * @param dbGroups A list of the names of existing database groups that the user named in `db_user` will join for the current session, in addition to any group memberships for an existing user. If not specified, a new user is added only to `PUBLIC`.
         * 
         * @return builder
         * 
         */
        public Builder dbGroups(@Nullable List<String> dbGroups) {
            $.dbGroups = dbGroups;
            return this;
        }

        /**
         * @param dbGroups A list of the names of existing database groups that the user named in `db_user` will join for the current session, in addition to any group memberships for an existing user. If not specified, a new user is added only to `PUBLIC`.
         * 
         * @return builder
         * 
         */
        public Builder dbGroups(String... dbGroups) {
            return dbGroups(List.of(dbGroups));
        }

        /**
         * @param dbName The name of a database that DbUser is authorized to log on to. If `db_name` is not specified, `db_user` can log on to any existing database.
         * 
         * @return builder
         * 
         */
        public Builder dbName(@Nullable String dbName) {
            $.dbName = dbName;
            return this;
        }

        /**
         * @param dbUser The name of a database user. If a user name matching `db_user` exists in the database, the temporary user credentials have the same permissions as the  existing user. If `db_user` doesn&#39;t exist in the database and `auto_create` is `True`, a new user is created using the value for `db_user` with `PUBLIC` permissions.  If a database user matching the value for `db_user` doesn&#39;t exist and `not` is `False`, then the command succeeds but the connection attempt will fail because the user doesn&#39;t exist in the database.
         * 
         * @return builder
         * 
         */
        public Builder dbUser(String dbUser) {
            $.dbUser = dbUser;
            return this;
        }

        /**
         * @param durationSeconds The number of seconds until the returned temporary password expires. Valid values are between `900` and `3600`. Default value is `900`.
         * 
         * @return builder
         * 
         */
        public Builder durationSeconds(@Nullable Integer durationSeconds) {
            $.durationSeconds = durationSeconds;
            return this;
        }

        public GetClusterCredentialsPlainArgs build() {
            $.clusterIdentifier = Objects.requireNonNull($.clusterIdentifier, "expected parameter 'clusterIdentifier' to be non-null");
            $.dbUser = Objects.requireNonNull($.dbUser, "expected parameter 'dbUser' to be non-null");
            return $;
        }
    }

}
