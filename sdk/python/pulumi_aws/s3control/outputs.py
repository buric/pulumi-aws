# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'BucketLifecycleConfigurationRule',
    'BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload',
    'BucketLifecycleConfigurationRuleExpiration',
    'BucketLifecycleConfigurationRuleFilter',
    'MultiRegionAccessPointDetails',
    'MultiRegionAccessPointDetailsPublicAccessBlock',
    'MultiRegionAccessPointDetailsRegion',
    'MultiRegionAccessPointPolicyDetails',
    'ObjectLambdaAccessPointConfiguration',
    'ObjectLambdaAccessPointConfigurationTransformationConfiguration',
    'ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation',
    'ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda',
]

@pulumi.output_type
class BucketLifecycleConfigurationRule(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "abortIncompleteMultipartUpload":
            suggest = "abort_incomplete_multipart_upload"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in BucketLifecycleConfigurationRule. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        BucketLifecycleConfigurationRule.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        BucketLifecycleConfigurationRule.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 id: str,
                 abort_incomplete_multipart_upload: Optional['outputs.BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload'] = None,
                 expiration: Optional['outputs.BucketLifecycleConfigurationRuleExpiration'] = None,
                 filter: Optional['outputs.BucketLifecycleConfigurationRuleFilter'] = None,
                 status: Optional[str] = None):
        """
        :param str id: Unique identifier for the rule.
        :param 'BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadArgs' abort_incomplete_multipart_upload: Configuration block containing settings for abort incomplete multipart upload.
        :param 'BucketLifecycleConfigurationRuleExpirationArgs' expiration: Configuration block containing settings for expiration of objects.
        :param 'BucketLifecycleConfigurationRuleFilterArgs' filter: Configuration block containing settings for filtering.
        :param str status: Status of the rule. Valid values: `Enabled` and `Disabled`. Defaults to `Enabled`.
        """
        pulumi.set(__self__, "id", id)
        if abort_incomplete_multipart_upload is not None:
            pulumi.set(__self__, "abort_incomplete_multipart_upload", abort_incomplete_multipart_upload)
        if expiration is not None:
            pulumi.set(__self__, "expiration", expiration)
        if filter is not None:
            pulumi.set(__self__, "filter", filter)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        Unique identifier for the rule.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="abortIncompleteMultipartUpload")
    def abort_incomplete_multipart_upload(self) -> Optional['outputs.BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload']:
        """
        Configuration block containing settings for abort incomplete multipart upload.
        """
        return pulumi.get(self, "abort_incomplete_multipart_upload")

    @property
    @pulumi.getter
    def expiration(self) -> Optional['outputs.BucketLifecycleConfigurationRuleExpiration']:
        """
        Configuration block containing settings for expiration of objects.
        """
        return pulumi.get(self, "expiration")

    @property
    @pulumi.getter
    def filter(self) -> Optional['outputs.BucketLifecycleConfigurationRuleFilter']:
        """
        Configuration block containing settings for filtering.
        """
        return pulumi.get(self, "filter")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        """
        Status of the rule. Valid values: `Enabled` and `Disabled`. Defaults to `Enabled`.
        """
        return pulumi.get(self, "status")


@pulumi.output_type
class BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "daysAfterInitiation":
            suggest = "days_after_initiation"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 days_after_initiation: int):
        """
        :param int days_after_initiation: Number of days after which Amazon S3 aborts an incomplete multipart upload.
        """
        pulumi.set(__self__, "days_after_initiation", days_after_initiation)

    @property
    @pulumi.getter(name="daysAfterInitiation")
    def days_after_initiation(self) -> int:
        """
        Number of days after which Amazon S3 aborts an incomplete multipart upload.
        """
        return pulumi.get(self, "days_after_initiation")


