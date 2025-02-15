# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['MaintenanceWindowArgs', 'MaintenanceWindow']

@pulumi.input_type
class MaintenanceWindowArgs:
    def __init__(__self__, *,
                 cutoff: pulumi.Input[int],
                 duration: pulumi.Input[int],
                 schedule: pulumi.Input[str],
                 allow_unassociated_targets: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 end_date: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 schedule_offset: Optional[pulumi.Input[int]] = None,
                 schedule_timezone: Optional[pulumi.Input[str]] = None,
                 start_date: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a MaintenanceWindow resource.
        :param pulumi.Input[int] cutoff: The number of hours before the end of the Maintenance Window that Systems Manager stops scheduling new tasks for execution.
        :param pulumi.Input[int] duration: The duration of the Maintenance Window in hours.
        :param pulumi.Input[str] schedule: The schedule of the Maintenance Window in the form of a [cron](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-maintenance-cron.html) or rate expression.
        :param pulumi.Input[bool] allow_unassociated_targets: Whether targets must be registered with the Maintenance Window before tasks can be defined for those targets.
        :param pulumi.Input[str] description: A description for the maintenance window.
        :param pulumi.Input[bool] enabled: Whether the maintenance window is enabled. Default: `true`.
        :param pulumi.Input[str] end_date: Timestamp in [ISO-8601 extended format](https://www.iso.org/iso-8601-date-and-time-format.html) when to no longer run the maintenance window.
        :param pulumi.Input[str] name: The name of the maintenance window.
        :param pulumi.Input[int] schedule_offset: The number of days to wait after the date and time specified by a CRON expression before running the maintenance window.
        :param pulumi.Input[str] schedule_timezone: Timezone for schedule in [Internet Assigned Numbers Authority (IANA) Time Zone Database format](https://www.iana.org/time-zones). For example: `America/Los_Angeles`, `etc/UTC`, or `Asia/Seoul`.
        :param pulumi.Input[str] start_date: Timestamp in [ISO-8601 extended format](https://www.iso.org/iso-8601-date-and-time-format.html) when to begin the maintenance window.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "cutoff", cutoff)
        pulumi.set(__self__, "duration", duration)
        pulumi.set(__self__, "schedule", schedule)
        if allow_unassociated_targets is not None:
            pulumi.set(__self__, "allow_unassociated_targets", allow_unassociated_targets)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if end_date is not None:
            pulumi.set(__self__, "end_date", end_date)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if schedule_offset is not None:
            pulumi.set(__self__, "schedule_offset", schedule_offset)
        if schedule_timezone is not None:
            pulumi.set(__self__, "schedule_timezone", schedule_timezone)
        if start_date is not None:
            pulumi.set(__self__, "start_date", start_date)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def cutoff(self) -> pulumi.Input[int]:
        """
        The number of hours before the end of the Maintenance Window that Systems Manager stops scheduling new tasks for execution.
        """
        return pulumi.get(self, "cutoff")

    @cutoff.setter
    def cutoff(self, value: pulumi.Input[int]):
        pulumi.set(self, "cutoff", value)

    @property
    @pulumi.getter
    def duration(self) -> pulumi.Input[int]:
        """
        The duration of the Maintenance Window in hours.
        """
        return pulumi.get(self, "duration")

    @duration.setter
    def duration(self, value: pulumi.Input[int]):
        pulumi.set(self, "duration", value)

    @property
    @pulumi.getter
    def schedule(self) -> pulumi.Input[str]:
        """
        The schedule of the Maintenance Window in the form of a [cron](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-maintenance-cron.html) or rate expression.
        """
        return pulumi.get(self, "schedule")

    @schedule.setter
    def schedule(self, value: pulumi.Input[str]):
        pulumi.set(self, "schedule", value)

    @property
    @pulumi.getter(name="allowUnassociatedTargets")
    def allow_unassociated_targets(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether targets must be registered with the Maintenance Window before tasks can be defined for those targets.
        """
        return pulumi.get(self, "allow_unassociated_targets")

    @allow_unassociated_targets.setter
    def allow_unassociated_targets(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_unassociated_targets", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A description for the maintenance window.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the maintenance window is enabled. Default: `true`.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="endDate")
    def end_date(self) -> Optional[pulumi.Input[str]]:
        """
        Timestamp in [ISO-8601 extended format](https://www.iso.org/iso-8601-date-and-time-format.html) when to no longer run the maintenance window.
        """
        return pulumi.get(self, "end_date")

    @end_date.setter
    def end_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "end_date", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the maintenance window.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="scheduleOffset")
    def schedule_offset(self) -> Optional[pulumi.Input[int]]:
        """
        The number of days to wait after the date and time specified by a CRON expression before running the maintenance window.
        """
        return pulumi.get(self, "schedule_offset")

    @schedule_offset.setter
    def schedule_offset(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "schedule_offset", value)

    @property
    @pulumi.getter(name="scheduleTimezone")
    def schedule_timezone(self) -> Optional[pulumi.Input[str]]:
        """
        Timezone for schedule in [Internet Assigned Numbers Authority (IANA) Time Zone Database format](https://www.iana.org/time-zones). For example: `America/Los_Angeles`, `etc/UTC`, or `Asia/Seoul`.
        """
        return pulumi.get(self, "schedule_timezone")

    @schedule_timezone.setter
    def schedule_timezone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schedule_timezone", value)

    @property
    @pulumi.getter(name="startDate")
    def start_date(self) -> Optional[pulumi.Input[str]]:
        """
        Timestamp in [ISO-8601 extended format](https://www.iso.org/iso-8601-date-and-time-format.html) when to begin the maintenance window.
        """
        return pulumi.get(self, "start_date")

    @start_date.setter
    def start_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "start_date", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _MaintenanceWindowState:
    def __init__(__self__, *,
                 allow_unassociated_targets: Optional[pulumi.Input[bool]] = None,
                 cutoff: Optional[pulumi.Input[int]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 duration: Optional[pulumi.Input[int]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 end_date: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 schedule: Optional[pulumi.Input[str]] = None,
                 schedule_offset: Optional[pulumi.Input[int]] = None,
                 schedule_timezone: Optional[pulumi.Input[str]] = None,
                 start_date: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering MaintenanceWindow resources.
        :param pulumi.Input[bool] allow_unassociated_targets: Whether targets must be registered with the Maintenance Window before tasks can be defined for those targets.
        :param pulumi.Input[int] cutoff: The number of hours before the end of the Maintenance Window that Systems Manager stops scheduling new tasks for execution.
        :param pulumi.Input[str] description: A description for the maintenance window.
        :param pulumi.Input[int] duration: The duration of the Maintenance Window in hours.
        :param pulumi.Input[bool] enabled: Whether the maintenance window is enabled. Default: `true`.
        :param pulumi.Input[str] end_date: Timestamp in [ISO-8601 extended format](https://www.iso.org/iso-8601-date-and-time-format.html) when to no longer run the maintenance window.
        :param pulumi.Input[str] name: The name of the maintenance window.
        :param pulumi.Input[str] schedule: The schedule of the Maintenance Window in the form of a [cron](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-maintenance-cron.html) or rate expression.
        :param pulumi.Input[int] schedule_offset: The number of days to wait after the date and time specified by a CRON expression before running the maintenance window.
        :param pulumi.Input[str] schedule_timezone: Timezone for schedule in [Internet Assigned Numbers Authority (IANA) Time Zone Database format](https://www.iana.org/time-zones). For example: `America/Los_Angeles`, `etc/UTC`, or `Asia/Seoul`.
        :param pulumi.Input[str] start_date: Timestamp in [ISO-8601 extended format](https://www.iso.org/iso-8601-date-and-time-format.html) when to begin the maintenance window.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider .
        """
        if allow_unassociated_targets is not None:
            pulumi.set(__self__, "allow_unassociated_targets", allow_unassociated_targets)
        if cutoff is not None:
            pulumi.set(__self__, "cutoff", cutoff)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if duration is not None:
            pulumi.set(__self__, "duration", duration)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if end_date is not None:
            pulumi.set(__self__, "end_date", end_date)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if schedule is not None:
            pulumi.set(__self__, "schedule", schedule)
        if schedule_offset is not None:
            pulumi.set(__self__, "schedule_offset", schedule_offset)
        if schedule_timezone is not None:
            pulumi.set(__self__, "schedule_timezone", schedule_timezone)
        if start_date is not None:
            pulumi.set(__self__, "start_date", start_date)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)

    @property
    @pulumi.getter(name="allowUnassociatedTargets")
    def allow_unassociated_targets(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether targets must be registered with the Maintenance Window before tasks can be defined for those targets.
        """
        return pulumi.get(self, "allow_unassociated_targets")

    @allow_unassociated_targets.setter
    def allow_unassociated_targets(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_unassociated_targets", value)

    @property
    @pulumi.getter
    def cutoff(self) -> Optional[pulumi.Input[int]]:
        """
        The number of hours before the end of the Maintenance Window that Systems Manager stops scheduling new tasks for execution.
        """
        return pulumi.get(self, "cutoff")

    @cutoff.setter
    def cutoff(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "cutoff", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A description for the maintenance window.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def duration(self) -> Optional[pulumi.Input[int]]:
        """
        The duration of the Maintenance Window in hours.
        """
        return pulumi.get(self, "duration")

    @duration.setter
    def duration(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "duration", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the maintenance window is enabled. Default: `true`.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="endDate")
    def end_date(self) -> Optional[pulumi.Input[str]]:
        """
        Timestamp in [ISO-8601 extended format](https://www.iso.org/iso-8601-date-and-time-format.html) when to no longer run the maintenance window.
        """
        return pulumi.get(self, "end_date")

    @end_date.setter
    def end_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "end_date", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the maintenance window.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def schedule(self) -> Optional[pulumi.Input[str]]:
        """
        The schedule of the Maintenance Window in the form of a [cron](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-maintenance-cron.html) or rate expression.
        """
        return pulumi.get(self, "schedule")

    @schedule.setter
    def schedule(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schedule", value)

    @property
    @pulumi.getter(name="scheduleOffset")
    def schedule_offset(self) -> Optional[pulumi.Input[int]]:
        """
        The number of days to wait after the date and time specified by a CRON expression before running the maintenance window.
        """
        return pulumi.get(self, "schedule_offset")

    @schedule_offset.setter
    def schedule_offset(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "schedule_offset", value)

    @property
    @pulumi.getter(name="scheduleTimezone")
    def schedule_timezone(self) -> Optional[pulumi.Input[str]]:
        """
        Timezone for schedule in [Internet Assigned Numbers Authority (IANA) Time Zone Database format](https://www.iana.org/time-zones). For example: `America/Los_Angeles`, `etc/UTC`, or `Asia/Seoul`.
        """
        return pulumi.get(self, "schedule_timezone")

    @schedule_timezone.setter
    def schedule_timezone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schedule_timezone", value)

    @property
    @pulumi.getter(name="startDate")
    def start_date(self) -> Optional[pulumi.Input[str]]:
        """
        Timestamp in [ISO-8601 extended format](https://www.iso.org/iso-8601-date-and-time-format.html) when to begin the maintenance window.
        """
        return pulumi.get(self, "start_date")

    @start_date.setter
    def start_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "start_date", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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


class MaintenanceWindow(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allow_unassociated_targets: Optional[pulumi.Input[bool]] = None,
                 cutoff: Optional[pulumi.Input[int]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 duration: Optional[pulumi.Input[int]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 end_date: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 schedule: Optional[pulumi.Input[str]] = None,
                 schedule_offset: Optional[pulumi.Input[int]] = None,
                 schedule_timezone: Optional[pulumi.Input[str]] = None,
                 start_date: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides an SSM Maintenance Window resource

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        production = aws.ssm.MaintenanceWindow("production",
            cutoff=1,
            duration=3,
            schedule="cron(0 16 ? * TUE *)")
        ```

        ## Import

        SSM

        Maintenance Windows can be imported using the `maintenance window id`, e.g.,

        ```sh
         $ pulumi import aws:ssm/maintenanceWindow:MaintenanceWindow imported-window mw-0123456789
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] allow_unassociated_targets: Whether targets must be registered with the Maintenance Window before tasks can be defined for those targets.
        :param pulumi.Input[int] cutoff: The number of hours before the end of the Maintenance Window that Systems Manager stops scheduling new tasks for execution.
        :param pulumi.Input[str] description: A description for the maintenance window.
        :param pulumi.Input[int] duration: The duration of the Maintenance Window in hours.
        :param pulumi.Input[bool] enabled: Whether the maintenance window is enabled. Default: `true`.
        :param pulumi.Input[str] end_date: Timestamp in [ISO-8601 extended format](https://www.iso.org/iso-8601-date-and-time-format.html) when to no longer run the maintenance window.
        :param pulumi.Input[str] name: The name of the maintenance window.
        :param pulumi.Input[str] schedule: The schedule of the Maintenance Window in the form of a [cron](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-maintenance-cron.html) or rate expression.
        :param pulumi.Input[int] schedule_offset: The number of days to wait after the date and time specified by a CRON expression before running the maintenance window.
        :param pulumi.Input[str] schedule_timezone: Timezone for schedule in [Internet Assigned Numbers Authority (IANA) Time Zone Database format](https://www.iana.org/time-zones). For example: `America/Los_Angeles`, `etc/UTC`, or `Asia/Seoul`.
        :param pulumi.Input[str] start_date: Timestamp in [ISO-8601 extended format](https://www.iso.org/iso-8601-date-and-time-format.html) when to begin the maintenance window.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MaintenanceWindowArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an SSM Maintenance Window resource

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        production = aws.ssm.MaintenanceWindow("production",
            cutoff=1,
            duration=3,
            schedule="cron(0 16 ? * TUE *)")
        ```

        ## Import

        SSM

        Maintenance Windows can be imported using the `maintenance window id`, e.g.,

        ```sh
         $ pulumi import aws:ssm/maintenanceWindow:MaintenanceWindow imported-window mw-0123456789
        ```

        :param str resource_name: The name of the resource.
        :param MaintenanceWindowArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MaintenanceWindowArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allow_unassociated_targets: Optional[pulumi.Input[bool]] = None,
                 cutoff: Optional[pulumi.Input[int]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 duration: Optional[pulumi.Input[int]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 end_date: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 schedule: Optional[pulumi.Input[str]] = None,
                 schedule_offset: Optional[pulumi.Input[int]] = None,
                 schedule_timezone: Optional[pulumi.Input[str]] = None,
                 start_date: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MaintenanceWindowArgs.__new__(MaintenanceWindowArgs)

            __props__.__dict__["allow_unassociated_targets"] = allow_unassociated_targets
            if cutoff is None and not opts.urn:
                raise TypeError("Missing required property 'cutoff'")
            __props__.__dict__["cutoff"] = cutoff
            __props__.__dict__["description"] = description
            if duration is None and not opts.urn:
                raise TypeError("Missing required property 'duration'")
            __props__.__dict__["duration"] = duration
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["end_date"] = end_date
            __props__.__dict__["name"] = name
            if schedule is None and not opts.urn:
                raise TypeError("Missing required property 'schedule'")
            __props__.__dict__["schedule"] = schedule
            __props__.__dict__["schedule_offset"] = schedule_offset
            __props__.__dict__["schedule_timezone"] = schedule_timezone
            __props__.__dict__["start_date"] = start_date
            __props__.__dict__["tags"] = tags
            __props__.__dict__["tags_all"] = None
        super(MaintenanceWindow, __self__).__init__(
            'aws:ssm/maintenanceWindow:MaintenanceWindow',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            allow_unassociated_targets: Optional[pulumi.Input[bool]] = None,
            cutoff: Optional[pulumi.Input[int]] = None,
            description: Optional[pulumi.Input[str]] = None,
            duration: Optional[pulumi.Input[int]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            end_date: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            schedule: Optional[pulumi.Input[str]] = None,
            schedule_offset: Optional[pulumi.Input[int]] = None,
            schedule_timezone: Optional[pulumi.Input[str]] = None,
            start_date: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'MaintenanceWindow':
        """
        Get an existing MaintenanceWindow resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] allow_unassociated_targets: Whether targets must be registered with the Maintenance Window before tasks can be defined for those targets.
        :param pulumi.Input[int] cutoff: The number of hours before the end of the Maintenance Window that Systems Manager stops scheduling new tasks for execution.
        :param pulumi.Input[str] description: A description for the maintenance window.
        :param pulumi.Input[int] duration: The duration of the Maintenance Window in hours.
        :param pulumi.Input[bool] enabled: Whether the maintenance window is enabled. Default: `true`.
        :param pulumi.Input[str] end_date: Timestamp in [ISO-8601 extended format](https://www.iso.org/iso-8601-date-and-time-format.html) when to no longer run the maintenance window.
        :param pulumi.Input[str] name: The name of the maintenance window.
        :param pulumi.Input[str] schedule: The schedule of the Maintenance Window in the form of a [cron](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-maintenance-cron.html) or rate expression.
        :param pulumi.Input[int] schedule_offset: The number of days to wait after the date and time specified by a CRON expression before running the maintenance window.
        :param pulumi.Input[str] schedule_timezone: Timezone for schedule in [Internet Assigned Numbers Authority (IANA) Time Zone Database format](https://www.iana.org/time-zones). For example: `America/Los_Angeles`, `etc/UTC`, or `Asia/Seoul`.
        :param pulumi.Input[str] start_date: Timestamp in [ISO-8601 extended format](https://www.iso.org/iso-8601-date-and-time-format.html) when to begin the maintenance window.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider .
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MaintenanceWindowState.__new__(_MaintenanceWindowState)

        __props__.__dict__["allow_unassociated_targets"] = allow_unassociated_targets
        __props__.__dict__["cutoff"] = cutoff
        __props__.__dict__["description"] = description
        __props__.__dict__["duration"] = duration
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["end_date"] = end_date
        __props__.__dict__["name"] = name
        __props__.__dict__["schedule"] = schedule
        __props__.__dict__["schedule_offset"] = schedule_offset
        __props__.__dict__["schedule_timezone"] = schedule_timezone
        __props__.__dict__["start_date"] = start_date
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return MaintenanceWindow(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="allowUnassociatedTargets")
    def allow_unassociated_targets(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether targets must be registered with the Maintenance Window before tasks can be defined for those targets.
        """
        return pulumi.get(self, "allow_unassociated_targets")

    @property
    @pulumi.getter
    def cutoff(self) -> pulumi.Output[int]:
        """
        The number of hours before the end of the Maintenance Window that Systems Manager stops scheduling new tasks for execution.
        """
        return pulumi.get(self, "cutoff")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        A description for the maintenance window.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def duration(self) -> pulumi.Output[int]:
        """
        The duration of the Maintenance Window in hours.
        """
        return pulumi.get(self, "duration")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether the maintenance window is enabled. Default: `true`.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="endDate")
    def end_date(self) -> pulumi.Output[Optional[str]]:
        """
        Timestamp in [ISO-8601 extended format](https://www.iso.org/iso-8601-date-and-time-format.html) when to no longer run the maintenance window.
        """
        return pulumi.get(self, "end_date")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the maintenance window.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def schedule(self) -> pulumi.Output[str]:
        """
        The schedule of the Maintenance Window in the form of a [cron](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-maintenance-cron.html) or rate expression.
        """
        return pulumi.get(self, "schedule")

    @property
    @pulumi.getter(name="scheduleOffset")
    def schedule_offset(self) -> pulumi.Output[Optional[int]]:
        """
        The number of days to wait after the date and time specified by a CRON expression before running the maintenance window.
        """
        return pulumi.get(self, "schedule_offset")

    @property
    @pulumi.getter(name="scheduleTimezone")
    def schedule_timezone(self) -> pulumi.Output[Optional[str]]:
        """
        Timezone for schedule in [Internet Assigned Numbers Authority (IANA) Time Zone Database format](https://www.iana.org/time-zones). For example: `America/Los_Angeles`, `etc/UTC`, or `Asia/Seoul`.
        """
        return pulumi.get(self, "schedule_timezone")

    @property
    @pulumi.getter(name="startDate")
    def start_date(self) -> pulumi.Output[Optional[str]]:
        """
        Timestamp in [ISO-8601 extended format](https://www.iso.org/iso-8601-date-and-time-format.html) when to begin the maintenance window.
        """
        return pulumi.get(self, "start_date")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider .
        """
        return pulumi.get(self, "tags_all")

