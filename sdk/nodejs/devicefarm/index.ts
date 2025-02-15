// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export * from "./devicePool";
export * from "./instanceProfile";
export * from "./networkProfile";
export * from "./project";
export * from "./testGridProject";
export * from "./upload";

// Import resources to register:
import { DevicePool } from "./devicePool";
import { InstanceProfile } from "./instanceProfile";
import { NetworkProfile } from "./networkProfile";
import { Project } from "./project";
import { TestGridProject } from "./testGridProject";
import { Upload } from "./upload";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "aws:devicefarm/devicePool:DevicePool":
                return new DevicePool(name, <any>undefined, { urn })
            case "aws:devicefarm/instanceProfile:InstanceProfile":
                return new InstanceProfile(name, <any>undefined, { urn })
            case "aws:devicefarm/networkProfile:NetworkProfile":
                return new NetworkProfile(name, <any>undefined, { urn })
            case "aws:devicefarm/project:Project":
                return new Project(name, <any>undefined, { urn })
            case "aws:devicefarm/testGridProject:TestGridProject":
                return new TestGridProject(name, <any>undefined, { urn })
            case "aws:devicefarm/upload:Upload":
                return new Upload(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("aws", "devicefarm/devicePool", _module)
pulumi.runtime.registerResourceModule("aws", "devicefarm/instanceProfile", _module)
pulumi.runtime.registerResourceModule("aws", "devicefarm/networkProfile", _module)
pulumi.runtime.registerResourceModule("aws", "devicefarm/project", _module)
pulumi.runtime.registerResourceModule("aws", "devicefarm/testGridProject", _module)
pulumi.runtime.registerResourceModule("aws", "devicefarm/upload", _module)
