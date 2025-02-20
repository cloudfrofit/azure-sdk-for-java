// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.phonenumbers.implementation.models;

import com.azure.communication.phonenumbers.CodeCoverageAnnotation.Generated;
import com.azure.communication.phonenumbers.models.PurchasedPhoneNumber;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PurchasedPhoneNumbers model. */
@Fluent
@Generated
public final class PurchasedPhoneNumbers {
    /*
     * Represents a list of phone numbers.
     */
    @JsonProperty(value = "phoneNumbers", required = true)
    private List<PurchasedPhoneNumber> phoneNumbers;

    /*
     * Represents the URL link to the next page of phone number results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the phoneNumbers property: Represents a list of phone numbers.
     *
     * @return the phoneNumbers value.
     */
    public List<PurchasedPhoneNumber> getPhoneNumbers() {
        return this.phoneNumbers;
    }

    /**
     * Set the phoneNumbers property: Represents a list of phone numbers.
     *
     * @param phoneNumbers the phoneNumbers value to set.
     * @return the PurchasedPhoneNumbers object itself.
     */
    public PurchasedPhoneNumbers setPhoneNumbers(List<PurchasedPhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }

    /**
     * Get the nextLink property: Represents the URL link to the next page of phone number results.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Represents the URL link to the next page of phone number results.
     *
     * @param nextLink the nextLink value to set.
     * @return the PurchasedPhoneNumbers object itself.
     */
    public PurchasedPhoneNumbers setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
