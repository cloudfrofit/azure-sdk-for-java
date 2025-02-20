// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated;

import com.azure.core.util.Context;

/** Samples for QueryKeys ListBySearchService. */
public final class QueryKeysListBySearchServiceSamples {
    /*
     * x-ms-original-file: specification/search/resource-manager/Microsoft.Search/stable/2020-08-01/examples/SearchListQueryKeysBySearchService.json
     */
    /**
     * Sample code: SearchListQueryKeysBySearchService.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void searchListQueryKeysBySearchService(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .searchServices()
            .manager()
            .serviceClient()
            .getQueryKeys()
            .listBySearchService("rg1", "mysearchservice", null, Context.NONE);
    }
}
