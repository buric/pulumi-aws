// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export * from "./activation";
export * from "./association";
export * from "./document";
export * from "./getDocument";
export * from "./getInstances";
export * from "./getMaintenanceWindows";
export * from "./getParameter";
export * from "./getParametersByPath";
export * from "./getPatchBaseline";
export * from "./maintenanceWindow";
export * from "./maintenanceWindowTarget";
export * from "./maintenanceWindowTask";
export * from "./parameter";
export * from "./parameterType";
export * from "./patchBaseline";
export * from "./patchGroup";
export * from "./resourceDataSync";

// Export enums:
export * from "../types/enums/ssm";

// Import resources to register:
import { Activation } from "./activation";
import { Association } from "./association";
import { Document } from "./document";
import { MaintenanceWindow } from "./maintenanceWindow";
import { MaintenanceWindowTarget } from "./maintenanceWindowTarget";
import { MaintenanceWindowTask } from "./maintenanceWindowTask";
import { Parameter } from "./parameter";
import { PatchBaseline } from "./patchBaseline";
import { PatchGroup } from "./patchGroup";
import { ResourceDataSync } from "./resourceDataSync";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "aws:ssm/activation:Activation":
                return new Activation(name, <any>undefined, { urn })
            case "aws:ssm/association:Association":
                return new Association(name, <any>undefined, { urn })
            case "aws:ssm/document:Document":
                return new Document(name, <any>undefined, { urn })
            case "aws:ssm/maintenanceWindow:MaintenanceWindow":
                return new MaintenanceWindow(name, <any>undefined, { urn })
            case "aws:ssm/maintenanceWindowTarget:MaintenanceWindowTarget":
                return new MaintenanceWindowTarget(name, <any>undefined, { urn })
            case "aws:ssm/maintenanceWindowTask:MaintenanceWindowTask":
                return new MaintenanceWindowTask(name, <any>undefined, { urn })
            case "aws:ssm/parameter:Parameter":
                return new Parameter(name, <any>undefined, { urn })
            case "aws:ssm/patchBaseline:PatchBaseline":
                return new PatchBaseline(name, <any>undefined, { urn })
            case "aws:ssm/patchGroup:PatchGroup":
                return new PatchGroup(name, <any>undefined, { urn })
            case "aws:ssm/resourceDataSync:ResourceDataSync":
                return new ResourceDataSync(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("aws", "ssm/activation", _module)
pulumi.runtime.registerResourceModule("aws", "ssm/association", _module)
pulumi.runtime.registerResourceModule("aws", "ssm/document", _module)
pulumi.runtime.registerResourceModule("aws", "ssm/maintenanceWindow", _module)
pulumi.runtime.registerResourceModule("aws", "ssm/maintenanceWindowTarget", _module)
pulumi.runtime.registerResourceModule("aws", "ssm/maintenanceWindowTask", _module)
pulumi.runtime.registerResourceModule("aws", "ssm/parameter", _module)
pulumi.runtime.registerResourceModule("aws", "ssm/patchBaseline", _module)
pulumi.runtime.registerResourceModule("aws", "ssm/patchGroup", _module)
pulumi.runtime.registerResourceModule("aws", "ssm/resourceDataSync", _module)
