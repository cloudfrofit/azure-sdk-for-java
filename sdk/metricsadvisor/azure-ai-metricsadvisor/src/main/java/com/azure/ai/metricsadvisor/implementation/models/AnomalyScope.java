// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Anomaly scope. */
public final class AnomalyScope extends ExpandableStringEnum<AnomalyScope> {
    /** Static value All for AnomalyScope. */
    public static final AnomalyScope ALL = fromString("All");

    /** Static value Dimension for AnomalyScope. */
    public static final AnomalyScope DIMENSION = fromString("Dimension");

    /** Static value TopN for AnomalyScope. */
    public static final AnomalyScope TOPN = fromString("TopN");

    /**
     * Creates a new instance of AnomalyScope value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AnomalyScope() {}

    /**
     * Creates or finds a AnomalyScope from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AnomalyScope.
     */
    @JsonCreator
    public static AnomalyScope fromString(String name) {
        return fromString(name, AnomalyScope.class);
    }

    /**
     * Gets known AnomalyScope values.
     *
     * @return known AnomalyScope values.
     */
    public static Collection<AnomalyScope> values() {
        return values(AnomalyScope.class);
    }
}
