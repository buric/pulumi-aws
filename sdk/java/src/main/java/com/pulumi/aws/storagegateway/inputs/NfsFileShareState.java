// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.storagegateway.inputs;

import com.pulumi.aws.storagegateway.inputs.NfsFileShareCacheAttributesArgs;
import com.pulumi.aws.storagegateway.inputs.NfsFileShareNfsFileShareDefaultsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NfsFileShareState extends com.pulumi.resources.ResourceArgs {

    public static final NfsFileShareState Empty = new NfsFileShareState();

    /**
     * Amazon Resource Name (ARN) of the NFS File Share.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the NFS File Share.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The Amazon Resource Name (ARN) of the storage used for audit logs.
     * 
     */
    @Import(name="auditDestinationArn")
    private @Nullable Output<String> auditDestinationArn;

    /**
     * @return The Amazon Resource Name (ARN) of the storage used for audit logs.
     * 
     */
    public Optional<Output<String>> auditDestinationArn() {
        return Optional.ofNullable(this.auditDestinationArn);
    }

    /**
     * The region of the S3 bucket used by the file share. Required when specifying `vpc_endpoint_dns_name`.
     * 
     */
    @Import(name="bucketRegion")
    private @Nullable Output<String> bucketRegion;

    /**
     * @return The region of the S3 bucket used by the file share. Required when specifying `vpc_endpoint_dns_name`.
     * 
     */
    public Optional<Output<String>> bucketRegion() {
        return Optional.ofNullable(this.bucketRegion);
    }

    /**
     * Refresh cache information. see Cache Attributes for more details.
     * 
     */
    @Import(name="cacheAttributes")
    private @Nullable Output<NfsFileShareCacheAttributesArgs> cacheAttributes;

    /**
     * @return Refresh cache information. see Cache Attributes for more details.
     * 
     */
    public Optional<Output<NfsFileShareCacheAttributesArgs>> cacheAttributes() {
        return Optional.ofNullable(this.cacheAttributes);
    }

    /**
     * The list of clients that are allowed to access the file gateway. The list must contain either valid IP addresses or valid CIDR blocks. Set to `[&#34;0.0.0.0/0&#34;]` to not limit access. Minimum 1 item. Maximum 100 items.
     * 
     */
    @Import(name="clientLists")
    private @Nullable Output<List<String>> clientLists;

    /**
     * @return The list of clients that are allowed to access the file gateway. The list must contain either valid IP addresses or valid CIDR blocks. Set to `[&#34;0.0.0.0/0&#34;]` to not limit access. Minimum 1 item. Maximum 100 items.
     * 
     */
    public Optional<Output<List<String>>> clientLists() {
        return Optional.ofNullable(this.clientLists);
    }

    /**
     * The default [storage class](https://docs.aws.amazon.com/storagegateway/latest/APIReference/API_CreateNFSFileShare.html#StorageGateway-CreateNFSFileShare-request-DefaultStorageClass) for objects put into an Amazon S3 bucket by the file gateway. Defaults to `S3_STANDARD`.
     * 
     */
    @Import(name="defaultStorageClass")
    private @Nullable Output<String> defaultStorageClass;

    /**
     * @return The default [storage class](https://docs.aws.amazon.com/storagegateway/latest/APIReference/API_CreateNFSFileShare.html#StorageGateway-CreateNFSFileShare-request-DefaultStorageClass) for objects put into an Amazon S3 bucket by the file gateway. Defaults to `S3_STANDARD`.
     * 
     */
    public Optional<Output<String>> defaultStorageClass() {
        return Optional.ofNullable(this.defaultStorageClass);
    }

    /**
     * The name of the file share. Must be set if an S3 prefix name is set in `location_arn`.
     * 
     */
    @Import(name="fileShareName")
    private @Nullable Output<String> fileShareName;

    /**
     * @return The name of the file share. Must be set if an S3 prefix name is set in `location_arn`.
     * 
     */
    public Optional<Output<String>> fileShareName() {
        return Optional.ofNullable(this.fileShareName);
    }

    /**
     * ID of the NFS File Share.
     * 
     */
    @Import(name="fileshareId")
    private @Nullable Output<String> fileshareId;

    /**
     * @return ID of the NFS File Share.
     * 
     */
    public Optional<Output<String>> fileshareId() {
        return Optional.ofNullable(this.fileshareId);
    }

    /**
     * Amazon Resource Name (ARN) of the file gateway.
     * 
     */
    @Import(name="gatewayArn")
    private @Nullable Output<String> gatewayArn;

    /**
     * @return Amazon Resource Name (ARN) of the file gateway.
     * 
     */
    public Optional<Output<String>> gatewayArn() {
        return Optional.ofNullable(this.gatewayArn);
    }

    /**
     * Boolean value that enables guessing of the MIME type for uploaded objects based on file extensions. Defaults to `true`.
     * 
     */
    @Import(name="guessMimeTypeEnabled")
    private @Nullable Output<Boolean> guessMimeTypeEnabled;

    /**
     * @return Boolean value that enables guessing of the MIME type for uploaded objects based on file extensions. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> guessMimeTypeEnabled() {
        return Optional.ofNullable(this.guessMimeTypeEnabled);
    }

    /**
     * Boolean value if `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3. Defaults to `false`.
     * 
     */
    @Import(name="kmsEncrypted")
    private @Nullable Output<Boolean> kmsEncrypted;

    /**
     * @return Boolean value if `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> kmsEncrypted() {
        return Optional.ofNullable(this.kmsEncrypted);
    }

    /**
     * Amazon Resource Name (ARN) for KMS key used for Amazon S3 server side encryption. This value can only be set when `kms_encrypted` is true.
     * 
     */
    @Import(name="kmsKeyArn")
    private @Nullable Output<String> kmsKeyArn;

    /**
     * @return Amazon Resource Name (ARN) for KMS key used for Amazon S3 server side encryption. This value can only be set when `kms_encrypted` is true.
     * 
     */
    public Optional<Output<String>> kmsKeyArn() {
        return Optional.ofNullable(this.kmsKeyArn);
    }

    /**
     * The ARN of the backed storage used for storing file data.
     * 
     */
    @Import(name="locationArn")
    private @Nullable Output<String> locationArn;

    /**
     * @return The ARN of the backed storage used for storing file data.
     * 
     */
    public Optional<Output<String>> locationArn() {
        return Optional.ofNullable(this.locationArn);
    }

    /**
     * Nested argument with file share default values. More information below. see NFS File Share Defaults for more details.
     * 
     */
    @Import(name="nfsFileShareDefaults")
    private @Nullable Output<NfsFileShareNfsFileShareDefaultsArgs> nfsFileShareDefaults;

    /**
     * @return Nested argument with file share default values. More information below. see NFS File Share Defaults for more details.
     * 
     */
    public Optional<Output<NfsFileShareNfsFileShareDefaultsArgs>> nfsFileShareDefaults() {
        return Optional.ofNullable(this.nfsFileShareDefaults);
    }

    /**
     * The notification policy of the file share. For more information see the [AWS Documentation](https://docs.aws.amazon.com/storagegateway/latest/APIReference/API_CreateNFSFileShare.html#StorageGateway-CreateNFSFileShare-request-NotificationPolicy). Default value is `{}`.
     * 
     */
    @Import(name="notificationPolicy")
    private @Nullable Output<String> notificationPolicy;

    /**
     * @return The notification policy of the file share. For more information see the [AWS Documentation](https://docs.aws.amazon.com/storagegateway/latest/APIReference/API_CreateNFSFileShare.html#StorageGateway-CreateNFSFileShare-request-NotificationPolicy). Default value is `{}`.
     * 
     */
    public Optional<Output<String>> notificationPolicy() {
        return Optional.ofNullable(this.notificationPolicy);
    }

    /**
     * Access Control List permission for S3 objects. Defaults to `private`.
     * 
     */
    @Import(name="objectAcl")
    private @Nullable Output<String> objectAcl;

    /**
     * @return Access Control List permission for S3 objects. Defaults to `private`.
     * 
     */
    public Optional<Output<String>> objectAcl() {
        return Optional.ofNullable(this.objectAcl);
    }

    /**
     * File share path used by the NFS client to identify the mount point.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return File share path used by the NFS client to identify the mount point.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Boolean to indicate write status of file share. File share does not accept writes if `true`. Defaults to `false`.
     * 
     */
    @Import(name="readOnly")
    private @Nullable Output<Boolean> readOnly;

    /**
     * @return Boolean to indicate write status of file share. File share does not accept writes if `true`. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    /**
     * Boolean who pays the cost of the request and the data download from the Amazon S3 bucket. Set this value to `true` if you want the requester to pay instead of the bucket owner. Defaults to `false`.
     * 
     */
    @Import(name="requesterPays")
    private @Nullable Output<Boolean> requesterPays;

    /**
     * @return Boolean who pays the cost of the request and the data download from the Amazon S3 bucket. Set this value to `true` if you want the requester to pay instead of the bucket owner. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> requesterPays() {
        return Optional.ofNullable(this.requesterPays);
    }

    /**
     * The ARN of the AWS Identity and Access Management (IAM) role that a file gateway assumes when it accesses the underlying storage.
     * 
     */
    @Import(name="roleArn")
    private @Nullable Output<String> roleArn;

    /**
     * @return The ARN of the AWS Identity and Access Management (IAM) role that a file gateway assumes when it accesses the underlying storage.
     * 
     */
    public Optional<Output<String>> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    /**
     * Maps a user to anonymous user. Defaults to `RootSquash`. Valid values: `RootSquash` (only root is mapped to anonymous user), `NoSquash` (no one is mapped to anonymous user), `AllSquash` (everyone is mapped to anonymous user)
     * 
     */
    @Import(name="squash")
    private @Nullable Output<String> squash;

    /**
     * @return Maps a user to anonymous user. Defaults to `RootSquash`. Valid values: `RootSquash` (only root is mapped to anonymous user), `NoSquash` (no one is mapped to anonymous user), `AllSquash` (everyone is mapped to anonymous user)
     * 
     */
    public Optional<Output<String>> squash() {
        return Optional.ofNullable(this.squash);
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * The DNS name of the VPC endpoint for S3 PrivateLink.
     * 
     */
    @Import(name="vpcEndpointDnsName")
    private @Nullable Output<String> vpcEndpointDnsName;

    /**
     * @return The DNS name of the VPC endpoint for S3 PrivateLink.
     * 
     */
    public Optional<Output<String>> vpcEndpointDnsName() {
        return Optional.ofNullable(this.vpcEndpointDnsName);
    }

    private NfsFileShareState() {}

    private NfsFileShareState(NfsFileShareState $) {
        this.arn = $.arn;
        this.auditDestinationArn = $.auditDestinationArn;
        this.bucketRegion = $.bucketRegion;
        this.cacheAttributes = $.cacheAttributes;
        this.clientLists = $.clientLists;
        this.defaultStorageClass = $.defaultStorageClass;
        this.fileShareName = $.fileShareName;
        this.fileshareId = $.fileshareId;
        this.gatewayArn = $.gatewayArn;
        this.guessMimeTypeEnabled = $.guessMimeTypeEnabled;
        this.kmsEncrypted = $.kmsEncrypted;
        this.kmsKeyArn = $.kmsKeyArn;
        this.locationArn = $.locationArn;
        this.nfsFileShareDefaults = $.nfsFileShareDefaults;
        this.notificationPolicy = $.notificationPolicy;
        this.objectAcl = $.objectAcl;
        this.path = $.path;
        this.readOnly = $.readOnly;
        this.requesterPays = $.requesterPays;
        this.roleArn = $.roleArn;
        this.squash = $.squash;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.vpcEndpointDnsName = $.vpcEndpointDnsName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NfsFileShareState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NfsFileShareState $;

        public Builder() {
            $ = new NfsFileShareState();
        }

        public Builder(NfsFileShareState defaults) {
            $ = new NfsFileShareState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn Amazon Resource Name (ARN) of the NFS File Share.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn Amazon Resource Name (ARN) of the NFS File Share.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param auditDestinationArn The Amazon Resource Name (ARN) of the storage used for audit logs.
         * 
         * @return builder
         * 
         */
        public Builder auditDestinationArn(@Nullable Output<String> auditDestinationArn) {
            $.auditDestinationArn = auditDestinationArn;
            return this;
        }

        /**
         * @param auditDestinationArn The Amazon Resource Name (ARN) of the storage used for audit logs.
         * 
         * @return builder
         * 
         */
        public Builder auditDestinationArn(String auditDestinationArn) {
            return auditDestinationArn(Output.of(auditDestinationArn));
        }

        /**
         * @param bucketRegion The region of the S3 bucket used by the file share. Required when specifying `vpc_endpoint_dns_name`.
         * 
         * @return builder
         * 
         */
        public Builder bucketRegion(@Nullable Output<String> bucketRegion) {
            $.bucketRegion = bucketRegion;
            return this;
        }

        /**
         * @param bucketRegion The region of the S3 bucket used by the file share. Required when specifying `vpc_endpoint_dns_name`.
         * 
         * @return builder
         * 
         */
        public Builder bucketRegion(String bucketRegion) {
            return bucketRegion(Output.of(bucketRegion));
        }

        /**
         * @param cacheAttributes Refresh cache information. see Cache Attributes for more details.
         * 
         * @return builder
         * 
         */
        public Builder cacheAttributes(@Nullable Output<NfsFileShareCacheAttributesArgs> cacheAttributes) {
            $.cacheAttributes = cacheAttributes;
            return this;
        }

        /**
         * @param cacheAttributes Refresh cache information. see Cache Attributes for more details.
         * 
         * @return builder
         * 
         */
        public Builder cacheAttributes(NfsFileShareCacheAttributesArgs cacheAttributes) {
            return cacheAttributes(Output.of(cacheAttributes));
        }

        /**
         * @param clientLists The list of clients that are allowed to access the file gateway. The list must contain either valid IP addresses or valid CIDR blocks. Set to `[&#34;0.0.0.0/0&#34;]` to not limit access. Minimum 1 item. Maximum 100 items.
         * 
         * @return builder
         * 
         */
        public Builder clientLists(@Nullable Output<List<String>> clientLists) {
            $.clientLists = clientLists;
            return this;
        }

        /**
         * @param clientLists The list of clients that are allowed to access the file gateway. The list must contain either valid IP addresses or valid CIDR blocks. Set to `[&#34;0.0.0.0/0&#34;]` to not limit access. Minimum 1 item. Maximum 100 items.
         * 
         * @return builder
         * 
         */
        public Builder clientLists(List<String> clientLists) {
            return clientLists(Output.of(clientLists));
        }

        /**
         * @param clientLists The list of clients that are allowed to access the file gateway. The list must contain either valid IP addresses or valid CIDR blocks. Set to `[&#34;0.0.0.0/0&#34;]` to not limit access. Minimum 1 item. Maximum 100 items.
         * 
         * @return builder
         * 
         */
        public Builder clientLists(String... clientLists) {
            return clientLists(List.of(clientLists));
        }

        /**
         * @param defaultStorageClass The default [storage class](https://docs.aws.amazon.com/storagegateway/latest/APIReference/API_CreateNFSFileShare.html#StorageGateway-CreateNFSFileShare-request-DefaultStorageClass) for objects put into an Amazon S3 bucket by the file gateway. Defaults to `S3_STANDARD`.
         * 
         * @return builder
         * 
         */
        public Builder defaultStorageClass(@Nullable Output<String> defaultStorageClass) {
            $.defaultStorageClass = defaultStorageClass;
            return this;
        }

        /**
         * @param defaultStorageClass The default [storage class](https://docs.aws.amazon.com/storagegateway/latest/APIReference/API_CreateNFSFileShare.html#StorageGateway-CreateNFSFileShare-request-DefaultStorageClass) for objects put into an Amazon S3 bucket by the file gateway. Defaults to `S3_STANDARD`.
         * 
         * @return builder
         * 
         */
        public Builder defaultStorageClass(String defaultStorageClass) {
            return defaultStorageClass(Output.of(defaultStorageClass));
        }

        /**
         * @param fileShareName The name of the file share. Must be set if an S3 prefix name is set in `location_arn`.
         * 
         * @return builder
         * 
         */
        public Builder fileShareName(@Nullable Output<String> fileShareName) {
            $.fileShareName = fileShareName;
            return this;
        }

        /**
         * @param fileShareName The name of the file share. Must be set if an S3 prefix name is set in `location_arn`.
         * 
         * @return builder
         * 
         */
        public Builder fileShareName(String fileShareName) {
            return fileShareName(Output.of(fileShareName));
        }

        /**
         * @param fileshareId ID of the NFS File Share.
         * 
         * @return builder
         * 
         */
        public Builder fileshareId(@Nullable Output<String> fileshareId) {
            $.fileshareId = fileshareId;
            return this;
        }

        /**
         * @param fileshareId ID of the NFS File Share.
         * 
         * @return builder
         * 
         */
        public Builder fileshareId(String fileshareId) {
            return fileshareId(Output.of(fileshareId));
        }

        /**
         * @param gatewayArn Amazon Resource Name (ARN) of the file gateway.
         * 
         * @return builder
         * 
         */
        public Builder gatewayArn(@Nullable Output<String> gatewayArn) {
            $.gatewayArn = gatewayArn;
            return this;
        }

        /**
         * @param gatewayArn Amazon Resource Name (ARN) of the file gateway.
         * 
         * @return builder
         * 
         */
        public Builder gatewayArn(String gatewayArn) {
            return gatewayArn(Output.of(gatewayArn));
        }

        /**
         * @param guessMimeTypeEnabled Boolean value that enables guessing of the MIME type for uploaded objects based on file extensions. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder guessMimeTypeEnabled(@Nullable Output<Boolean> guessMimeTypeEnabled) {
            $.guessMimeTypeEnabled = guessMimeTypeEnabled;
            return this;
        }

        /**
         * @param guessMimeTypeEnabled Boolean value that enables guessing of the MIME type for uploaded objects based on file extensions. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder guessMimeTypeEnabled(Boolean guessMimeTypeEnabled) {
            return guessMimeTypeEnabled(Output.of(guessMimeTypeEnabled));
        }

        /**
         * @param kmsEncrypted Boolean value if `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder kmsEncrypted(@Nullable Output<Boolean> kmsEncrypted) {
            $.kmsEncrypted = kmsEncrypted;
            return this;
        }

        /**
         * @param kmsEncrypted Boolean value if `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder kmsEncrypted(Boolean kmsEncrypted) {
            return kmsEncrypted(Output.of(kmsEncrypted));
        }

        /**
         * @param kmsKeyArn Amazon Resource Name (ARN) for KMS key used for Amazon S3 server side encryption. This value can only be set when `kms_encrypted` is true.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyArn(@Nullable Output<String> kmsKeyArn) {
            $.kmsKeyArn = kmsKeyArn;
            return this;
        }

        /**
         * @param kmsKeyArn Amazon Resource Name (ARN) for KMS key used for Amazon S3 server side encryption. This value can only be set when `kms_encrypted` is true.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyArn(String kmsKeyArn) {
            return kmsKeyArn(Output.of(kmsKeyArn));
        }

        /**
         * @param locationArn The ARN of the backed storage used for storing file data.
         * 
         * @return builder
         * 
         */
        public Builder locationArn(@Nullable Output<String> locationArn) {
            $.locationArn = locationArn;
            return this;
        }

        /**
         * @param locationArn The ARN of the backed storage used for storing file data.
         * 
         * @return builder
         * 
         */
        public Builder locationArn(String locationArn) {
            return locationArn(Output.of(locationArn));
        }

        /**
         * @param nfsFileShareDefaults Nested argument with file share default values. More information below. see NFS File Share Defaults for more details.
         * 
         * @return builder
         * 
         */
        public Builder nfsFileShareDefaults(@Nullable Output<NfsFileShareNfsFileShareDefaultsArgs> nfsFileShareDefaults) {
            $.nfsFileShareDefaults = nfsFileShareDefaults;
            return this;
        }

        /**
         * @param nfsFileShareDefaults Nested argument with file share default values. More information below. see NFS File Share Defaults for more details.
         * 
         * @return builder
         * 
         */
        public Builder nfsFileShareDefaults(NfsFileShareNfsFileShareDefaultsArgs nfsFileShareDefaults) {
            return nfsFileShareDefaults(Output.of(nfsFileShareDefaults));
        }

        /**
         * @param notificationPolicy The notification policy of the file share. For more information see the [AWS Documentation](https://docs.aws.amazon.com/storagegateway/latest/APIReference/API_CreateNFSFileShare.html#StorageGateway-CreateNFSFileShare-request-NotificationPolicy). Default value is `{}`.
         * 
         * @return builder
         * 
         */
        public Builder notificationPolicy(@Nullable Output<String> notificationPolicy) {
            $.notificationPolicy = notificationPolicy;
            return this;
        }

        /**
         * @param notificationPolicy The notification policy of the file share. For more information see the [AWS Documentation](https://docs.aws.amazon.com/storagegateway/latest/APIReference/API_CreateNFSFileShare.html#StorageGateway-CreateNFSFileShare-request-NotificationPolicy). Default value is `{}`.
         * 
         * @return builder
         * 
         */
        public Builder notificationPolicy(String notificationPolicy) {
            return notificationPolicy(Output.of(notificationPolicy));
        }

        /**
         * @param objectAcl Access Control List permission for S3 objects. Defaults to `private`.
         * 
         * @return builder
         * 
         */
        public Builder objectAcl(@Nullable Output<String> objectAcl) {
            $.objectAcl = objectAcl;
            return this;
        }

        /**
         * @param objectAcl Access Control List permission for S3 objects. Defaults to `private`.
         * 
         * @return builder
         * 
         */
        public Builder objectAcl(String objectAcl) {
            return objectAcl(Output.of(objectAcl));
        }

        /**
         * @param path File share path used by the NFS client to identify the mount point.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path File share path used by the NFS client to identify the mount point.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param readOnly Boolean to indicate write status of file share. File share does not accept writes if `true`. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            $.readOnly = readOnly;
            return this;
        }

        /**
         * @param readOnly Boolean to indicate write status of file share. File share does not accept writes if `true`. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder readOnly(Boolean readOnly) {
            return readOnly(Output.of(readOnly));
        }

        /**
         * @param requesterPays Boolean who pays the cost of the request and the data download from the Amazon S3 bucket. Set this value to `true` if you want the requester to pay instead of the bucket owner. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder requesterPays(@Nullable Output<Boolean> requesterPays) {
            $.requesterPays = requesterPays;
            return this;
        }

        /**
         * @param requesterPays Boolean who pays the cost of the request and the data download from the Amazon S3 bucket. Set this value to `true` if you want the requester to pay instead of the bucket owner. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder requesterPays(Boolean requesterPays) {
            return requesterPays(Output.of(requesterPays));
        }

        /**
         * @param roleArn The ARN of the AWS Identity and Access Management (IAM) role that a file gateway assumes when it accesses the underlying storage.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(@Nullable Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn The ARN of the AWS Identity and Access Management (IAM) role that a file gateway assumes when it accesses the underlying storage.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        /**
         * @param squash Maps a user to anonymous user. Defaults to `RootSquash`. Valid values: `RootSquash` (only root is mapped to anonymous user), `NoSquash` (no one is mapped to anonymous user), `AllSquash` (everyone is mapped to anonymous user)
         * 
         * @return builder
         * 
         */
        public Builder squash(@Nullable Output<String> squash) {
            $.squash = squash;
            return this;
        }

        /**
         * @param squash Maps a user to anonymous user. Defaults to `RootSquash`. Valid values: `RootSquash` (only root is mapped to anonymous user), `NoSquash` (no one is mapped to anonymous user), `AllSquash` (everyone is mapped to anonymous user)
         * 
         * @return builder
         * 
         */
        public Builder squash(String squash) {
            return squash(Output.of(squash));
        }

        /**
         * @param tags Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param vpcEndpointDnsName The DNS name of the VPC endpoint for S3 PrivateLink.
         * 
         * @return builder
         * 
         */
        public Builder vpcEndpointDnsName(@Nullable Output<String> vpcEndpointDnsName) {
            $.vpcEndpointDnsName = vpcEndpointDnsName;
            return this;
        }

        /**
         * @param vpcEndpointDnsName The DNS name of the VPC endpoint for S3 PrivateLink.
         * 
         * @return builder
         * 
         */
        public Builder vpcEndpointDnsName(String vpcEndpointDnsName) {
            return vpcEndpointDnsName(Output.of(vpcEndpointDnsName));
        }

        public NfsFileShareState build() {
            return $;
        }
    }

}
