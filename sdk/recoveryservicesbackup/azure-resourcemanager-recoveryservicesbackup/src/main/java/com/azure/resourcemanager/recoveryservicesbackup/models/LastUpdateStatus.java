// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for LastUpdateStatus. */
public final class LastUpdateStatus extends ExpandableStringEnum<LastUpdateStatus> {
    /** Static value Invalid for LastUpdateStatus. */
    public static final LastUpdateStatus INVALID = fromString("Invalid");

    /** Static value NotEnabled for LastUpdateStatus. */
    public static final LastUpdateStatus NOT_ENABLED = fromString("NotEnabled");

    /** Static value PartiallySucceeded for LastUpdateStatus. */
    public static final LastUpdateStatus PARTIALLY_SUCCEEDED = fromString("PartiallySucceeded");

    /** Static value PartiallyFailed for LastUpdateStatus. */
    public static final LastUpdateStatus PARTIALLY_FAILED = fromString("PartiallyFailed");

    /** Static value Failed for LastUpdateStatus. */
    public static final LastUpdateStatus FAILED = fromString("Failed");

    /** Static value Succeeded for LastUpdateStatus. */
    public static final LastUpdateStatus SUCCEEDED = fromString("Succeeded");

    /** Static value Initialized for LastUpdateStatus. */
    public static final LastUpdateStatus INITIALIZED = fromString("Initialized");

    /** Static value FirstInitialization for LastUpdateStatus. */
    public static final LastUpdateStatus FIRST_INITIALIZATION = fromString("FirstInitialization");

    /**
     * Creates a new instance of LastUpdateStatus value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public LastUpdateStatus() {
    }

    /**
     * Creates or finds a LastUpdateStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LastUpdateStatus.
     */
    @JsonCreator
    public static LastUpdateStatus fromString(String name) {
        return fromString(name, LastUpdateStatus.class);
    }

    /**
     * Gets known LastUpdateStatus values.
     *
     * @return known LastUpdateStatus values.
     */
    public static Collection<LastUpdateStatus> values() {
        return values(LastUpdateStatus.class);
    }
}