@pulumi.output_type
class BucketLifecycleConfigurationRuleExpiration(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "expiredObjectDeleteMarker":
            suggest = "expired_object_delete_marker"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in BucketLifecycleConfigurationRuleExpiration. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        BucketLifecycleConfigurationRuleExpiration.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        BucketLifecycleConfigurationRuleExpiration.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 date: Optional[str] = None,
                 days: Optional[int] = None,
                 expired_object_delete_marker: Optional[bool] = None):
        """
        :param str date: Date the object is to be deleted. Should be in `YYYY-MM-DD` date format, e.g., `2020-09-30`.
        :param int days: Number of days before the object is to be deleted.
        :param bool expired_object_delete_marker: Enable to remove a delete marker with no noncurrent versions. Cannot be specified with `date` or `days`.
        """
        if date is not None:
            pulumi.set(__self__, "date", date)
        if days is not None:
            pulumi.set(__self__, "days", days)
        if expired_object_delete_marker is not None:
            pulumi.set(__self__, "expired_object_delete_marker", expired_object_delete_marker)

    @property
    @pulumi.getter
    def date(self) -> Optional[str]:
        """
        Date the object is to be deleted. Should be in `YYYY-MM-DD` date format, e.g., `2020-09-30`.
        """
        return pulumi.get(self, "date")

    @property
    @pulumi.getter
    def days(self) -> Optional[int]:
        """
        Number of days before the object is to be deleted.
        """
        return pulumi.get(self, "days")

    @property
    @pulumi.getter(name="expiredObjectDeleteMarker")
    def expired_object_delete_marker(self) -> Optional[bool]:
        """
        Enable to remove a delete marker with no noncurrent versions. Cannot be specified with `date` or `days`.
        """
        return pulumi.get(self, "expired_object_delete_marker")


@pulumi.output_type
class BucketLifecycleConfigurationRuleFilter(dict):
    def __init__(__self__, *,
                 prefix: Optional[str] = None,
                 tags: Optional[Mapping[str, str]] = None):
        """
        :param str prefix: Object prefix for rule filtering.
        :param Mapping[str, str] tags: Key-value map of object tags for rule filtering.
        """
        if prefix is not None:
            pulumi.set(__self__, "prefix", prefix)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def prefix(self) -> Optional[str]:
        """
        Object prefix for rule filtering.
        """
        return pulumi.get(self, "prefix")

    @property
    @pulumi.getter
    def tags(self) -> Optional[Mapping[str, str]]:
        """
        Key-value map of object tags for rule filtering.
        """
        return pulumi.get(self, "tags")


