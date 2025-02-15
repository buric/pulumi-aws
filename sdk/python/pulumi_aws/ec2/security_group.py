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

__all__ = ['SecurityGroupArgs', 'SecurityGroup']

@pulumi.input_type
class SecurityGroupArgs:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 egress: Optional[pulumi.Input[Sequence[pulumi.Input['SecurityGroupEgressArgs']]]] = None,
                 ingress: Optional[pulumi.Input[Sequence[pulumi.Input['SecurityGroupIngressArgs']]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 name_prefix: Optional[pulumi.Input[str]] = None,
                 revoke_rules_on_delete: Optional[pulumi.Input[bool]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a SecurityGroup resource.
        :param pulumi.Input[str] description: Description of this egress rule.
        :param pulumi.Input[Sequence[pulumi.Input['SecurityGroupEgressArgs']]] egress: Configuration block for egress rules. Can be specified multiple times for each egress rule. Each egress block supports fields documented below.
        :param pulumi.Input[Sequence[pulumi.Input['SecurityGroupIngressArgs']]] ingress: Configuration block for egress rules. Can be specified multiple times for each ingress rule. Each ingress block supports fields documented below.
        :param pulumi.Input[str] name: Name of the security group. If omitted, this provider will assign a random, unique name.
        :param pulumi.Input[str] name_prefix: Creates a unique name beginning with the specified prefix. Conflicts with `name`.
        :param pulumi.Input[bool] revoke_rules_on_delete: Instruct this provider to revoke all of the Security Groups attached ingress and egress rules before deleting the rule itself. This is normally not needed, however certain AWS services such as Elastic Map Reduce may automatically add required rules to security groups used with the service, and those rules may contain a cyclic dependency that prevent the security groups from being destroyed without removing the dependency first. Default `false`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to the resource.
        :param pulumi.Input[str] vpc_id: VPC ID.
        """
        if description is None:
            description = 'Managed by Pulumi'
        if description is not None:
            pulumi.set(__self__, "description", description)
        if egress is not None:
            pulumi.set(__self__, "egress", egress)
        if ingress is not None:
            pulumi.set(__self__, "ingress", ingress)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if name_prefix is not None:
            pulumi.set(__self__, "name_prefix", name_prefix)
        if revoke_rules_on_delete is not None:
            pulumi.set(__self__, "revoke_rules_on_delete", revoke_rules_on_delete)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if vpc_id is not None:
            pulumi.set(__self__, "vpc_id", vpc_id)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of this egress rule.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def egress(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SecurityGroupEgressArgs']]]]:
        """
        Configuration block for egress rules. Can be specified multiple times for each egress rule. Each egress block supports fields documented below.
        """
        return pulumi.get(self, "egress")

    @egress.setter
    def egress(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SecurityGroupEgressArgs']]]]):
        pulumi.set(self, "egress", value)

    @property
    @pulumi.getter
    def ingress(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SecurityGroupIngressArgs']]]]:
        """
        Configuration block for egress rules. Can be specified multiple times for each ingress rule. Each ingress block supports fields documented below.
        """
        return pulumi.get(self, "ingress")

    @ingress.setter
    def ingress(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SecurityGroupIngressArgs']]]]):
        pulumi.set(self, "ingress", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the security group. If omitted, this provider will assign a random, unique name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="namePrefix")
    def name_prefix(self) -> Optional[pulumi.Input[str]]:
        """
        Creates a unique name beginning with the specified prefix. Conflicts with `name`.
        """
        return pulumi.get(self, "name_prefix")

    @name_prefix.setter
    def name_prefix(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name_prefix", value)

    @property
    @pulumi.getter(name="revokeRulesOnDelete")
    def revoke_rules_on_delete(self) -> Optional[pulumi.Input[bool]]:
        """
        Instruct this provider to revoke all of the Security Groups attached ingress and egress rules before deleting the rule itself. This is normally not needed, however certain AWS services such as Elastic Map Reduce may automatically add required rules to security groups used with the service, and those rules may contain a cyclic dependency that prevent the security groups from being destroyed without removing the dependency first. Default `false`.
        """
        return pulumi.get(self, "revoke_rules_on_delete")

    @revoke_rules_on_delete.setter
    def revoke_rules_on_delete(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "revoke_rules_on_delete", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[pulumi.Input[str]]:
        """
        VPC ID.
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_id", value)


@pulumi.input_type
class _SecurityGroupState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 egress: Optional[pulumi.Input[Sequence[pulumi.Input['SecurityGroupEgressArgs']]]] = None,
                 ingress: Optional[pulumi.Input[Sequence[pulumi.Input['SecurityGroupIngressArgs']]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 name_prefix: Optional[pulumi.Input[str]] = None,
                 owner_id: Optional[pulumi.Input[str]] = None,
                 revoke_rules_on_delete: Optional[pulumi.Input[bool]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SecurityGroup resources.
        :param pulumi.Input[str] arn: ARN of the security group.
        :param pulumi.Input[str] description: Description of this egress rule.
        :param pulumi.Input[Sequence[pulumi.Input['SecurityGroupEgressArgs']]] egress: Configuration block for egress rules. Can be specified multiple times for each egress rule. Each egress block supports fields documented below.
        :param pulumi.Input[Sequence[pulumi.Input['SecurityGroupIngressArgs']]] ingress: Configuration block for egress rules. Can be specified multiple times for each ingress rule. Each ingress block supports fields documented below.
        :param pulumi.Input[str] name: Name of the security group. If omitted, this provider will assign a random, unique name.
        :param pulumi.Input[str] name_prefix: Creates a unique name beginning with the specified prefix. Conflicts with `name`.
        :param pulumi.Input[str] owner_id: Owner ID.
        :param pulumi.Input[bool] revoke_rules_on_delete: Instruct this provider to revoke all of the Security Groups attached ingress and egress rules before deleting the rule itself. This is normally not needed, however certain AWS services such as Elastic Map Reduce may automatically add required rules to security groups used with the service, and those rules may contain a cyclic dependency that prevent the security groups from being destroyed without removing the dependency first. Default `false`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider .
        :param pulumi.Input[str] vpc_id: VPC ID.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if description is None:
            description = 'Managed by Pulumi'
        if description is not None:
            pulumi.set(__self__, "description", description)
        if egress is not None:
            pulumi.set(__self__, "egress", egress)
        if ingress is not None:
            pulumi.set(__self__, "ingress", ingress)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if name_prefix is not None:
            pulumi.set(__self__, "name_prefix", name_prefix)
        if owner_id is not None:
            pulumi.set(__self__, "owner_id", owner_id)
        if revoke_rules_on_delete is not None:
            pulumi.set(__self__, "revoke_rules_on_delete", revoke_rules_on_delete)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if vpc_id is not None:
            pulumi.set(__self__, "vpc_id", vpc_id)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN of the security group.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of this egress rule.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def egress(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SecurityGroupEgressArgs']]]]:
        """
        Configuration block for egress rules. Can be specified multiple times for each egress rule. Each egress block supports fields documented below.
        """
        return pulumi.get(self, "egress")

    @egress.setter
    def egress(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SecurityGroupEgressArgs']]]]):
        pulumi.set(self, "egress", value)

    @property
    @pulumi.getter
    def ingress(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SecurityGroupIngressArgs']]]]:
        """
        Configuration block for egress rules. Can be specified multiple times for each ingress rule. Each ingress block supports fields documented below.
        """
        return pulumi.get(self, "ingress")

    @ingress.setter
    def ingress(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SecurityGroupIngressArgs']]]]):
        pulumi.set(self, "ingress", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the security group. If omitted, this provider will assign a random, unique name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="namePrefix")
    def name_prefix(self) -> Optional[pulumi.Input[str]]:
        """
        Creates a unique name beginning with the specified prefix. Conflicts with `name`.
        """
        return pulumi.get(self, "name_prefix")

    @name_prefix.setter
    def name_prefix(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name_prefix", value)

    @property
    @pulumi.getter(name="ownerId")
    def owner_id(self) -> Optional[pulumi.Input[str]]:
        """
        Owner ID.
        """
        return pulumi.get(self, "owner_id")

    @owner_id.setter
    def owner_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owner_id", value)

    @property
    @pulumi.getter(name="revokeRulesOnDelete")
    def revoke_rules_on_delete(self) -> Optional[pulumi.Input[bool]]:
        """
        Instruct this provider to revoke all of the Security Groups attached ingress and egress rules before deleting the rule itself. This is normally not needed, however certain AWS services such as Elastic Map Reduce may automatically add required rules to security groups used with the service, and those rules may contain a cyclic dependency that prevent the security groups from being destroyed without removing the dependency first. Default `false`.
        """
        return pulumi.get(self, "revoke_rules_on_delete")

    @revoke_rules_on_delete.setter
    def revoke_rules_on_delete(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "revoke_rules_on_delete", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of tags to assign to the resource.
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
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[pulumi.Input[str]]:
        """
        VPC ID.
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_id", value)


class SecurityGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 egress: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SecurityGroupEgressArgs']]]]] = None,
                 ingress: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SecurityGroupIngressArgs']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 name_prefix: Optional[pulumi.Input[str]] = None,
                 revoke_rules_on_delete: Optional[pulumi.Input[bool]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Import

        Security Groups can be imported using the `security group id`, e.g.,

        ```sh
         $ pulumi import aws:ec2/securityGroup:SecurityGroup elb_sg sg-903004f8
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of this egress rule.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SecurityGroupEgressArgs']]]] egress: Configuration block for egress rules. Can be specified multiple times for each egress rule. Each egress block supports fields documented below.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SecurityGroupIngressArgs']]]] ingress: Configuration block for egress rules. Can be specified multiple times for each ingress rule. Each ingress block supports fields documented below.
        :param pulumi.Input[str] name: Name of the security group. If omitted, this provider will assign a random, unique name.
        :param pulumi.Input[str] name_prefix: Creates a unique name beginning with the specified prefix. Conflicts with `name`.
        :param pulumi.Input[bool] revoke_rules_on_delete: Instruct this provider to revoke all of the Security Groups attached ingress and egress rules before deleting the rule itself. This is normally not needed, however certain AWS services such as Elastic Map Reduce may automatically add required rules to security groups used with the service, and those rules may contain a cyclic dependency that prevent the security groups from being destroyed without removing the dependency first. Default `false`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to the resource.
        :param pulumi.Input[str] vpc_id: VPC ID.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[SecurityGroupArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        Security Groups can be imported using the `security group id`, e.g.,

        ```sh
         $ pulumi import aws:ec2/securityGroup:SecurityGroup elb_sg sg-903004f8
        ```

        :param str resource_name: The name of the resource.
        :param SecurityGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SecurityGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 egress: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SecurityGroupEgressArgs']]]]] = None,
                 ingress: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SecurityGroupIngressArgs']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 name_prefix: Optional[pulumi.Input[str]] = None,
                 revoke_rules_on_delete: Optional[pulumi.Input[bool]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SecurityGroupArgs.__new__(SecurityGroupArgs)

            if description is None:
                description = 'Managed by Pulumi'
            __props__.__dict__["description"] = description
            __props__.__dict__["egress"] = egress
            __props__.__dict__["ingress"] = ingress
            __props__.__dict__["name"] = name
            __props__.__dict__["name_prefix"] = name_prefix
            __props__.__dict__["revoke_rules_on_delete"] = revoke_rules_on_delete
            __props__.__dict__["tags"] = tags
            __props__.__dict__["vpc_id"] = vpc_id
            __props__.__dict__["arn"] = None
            __props__.__dict__["owner_id"] = None
            __props__.__dict__["tags_all"] = None
        super(SecurityGroup, __self__).__init__(
            'aws:ec2/securityGroup:SecurityGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            egress: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SecurityGroupEgressArgs']]]]] = None,
            ingress: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SecurityGroupIngressArgs']]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            name_prefix: Optional[pulumi.Input[str]] = None,
            owner_id: Optional[pulumi.Input[str]] = None,
            revoke_rules_on_delete: Optional[pulumi.Input[bool]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            vpc_id: Optional[pulumi.Input[str]] = None) -> 'SecurityGroup':
        """
        Get an existing SecurityGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: ARN of the security group.
        :param pulumi.Input[str] description: Description of this egress rule.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SecurityGroupEgressArgs']]]] egress: Configuration block for egress rules. Can be specified multiple times for each egress rule. Each egress block supports fields documented below.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SecurityGroupIngressArgs']]]] ingress: Configuration block for egress rules. Can be specified multiple times for each ingress rule. Each ingress block supports fields documented below.
        :param pulumi.Input[str] name: Name of the security group. If omitted, this provider will assign a random, unique name.
        :param pulumi.Input[str] name_prefix: Creates a unique name beginning with the specified prefix. Conflicts with `name`.
        :param pulumi.Input[str] owner_id: Owner ID.
        :param pulumi.Input[bool] revoke_rules_on_delete: Instruct this provider to revoke all of the Security Groups attached ingress and egress rules before deleting the rule itself. This is normally not needed, however certain AWS services such as Elastic Map Reduce may automatically add required rules to security groups used with the service, and those rules may contain a cyclic dependency that prevent the security groups from being destroyed without removing the dependency first. Default `false`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider .
        :param pulumi.Input[str] vpc_id: VPC ID.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SecurityGroupState.__new__(_SecurityGroupState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["description"] = description
        __props__.__dict__["egress"] = egress
        __props__.__dict__["ingress"] = ingress
        __props__.__dict__["name"] = name
        __props__.__dict__["name_prefix"] = name_prefix
        __props__.__dict__["owner_id"] = owner_id
        __props__.__dict__["revoke_rules_on_delete"] = revoke_rules_on_delete
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["vpc_id"] = vpc_id
        return SecurityGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        ARN of the security group.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        Description of this egress rule.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def egress(self) -> pulumi.Output[Sequence['outputs.SecurityGroupEgress']]:
        """
        Configuration block for egress rules. Can be specified multiple times for each egress rule. Each egress block supports fields documented below.
        """
        return pulumi.get(self, "egress")

    @property
    @pulumi.getter
    def ingress(self) -> pulumi.Output[Sequence['outputs.SecurityGroupIngress']]:
        """
        Configuration block for egress rules. Can be specified multiple times for each ingress rule. Each ingress block supports fields documented below.
        """
        return pulumi.get(self, "ingress")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the security group. If omitted, this provider will assign a random, unique name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="namePrefix")
    def name_prefix(self) -> pulumi.Output[str]:
        """
        Creates a unique name beginning with the specified prefix. Conflicts with `name`.
        """
        return pulumi.get(self, "name_prefix")

    @property
    @pulumi.getter(name="ownerId")
    def owner_id(self) -> pulumi.Output[str]:
        """
        Owner ID.
        """
        return pulumi.get(self, "owner_id")

    @property
    @pulumi.getter(name="revokeRulesOnDelete")
    def revoke_rules_on_delete(self) -> pulumi.Output[Optional[bool]]:
        """
        Instruct this provider to revoke all of the Security Groups attached ingress and egress rules before deleting the rule itself. This is normally not needed, however certain AWS services such as Elastic Map Reduce may automatically add required rules to security groups used with the service, and those rules may contain a cyclic dependency that prevent the security groups from being destroyed without removing the dependency first. Default `false`.
        """
        return pulumi.get(self, "revoke_rules_on_delete")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Map of tags to assign to the resource.
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
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Output[str]:
        """
        VPC ID.
        """
        return pulumi.get(self, "vpc_id")

