// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package directoryservice

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "aws:directoryservice/conditionalForwader:ConditionalForwader":
		r = &ConditionalForwader{}
	case "aws:directoryservice/directory:Directory":
		r = &Directory{}
	case "aws:directoryservice/logService:LogService":
		r = &LogService{}
	case "aws:directoryservice/sharedDirectory:SharedDirectory":
		r = &SharedDirectory{}
	case "aws:directoryservice/sharedDirectoryAccepter:SharedDirectoryAccepter":
		r = &SharedDirectoryAccepter{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

func init() {
	version, err := aws.PkgVersion()
	if err != nil {
		version = semver.Version{Major: 1}
	}
	pulumi.RegisterResourceModule(
		"aws",
		"directoryservice/conditionalForwader",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"directoryservice/directory",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"directoryservice/logService",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"directoryservice/sharedDirectory",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"directoryservice/sharedDirectoryAccepter",
		&module{version},
	)
}
