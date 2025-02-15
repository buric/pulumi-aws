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
from ._inputs import *

__all__ = ['JobDefinitionArgs', 'JobDefinition']

@pulumi.input_type
class JobDefinitionArgs:
    def __init__(__self__, *,
                 type: pulumi.Input[str],
                 container_properties: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parameters: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 platform_capabilities: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 propagate_tags: Optional[pulumi.Input[bool]] = None,
                 retry_strategy: Optional[pulumi.Input['JobDefinitionRetryStrategyArgs']] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 timeout: Optional[pulumi.Input['JobDefinitionTimeoutArgs']] = None):
        """
        The set of arguments for constructing a JobDefinition resource.
        :param pulumi.Input[str] type: The type of job definition.  Must be `container`.
        :param pulumi.Input[str] container_properties: A valid [container properties](http://docs.aws.amazon.com/batch/latest/APIReference/API_RegisterJobDefinition.html)
               provided as a single valid JSON document. This parameter is required if the `type` parameter is `container`.
        :param pulumi.Input[str] name: Specifies the name of the job definition.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] parameters: Specifies the parameter substitution placeholders to set in the job definition.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] platform_capabilities: The platform capabilities required by the job definition. If no value is specified, it defaults to `EC2`. To run the job on Fargate resources, specify `FARGATE`.
        :param pulumi.Input[bool] propagate_tags: Specifies whether to propagate the tags from the job definition to the corresponding Amazon ECS task. Default is `false`.
        :param pulumi.Input['JobDefinitionRetryStrategyArgs'] retry_strategy: Specifies the retry strategy to use for failed jobs that are submitted with this job definition.
               Maximum number of `retry_strategy` is `1`.  Defined below.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input['JobDefinitionTimeoutArgs'] timeout: Specifies the timeout for jobs so that if a job runs longer, AWS Batch terminates the job. Maximum number of `timeout` is `1`. Defined below.
        """
        pulumi.set(__self__, "type", type)
        if container_properties is not None:
            pulumi.set(__self__, "container_properties", container_properties)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if parameters is not None:
            pulumi.set(__self__, "parameters", parameters)
        if platform_capabilities is not None:
            pulumi.set(__self__, "platform_capabilities", platform_capabilities)
        if propagate_tags is not None:
            pulumi.set(__self__, "propagate_tags", propagate_tags)
        if retry_strategy is not None:
            pulumi.set(__self__, "retry_strategy", retry_strategy)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if timeout is not None:
            pulumi.set(__self__, "timeout", timeout)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        The type of job definition.  Must be `container`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="containerProperties")
    def container_properties(self) -> Optional[pulumi.Input[str]]:
        """
        A valid [container properties](http://docs.aws.amazon.com/batch/latest/APIReference/API_RegisterJobDefinition.html)
        provided as a single valid JSON document. This parameter is required if the `type` parameter is `container`.
        """
        return pulumi.get(self, "container_properties")

    @container_properties.setter
    def container_properties(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "container_properties", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the job definition.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def parameters(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Specifies the parameter substitution placeholders to set in the job definition.
        """
        return pulumi.get(self, "parameters")

    @parameters.setter
    def parameters(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "parameters", value)

    @property
    @pulumi.getter(name="platformCapabilities")
    def platform_capabilities(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The platform capabilities required by the job definition. If no value is specified, it defaults to `EC2`. To run the job on Fargate resources, specify `FARGATE`.
        """
        return pulumi.get(self, "platform_capabilities")

    @platform_capabilities.setter
    def platform_capabilities(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "platform_capabilities", value)

    @property
    @pulumi.getter(name="propagateTags")
    def propagate_tags(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to propagate the tags from the job definition to the corresponding Amazon ECS task. Default is `false`.
        """
        return pulumi.get(self, "propagate_tags")

    @propagate_tags.setter
    def propagate_tags(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "propagate_tags", value)

    @property
    @pulumi.getter(name="retryStrategy")
    def retry_strategy(self) -> Optional[pulumi.Input['JobDefinitionRetryStrategyArgs']]:
        """
        Specifies the retry strategy to use for failed jobs that are submitted with this job definition.
        Maximum number of `retry_strategy` is `1`.  Defined below.
        """
        return pulumi.get(self, "retry_strategy")

    @retry_strategy.setter
    def retry_strategy(self, value: Optional[pulumi.Input['JobDefinitionRetryStrategyArgs']]):
        pulumi.set(self, "retry_strategy", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter
    def timeout(self) -> Optional[pulumi.Input['JobDefinitionTimeoutArgs']]:
        """
        Specifies the timeout for jobs so that if a job runs longer, AWS Batch terminates the job. Maximum number of `timeout` is `1`. Defined below.
        """
        return pulumi.get(self, "timeout")

    @timeout.setter
    def timeout(self, value: Optional[pulumi.Input['JobDefinitionTimeoutArgs']]):
        pulumi.set(self, "timeout", value)


@pulumi.input_type
class _JobDefinitionState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 container_properties: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parameters: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 platform_capabilities: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 propagate_tags: Optional[pulumi.Input[bool]] = None,
                 retry_strategy: Optional[pulumi.Input['JobDefinitionRetryStrategyArgs']] = None,
                 revision: Optional[pulumi.Input[int]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 timeout: Optional[pulumi.Input['JobDefinitionTimeoutArgs']] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering JobDefinition resources.
        :param pulumi.Input[str] arn: The Amazon Resource Name of the job definition.
        :param pulumi.Input[str] container_properties: A valid [container properties](http://docs.aws.amazon.com/batch/latest/APIReference/API_RegisterJobDefinition.html)
               provided as a single valid JSON document. This parameter is required if the `type` parameter is `container`.
        :param pulumi.Input[str] name: Specifies the name of the job definition.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] parameters: Specifies the parameter substitution placeholders to set in the job definition.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] platform_capabilities: The platform capabilities required by the job definition. If no value is specified, it defaults to `EC2`. To run the job on Fargate resources, specify `FARGATE`.
        :param pulumi.Input[bool] propagate_tags: Specifies whether to propagate the tags from the job definition to the corresponding Amazon ECS task. Default is `false`.
        :param pulumi.Input['JobDefinitionRetryStrategyArgs'] retry_strategy: Specifies the retry strategy to use for failed jobs that are submitted with this job definition.
               Maximum number of `retry_strategy` is `1`.  Defined below.
        :param pulumi.Input[int] revision: The revision of the job definition.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider .
        :param pulumi.Input['JobDefinitionTimeoutArgs'] timeout: Specifies the timeout for jobs so that if a job runs longer, AWS Batch terminates the job. Maximum number of `timeout` is `1`. Defined below.
        :param pulumi.Input[str] type: The type of job definition.  Must be `container`.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if container_properties is not None:
            pulumi.set(__self__, "container_properties", container_properties)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if parameters is not None:
            pulumi.set(__self__, "parameters", parameters)
        if platform_capabilities is not None:
            pulumi.set(__self__, "platform_capabilities", platform_capabilities)
        if propagate_tags is not None:
            pulumi.set(__self__, "propagate_tags", propagate_tags)
        if retry_strategy is not None:
            pulumi.set(__self__, "retry_strategy", retry_strategy)
        if revision is not None:
            pulumi.set(__self__, "revision", revision)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if timeout is not None:
            pulumi.set(__self__, "timeout", timeout)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name of the job definition.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="containerProperties")
    def container_properties(self) -> Optional[pulumi.Input[str]]:
        """
        A valid [container properties](http://docs.aws.amazon.com/batch/latest/APIReference/API_RegisterJobDefinition.html)
        provided as a single valid JSON document. This parameter is required if the `type` parameter is `container`.
        """
        return pulumi.get(self, "container_properties")

    @container_properties.setter
    def container_properties(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "container_properties", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the job definition.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def parameters(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Specifies the parameter substitution placeholders to set in the job definition.
        """
        return pulumi.get(self, "parameters")

    @parameters.setter
    def parameters(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "parameters", value)

    @property
    @pulumi.getter(name="platformCapabilities")
    def platform_capabilities(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The platform capabilities required by the job definition. If no value is specified, it defaults to `EC2`. To run the job on Fargate resources, specify `FARGATE`.
        """
        return pulumi.get(self, "platform_capabilities")

    @platform_capabilities.setter
    def platform_capabilities(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "platform_capabilities", value)

    @property
    @pulumi.getter(name="propagateTags")
    def propagate_tags(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to propagate the tags from the job definition to the corresponding Amazon ECS task. Default is `false`.
        """
        return pulumi.get(self, "propagate_tags")

    @propagate_tags.setter
    def propagate_tags(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "propagate_tags", value)

    @property
    @pulumi.getter(name="retryStrategy")
    def retry_strategy(self) -> Optional[pulumi.Input['JobDefinitionRetryStrategyArgs']]:
        """
        Specifies the retry strategy to use for failed jobs that are submitted with this job definition.
        Maximum number of `retry_strategy` is `1`.  Defined below.
        """
        return pulumi.get(self, "retry_strategy")

    @retry_strategy.setter
    def retry_strategy(self, value: Optional[pulumi.Input['JobDefinitionRetryStrategyArgs']]):
        pulumi.set(self, "retry_strategy", value)

    @property
    @pulumi.getter
    def revision(self) -> Optional[pulumi.Input[int]]:
        """
        The revision of the job definition.
        """
        return pulumi.get(self, "revision")

    @revision.setter
    def revision(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "revision", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider .
        """
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)

    @property
    @pulumi.getter
    def timeout(self) -> Optional[pulumi.Input['JobDefinitionTimeoutArgs']]:
        """
        Specifies the timeout for jobs so that if a job runs longer, AWS Batch terminates the job. Maximum number of `timeout` is `1`. Defined below.
        """
        return pulumi.get(self, "timeout")

    @timeout.setter
    def timeout(self, value: Optional[pulumi.Input['JobDefinitionTimeoutArgs']]):
        pulumi.set(self, "timeout", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of job definition.  Must be `container`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class JobDefinition(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 container_properties: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parameters: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 platform_capabilities: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 propagate_tags: Optional[pulumi.Input[bool]] = None,
                 retry_strategy: Optional[pulumi.Input[pulumi.InputType['JobDefinitionRetryStrategyArgs']]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 timeout: Optional[pulumi.Input[pulumi.InputType['JobDefinitionTimeoutArgs']]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Batch Job Definition resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.batch.JobDefinition("test",
            container_properties=\"\"\"{
        	"command": ["ls", "-la"],
        	"image": "busybox",
        	"memory": 1024,
        	"vcpus": 1,
        	"volumes": [
              {
                "host": {
                  "sourcePath": "/tmp"
                },
                "name": "tmp"
              }
            ],
        	"environment": [
        		{"name": "VARNAME", "value": "VARVAL"}
        	],
        	"mountPoints": [
        		{
                  "sourceVolume": "tmp",
                  "containerPath": "/tmp",
                  "readOnly": false
                }
        	],
            "ulimits": [
              {
                "hardLimit": 1024,
                "name": "nofile",
                "softLimit": 1024
              }
            ]
        }

        \"\"\",
            type="container")
        ```
        ### Fargate Platform Capability

        ```python
        import pulumi
        import pulumi_aws as aws

        assume_role_policy = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
            actions=["sts:AssumeRole"],
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="Service",
                identifiers=["ecs-tasks.amazonaws.com"],
            )],
        )])
        ecs_task_execution_role = aws.iam.Role("ecsTaskExecutionRole", assume_role_policy=assume_role_policy.json)
        ecs_task_execution_role_policy = aws.iam.RolePolicyAttachment("ecsTaskExecutionRolePolicy",
            role=ecs_task_execution_role.name,
            policy_arn="arn:aws:iam::aws:policy/service-role/AmazonECSTaskExecutionRolePolicy")
        test = aws.batch.JobDefinition("test",
            type="container",
            platform_capabilities=["FARGATE"],
            container_properties=ecs_task_execution_role.arn.apply(lambda arn: f\"\"\"{{
          "command": ["echo", "test"],
          "image": "busybox",
          "fargatePlatformConfiguration": {{
            "platformVersion": "LATEST"
          }},
          "resourceRequirements": [
            {{"type": "VCPU", "value": "0.25"}},
            {{"type": "MEMORY", "value": "512"}}
          ],
          "executionRoleArn": "{arn}"
        }}
        \"\"\"))
        ```

        ## Import

        Batch Job Definition can be imported using the `arn`, e.g.,

        ```sh
         $ pulumi import aws:batch/jobDefinition:JobDefinition test arn:aws:batch:us-east-1:123456789012:job-definition/sample
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] container_properties: A valid [container properties](http://docs.aws.amazon.com/batch/latest/APIReference/API_RegisterJobDefinition.html)
               provided as a single valid JSON document. This parameter is required if the `type` parameter is `container`.
        :param pulumi.Input[str] name: Specifies the name of the job definition.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] parameters: Specifies the parameter substitution placeholders to set in the job definition.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] platform_capabilities: The platform capabilities required by the job definition. If no value is specified, it defaults to `EC2`. To run the job on Fargate resources, specify `FARGATE`.
        :param pulumi.Input[bool] propagate_tags: Specifies whether to propagate the tags from the job definition to the corresponding Amazon ECS task. Default is `false`.
        :param pulumi.Input[pulumi.InputType['JobDefinitionRetryStrategyArgs']] retry_strategy: Specifies the retry strategy to use for failed jobs that are submitted with this job definition.
               Maximum number of `retry_strategy` is `1`.  Defined below.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[pulumi.InputType['JobDefinitionTimeoutArgs']] timeout: Specifies the timeout for jobs so that if a job runs longer, AWS Batch terminates the job. Maximum number of `timeout` is `1`. Defined below.
        :param pulumi.Input[str] type: The type of job definition.  Must be `container`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: JobDefinitionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Batch Job Definition resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.batch.JobDefinition("test",
            container_properties=\"\"\"{
        	"command": ["ls", "-la"],
        	"image": "busybox",
        	"memory": 1024,
        	"vcpus": 1,
        	"volumes": [
              {
                "host": {
                  "sourcePath": "/tmp"
                },
                "name": "tmp"
              }
            ],
        	"environment": [
        		{"name": "VARNAME", "value": "VARVAL"}
        	],
        	"mountPoints": [
        		{
                  "sourceVolume": "tmp",
                  "containerPath": "/tmp",
                  "readOnly": false
                }
        	],
            "ulimits": [
              {
                "hardLimit": 1024,
                "name": "nofile",
                "softLimit": 1024
              }
            ]
        }

        \"\"\",
            type="container")
        ```
        ### Fargate Platform Capability

        ```python
        import pulumi
        import pulumi_aws as aws

        assume_role_policy = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
            actions=["sts:AssumeRole"],
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="Service",
                identifiers=["ecs-tasks.amazonaws.com"],
            )],
        )])
        ecs_task_execution_role = aws.iam.Role("ecsTaskExecutionRole", assume_role_policy=assume_role_policy.json)
        ecs_task_execution_role_policy = aws.iam.RolePolicyAttachment("ecsTaskExecutionRolePolicy",
            role=ecs_task_execution_role.name,
            policy_arn="arn:aws:iam::aws:policy/service-role/AmazonECSTaskExecutionRolePolicy")
        test = aws.batch.JobDefinition("test",
            type="container",
            platform_capabilities=["FARGATE"],
            container_properties=ecs_task_execution_role.arn.apply(lambda arn: f\"\"\"{{
          "command": ["echo", "test"],
          "image": "busybox",
          "fargatePlatformConfiguration": {{
            "platformVersion": "LATEST"
          }},
          "resourceRequirements": [
            {{"type": "VCPU", "value": "0.25"}},
            {{"type": "MEMORY", "value": "512"}}
          ],
          "executionRoleArn": "{arn}"
        }}
        \"\"\"))
        ```

        ## Import

        Batch Job Definition can be imported using the `arn`, e.g.,

        ```sh
         $ pulumi import aws:batch/jobDefinition:JobDefinition test arn:aws:batch:us-east-1:123456789012:job-definition/sample
        ```

        :param str resource_name: The name of the resource.
        :param JobDefinitionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(JobDefinitionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 container_properties: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parameters: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 platform_capabilities: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 propagate_tags: Optional[pulumi.Input[bool]] = None,
                 retry_strategy: Optional[pulumi.Input[pulumi.InputType['JobDefinitionRetryStrategyArgs']]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 timeout: Optional[pulumi.Input[pulumi.InputType['JobDefinitionTimeoutArgs']]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = JobDefinitionArgs.__new__(JobDefinitionArgs)

            __props__.__dict__["container_properties"] = container_properties
            __props__.__dict__["name"] = name
            __props__.__dict__["parameters"] = parameters
            __props__.__dict__["platform_capabilities"] = platform_capabilities
            __props__.__dict__["propagate_tags"] = propagate_tags
            __props__.__dict__["retry_strategy"] = retry_strategy
            __props__.__dict__["tags"] = tags
            __props__.__dict__["timeout"] = timeout
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
            __props__.__dict__["arn"] = None
            __props__.__dict__["revision"] = None
            __props__.__dict__["tags_all"] = None
        super(JobDefinition, __self__).__init__(
            'aws:batch/jobDefinition:JobDefinition',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            container_properties: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            parameters: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            platform_capabilities: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            propagate_tags: Optional[pulumi.Input[bool]] = None,
            retry_strategy: Optional[pulumi.Input[pulumi.InputType['JobDefinitionRetryStrategyArgs']]] = None,
            revision: Optional[pulumi.Input[int]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            timeout: Optional[pulumi.Input[pulumi.InputType['JobDefinitionTimeoutArgs']]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'JobDefinition':
        """
        Get an existing JobDefinition resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The Amazon Resource Name of the job definition.
        :param pulumi.Input[str] container_properties: A valid [container properties](http://docs.aws.amazon.com/batch/latest/APIReference/API_RegisterJobDefinition.html)
               provided as a single valid JSON document. This parameter is required if the `type` parameter is `container`.
        :param pulumi.Input[str] name: Specifies the name of the job definition.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] parameters: Specifies the parameter substitution placeholders to set in the job definition.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] platform_capabilities: The platform capabilities required by the job definition. If no value is specified, it defaults to `EC2`. To run the job on Fargate resources, specify `FARGATE`.
        :param pulumi.Input[bool] propagate_tags: Specifies whether to propagate the tags from the job definition to the corresponding Amazon ECS task. Default is `false`.
        :param pulumi.Input[pulumi.InputType['JobDefinitionRetryStrategyArgs']] retry_strategy: Specifies the retry strategy to use for failed jobs that are submitted with this job definition.
               Maximum number of `retry_strategy` is `1`.  Defined below.
        :param pulumi.Input[int] revision: The revision of the job definition.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider .
        :param pulumi.Input[pulumi.InputType['JobDefinitionTimeoutArgs']] timeout: Specifies the timeout for jobs so that if a job runs longer, AWS Batch terminates the job. Maximum number of `timeout` is `1`. Defined below.
        :param pulumi.Input[str] type: The type of job definition.  Must be `container`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _JobDefinitionState.__new__(_JobDefinitionState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["container_properties"] = container_properties
        __props__.__dict__["name"] = name
        __props__.__dict__["parameters"] = parameters
        __props__.__dict__["platform_capabilities"] = platform_capabilities
        __props__.__dict__["propagate_tags"] = propagate_tags
        __props__.__dict__["retry_strategy"] = retry_strategy
        __props__.__dict__["revision"] = revision
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["timeout"] = timeout
        __props__.__dict__["type"] = type
        return JobDefinition(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name of the job definition.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="containerProperties")
    def container_properties(self) -> pulumi.Output[Optional[str]]:
        """
        A valid [container properties](http://docs.aws.amazon.com/batch/latest/APIReference/API_RegisterJobDefinition.html)
        provided as a single valid JSON document. This parameter is required if the `type` parameter is `container`.
        """
        return pulumi.get(self, "container_properties")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Specifies the name of the job definition.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def parameters(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Specifies the parameter substitution placeholders to set in the job definition.
        """
        return pulumi.get(self, "parameters")

    @property
    @pulumi.getter(name="platformCapabilities")
    def platform_capabilities(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The platform capabilities required by the job definition. If no value is specified, it defaults to `EC2`. To run the job on Fargate resources, specify `FARGATE`.
        """
        return pulumi.get(self, "platform_capabilities")

    @property
    @pulumi.getter(name="propagateTags")
    def propagate_tags(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether to propagate the tags from the job definition to the corresponding Amazon ECS task. Default is `false`.
        """
        return pulumi.get(self, "propagate_tags")

    @property
    @pulumi.getter(name="retryStrategy")
    def retry_strategy(self) -> pulumi.Output[Optional['outputs.JobDefinitionRetryStrategy']]:
        """
        Specifies the retry strategy to use for failed jobs that are submitted with this job definition.
        Maximum number of `retry_strategy` is `1`.  Defined below.
        """
        return pulumi.get(self, "retry_strategy")

    @property
    @pulumi.getter
    def revision(self) -> pulumi.Output[int]:
        """
        The revision of the job definition.
        """
        return pulumi.get(self, "revision")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider .
        """
        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter
    def timeout(self) -> pulumi.Output[Optional['outputs.JobDefinitionTimeout']]:
        """
        Specifies the timeout for jobs so that if a job runs longer, AWS Batch terminates the job. Maximum number of `timeout` is `1`. Defined below.
        """
        return pulumi.get(self, "timeout")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The type of job definition.  Must be `container`.
        """
        return pulumi.get(self, "type")

