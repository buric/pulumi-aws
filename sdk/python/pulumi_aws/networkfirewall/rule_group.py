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

__all__ = ['RuleGroupArgs', 'RuleGroup']

@pulumi.input_type
class RuleGroupArgs:
    def __init__(__self__, *,
                 capacity: pulumi.Input[int],
                 type: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 rule_group: Optional[pulumi.Input['RuleGroupRuleGroupArgs']] = None,
                 rules: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a RuleGroup resource.
        :param pulumi.Input[int] capacity: The maximum number of operating resources that this rule group can use. For a stateless rule group, the capacity required is the sum of the capacity requirements of the individual rules. For a stateful rule group, the minimum capacity required is the number of individual rules.
        :param pulumi.Input[str] type: Whether the rule group is stateless (containing stateless rules) or stateful (containing stateful rules). Valid values include: `STATEFUL` or `STATELESS`.
        :param pulumi.Input[str] description: A friendly description of the rule group.
        :param pulumi.Input[str] name: A friendly name of the rule group.
        :param pulumi.Input['RuleGroupRuleGroupArgs'] rule_group: A configuration block that defines the rule group rules. Required unless `rules` is specified. See Rule Group below for details.
        :param pulumi.Input[str] rules: The stateful rule group rules specifications in Suricata file format, with one rule per line. Use this to import your existing Suricata compatible rule groups. Required unless `rule_group` is specified.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of key:value pairs to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "capacity", capacity)
        pulumi.set(__self__, "type", type)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if rule_group is not None:
            pulumi.set(__self__, "rule_group", rule_group)
        if rules is not None:
            pulumi.set(__self__, "rules", rules)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def capacity(self) -> pulumi.Input[int]:
        """
        The maximum number of operating resources that this rule group can use. For a stateless rule group, the capacity required is the sum of the capacity requirements of the individual rules. For a stateful rule group, the minimum capacity required is the number of individual rules.
        """
        return pulumi.get(self, "capacity")

    @capacity.setter
    def capacity(self, value: pulumi.Input[int]):
        pulumi.set(self, "capacity", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        Whether the rule group is stateless (containing stateless rules) or stateful (containing stateful rules). Valid values include: `STATEFUL` or `STATELESS`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A friendly description of the rule group.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        A friendly name of the rule group.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="ruleGroup")
    def rule_group(self) -> Optional[pulumi.Input['RuleGroupRuleGroupArgs']]:
        """
        A configuration block that defines the rule group rules. Required unless `rules` is specified. See Rule Group below for details.
        """
        return pulumi.get(self, "rule_group")

    @rule_group.setter
    def rule_group(self, value: Optional[pulumi.Input['RuleGroupRuleGroupArgs']]):
        pulumi.set(self, "rule_group", value)

    @property
    @pulumi.getter
    def rules(self) -> Optional[pulumi.Input[str]]:
        """
        The stateful rule group rules specifications in Suricata file format, with one rule per line. Use this to import your existing Suricata compatible rule groups. Required unless `rule_group` is specified.
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rules", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of key:value pairs to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _RuleGroupState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 capacity: Optional[pulumi.Input[int]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 rule_group: Optional[pulumi.Input['RuleGroupRuleGroupArgs']] = None,
                 rules: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 update_token: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering RuleGroup resources.
        :param pulumi.Input[str] arn: The Amazon Resource Name (ARN) that identifies the rule group.
        :param pulumi.Input[int] capacity: The maximum number of operating resources that this rule group can use. For a stateless rule group, the capacity required is the sum of the capacity requirements of the individual rules. For a stateful rule group, the minimum capacity required is the number of individual rules.
        :param pulumi.Input[str] description: A friendly description of the rule group.
        :param pulumi.Input[str] name: A friendly name of the rule group.
        :param pulumi.Input['RuleGroupRuleGroupArgs'] rule_group: A configuration block that defines the rule group rules. Required unless `rules` is specified. See Rule Group below for details.
        :param pulumi.Input[str] rules: The stateful rule group rules specifications in Suricata file format, with one rule per line. Use this to import your existing Suricata compatible rule groups. Required unless `rule_group` is specified.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of key:value pairs to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider .
        :param pulumi.Input[str] type: Whether the rule group is stateless (containing stateless rules) or stateful (containing stateful rules). Valid values include: `STATEFUL` or `STATELESS`.
        :param pulumi.Input[str] update_token: A string token used when updating the rule group.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if capacity is not None:
            pulumi.set(__self__, "capacity", capacity)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if rule_group is not None:
            pulumi.set(__self__, "rule_group", rule_group)
        if rules is not None:
            pulumi.set(__self__, "rules", rules)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if update_token is not None:
            pulumi.set(__self__, "update_token", update_token)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) that identifies the rule group.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def capacity(self) -> Optional[pulumi.Input[int]]:
        """
        The maximum number of operating resources that this rule group can use. For a stateless rule group, the capacity required is the sum of the capacity requirements of the individual rules. For a stateful rule group, the minimum capacity required is the number of individual rules.
        """
        return pulumi.get(self, "capacity")

    @capacity.setter
    def capacity(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "capacity", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A friendly description of the rule group.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        A friendly name of the rule group.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="ruleGroup")
    def rule_group(self) -> Optional[pulumi.Input['RuleGroupRuleGroupArgs']]:
        """
        A configuration block that defines the rule group rules. Required unless `rules` is specified. See Rule Group below for details.
        """
        return pulumi.get(self, "rule_group")

    @rule_group.setter
    def rule_group(self, value: Optional[pulumi.Input['RuleGroupRuleGroupArgs']]):
        pulumi.set(self, "rule_group", value)

    @property
    @pulumi.getter
    def rules(self) -> Optional[pulumi.Input[str]]:
        """
        The stateful rule group rules specifications in Suricata file format, with one rule per line. Use this to import your existing Suricata compatible rule groups. Required unless `rule_group` is specified.
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rules", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of key:value pairs to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Whether the rule group is stateless (containing stateless rules) or stateful (containing stateful rules). Valid values include: `STATEFUL` or `STATELESS`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="updateToken")
    def update_token(self) -> Optional[pulumi.Input[str]]:
        """
        A string token used when updating the rule group.
        """
        return pulumi.get(self, "update_token")

    @update_token.setter
    def update_token(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "update_token", value)


class RuleGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 capacity: Optional[pulumi.Input[int]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 rule_group: Optional[pulumi.Input[pulumi.InputType['RuleGroupRuleGroupArgs']]] = None,
                 rules: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides an AWS Network Firewall Rule Group Resource

        ## Example Usage
        ### Stateful Inspection for denying access to a domain

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.networkfirewall.RuleGroup("example",
            capacity=100,
            rule_group=aws.networkfirewall.RuleGroupRuleGroupArgs(
                rules_source=aws.networkfirewall.RuleGroupRuleGroupRulesSourceArgs(
                    rules_source_list=aws.networkfirewall.RuleGroupRuleGroupRulesSourceRulesSourceListArgs(
                        generated_rules_type="DENYLIST",
                        target_types=["HTTP_HOST"],
                        targets=["test.example.com"],
                    ),
                ),
            ),
            tags={
                "Tag1": "Value1",
                "Tag2": "Value2",
            },
            type="STATEFUL")
        ```
        ### Stateful Inspection from rules specifications defined in Suricata flat format

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.networkfirewall.RuleGroup("example",
            capacity=100,
            type="STATEFUL",
            rules=(lambda path: open(path).read())("example.rules"),
            tags={
                "Tag1": "Value1",
                "Tag2": "Value2",
            })
        ```
        ### Stateful Inspection from rule group specifications using rule variables and Suricata format rules

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.networkfirewall.RuleGroup("example",
            capacity=100,
            type="STATEFUL",
            rule_group=aws.networkfirewall.RuleGroupRuleGroupArgs(
                rule_variables=aws.networkfirewall.RuleGroupRuleGroupRuleVariablesArgs(
                    ip_sets=[
                        aws.networkfirewall.RuleGroupRuleGroupRuleVariablesIpSetArgs(
                            key="WEBSERVERS_HOSTS",
                            ip_set=aws.networkfirewall.RuleGroupRuleGroupRuleVariablesIpSetIpSetArgs(
                                definitions=[
                                    "10.0.0.0/16",
                                    "10.0.1.0/24",
                                    "192.168.0.0/16",
                                ],
                            ),
                        ),
                        aws.networkfirewall.RuleGroupRuleGroupRuleVariablesIpSetArgs(
                            key="EXTERNAL_HOST",
                            ip_set=aws.networkfirewall.RuleGroupRuleGroupRuleVariablesIpSetIpSetArgs(
                                definitions=["1.2.3.4/32"],
                            ),
                        ),
                    ],
                    port_sets=[aws.networkfirewall.RuleGroupRuleGroupRuleVariablesPortSetArgs(
                        key="HTTP_PORTS",
                        port_set=aws.networkfirewall.RuleGroupRuleGroupRuleVariablesPortSetPortSetArgs(
                            definitions=[
                                "443",
                                "80",
                            ],
                        ),
                    )],
                ),
                rules_source=aws.networkfirewall.RuleGroupRuleGroupRulesSourceArgs(
                    rules_string=(lambda path: open(path).read())("suricata_rules_file"),
                ),
            ),
            tags={
                "Tag1": "Value1",
                "Tag2": "Value2",
            })
        ```

        ## Import

        Network Firewall Rule Groups can be imported using their `ARN`.

        ```sh
         $ pulumi import aws:networkfirewall/ruleGroup:RuleGroup example arn:aws:network-firewall:us-west-1:123456789012:stateful-rulegroup/example
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] capacity: The maximum number of operating resources that this rule group can use. For a stateless rule group, the capacity required is the sum of the capacity requirements of the individual rules. For a stateful rule group, the minimum capacity required is the number of individual rules.
        :param pulumi.Input[str] description: A friendly description of the rule group.
        :param pulumi.Input[str] name: A friendly name of the rule group.
        :param pulumi.Input[pulumi.InputType['RuleGroupRuleGroupArgs']] rule_group: A configuration block that defines the rule group rules. Required unless `rules` is specified. See Rule Group below for details.
        :param pulumi.Input[str] rules: The stateful rule group rules specifications in Suricata file format, with one rule per line. Use this to import your existing Suricata compatible rule groups. Required unless `rule_group` is specified.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of key:value pairs to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] type: Whether the rule group is stateless (containing stateless rules) or stateful (containing stateful rules). Valid values include: `STATEFUL` or `STATELESS`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RuleGroupArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an AWS Network Firewall Rule Group Resource

        ## Example Usage
        ### Stateful Inspection for denying access to a domain

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.networkfirewall.RuleGroup("example",
            capacity=100,
            rule_group=aws.networkfirewall.RuleGroupRuleGroupArgs(
                rules_source=aws.networkfirewall.RuleGroupRuleGroupRulesSourceArgs(
                    rules_source_list=aws.networkfirewall.RuleGroupRuleGroupRulesSourceRulesSourceListArgs(
                        generated_rules_type="DENYLIST",
                        target_types=["HTTP_HOST"],
                        targets=["test.example.com"],
                    ),
                ),
            ),
            tags={
                "Tag1": "Value1",
                "Tag2": "Value2",
            },
            type="STATEFUL")
        ```
        ### Stateful Inspection from rules specifications defined in Suricata flat format

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.networkfirewall.RuleGroup("example",
            capacity=100,
            type="STATEFUL",
            rules=(lambda path: open(path).read())("example.rules"),
            tags={
                "Tag1": "Value1",
                "Tag2": "Value2",
            })
        ```
        ### Stateful Inspection from rule group specifications using rule variables and Suricata format rules

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.networkfirewall.RuleGroup("example",
            capacity=100,
            type="STATEFUL",
            rule_group=aws.networkfirewall.RuleGroupRuleGroupArgs(
                rule_variables=aws.networkfirewall.RuleGroupRuleGroupRuleVariablesArgs(
                    ip_sets=[
                        aws.networkfirewall.RuleGroupRuleGroupRuleVariablesIpSetArgs(
                            key="WEBSERVERS_HOSTS",
                            ip_set=aws.networkfirewall.RuleGroupRuleGroupRuleVariablesIpSetIpSetArgs(
                                definitions=[
                                    "10.0.0.0/16",
                                    "10.0.1.0/24",
                                    "192.168.0.0/16",
                                ],
                            ),
                        ),
                        aws.networkfirewall.RuleGroupRuleGroupRuleVariablesIpSetArgs(
                            key="EXTERNAL_HOST",
                            ip_set=aws.networkfirewall.RuleGroupRuleGroupRuleVariablesIpSetIpSetArgs(
                                definitions=["1.2.3.4/32"],
                            ),
                        ),
                    ],
                    port_sets=[aws.networkfirewall.RuleGroupRuleGroupRuleVariablesPortSetArgs(
                        key="HTTP_PORTS",
                        port_set=aws.networkfirewall.RuleGroupRuleGroupRuleVariablesPortSetPortSetArgs(
                            definitions=[
                                "443",
                                "80",
                            ],
                        ),
                    )],
                ),
                rules_source=aws.networkfirewall.RuleGroupRuleGroupRulesSourceArgs(
                    rules_string=(lambda path: open(path).read())("suricata_rules_file"),
                ),
            ),
            tags={
                "Tag1": "Value1",
                "Tag2": "Value2",
            })
        ```

        ## Import

        Network Firewall Rule Groups can be imported using their `ARN`.

        ```sh
         $ pulumi import aws:networkfirewall/ruleGroup:RuleGroup example arn:aws:network-firewall:us-west-1:123456789012:stateful-rulegroup/example
        ```

        :param str resource_name: The name of the resource.
        :param RuleGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RuleGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 capacity: Optional[pulumi.Input[int]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 rule_group: Optional[pulumi.Input[pulumi.InputType['RuleGroupRuleGroupArgs']]] = None,
                 rules: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RuleGroupArgs.__new__(RuleGroupArgs)

            if capacity is None and not opts.urn:
                raise TypeError("Missing required property 'capacity'")
            __props__.__dict__["capacity"] = capacity
            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            __props__.__dict__["rule_group"] = rule_group
            __props__.__dict__["rules"] = rules
            __props__.__dict__["tags"] = tags
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
            __props__.__dict__["arn"] = None
            __props__.__dict__["tags_all"] = None
            __props__.__dict__["update_token"] = None
        super(RuleGroup, __self__).__init__(
            'aws:networkfirewall/ruleGroup:RuleGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            capacity: Optional[pulumi.Input[int]] = None,
            description: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            rule_group: Optional[pulumi.Input[pulumi.InputType['RuleGroupRuleGroupArgs']]] = None,
            rules: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            type: Optional[pulumi.Input[str]] = None,
            update_token: Optional[pulumi.Input[str]] = None) -> 'RuleGroup':
        """
        Get an existing RuleGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The Amazon Resource Name (ARN) that identifies the rule group.
        :param pulumi.Input[int] capacity: The maximum number of operating resources that this rule group can use. For a stateless rule group, the capacity required is the sum of the capacity requirements of the individual rules. For a stateful rule group, the minimum capacity required is the number of individual rules.
        :param pulumi.Input[str] description: A friendly description of the rule group.
        :param pulumi.Input[str] name: A friendly name of the rule group.
        :param pulumi.Input[pulumi.InputType['RuleGroupRuleGroupArgs']] rule_group: A configuration block that defines the rule group rules. Required unless `rules` is specified. See Rule Group below for details.
        :param pulumi.Input[str] rules: The stateful rule group rules specifications in Suricata file format, with one rule per line. Use this to import your existing Suricata compatible rule groups. Required unless `rule_group` is specified.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of key:value pairs to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider .
        :param pulumi.Input[str] type: Whether the rule group is stateless (containing stateless rules) or stateful (containing stateful rules). Valid values include: `STATEFUL` or `STATELESS`.
        :param pulumi.Input[str] update_token: A string token used when updating the rule group.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RuleGroupState.__new__(_RuleGroupState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["capacity"] = capacity
        __props__.__dict__["description"] = description
        __props__.__dict__["name"] = name
        __props__.__dict__["rule_group"] = rule_group
        __props__.__dict__["rules"] = rules
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["type"] = type
        __props__.__dict__["update_token"] = update_token
        return RuleGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name (ARN) that identifies the rule group.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def capacity(self) -> pulumi.Output[int]:
        """
        The maximum number of operating resources that this rule group can use. For a stateless rule group, the capacity required is the sum of the capacity requirements of the individual rules. For a stateful rule group, the minimum capacity required is the number of individual rules.
        """
        return pulumi.get(self, "capacity")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        A friendly description of the rule group.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        A friendly name of the rule group.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="ruleGroup")
    def rule_group(self) -> pulumi.Output['outputs.RuleGroupRuleGroup']:
        """
        A configuration block that defines the rule group rules. Required unless `rules` is specified. See Rule Group below for details.
        """
        return pulumi.get(self, "rule_group")

    @property
    @pulumi.getter
    def rules(self) -> pulumi.Output[Optional[str]]:
        """
        The stateful rule group rules specifications in Suricata file format, with one rule per line. Use this to import your existing Suricata compatible rule groups. Required unless `rule_group` is specified.
        """
        return pulumi.get(self, "rules")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A map of key:value pairs to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    def type(self) -> pulumi.Output[str]:
        """
        Whether the rule group is stateless (containing stateless rules) or stateful (containing stateful rules). Valid values include: `STATEFUL` or `STATELESS`.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="updateToken")
    def update_token(self) -> pulumi.Output[str]:
        """
        A string token used when updating the rule group.
        """
        return pulumi.get(self, "update_token")