@pulumi.output_type
class MultiRegionAccessPointDetails(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "publicAccessBlock":
            suggest = "public_access_block"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in MultiRegionAccessPointDetails. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        MultiRegionAccessPointDetails.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        MultiRegionAccessPointDetails.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 name: str,
                 regions: Sequence['outputs.MultiRegionAccessPointDetailsRegion'],
                 public_access_block: Optional['outputs.MultiRegionAccessPointDetailsPublicAccessBlock'] = None):
        """
        :param str name: The name of the Multi-Region Access Point.
        :param Sequence['MultiRegionAccessPointDetailsRegionArgs'] regions: The Region configuration block to specify the bucket associated with the Multi-Region Access Point. See Region Configuration below for more details.
        :param 'MultiRegionAccessPointDetailsPublicAccessBlockArgs' public_access_block: Configuration block to manage the `PublicAccessBlock` configuration that you want to apply to this Multi-Region Access Point. You can enable the configuration options in any combination. See Public Access Block Configuration below for more details.
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "regions", regions)
        if public_access_block is not None:
            pulumi.set(__self__, "public_access_block", public_access_block)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the Multi-Region Access Point.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def regions(self) -> Sequence['outputs.MultiRegionAccessPointDetailsRegion']:
        """
        The Region configuration block to specify the bucket associated with the Multi-Region Access Point. See Region Configuration below for more details.
        """
        return pulumi.get(self, "regions")

    @property
    @pulumi.getter(name="publicAccessBlock")
    def public_access_block(self) -> Optional['outputs.MultiRegionAccessPointDetailsPublicAccessBlock']:
        """
        Configuration block to manage the `PublicAccessBlock` configuration that you want to apply to this Multi-Region Access Point. You can enable the configuration options in any combination. See Public Access Block Configuration below for more details.
        """
        return pulumi.get(self, "public_access_block")


@pulumi.output_type
class MultiRegionAccessPointDetailsPublicAccessBlock(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "blockPublicAcls":
            suggest = "block_public_acls"
        elif key == "blockPublicPolicy":
            suggest = "block_public_policy"
        elif key == "ignorePublicAcls":
            suggest = "ignore_public_acls"
        elif key == "restrictPublicBuckets":
            suggest = "restrict_public_buckets"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in MultiRegionAccessPointDetailsPublicAccessBlock. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        MultiRegionAccessPointDetailsPublicAccessBlock.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        MultiRegionAccessPointDetailsPublicAccessBlock.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 block_public_acls: Optional[bool] = None,
                 block_public_policy: Optional[bool] = None,
                 ignore_public_acls: Optional[bool] = None,
                 restrict_public_buckets: Optional[bool] = None):
        """
        :param bool block_public_acls: Whether Amazon S3 should block public ACLs for buckets in this account. Defaults to `true`. Enabling this setting does not affect existing policies or ACLs. When set to `true` causes the following behavior:
               * PUT Bucket acl and PUT Object acl calls fail if the specified ACL is public.
               * PUT Object calls fail if the request includes a public ACL.
               * PUT Bucket calls fail if the request includes a public ACL.
        :param bool block_public_policy: Whether Amazon S3 should block public bucket policies for buckets in this account. Defaults to `true`. Enabling this setting does not affect existing bucket policies. When set to `true` causes Amazon S3 to:
               * Reject calls to PUT Bucket policy if the specified bucket policy allows public access.
        :param bool ignore_public_acls: Whether Amazon S3 should ignore public ACLs for buckets in this account. Defaults to `true`. Enabling this setting does not affect the persistence of any existing ACLs and doesn't prevent new public ACLs from being set. When set to `true` causes Amazon S3 to:
               * Ignore all public ACLs on buckets in this account and any objects that they contain.
        :param bool restrict_public_buckets: Whether Amazon S3 should restrict public bucket policies for buckets in this account. Defaults to `true`. Enabling this setting does not affect previously stored bucket policies, except that public and cross-account access within any public bucket policy, including non-public delegation to specific accounts, is blocked. When set to `true`:
               * Only the bucket owner and AWS Services can access buckets with public policies.
        """
        if block_public_acls is not None:
            pulumi.set(__self__, "block_public_acls", block_public_acls)
        if block_public_policy is not None:
            pulumi.set(__self__, "block_public_policy", block_public_policy)
        if ignore_public_acls is not None:
            pulumi.set(__self__, "ignore_public_acls", ignore_public_acls)
        if restrict_public_buckets is not None:
            pulumi.set(__self__, "restrict_public_buckets", restrict_public_buckets)

    @property
    @pulumi.getter(name="blockPublicAcls")
    def block_public_acls(self) -> Optional[bool]:
        """
        Whether Amazon S3 should block public ACLs for buckets in this account. Defaults to `true`. Enabling this setting does not affect existing policies or ACLs. When set to `true` causes the following behavior:
        * PUT Bucket acl and PUT Object acl calls fail if the specified ACL is public.
        * PUT Object calls fail if the request includes a public ACL.
        * PUT Bucket calls fail if the request includes a public ACL.
        """
        return pulumi.get(self, "block_public_acls")

    @property
    @pulumi.getter(name="blockPublicPolicy")
    def block_public_policy(self) -> Optional[bool]:
        """
        Whether Amazon S3 should block public bucket policies for buckets in this account. Defaults to `true`. Enabling this setting does not affect existing bucket policies. When set to `true` causes Amazon S3 to:
        * Reject calls to PUT Bucket policy if the specified bucket policy allows public access.
        """
        return pulumi.get(self, "block_public_policy")

    @property
    @pulumi.getter(name="ignorePublicAcls")
    def ignore_public_acls(self) -> Optional[bool]:
        """
        Whether Amazon S3 should ignore public ACLs for buckets in this account. Defaults to `true`. Enabling this setting does not affect the persistence of any existing ACLs and doesn't prevent new public ACLs from being set. When set to `true` causes Amazon S3 to:
        * Ignore all public ACLs on buckets in this account and any objects that they contain.
        """
        return pulumi.get(self, "ignore_public_acls")

    @property
    @pulumi.getter(name="restrictPublicBuckets")
    def restrict_public_buckets(self) -> Optional[bool]:
        """
        Whether Amazon S3 should restrict public bucket policies for buckets in this account. Defaults to `true`. Enabling this setting does not affect previously stored bucket policies, except that public and cross-account access within any public bucket policy, including non-public delegation to specific accounts, is blocked. When set to `true`:
        * Only the bucket owner and AWS Services can access buckets with public policies.
        """
        return pulumi.get(self, "restrict_public_buckets")


@pulumi.output_type
class MultiRegionAccessPointDetailsRegion(dict):
    def __init__(__self__, *,
                 bucket: str):
        """
        :param str bucket: The name of the associated bucket for the Region.
        """
        pulumi.set(__self__, "bucket", bucket)

    @property
    @pulumi.getter
    def bucket(self) -> str:
        """
        The name of the associated bucket for the Region.
        """
        return pulumi.get(self, "bucket")


@pulumi.output_type
class MultiRegionAccessPointPolicyDetails(dict):
    def __init__(__self__, *,
                 name: str,
                 policy: str):
        """
        :param str name: The name of the Multi-Region Access Point.
        :param str policy: A valid JSON document that specifies the policy that you want to associate with this Multi-Region Access Point. Once applied, the policy can be edited, but not deleted. For more information, see the documentation on [Multi-Region Access Point Permissions](https://docs.aws.amazon.com/AmazonS3/latest/userguide/MultiRegionAccessPointPermissions.html).
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "policy", policy)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the Multi-Region Access Point.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def policy(self) -> str:
        """
        A valid JSON document that specifies the policy that you want to associate with this Multi-Region Access Point. Once applied, the policy can be edited, but not deleted. For more information, see the documentation on [Multi-Region Access Point Permissions](https://docs.aws.amazon.com/AmazonS3/latest/userguide/MultiRegionAccessPointPermissions.html).
        """
        return pulumi.get(self, "policy")


