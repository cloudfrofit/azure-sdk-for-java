// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.fluent.models.ReissueCertificateOrderRequestProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Class representing certificate reissue request. */
@Fluent
public final class ReissueCertificateOrderRequest extends ProxyOnlyResource {
    /*
     * ReissueCertificateOrderRequest resource specific properties
     */
    @JsonProperty(value = "properties")
    private ReissueCertificateOrderRequestProperties innerProperties;

    /** Creates an instance of ReissueCertificateOrderRequest class. */
    public ReissueCertificateOrderRequest() {
    }

    /**
     * Get the innerProperties property: ReissueCertificateOrderRequest resource specific properties.
     *
     * @return the innerProperties value.
     */
    private ReissueCertificateOrderRequestProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public ReissueCertificateOrderRequest withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the keySize property: Certificate Key Size.
     *
     * @return the keySize value.
     */
    public Integer keySize() {
        return this.innerProperties() == null ? null : this.innerProperties().keySize();
    }

    /**
     * Set the keySize property: Certificate Key Size.
     *
     * @param keySize the keySize value to set.
     * @return the ReissueCertificateOrderRequest object itself.
     */
    public ReissueCertificateOrderRequest withKeySize(Integer keySize) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReissueCertificateOrderRequestProperties();
        }
        this.innerProperties().withKeySize(keySize);
        return this;
    }

    /**
     * Get the delayExistingRevokeInHours property: Delay in hours to revoke existing certificate after the new
     * certificate is issued.
     *
     * @return the delayExistingRevokeInHours value.
     */
    public Integer delayExistingRevokeInHours() {
        return this.innerProperties() == null ? null : this.innerProperties().delayExistingRevokeInHours();
    }

    /**
     * Set the delayExistingRevokeInHours property: Delay in hours to revoke existing certificate after the new
     * certificate is issued.
     *
     * @param delayExistingRevokeInHours the delayExistingRevokeInHours value to set.
     * @return the ReissueCertificateOrderRequest object itself.
     */
    public ReissueCertificateOrderRequest withDelayExistingRevokeInHours(Integer delayExistingRevokeInHours) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReissueCertificateOrderRequestProperties();
        }
        this.innerProperties().withDelayExistingRevokeInHours(delayExistingRevokeInHours);
        return this;
    }

    /**
     * Get the csr property: Csr to be used for re-key operation.
     *
     * @return the csr value.
     */
    public String csr() {
        return this.innerProperties() == null ? null : this.innerProperties().csr();
    }

    /**
     * Set the csr property: Csr to be used for re-key operation.
     *
     * @param csr the csr value to set.
     * @return the ReissueCertificateOrderRequest object itself.
     */
    public ReissueCertificateOrderRequest withCsr(String csr) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReissueCertificateOrderRequestProperties();
        }
        this.innerProperties().withCsr(csr);
        return this;
    }

    /**
     * Get the isPrivateKeyExternal property: Should we change the ASC type (from managed private key to external
     * private key and vice versa).
     *
     * @return the isPrivateKeyExternal value.
     */
    public Boolean isPrivateKeyExternal() {
        return this.innerProperties() == null ? null : this.innerProperties().isPrivateKeyExternal();
    }

    /**
     * Set the isPrivateKeyExternal property: Should we change the ASC type (from managed private key to external
     * private key and vice versa).
     *
     * @param isPrivateKeyExternal the isPrivateKeyExternal value to set.
     * @return the ReissueCertificateOrderRequest object itself.
     */
    public ReissueCertificateOrderRequest withIsPrivateKeyExternal(Boolean isPrivateKeyExternal) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReissueCertificateOrderRequestProperties();
        }
        this.innerProperties().withIsPrivateKeyExternal(isPrivateKeyExternal);
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
