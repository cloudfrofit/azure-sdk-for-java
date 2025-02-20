// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.ArmIdWrapper;
import com.azure.resourcemanager.appservice.models.PrivateLinkConnectionState;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Remote Private Endpoint Connection ARM resource. */
@Fluent
public final class RemotePrivateEndpointConnectionArmResourceInner extends ProxyOnlyResource {
    /*
     * RemotePrivateEndpointConnectionARMResource resource specific properties
     */
    @JsonProperty(value = "properties")
    private RemotePrivateEndpointConnectionArmResourceProperties innerProperties;

    /** Creates an instance of RemotePrivateEndpointConnectionArmResourceInner class. */
    public RemotePrivateEndpointConnectionArmResourceInner() {
    }

    /**
     * Get the innerProperties property: RemotePrivateEndpointConnectionARMResource resource specific properties.
     *
     * @return the innerProperties value.
     */
    private RemotePrivateEndpointConnectionArmResourceProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public RemotePrivateEndpointConnectionArmResourceInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioningState property.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the privateEndpoint property: PrivateEndpoint of a remote private endpoint connection.
     *
     * @return the privateEndpoint value.
     */
    public ArmIdWrapper privateEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().privateEndpoint();
    }

    /**
     * Set the privateEndpoint property: PrivateEndpoint of a remote private endpoint connection.
     *
     * @param privateEndpoint the privateEndpoint value to set.
     * @return the RemotePrivateEndpointConnectionArmResourceInner object itself.
     */
    public RemotePrivateEndpointConnectionArmResourceInner withPrivateEndpoint(ArmIdWrapper privateEndpoint) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RemotePrivateEndpointConnectionArmResourceProperties();
        }
        this.innerProperties().withPrivateEndpoint(privateEndpoint);
        return this;
    }

    /**
     * Get the privateLinkServiceConnectionState property: The state of a private link connection.
     *
     * @return the privateLinkServiceConnectionState value.
     */
    public PrivateLinkConnectionState privateLinkServiceConnectionState() {
        return this.innerProperties() == null ? null : this.innerProperties().privateLinkServiceConnectionState();
    }

    /**
     * Set the privateLinkServiceConnectionState property: The state of a private link connection.
     *
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set.
     * @return the RemotePrivateEndpointConnectionArmResourceInner object itself.
     */
    public RemotePrivateEndpointConnectionArmResourceInner withPrivateLinkServiceConnectionState(
        PrivateLinkConnectionState privateLinkServiceConnectionState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RemotePrivateEndpointConnectionArmResourceProperties();
        }
        this.innerProperties().withPrivateLinkServiceConnectionState(privateLinkServiceConnectionState);
        return this;
    }

    /**
     * Get the ipAddresses property: Private IPAddresses mapped to the remote private endpoint.
     *
     * @return the ipAddresses value.
     */
    public List<String> ipAddresses() {
        return this.innerProperties() == null ? null : this.innerProperties().ipAddresses();
    }

    /**
     * Set the ipAddresses property: Private IPAddresses mapped to the remote private endpoint.
     *
     * @param ipAddresses the ipAddresses value to set.
     * @return the RemotePrivateEndpointConnectionArmResourceInner object itself.
     */
    public RemotePrivateEndpointConnectionArmResourceInner withIpAddresses(List<String> ipAddresses) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RemotePrivateEndpointConnectionArmResourceProperties();
        }
        this.innerProperties().withIpAddresses(ipAddresses);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