@pulumi.output_type
class ObjectLambdaAccessPointConfiguration(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "supportingAccessPoint":
            suggest = "supporting_access_point"
        elif key == "transformationConfigurations":
            suggest = "transformation_configurations"
        elif key == "allowedFeatures":
            suggest = "allowed_features"
        elif key == "cloudWatchMetricsEnabled":
            suggest = "cloud_watch_metrics_enabled"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ObjectLambdaAccessPointConfiguration. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ObjectLambdaAccessPointConfiguration.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ObjectLambdaAccessPointConfiguration.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 supporting_access_point: str,
                 transformation_configurations: Sequence['outputs.ObjectLambdaAccessPointConfigurationTransformationConfiguration'],
                 allowed_features: Optional[Sequence[str]] = None,
                 cloud_watch_metrics_enabled: Optional[bool] = None):
        """
        :param str supporting_access_point: Standard access point associated with the Object Lambda Access Point.
        :param Sequence['ObjectLambdaAccessPointConfigurationTransformationConfigurationArgs'] transformation_configurations: List of transformation configurations for the Object Lambda Access Point. See Transformation Configuration below for more details.
        :param Sequence[str] allowed_features: Allowed features. Valid values: `GetObject-Range`, `GetObject-PartNumber`.
        :param bool cloud_watch_metrics_enabled: Whether or not the CloudWatch metrics configuration is enabled.
        """
        pulumi.set(__self__, "supporting_access_point", supporting_access_point)
        pulumi.set(__self__, "transformation_configurations", transformation_configurations)
        if allowed_features is not None:
            pulumi.set(__self__, "allowed_features", allowed_features)
        if cloud_watch_metrics_enabled is not None:
            pulumi.set(__self__, "cloud_watch_metrics_enabled", cloud_watch_metrics_enabled)

    @property
    @pulumi.getter(name="supportingAccessPoint")
    def supporting_access_point(self) -> str:
        """
        Standard access point associated with the Object Lambda Access Point.
        """
        return pulumi.get(self, "supporting_access_point")

    @property
    @pulumi.getter(name="transformationConfigurations")
    def transformation_configurations(self) -> Sequence['outputs.ObjectLambdaAccessPointConfigurationTransformationConfiguration']:
        """
        List of transformation configurations for the Object Lambda Access Point. See Transformation Configuration below for more details.
        """
        return pulumi.get(self, "transformation_configurations")

    @property
    @pulumi.getter(name="allowedFeatures")
    def allowed_features(self) -> Optional[Sequence[str]]:
        """
        Allowed features. Valid values: `GetObject-Range`, `GetObject-PartNumber`.
        """
        return pulumi.get(self, "allowed_features")

    @property
    @pulumi.getter(name="cloudWatchMetricsEnabled")
    def cloud_watch_metrics_enabled(self) -> Optional[bool]:
        """
        Whether or not the CloudWatch metrics configuration is enabled.
        """
        return pulumi.get(self, "cloud_watch_metrics_enabled")


