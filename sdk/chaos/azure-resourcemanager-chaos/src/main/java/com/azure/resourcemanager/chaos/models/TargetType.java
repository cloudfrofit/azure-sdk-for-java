// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.chaos.fluent.models.TargetTypeInner;
import java.util.List;

/** An immutable client-side representation of TargetType. */
public interface TargetType {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: The system metadata properties of the target type resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the location property: Location of the Target Type resource.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the displayName property: Localized string of the display name.
     *
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the description property: Localized string of the description.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the propertiesSchema property: URL to retrieve JSON schema of the Target Type properties.
     *
     * @return the propertiesSchema value.
     */
    String propertiesSchema();

    /**
     * Gets the resourceTypes property: List of resource types this Target Type can extend.
     *
     * @return the resourceTypes value.
     */
    List<String> resourceTypes();

    /**
     * Gets the inner com.azure.resourcemanager.chaos.fluent.models.TargetTypeInner object.
     *
     * @return the inner object.
     */
    TargetTypeInner innerModel();
}
