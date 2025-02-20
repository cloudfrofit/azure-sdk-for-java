// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A reference to a certificate to be installed on compute nodes in a pool. This must exist inside the same account as
 * the pool.
 *
 * <p>Warning: This object is deprecated and will be removed after February, 2024. Please use the [Azure KeyVault
 * Extension](https://learn.microsoft.com/azure/batch/batch-certificate-migration-guide) instead.
 */
@Fluent
public final class CertificateReference {
    /*
     * The fully qualified ID of the certificate to install on the pool. This must be inside the same batch account as
     * the pool.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * The location of the certificate store on the compute node into which to install the certificate.
     *
     * The default value is currentUser. This property is applicable only for pools configured with Windows nodes (that
     * is, created with cloudServiceConfiguration, or with virtualMachineConfiguration using a Windows image
     * reference). For Linux compute nodes, the certificates are stored in a directory inside the task working
     * directory and an environment variable AZ_BATCH_CERTIFICATES_DIR is supplied to the task to query for this
     * location. For certificates with visibility of 'remoteUser', a 'certs' directory is created in the user's home
     * directory (e.g., /home/{user-name}/certs) and certificates are placed in that directory.
     */
    @JsonProperty(value = "storeLocation")
    private CertificateStoreLocation storeLocation;

    /*
     * The name of the certificate store on the compute node into which to install the certificate.
     *
     * This property is applicable only for pools configured with Windows nodes (that is, created with
     * cloudServiceConfiguration, or with virtualMachineConfiguration using a Windows image reference). Common store
     * names include: My, Root, CA, Trust, Disallowed, TrustedPeople, TrustedPublisher, AuthRoot, AddressBook, but any
     * custom store name can also be used. The default value is My.
     */
    @JsonProperty(value = "storeName")
    private String storeName;

    /*
     * Which user accounts on the compute node should have access to the private data of the certificate.
     */
    @JsonProperty(value = "visibility")
    private List<CertificateVisibility> visibility;

    /** Creates an instance of CertificateReference class. */
    public CertificateReference() {
    }

    /**
     * Get the id property: The fully qualified ID of the certificate to install on the pool. This must be inside the
     * same batch account as the pool.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The fully qualified ID of the certificate to install on the pool. This must be inside the
     * same batch account as the pool.
     *
     * @param id the id value to set.
     * @return the CertificateReference object itself.
     */
    public CertificateReference withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the storeLocation property: The location of the certificate store on the compute node into which to install
     * the certificate.
     *
     * <p>The default value is currentUser. This property is applicable only for pools configured with Windows nodes
     * (that is, created with cloudServiceConfiguration, or with virtualMachineConfiguration using a Windows image
     * reference). For Linux compute nodes, the certificates are stored in a directory inside the task working directory
     * and an environment variable AZ_BATCH_CERTIFICATES_DIR is supplied to the task to query for this location. For
     * certificates with visibility of 'remoteUser', a 'certs' directory is created in the user's home directory (e.g.,
     * /home/{user-name}/certs) and certificates are placed in that directory.
     *
     * @return the storeLocation value.
     */
    public CertificateStoreLocation storeLocation() {
        return this.storeLocation;
    }

    /**
     * Set the storeLocation property: The location of the certificate store on the compute node into which to install
     * the certificate.
     *
     * <p>The default value is currentUser. This property is applicable only for pools configured with Windows nodes
     * (that is, created with cloudServiceConfiguration, or with virtualMachineConfiguration using a Windows image
     * reference). For Linux compute nodes, the certificates are stored in a directory inside the task working directory
     * and an environment variable AZ_BATCH_CERTIFICATES_DIR is supplied to the task to query for this location. For
     * certificates with visibility of 'remoteUser', a 'certs' directory is created in the user's home directory (e.g.,
     * /home/{user-name}/certs) and certificates are placed in that directory.
     *
     * @param storeLocation the storeLocation value to set.
     * @return the CertificateReference object itself.
     */
    public CertificateReference withStoreLocation(CertificateStoreLocation storeLocation) {
        this.storeLocation = storeLocation;
        return this;
    }

    /**
     * Get the storeName property: The name of the certificate store on the compute node into which to install the
     * certificate.
     *
     * <p>This property is applicable only for pools configured with Windows nodes (that is, created with
     * cloudServiceConfiguration, or with virtualMachineConfiguration using a Windows image reference). Common store
     * names include: My, Root, CA, Trust, Disallowed, TrustedPeople, TrustedPublisher, AuthRoot, AddressBook, but any
     * custom store name can also be used. The default value is My.
     *
     * @return the storeName value.
     */
    public String storeName() {
        return this.storeName;
    }

    /**
     * Set the storeName property: The name of the certificate store on the compute node into which to install the
     * certificate.
     *
     * <p>This property is applicable only for pools configured with Windows nodes (that is, created with
     * cloudServiceConfiguration, or with virtualMachineConfiguration using a Windows image reference). Common store
     * names include: My, Root, CA, Trust, Disallowed, TrustedPeople, TrustedPublisher, AuthRoot, AddressBook, but any
     * custom store name can also be used. The default value is My.
     *
     * @param storeName the storeName value to set.
     * @return the CertificateReference object itself.
     */
    public CertificateReference withStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }

    /**
     * Get the visibility property: Which user accounts on the compute node should have access to the private data of
     * the certificate.
     *
     * @return the visibility value.
     */
    public List<CertificateVisibility> visibility() {
        return this.visibility;
    }

    /**
     * Set the visibility property: Which user accounts on the compute node should have access to the private data of
     * the certificate.
     *
     * @param visibility the visibility value to set.
     * @return the CertificateReference object itself.
     */
    public CertificateReference withVisibility(List<CertificateVisibility> visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property id in model CertificateReference"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CertificateReference.class);
}
