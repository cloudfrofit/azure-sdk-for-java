// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.desktopvirtualization.models.LogSpecification;
import com.azure.resourcemanager.desktopvirtualization.models.ServiceSpecification;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ServiceSpecificationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServiceSpecification model =
            BinaryData
                .fromString(
                    "{\"logSpecifications\":[{\"name\":\"okjye\",\"displayName\":\"kvnipjoxz\",\"blobDuration\":\"chgejspodm\"},{\"name\":\"lzydehojwyahux\",\"displayName\":\"pmqnja\",\"blobDuration\":\"ixjsprozvcputeg\"}]}")
                .toObject(ServiceSpecification.class);
        Assertions.assertEquals("okjye", model.logSpecifications().get(0).name());
        Assertions.assertEquals("kvnipjoxz", model.logSpecifications().get(0).displayName());
        Assertions.assertEquals("chgejspodm", model.logSpecifications().get(0).blobDuration());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServiceSpecification model =
            new ServiceSpecification()
                .withLogSpecifications(
                    Arrays
                        .asList(
                            new LogSpecification()
                                .withName("okjye")
                                .withDisplayName("kvnipjoxz")
                                .withBlobDuration("chgejspodm"),
                            new LogSpecification()
                                .withName("lzydehojwyahux")
                                .withDisplayName("pmqnja")
                                .withBlobDuration("ixjsprozvcputeg")));
        model = BinaryData.fromObject(model).toObject(ServiceSpecification.class);
        Assertions.assertEquals("okjye", model.logSpecifications().get(0).name());
        Assertions.assertEquals("kvnipjoxz", model.logSpecifications().get(0).displayName());
        Assertions.assertEquals("chgejspodm", model.logSpecifications().get(0).blobDuration());
    }
}
