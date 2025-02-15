// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.transfer.inputs;

import com.pulumi.aws.transfer.inputs.UserHomeDirectoryMappingArgs;
import com.pulumi.aws.transfer.inputs.UserPosixProfileArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserState extends com.pulumi.resources.ResourceArgs {

    public static final UserState Empty = new UserState();

    /**
     * Amazon Resource Name (ARN) of Transfer User
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of Transfer User
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The landing directory (folder) for a user when they log in to the server using their SFTP client.  It should begin with a `/`.  The first item in the path is the name of the home bucket (accessible as `${Transfer:HomeBucket}` in the policy) and the rest is the home directory (accessible as `${Transfer:HomeDirectory}` in the policy). For example, `/example-bucket-1234/username` would set the home bucket to `example-bucket-1234` and the home directory to `username`.
     * 
     */
    @Import(name="homeDirectory")
    private @Nullable Output<String> homeDirectory;

    /**
     * @return The landing directory (folder) for a user when they log in to the server using their SFTP client.  It should begin with a `/`.  The first item in the path is the name of the home bucket (accessible as `${Transfer:HomeBucket}` in the policy) and the rest is the home directory (accessible as `${Transfer:HomeDirectory}` in the policy). For example, `/example-bucket-1234/username` would set the home bucket to `example-bucket-1234` and the home directory to `username`.
     * 
     */
    public Optional<Output<String>> homeDirectory() {
        return Optional.ofNullable(this.homeDirectory);
    }

    /**
     * Logical directory mappings that specify what S3 paths and keys should be visible to your user and how you want to make them visible. See Home Directory Mappings below.
     * 
     */
    @Import(name="homeDirectoryMappings")
    private @Nullable Output<List<UserHomeDirectoryMappingArgs>> homeDirectoryMappings;

    /**
     * @return Logical directory mappings that specify what S3 paths and keys should be visible to your user and how you want to make them visible. See Home Directory Mappings below.
     * 
     */
    public Optional<Output<List<UserHomeDirectoryMappingArgs>>> homeDirectoryMappings() {
        return Optional.ofNullable(this.homeDirectoryMappings);
    }

    /**
     * The type of landing directory (folder) you mapped for your users&#39; home directory. Valid values are `PATH` and `LOGICAL`.
     * 
     */
    @Import(name="homeDirectoryType")
    private @Nullable Output<String> homeDirectoryType;

    /**
     * @return The type of landing directory (folder) you mapped for your users&#39; home directory. Valid values are `PATH` and `LOGICAL`.
     * 
     */
    public Optional<Output<String>> homeDirectoryType() {
        return Optional.ofNullable(this.homeDirectoryType);
    }

    /**
     * An IAM JSON policy document that scopes down user access to portions of their Amazon S3 bucket. IAM variables you can use inside this policy include `${Transfer:UserName}`, `${Transfer:HomeDirectory}`, and `${Transfer:HomeBucket}`. These are evaluated on-the-fly when navigating the bucket.
     * 
     */
    @Import(name="policy")
    private @Nullable Output<String> policy;

    /**
     * @return An IAM JSON policy document that scopes down user access to portions of their Amazon S3 bucket. IAM variables you can use inside this policy include `${Transfer:UserName}`, `${Transfer:HomeDirectory}`, and `${Transfer:HomeBucket}`. These are evaluated on-the-fly when navigating the bucket.
     * 
     */
    public Optional<Output<String>> policy() {
        return Optional.ofNullable(this.policy);
    }

    /**
     * Specifies the full POSIX identity, including user ID (Uid), group ID (Gid), and any secondary groups IDs (SecondaryGids), that controls your users&#39; access to your Amazon EFS file systems. See Posix Profile below.
     * 
     */
    @Import(name="posixProfile")
    private @Nullable Output<UserPosixProfileArgs> posixProfile;

    /**
     * @return Specifies the full POSIX identity, including user ID (Uid), group ID (Gid), and any secondary groups IDs (SecondaryGids), that controls your users&#39; access to your Amazon EFS file systems. See Posix Profile below.
     * 
     */
    public Optional<Output<UserPosixProfileArgs>> posixProfile() {
        return Optional.ofNullable(this.posixProfile);
    }

    /**
     * Amazon Resource Name (ARN) of an IAM role that allows the service to controls your user’s access to your Amazon S3 bucket.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return Amazon Resource Name (ARN) of an IAM role that allows the service to controls your user’s access to your Amazon S3 bucket.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    /**
     * The Server ID of the Transfer Server (e.g., `s-12345678`)
     * 
     */
    @Import(name="serverId")
    private @Nullable Output<String> serverId;

    /**
     * @return The Server ID of the Transfer Server (e.g., `s-12345678`)
     * 
     */
    public Optional<Output<String>> serverId() {
        return Optional.ofNullable(this.serverId);
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider.
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * The name used for log in to your SFTP server.
     * 
     */
    @Import(name="userName")
    private @Nullable Output<String> userName;

    /**
     * @return The name used for log in to your SFTP server.
     * 
     */
    public Optional<Output<String>> userName() {
        return Optional.ofNullable(this.userName);
    }

    private UserState() {}

    private UserState(UserState $) {
        this.arn = $.arn;
        this.homeDirectory = $.homeDirectory;
        this.homeDirectoryMappings = $.homeDirectoryMappings;
        this.homeDirectoryType = $.homeDirectoryType;
        this.policy = $.policy;
        this.posixProfile = $.posixProfile;
        this.role = $.role;
        this.serverId = $.serverId;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserState $;

        public Builder() {
            $ = new UserState();
        }

        public Builder(UserState defaults) {
            $ = new UserState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn Amazon Resource Name (ARN) of Transfer User
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn Amazon Resource Name (ARN) of Transfer User
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param homeDirectory The landing directory (folder) for a user when they log in to the server using their SFTP client.  It should begin with a `/`.  The first item in the path is the name of the home bucket (accessible as `${Transfer:HomeBucket}` in the policy) and the rest is the home directory (accessible as `${Transfer:HomeDirectory}` in the policy). For example, `/example-bucket-1234/username` would set the home bucket to `example-bucket-1234` and the home directory to `username`.
         * 
         * @return builder
         * 
         */
        public Builder homeDirectory(@Nullable Output<String> homeDirectory) {
            $.homeDirectory = homeDirectory;
            return this;
        }

        /**
         * @param homeDirectory The landing directory (folder) for a user when they log in to the server using their SFTP client.  It should begin with a `/`.  The first item in the path is the name of the home bucket (accessible as `${Transfer:HomeBucket}` in the policy) and the rest is the home directory (accessible as `${Transfer:HomeDirectory}` in the policy). For example, `/example-bucket-1234/username` would set the home bucket to `example-bucket-1234` and the home directory to `username`.
         * 
         * @return builder
         * 
         */
        public Builder homeDirectory(String homeDirectory) {
            return homeDirectory(Output.of(homeDirectory));
        }

        /**
         * @param homeDirectoryMappings Logical directory mappings that specify what S3 paths and keys should be visible to your user and how you want to make them visible. See Home Directory Mappings below.
         * 
         * @return builder
         * 
         */
        public Builder homeDirectoryMappings(@Nullable Output<List<UserHomeDirectoryMappingArgs>> homeDirectoryMappings) {
            $.homeDirectoryMappings = homeDirectoryMappings;
            return this;
        }

        /**
         * @param homeDirectoryMappings Logical directory mappings that specify what S3 paths and keys should be visible to your user and how you want to make them visible. See Home Directory Mappings below.
         * 
         * @return builder
         * 
         */
        public Builder homeDirectoryMappings(List<UserHomeDirectoryMappingArgs> homeDirectoryMappings) {
            return homeDirectoryMappings(Output.of(homeDirectoryMappings));
        }

        /**
         * @param homeDirectoryMappings Logical directory mappings that specify what S3 paths and keys should be visible to your user and how you want to make them visible. See Home Directory Mappings below.
         * 
         * @return builder
         * 
         */
        public Builder homeDirectoryMappings(UserHomeDirectoryMappingArgs... homeDirectoryMappings) {
            return homeDirectoryMappings(List.of(homeDirectoryMappings));
        }

        /**
         * @param homeDirectoryType The type of landing directory (folder) you mapped for your users&#39; home directory. Valid values are `PATH` and `LOGICAL`.
         * 
         * @return builder
         * 
         */
        public Builder homeDirectoryType(@Nullable Output<String> homeDirectoryType) {
            $.homeDirectoryType = homeDirectoryType;
            return this;
        }

        /**
         * @param homeDirectoryType The type of landing directory (folder) you mapped for your users&#39; home directory. Valid values are `PATH` and `LOGICAL`.
         * 
         * @return builder
         * 
         */
        public Builder homeDirectoryType(String homeDirectoryType) {
            return homeDirectoryType(Output.of(homeDirectoryType));
        }

        /**
         * @param policy An IAM JSON policy document that scopes down user access to portions of their Amazon S3 bucket. IAM variables you can use inside this policy include `${Transfer:UserName}`, `${Transfer:HomeDirectory}`, and `${Transfer:HomeBucket}`. These are evaluated on-the-fly when navigating the bucket.
         * 
         * @return builder
         * 
         */
        public Builder policy(@Nullable Output<String> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy An IAM JSON policy document that scopes down user access to portions of their Amazon S3 bucket. IAM variables you can use inside this policy include `${Transfer:UserName}`, `${Transfer:HomeDirectory}`, and `${Transfer:HomeBucket}`. These are evaluated on-the-fly when navigating the bucket.
         * 
         * @return builder
         * 
         */
        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        /**
         * @param posixProfile Specifies the full POSIX identity, including user ID (Uid), group ID (Gid), and any secondary groups IDs (SecondaryGids), that controls your users&#39; access to your Amazon EFS file systems. See Posix Profile below.
         * 
         * @return builder
         * 
         */
        public Builder posixProfile(@Nullable Output<UserPosixProfileArgs> posixProfile) {
            $.posixProfile = posixProfile;
            return this;
        }

        /**
         * @param posixProfile Specifies the full POSIX identity, including user ID (Uid), group ID (Gid), and any secondary groups IDs (SecondaryGids), that controls your users&#39; access to your Amazon EFS file systems. See Posix Profile below.
         * 
         * @return builder
         * 
         */
        public Builder posixProfile(UserPosixProfileArgs posixProfile) {
            return posixProfile(Output.of(posixProfile));
        }

        /**
         * @param role Amazon Resource Name (ARN) of an IAM role that allows the service to controls your user’s access to your Amazon S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role Amazon Resource Name (ARN) of an IAM role that allows the service to controls your user’s access to your Amazon S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param serverId The Server ID of the Transfer Server (e.g., `s-12345678`)
         * 
         * @return builder
         * 
         */
        public Builder serverId(@Nullable Output<String> serverId) {
            $.serverId = serverId;
            return this;
        }

        /**
         * @param serverId The Server ID of the Transfer Server (e.g., `s-12345678`)
         * 
         * @return builder
         * 
         */
        public Builder serverId(String serverId) {
            return serverId(Output.of(serverId));
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param userName The name used for log in to your SFTP server.
         * 
         * @return builder
         * 
         */
        public Builder userName(@Nullable Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName The name used for log in to your SFTP server.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        public UserState build() {
            return $;
        }
    }

}
