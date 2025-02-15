# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['AgentArgs', 'Agent']

@pulumi.input_type
class AgentArgs:
    def __init__(__self__, *,
                 activation_key: Optional[pulumi.Input[str]] = None,
                 ip_address: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 private_link_endpoint: Optional[pulumi.Input[str]] = None,
                 security_group_arns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 subnet_arns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 vpc_endpoint_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Agent resource.
        :param pulumi.Input[str] activation_key: DataSync Agent activation key during resource creation. Conflicts with `ip_address`. If an `ip_address` is provided instead, the provider will retrieve the `activation_key` as part of the resource creation.
        :param pulumi.Input[str] ip_address: DataSync Agent IP address to retrieve activation key during resource creation. Conflicts with `activation_key`. DataSync Agent must be accessible on port 80 from where the provider is running.
        :param pulumi.Input[str] name: Name of the DataSync Agent.
        :param pulumi.Input[str] private_link_endpoint: The IP address of the VPC endpoint the agent should connect to when retrieving an activation key during resource creation. Conflicts with `activation_key`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_arns: The ARNs of the security groups used to protect your data transfer task subnets.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnet_arns: The Amazon Resource Names (ARNs) of the subnets in which DataSync will create elastic network interfaces for each data transfer task.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value pairs of resource tags to assign to the DataSync Agent. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] vpc_endpoint_id: The ID of the VPC (virtual private cloud) endpoint that the agent has access to.
        """
        if activation_key is not None:
            pulumi.set(__self__, "activation_key", activation_key)
        if ip_address is not None:
            pulumi.set(__self__, "ip_address", ip_address)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if private_link_endpoint is not None:
            pulumi.set(__self__, "private_link_endpoint", private_link_endpoint)
        if security_group_arns is not None:
            pulumi.set(__self__, "security_group_arns", security_group_arns)
        if subnet_arns is not None:
            pulumi.set(__self__, "subnet_arns", subnet_arns)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if vpc_endpoint_id is not None:
            pulumi.set(__self__, "vpc_endpoint_id", vpc_endpoint_id)

    @property
    @pulumi.getter(name="activationKey")
    def activation_key(self) -> Optional[pulumi.Input[str]]:
        """
        DataSync Agent activation key during resource creation. Conflicts with `ip_address`. If an `ip_address` is provided instead, the provider will retrieve the `activation_key` as part of the resource creation.
        """
        return pulumi.get(self, "activation_key")

    @activation_key.setter
    def activation_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "activation_key", value)

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> Optional[pulumi.Input[str]]:
        """
        DataSync Agent IP address to retrieve activation key during resource creation. Conflicts with `activation_key`. DataSync Agent must be accessible on port 80 from where the provider is running.
        """
        return pulumi.get(self, "ip_address")

    @ip_address.setter
    def ip_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip_address", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the DataSync Agent.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="privateLinkEndpoint")
    def private_link_endpoint(self) -> Optional[pulumi.Input[str]]:
        """
        The IP address of the VPC endpoint the agent should connect to when retrieving an activation key during resource creation. Conflicts with `activation_key`.
        """
        return pulumi.get(self, "private_link_endpoint")

    @private_link_endpoint.setter
    def private_link_endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_link_endpoint", value)

    @property
    @pulumi.getter(name="securityGroupArns")
    def security_group_arns(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The ARNs of the security groups used to protect your data transfer task subnets.
        """
        return pulumi.get(self, "security_group_arns")

    @security_group_arns.setter
    def security_group_arns(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "security_group_arns", value)

    @property
    @pulumi.getter(name="subnetArns")
    def subnet_arns(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The Amazon Resource Names (ARNs) of the subnets in which DataSync will create elastic network interfaces for each data transfer task.
        """
        return pulumi.get(self, "subnet_arns")

    @subnet_arns.setter
    def subnet_arns(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "subnet_arns", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value pairs of resource tags to assign to the DataSync Agent. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="vpcEndpointId")
    def vpc_endpoint_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the VPC (virtual private cloud) endpoint that the agent has access to.
        """
        return pulumi.get(self, "vpc_endpoint_id")

    @vpc_endpoint_id.setter
    def vpc_endpoint_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_endpoint_id", value)


@pulumi.input_type
class _AgentState:
    def __init__(__self__, *,
                 activation_key: Optional[pulumi.Input[str]] = None,
                 arn: Optional[pulumi.Input[str]] = None,
                 ip_address: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 private_link_endpoint: Optional[pulumi.Input[str]] = None,
                 security_group_arns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 subnet_arns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 vpc_endpoint_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Agent resources.
        :param pulumi.Input[str] activation_key: DataSync Agent activation key during resource creation. Conflicts with `ip_address`. If an `ip_address` is provided instead, the provider will retrieve the `activation_key` as part of the resource creation.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) of the DataSync Agent.
        :param pulumi.Input[str] ip_address: DataSync Agent IP address to retrieve activation key during resource creation. Conflicts with `activation_key`. DataSync Agent must be accessible on port 80 from where the provider is running.
        :param pulumi.Input[str] name: Name of the DataSync Agent.
        :param pulumi.Input[str] private_link_endpoint: The IP address of the VPC endpoint the agent should connect to when retrieving an activation key during resource creation. Conflicts with `activation_key`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_arns: The ARNs of the security groups used to protect your data transfer task subnets.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnet_arns: The Amazon Resource Names (ARNs) of the subnets in which DataSync will create elastic network interfaces for each data transfer task.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value pairs of resource tags to assign to the DataSync Agent. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider .
        :param pulumi.Input[str] vpc_endpoint_id: The ID of the VPC (virtual private cloud) endpoint that the agent has access to.
        """
        if activation_key is not None:
            pulumi.set(__self__, "activation_key", activation_key)
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if ip_address is not None:
            pulumi.set(__self__, "ip_address", ip_address)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if private_link_endpoint is not None:
            pulumi.set(__self__, "private_link_endpoint", private_link_endpoint)
        if security_group_arns is not None:
            pulumi.set(__self__, "security_group_arns", security_group_arns)
        if subnet_arns is not None:
            pulumi.set(__self__, "subnet_arns", subnet_arns)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if vpc_endpoint_id is not None:
            pulumi.set(__self__, "vpc_endpoint_id", vpc_endpoint_id)

    @property
    @pulumi.getter(name="activationKey")
    def activation_key(self) -> Optional[pulumi.Input[str]]:
        """
        DataSync Agent activation key during resource creation. Conflicts with `ip_address`. If an `ip_address` is provided instead, the provider will retrieve the `activation_key` as part of the resource creation.
        """
        return pulumi.get(self, "activation_key")

    @activation_key.setter
    def activation_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "activation_key", value)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        Amazon Resource Name (ARN) of the DataSync Agent.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> Optional[pulumi.Input[str]]:
        """
        DataSync Agent IP address to retrieve activation key during resource creation. Conflicts with `activation_key`. DataSync Agent must be accessible on port 80 from where the provider is running.
        """
        return pulumi.get(self, "ip_address")

    @ip_address.setter
    def ip_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip_address", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the DataSync Agent.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="privateLinkEndpoint")
    def private_link_endpoint(self) -> Optional[pulumi.Input[str]]:
        """
        The IP address of the VPC endpoint the agent should connect to when retrieving an activation key during resource creation. Conflicts with `activation_key`.
        """
        return pulumi.get(self, "private_link_endpoint")

    @private_link_endpoint.setter
    def private_link_endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_link_endpoint", value)

    @property
    @pulumi.getter(name="securityGroupArns")
    def security_group_arns(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The ARNs of the security groups used to protect your data transfer task subnets.
        """
        return pulumi.get(self, "security_group_arns")

    @security_group_arns.setter
    def security_group_arns(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "security_group_arns", value)

    @property
    @pulumi.getter(name="subnetArns")
    def subnet_arns(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The Amazon Resource Names (ARNs) of the subnets in which DataSync will create elastic network interfaces for each data transfer task.
        """
        return pulumi.get(self, "subnet_arns")

    @subnet_arns.setter
    def subnet_arns(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "subnet_arns", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value pairs of resource tags to assign to the DataSync Agent. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    @pulumi.getter(name="vpcEndpointId")
    def vpc_endpoint_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the VPC (virtual private cloud) endpoint that the agent has access to.
        """
        return pulumi.get(self, "vpc_endpoint_id")

    @vpc_endpoint_id.setter
    def vpc_endpoint_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_endpoint_id", value)


class Agent(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 activation_key: Optional[pulumi.Input[str]] = None,
                 ip_address: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 private_link_endpoint: Optional[pulumi.Input[str]] = None,
                 security_group_arns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 subnet_arns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 vpc_endpoint_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages an AWS DataSync Agent deployed on premises.

        > **NOTE:** One of `activation_key` or `ip_address` must be provided for resource creation (agent activation). Neither is required for resource import. If using `ip_address`, this provider must be able to make an HTTP (port 80) GET request to the specified IP address from where it is running. The agent will turn off that HTTP server after activation.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.datasync.Agent("example", ip_address="1.2.3.4")
        ```

        ## Import

        `aws_datasync_agent` can be imported by using the DataSync Agent Amazon Resource Name (ARN), e.g.,

        ```sh
         $ pulumi import aws:datasync/agent:Agent example arn:aws:datasync:us-east-1:123456789012:agent/agent-12345678901234567
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] activation_key: DataSync Agent activation key during resource creation. Conflicts with `ip_address`. If an `ip_address` is provided instead, the provider will retrieve the `activation_key` as part of the resource creation.
        :param pulumi.Input[str] ip_address: DataSync Agent IP address to retrieve activation key during resource creation. Conflicts with `activation_key`. DataSync Agent must be accessible on port 80 from where the provider is running.
        :param pulumi.Input[str] name: Name of the DataSync Agent.
        :param pulumi.Input[str] private_link_endpoint: The IP address of the VPC endpoint the agent should connect to when retrieving an activation key during resource creation. Conflicts with `activation_key`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_arns: The ARNs of the security groups used to protect your data transfer task subnets.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnet_arns: The Amazon Resource Names (ARNs) of the subnets in which DataSync will create elastic network interfaces for each data transfer task.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value pairs of resource tags to assign to the DataSync Agent. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] vpc_endpoint_id: The ID of the VPC (virtual private cloud) endpoint that the agent has access to.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[AgentArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an AWS DataSync Agent deployed on premises.

        > **NOTE:** One of `activation_key` or `ip_address` must be provided for resource creation (agent activation). Neither is required for resource import. If using `ip_address`, this provider must be able to make an HTTP (port 80) GET request to the specified IP address from where it is running. The agent will turn off that HTTP server after activation.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.datasync.Agent("example", ip_address="1.2.3.4")
        ```

        ## Import

        `aws_datasync_agent` can be imported by using the DataSync Agent Amazon Resource Name (ARN), e.g.,

        ```sh
         $ pulumi import aws:datasync/agent:Agent example arn:aws:datasync:us-east-1:123456789012:agent/agent-12345678901234567
        ```

        :param str resource_name: The name of the resource.
        :param AgentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AgentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 activation_key: Optional[pulumi.Input[str]] = None,
                 ip_address: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 private_link_endpoint: Optional[pulumi.Input[str]] = None,
                 security_group_arns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 subnet_arns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 vpc_endpoint_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AgentArgs.__new__(AgentArgs)

            __props__.__dict__["activation_key"] = activation_key
            __props__.__dict__["ip_address"] = ip_address
            __props__.__dict__["name"] = name
            __props__.__dict__["private_link_endpoint"] = private_link_endpoint
            __props__.__dict__["security_group_arns"] = security_group_arns
            __props__.__dict__["subnet_arns"] = subnet_arns
            __props__.__dict__["tags"] = tags
            __props__.__dict__["vpc_endpoint_id"] = vpc_endpoint_id
            __props__.__dict__["arn"] = None
            __props__.__dict__["tags_all"] = None
        super(Agent, __self__).__init__(
            'aws:datasync/agent:Agent',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            activation_key: Optional[pulumi.Input[str]] = None,
            arn: Optional[pulumi.Input[str]] = None,
            ip_address: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            private_link_endpoint: Optional[pulumi.Input[str]] = None,
            security_group_arns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            subnet_arns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            vpc_endpoint_id: Optional[pulumi.Input[str]] = None) -> 'Agent':
        """
        Get an existing Agent resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] activation_key: DataSync Agent activation key during resource creation. Conflicts with `ip_address`. If an `ip_address` is provided instead, the provider will retrieve the `activation_key` as part of the resource creation.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) of the DataSync Agent.
        :param pulumi.Input[str] ip_address: DataSync Agent IP address to retrieve activation key during resource creation. Conflicts with `activation_key`. DataSync Agent must be accessible on port 80 from where the provider is running.
        :param pulumi.Input[str] name: Name of the DataSync Agent.
        :param pulumi.Input[str] private_link_endpoint: The IP address of the VPC endpoint the agent should connect to when retrieving an activation key during resource creation. Conflicts with `activation_key`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_arns: The ARNs of the security groups used to protect your data transfer task subnets.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnet_arns: The Amazon Resource Names (ARNs) of the subnets in which DataSync will create elastic network interfaces for each data transfer task.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value pairs of resource tags to assign to the DataSync Agent. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider .
        :param pulumi.Input[str] vpc_endpoint_id: The ID of the VPC (virtual private cloud) endpoint that the agent has access to.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AgentState.__new__(_AgentState)

        __props__.__dict__["activation_key"] = activation_key
        __props__.__dict__["arn"] = arn
        __props__.__dict__["ip_address"] = ip_address
        __props__.__dict__["name"] = name
        __props__.__dict__["private_link_endpoint"] = private_link_endpoint
        __props__.__dict__["security_group_arns"] = security_group_arns
        __props__.__dict__["subnet_arns"] = subnet_arns
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["vpc_endpoint_id"] = vpc_endpoint_id
        return Agent(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="activationKey")
    def activation_key(self) -> pulumi.Output[str]:
        """
        DataSync Agent activation key during resource creation. Conflicts with `ip_address`. If an `ip_address` is provided instead, the provider will retrieve the `activation_key` as part of the resource creation.
        """
        return pulumi.get(self, "activation_key")

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        Amazon Resource Name (ARN) of the DataSync Agent.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> pulumi.Output[str]:
        """
        DataSync Agent IP address to retrieve activation key during resource creation. Conflicts with `activation_key`. DataSync Agent must be accessible on port 80 from where the provider is running.
        """
        return pulumi.get(self, "ip_address")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the DataSync Agent.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="privateLinkEndpoint")
    def private_link_endpoint(self) -> pulumi.Output[Optional[str]]:
        """
        The IP address of the VPC endpoint the agent should connect to when retrieving an activation key during resource creation. Conflicts with `activation_key`.
        """
        return pulumi.get(self, "private_link_endpoint")

    @property
    @pulumi.getter(name="securityGroupArns")
    def security_group_arns(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The ARNs of the security groups used to protect your data transfer task subnets.
        """
        return pulumi.get(self, "security_group_arns")

    @property
    @pulumi.getter(name="subnetArns")
    def subnet_arns(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The Amazon Resource Names (ARNs) of the subnets in which DataSync will create elastic network interfaces for each data transfer task.
        """
        return pulumi.get(self, "subnet_arns")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value pairs of resource tags to assign to the DataSync Agent. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    @pulumi.getter(name="vpcEndpointId")
    def vpc_endpoint_id(self) -> pulumi.Output[Optional[str]]:
        """
        The ID of the VPC (virtual private cloud) endpoint that the agent has access to.
        """
        return pulumi.get(self, "vpc_endpoint_id")

