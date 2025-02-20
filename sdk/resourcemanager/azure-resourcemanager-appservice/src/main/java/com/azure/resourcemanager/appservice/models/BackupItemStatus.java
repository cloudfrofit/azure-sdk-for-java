// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Backup status. */
public enum BackupItemStatus {
    /** Enum value InProgress. */
    IN_PROGRESS("InProgress"),

    /** Enum value Failed. */
    FAILED("Failed"),

    /** Enum value Succeeded. */
    SUCCEEDED("Succeeded"),

    /** Enum value TimedOut. */
    TIMED_OUT("TimedOut"),

    /** Enum value Created. */
    CREATED("Created"),

    /** Enum value Skipped. */
    SKIPPED("Skipped"),

    /** Enum value PartiallySucceeded. */
    PARTIALLY_SUCCEEDED("PartiallySucceeded"),

    /** Enum value DeleteInProgress. */
    DELETE_IN_PROGRESS("DeleteInProgress"),

    /** Enum value DeleteFailed. */
    DELETE_FAILED("DeleteFailed"),

    /** Enum value Deleted. */
    DELETED("Deleted");

    /** The actual serialized value for a BackupItemStatus instance. */
    private final String value;

    BackupItemStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a BackupItemStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed BackupItemStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static BackupItemStatus fromString(String value) {
        if (value == null) {
            return null;
        }
        BackupItemStatus[] items = BackupItemStatus.values();
        for (BackupItemStatus item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
