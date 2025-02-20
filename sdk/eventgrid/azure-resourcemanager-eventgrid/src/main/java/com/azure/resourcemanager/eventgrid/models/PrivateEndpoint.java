// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PrivateEndpoint information. */
@Fluent
public final class PrivateEndpoint {
    /*
     * The ARM identifier for Private Endpoint.
     */
    @JsonProperty(value = "id")
    private String id;

    /** Creates an instance of PrivateEndpoint class. */
    public PrivateEndpoint() {
    }

    /**
     * Get the id property: The ARM identifier for Private Endpoint.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The ARM identifier for Private Endpoint.
     *
     * @param id the id value to set.
     * @return the PrivateEndpoint object itself.
     */
    public PrivateEndpoint withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
