# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'BucketLifecycleConfigurationRuleArgs',
    'BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadArgs',
    'BucketLifecycleConfigurationRuleExpirationArgs',
    'BucketLifecycleConfigurationRuleFilterArgs',
    'MultiRegionAccessPointDetailsArgs',
    'MultiRegionAccessPointDetailsPublicAccessBlockArgs',
    'MultiRegionAccessPointDetailsRegionArgs',
    'MultiRegionAccessPointPolicyDetailsArgs',
    'ObjectLambdaAccessPointConfigurationArgs',
    'ObjectLambdaAccessPointConfigurationTransformationConfigurationArgs',
    'ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationArgs',
    'ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambdaArgs',
]

@pulumi.input_type
class BucketLifecycleConfigurationRuleArgs:
    def __init__(__self__, *,
                 id: pulumi.Input[str],
                 abort_incomplete_multipart_upload: Optional[pulumi.Input['BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadArgs']] = None,
                 expiration: Optional[pulumi.Input['BucketLifecycleConfigurationRuleExpirationArgs']] = None,
                 filter: Optional[pulumi.Input['BucketLifecycleConfigurationRuleFilterArgs']] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] id: Unique identifier for the rule.
        :param pulumi.Input['BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadArgs'] abort_incomplete_multipart_upload: Configuration block containing settings for abort incomplete multipart upload.
        :param pulumi.Input['BucketLifecycleConfigurationRuleExpirationArgs'] expiration: Configuration block containing settings for expiration of objects.
        :param pulumi.Input['BucketLifecycleConfigurationRuleFilterArgs'] filter: Configuration block containing settings for filtering.
        :param pulumi.Input[str] status: Status of the rule. Valid values: `Enabled` and `Disabled`. Defaults to `Enabled`.
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
    def id(self) -> pulumi.Input[str]:
        """
        Unique identifier for the rule.
        """
        return pulumi.get(self, "id")

    @id.setter
    def id(self, value: pulumi.Input[str]):
        pulumi.set(self, "id", value)

    @property
    @pulumi.getter(name="abortIncompleteMultipartUpload")
    def abort_incomplete_multipart_upload(self) -> Optional[pulumi.Input['BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadArgs']]:
        """
        Configuration block containing settings for abort incomplete multipart upload.
        """
        return pulumi.get(self, "abort_incomplete_multipart_upload")

    @abort_incomplete_multipart_upload.setter
    def abort_incomplete_multipart_upload(self, value: Optional[pulumi.Input['BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadArgs']]):
        pulumi.set(self, "abort_incomplete_multipart_upload", value)

    @property
    @pulumi.getter
    def expiration(self) -> Optional[pulumi.Input['BucketLifecycleConfigurationRuleExpirationArgs']]:
        """
        Configuration block containing settings for expiration of objects.
        """
        return pulumi.get(self, "expiration")

    @expiration.setter
    def expiration(self, value: Optional[pulumi.Input['BucketLifecycleConfigurationRuleExpirationArgs']]):
        pulumi.set(self, "expiration", value)

    @property
    @pulumi.getter
    def filter(self) -> Optional[pulumi.Input['BucketLifecycleConfigurationRuleFilterArgs']]:
        """
        Configuration block containing settings for filtering.
        """
        return pulumi.get(self, "filter")

    @filter.setter
    def filter(self, value: Optional[pulumi.Input['BucketLifecycleConfigurationRuleFilterArgs']]):
        pulumi.set(self, "filter", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Status of the rule. Valid values: `Enabled` and `Disabled`. Defaults to `Enabled`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


@pulumi.input_type
class BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadArgs:
    def __init__(__self__, *,
                 days_after_initiation: pulumi.Input[int]):
        """
        :param pulumi.Input[int] days_after_initiation: Number of days after which Amazon S3 aborts an incomplete multipart upload.
        """
        pulumi.set(__self__, "days_after_initiation", days_after_initiation)

    @property
    @pulumi.getter(name="daysAfterInitiation")
    def days_after_initiation(self) -> pulumi.Input[int]:
        """
        Number of days after which Amazon S3 aborts an incomplete multipart upload.
        """
        return pulumi.get(self, "days_after_initiation")

    @days_after_initiation.setter
    def days_after_initiation(self, value: pulumi.Input[int]):
        pulumi.set(self, "days_after_initiation", value)


@pulumi.input_type
class BucketLifecycleConfigurationRuleExpirationArgs:
    def __init__(__self__, *,
                 date: Optional[pulumi.Input[str]] = None,
                 days: Optional[pulumi.Input[int]] = None,
                 expired_object_delete_marker: Optional[pulumi.Input[bool]] = None):
        """
        :param pulumi.Input[str] date: Date the object is to be deleted. Should be in `YYYY-MM-DD` date format, e.g., `2020-09-30`.
        :param pulumi.Input[int] days: Number of days before the object is to be deleted.
        :param pulumi.Input[bool] expired_object_delete_marker: Enable to remove a delete marker with no noncurrent versions. Cannot be specified with `date` or `days`.
        """
        if date is not None:
            pulumi.set(__self__, "date", date)
        if days is not None:
            pulumi.set(__self__, "days", days)
        if expired_object_delete_marker is not None:
            pulumi.set(__self__, "expired_object_delete_marker", expired_object_delete_marker)

    @property
    @pulumi.getter
    def date(self) -> Optional[pulumi.Input[str]]:
        """
        Date the object is to be deleted. Should be in `YYYY-MM-DD` date format, e.g., `2020-09-30`.
        """
        return pulumi.get(self, "date")

    @date.setter
    def date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "date", value)

    @property
    @pulumi.getter
    def days(self) -> Optional[pulumi.Input[int]]:
        """
        Number of days before the object is to be deleted.
        """
        return pulumi.get(self, "days")

    @days.setter
    def days(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "days", value)

    @property
    @pulumi.getter(name="expiredObjectDeleteMarker")
    def expired_object_delete_marker(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable to remove a delete marker with no noncurrent versions. Cannot be specified with `date` or `days`.
        """
        return pulumi.get(self, "expired_object_delete_marker")

    @expired_object_delete_marker.setter
    def expired_object_delete_marker(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "expired_object_delete_marker", value)


@pulumi.input_type
class BucketLifecycleConfigurationRuleFilterArgs:
    def __init__(__self__, *,
                 prefix: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        :param pulumi.Input[str] prefix: Object prefix for rule filtering.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of object tags for rule filtering.
        """
        if prefix is not None:
            pulumi.set(__self__, "prefix", prefix)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def prefix(self) -> Optional[pulumi.Input[str]]:
        """
        Object prefix for rule filtering.
        """
        return pulumi.get(self, "prefix")

    @prefix.setter
    def prefix(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "prefix", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value map of object tags for rule filtering.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class MultiRegionAccessPointDetailsArgs:
    def __init__(__self__, *,
                 name: pulumi.Input[str],
                 regions: pulumi.Input[Sequence[pulumi.Input['MultiRegionAccessPointDetailsRegionArgs']]],
                 public_access_block: Optional[pulumi.Input['MultiRegionAccessPointDetailsPublicAccessBlockArgs']] = None):
        """
        :param pulumi.Input[str] name: The name of the Multi-Region Access Point.
        :param pulumi.Input[Sequence[pulumi.Input['MultiRegionAccessPointDetailsRegionArgs']]] regions: The Region configuration block to specify the bucket associated with the Multi-Region Access Point. See Region Configuration below for more details.
        :param pulumi.Input['MultiRegionAccessPointDetailsPublicAccessBlockArgs'] public_access_block: Configuration block to manage the `PublicAccessBlock` configuration that you want to apply to this Multi-Region Access Point. You can enable the configuration options in any combination. See Public Access Block Configuration below for more details.
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "regions", regions)
        if public_access_block is not None:
            pulumi.set(__self__, "public_access_block", public_access_block)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        The name of the Multi-Region Access Point.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def regions(self) -> pulumi.Input[Sequence[pulumi.Input['MultiRegionAccessPointDetailsRegionArgs']]]:
        """
        The Region configuration block to specify the bucket associated with the Multi-Region Access Point. See Region Configuration below for more details.
        """
        return pulumi.get(self, "regions")

    @regions.setter
    def regions(self, value: pulumi.Input[Sequence[pulumi.Input['MultiRegionAccessPointDetailsRegionArgs']]]):
        pulumi.set(self, "regions", value)

    @property
    @pulumi.getter(name="publicAccessBlock")
    def public_access_block(self) -> Optional[pulumi.Input['MultiRegionAccessPointDetailsPublicAccessBlockArgs']]:
        """
        Configuration block to manage the `PublicAccessBlock` configuration that you want to apply to this Multi-Region Access Point. You can enable the configuration options in any combination. See Public Access Block Configuration below for more details.
        """
        return pulumi.get(self, "public_access_block")

    @public_access_block.setter
    def public_access_block(self, value: Optional[pulumi.Input['MultiRegionAccessPointDetailsPublicAccessBlockArgs']]):
        pulumi.set(self, "public_access_block", value)


@pulumi.input_type
class MultiRegionAccessPointDetailsPublicAccessBlockArgs:
    def __init__(__self__, *,
                 block_public_acls: Optional[pulumi.Input[bool]] = None,
                 block_public_policy: Optional[pulumi.Input[bool]] = None,
                 ignore_public_acls: Optional[pulumi.Input[bool]] = None,
                 restrict_public_buckets: Optional[pulumi.Input[bool]] = None):
        """
        :param pulumi.Input[bool] block_public_acls: Whether Amazon S3 should block public ACLs for buckets in this account. Defaults to `true`. Enabling this setting does not affect existing policies or ACLs. When set to `true` causes the following behavior:
               * PUT Bucket acl and PUT Object acl calls fail if the specified ACL is public.
               * PUT Object calls fail if the request includes a public ACL.
               * PUT Bucket calls fail if the request includes a public ACL.
        :param pulumi.Input[bool] block_public_policy: Whether Amazon S3 should block public bucket policies for buckets in this account. Defaults to `true`. Enabling this setting does not affect existing bucket policies. When set to `true` causes Amazon S3 to:
               * Reject calls to PUT Bucket policy if the specified bucket policy allows public access.
        :param pulumi.Input[bool] ignore_public_acls: Whether Amazon S3 should ignore public ACLs for buckets in this account. Defaults to `true`. Enabling this setting does not affect the persistence of any existing ACLs and doesn't prevent new public ACLs from being set. When set to `true` causes Amazon S3 to:
               * Ignore all public ACLs on buckets in this account and any objects that they contain.
        :param pulumi.Input[bool] restrict_public_buckets: Whether Amazon S3 should restrict public bucket policies for buckets in this account. Defaults to `true`. Enabling this setting does not affect previously stored bucket policies, except that public and cross-account access within any public bucket policy, including non-public delegation to specific accounts, is blocked. When set to `true`:
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
    def block_public_acls(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether Amazon S3 should block public ACLs for buckets in this account. Defaults to `true`. Enabling this setting does not affect existing policies or ACLs. When set to `true` causes the following behavior:
        * PUT Bucket acl and PUT Object acl calls fail if the specified ACL is public.
        * PUT Object calls fail if the request includes a public ACL.
        * PUT Bucket calls fail if the request includes a public ACL.
        """
        return pulumi.get(self, "block_public_acls")

    @block_public_acls.setter
    def block_public_acls(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "block_public_acls", value)

    @property
    @pulumi.getter(name="blockPublicPolicy")
    def block_public_policy(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether Amazon S3 should block public bucket policies for buckets in this account. Defaults to `true`. Enabling this setting does not affect existing bucket policies. When set to `true` causes Amazon S3 to:
        * Reject calls to PUT Bucket policy if the specified bucket policy allows public access.
        """
        return pulumi.get(self, "block_public_policy")

    @block_public_policy.setter
    def block_public_policy(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "block_public_policy", value)

    @property
    @pulumi.getter(name="ignorePublicAcls")
    def ignore_public_acls(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether Amazon S3 should ignore public ACLs for buckets in this account. Defaults to `true`. Enabling this setting does not affect the persistence of any existing ACLs and doesn't prevent new public ACLs from being set. When set to `true` causes Amazon S3 to:
        * Ignore all public ACLs on buckets in this account and any objects that they contain.
        """
        return pulumi.get(self, "ignore_public_acls")

    @ignore_public_acls.setter
    def ignore_public_acls(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ignore_public_acls", value)

    @property
    @pulumi.getter(name="restrictPublicBuckets")
    def restrict_public_buckets(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether Amazon S3 should restrict public bucket policies for buckets in this account. Defaults to `true`. Enabling this setting does not affect previously stored bucket policies, except that public and cross-account access within any public bucket policy, including non-public delegation to specific accounts, is blocked. When set to `true`:
        * Only the bucket owner and AWS Services can access buckets with public policies.
        """
        return pulumi.get(self, "restrict_public_buckets")

    @restrict_public_buckets.setter
    def restrict_public_buckets(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "restrict_public_buckets", value)


@pulumi.input_type
class MultiRegionAccessPointDetailsRegionArgs:
    def __init__(__self__, *,
                 bucket: pulumi.Input[str]):
        """
        :param pulumi.Input[str] bucket: The name of the associated bucket for the Region.
        """
        pulumi.set(__self__, "bucket", bucket)

    @property
    @pulumi.getter
    def bucket(self) -> pulumi.Input[str]:
        """
        The name of the associated bucket for the Region.
        """
        return pulumi.get(self, "bucket")

    @bucket.setter
    def bucket(self, value: pulumi.Input[str]):
        pulumi.set(self, "bucket", value)


@pulumi.input_type
class MultiRegionAccessPointPolicyDetailsArgs:
    def __init__(__self__, *,
                 name: pulumi.Input[str],
                 policy: pulumi.Input[str]):
        """
        :param pulumi.Input[str] name: The name of the Multi-Region Access Point.
        :param pulumi.Input[str] policy: A valid JSON document that specifies the policy that you want to associate with this Multi-Region Access Point. Once applied, the policy can be edited, but not deleted. For more information, see the documentation on [Multi-Region Access Point Permissions](https://docs.aws.amazon.com/AmazonS3/latest/userguide/MultiRegionAccessPointPermissions.html).
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "policy", policy)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        The name of the Multi-Region Access Point.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def policy(self) -> pulumi.Input[str]:
        """
        A valid JSON document that specifies the policy that you want to associate with this Multi-Region Access Point. Once applied, the policy can be edited, but not deleted. For more information, see the documentation on [Multi-Region Access Point Permissions](https://docs.aws.amazon.com/AmazonS3/latest/userguide/MultiRegionAccessPointPermissions.html).
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: pulumi.Input[str]):
        pulumi.set(self, "policy", value)


@pulumi.input_type
class ObjectLambdaAccessPointConfigurationArgs:
    def __init__(__self__, *,
                 supporting_access_point: pulumi.Input[str],
                 transformation_configurations: pulumi.Input[Sequence[pulumi.Input['ObjectLambdaAccessPointConfigurationTransformationConfigurationArgs']]],
                 allowed_features: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 cloud_watch_metrics_enabled: Optional[pulumi.Input[bool]] = None):
        """
        :param pulumi.Input[str] supporting_access_point: Standard access point associated with the Object Lambda Access Point.
        :param pulumi.Input[Sequence[pulumi.Input['ObjectLambdaAccessPointConfigurationTransformationConfigurationArgs']]] transformation_configurations: List of transformation configurations for the Object Lambda Access Point. See Transformation Configuration below for more details.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_features: Allowed features. Valid values: `GetObject-Range`, `GetObject-PartNumber`.
        :param pulumi.Input[bool] cloud_watch_metrics_enabled: Whether or not the CloudWatch metrics configuration is enabled.
        """
        pulumi.set(__self__, "supporting_access_point", supporting_access_point)
        pulumi.set(__self__, "transformation_configurations", transformation_configurations)
        if allowed_features is not None:
            pulumi.set(__self__, "allowed_features", allowed_features)
        if cloud_watch_metrics_enabled is not None:
            pulumi.set(__self__, "cloud_watch_metrics_enabled", cloud_watch_metrics_enabled)

    @property
    @pulumi.getter(name="supportingAccessPoint")
    def supporting_access_point(self) -> pulumi.Input[str]:
        """
        Standard access point associated with the Object Lambda Access Point.
        """
        return pulumi.get(self, "supporting_access_point")

    @supporting_access_point.setter
    def supporting_access_point(self, value: pulumi.Input[str]):
        pulumi.set(self, "supporting_access_point", value)

    @property
    @pulumi.getter(name="transformationConfigurations")
    def transformation_configurations(self) -> pulumi.Input[Sequence[pulumi.Input['ObjectLambdaAccessPointConfigurationTransformationConfigurationArgs']]]:
        """
        List of transformation configurations for the Object Lambda Access Point. See Transformation Configuration below for more details.
        """
        return pulumi.get(self, "transformation_configurations")

    @transformation_configurations.setter
    def transformation_configurations(self, value: pulumi.Input[Sequence[pulumi.Input['ObjectLambdaAccessPointConfigurationTransformationConfigurationArgs']]]):
        pulumi.set(self, "transformation_configurations", value)

    @property
    @pulumi.getter(name="allowedFeatures")
    def allowed_features(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Allowed features. Valid values: `GetObject-Range`, `GetObject-PartNumber`.
        """
        return pulumi.get(self, "allowed_features")

    @allowed_features.setter
    def allowed_features(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "allowed_features", value)

    @property
    @pulumi.getter(name="cloudWatchMetricsEnabled")
    def cloud_watch_metrics_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether or not the CloudWatch metrics configuration is enabled.
        """
        return pulumi.get(self, "cloud_watch_metrics_enabled")

    @cloud_watch_metrics_enabled.setter
    def cloud_watch_metrics_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "cloud_watch_metrics_enabled", value)


@pulumi.input_type
class ObjectLambdaAccessPointConfigurationTransformationConfigurationArgs:
    def __init__(__self__, *,
                 actions: pulumi.Input[Sequence[pulumi.Input[str]]],
                 content_transformation: pulumi.Input['ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationArgs']):
        """
        :param pulumi.Input[Sequence[pulumi.Input[str]]] actions: The actions of an Object Lambda Access Point configuration. Valid values: `GetObject`.
        :param pulumi.Input['ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationArgs'] content_transformation: The content transformation of an Object Lambda Access Point configuration. See Content Transformation below for more details.
        """
        pulumi.set(__self__, "actions", actions)
        pulumi.set(__self__, "content_transformation", content_transformation)

    @property
    @pulumi.getter
    def actions(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        The actions of an Object Lambda Access Point configuration. Valid values: `GetObject`.
        """
        return pulumi.get(self, "actions")

    @actions.setter
    def actions(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "actions", value)

    @property
    @pulumi.getter(name="contentTransformation")
    def content_transformation(self) -> pulumi.Input['ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationArgs']:
        """
        The content transformation of an Object Lambda Access Point configuration. See Content Transformation below for more details.
        """
        return pulumi.get(self, "content_transformation")

    @content_transformation.setter
    def content_transformation(self, value: pulumi.Input['ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationArgs']):
        pulumi.set(self, "content_transformation", value)


@pulumi.input_type
class ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationArgs:
    def __init__(__self__, *,
                 aws_lambda: pulumi.Input['ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambdaArgs']):
        """
        :param pulumi.Input['ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambdaArgs'] aws_lambda: Configuration for an AWS Lambda function. See AWS Lambda below for more details.
        """
        pulumi.set(__self__, "aws_lambda", aws_lambda)

    @property
    @pulumi.getter(name="awsLambda")
    def aws_lambda(self) -> pulumi.Input['ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambdaArgs']:
        """
        Configuration for an AWS Lambda function. See AWS Lambda below for more details.
        """
        return pulumi.get(self, "aws_lambda")

    @aws_lambda.setter
    def aws_lambda(self, value: pulumi.Input['ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambdaArgs']):
        pulumi.set(self, "aws_lambda", value)


@pulumi.input_type
class ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambdaArgs:
    def __init__(__self__, *,
                 function_arn: pulumi.Input[str],
                 function_payload: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] function_arn: The Amazon Resource Name (ARN) of the AWS Lambda function.
        :param pulumi.Input[str] function_payload: Additional JSON that provides supplemental data to the Lambda function used to transform objects.
        """
        pulumi.set(__self__, "function_arn", function_arn)
        if function_payload is not None:
            pulumi.set(__self__, "function_payload", function_payload)

    @property
    @pulumi.getter(name="functionArn")
    def function_arn(self) -> pulumi.Input[str]:
        """
        The Amazon Resource Name (ARN) of the AWS Lambda function.
        """
        return pulumi.get(self, "function_arn")

    @function_arn.setter
    def function_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "function_arn", value)

    @property
    @pulumi.getter(name="functionPayload")
    def function_payload(self) -> Optional[pulumi.Input[str]]:
        """
        Additional JSON that provides supplemental data to the Lambda function used to transform objects.
        """
        return pulumi.get(self, "function_payload")

    @function_payload.setter
    def function_payload(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "function_payload", value)