@pulumi.output_type
class ObjectLambdaAccessPointConfigurationTransformationConfiguration(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "contentTransformation":
            suggest = "content_transformation"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ObjectLambdaAccessPointConfigurationTransformationConfiguration. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ObjectLambdaAccessPointConfigurationTransformationConfiguration.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ObjectLambdaAccessPointConfigurationTransformationConfiguration.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 actions: Sequence[str],
                 content_transformation: 'outputs.ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation'):
        """
        :param Sequence[str] actions: The actions of an Object Lambda Access Point configuration. Valid values: `GetObject`.
        :param 'ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationArgs' content_transformation: The content transformation of an Object Lambda Access Point configuration. See Content Transformation below for more details.
        """
        pulumi.set(__self__, "actions", actions)
        pulumi.set(__self__, "content_transformation", content_transformation)

    @property
    @pulumi.getter
    def actions(self) -> Sequence[str]:
        """
        The actions of an Object Lambda Access Point configuration. Valid values: `GetObject`.
        """
        return pulumi.get(self, "actions")

    @property
    @pulumi.getter(name="contentTransformation")
    def content_transformation(self) -> 'outputs.ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation':
        """
        The content transformation of an Object Lambda Access Point configuration. See Content Transformation below for more details.
        """
        return pulumi.get(self, "content_transformation")


@pulumi.output_type
class ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "awsLambda":
            suggest = "aws_lambda"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 aws_lambda: 'outputs.ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda'):
        """
        :param 'ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambdaArgs' aws_lambda: Configuration for an AWS Lambda function. See AWS Lambda below for more details.
        """
        pulumi.set(__self__, "aws_lambda", aws_lambda)

    @property
    @pulumi.getter(name="awsLambda")
    def aws_lambda(self) -> 'outputs.ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda':
        """
        Configuration for an AWS Lambda function. See AWS Lambda below for more details.
        """
        return pulumi.get(self, "aws_lambda")


@pulumi.output_type
class ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "functionArn":
            suggest = "function_arn"
        elif key == "functionPayload":
            suggest = "function_payload"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 function_arn: str,
                 function_payload: Optional[str] = None):
        """
        :param str function_arn: The Amazon Resource Name (ARN) of the AWS Lambda function.
        :param str function_payload: Additional JSON that provides supplemental data to the Lambda function used to transform objects.
        """
        pulumi.set(__self__, "function_arn", function_arn)
        if function_payload is not None:
            pulumi.set(__self__, "function_payload", function_payload)

    @property
    @pulumi.getter(name="functionArn")
    def function_arn(self) -> str:
        """
        The Amazon Resource Name (ARN) of the AWS Lambda function.
        """
        return pulumi.get(self, "function_arn")

    @property
    @pulumi.getter(name="functionPayload")
    def function_payload(self) -> Optional[str]:
        """
        Additional JSON that provides supplemental data to the Lambda function used to transform objects.
        """
        return pulumi.get(self, "function_payload")


