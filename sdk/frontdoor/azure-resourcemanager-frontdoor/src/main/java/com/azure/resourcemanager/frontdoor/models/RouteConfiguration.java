// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Base class for all types of Route. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "@odata.type",
    defaultImpl = RouteConfiguration.class)
@JsonTypeName("RouteConfiguration")
@JsonSubTypes({
    @JsonSubTypes.Type(
        name = "#Microsoft.Azure.FrontDoor.Models.FrontdoorForwardingConfiguration",
        value = ForwardingConfiguration.class),
    @JsonSubTypes.Type(
        name = "#Microsoft.Azure.FrontDoor.Models.FrontdoorRedirectConfiguration",
        value = RedirectConfiguration.class)
})
@Immutable
public class RouteConfiguration {
    /** Creates an instance of RouteConfiguration class. */
    public RouteConfiguration() {
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
