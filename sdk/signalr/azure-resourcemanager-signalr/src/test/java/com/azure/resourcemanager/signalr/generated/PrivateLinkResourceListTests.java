// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.signalr.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.signalr.models.PrivateLinkResourceList;
import com.azure.resourcemanager.signalr.models.ShareablePrivateLinkResourceProperties;
import com.azure.resourcemanager.signalr.models.ShareablePrivateLinkResourceType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkResourceListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkResourceList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"groupId\":\"ceamtm\",\"requiredMembers\":[\"o\"],\"requiredZoneNames\":[\"wcw\"],\"shareablePrivateLinkResourceTypes\":[{\"name\":\"knssxmojm\",\"properties\":{}},{\"name\":\"kjprvk\",\"properties\":{}},{\"name\":\"zqljyxgtczh\",\"properties\":{}}]},\"id\":\"dbsdshm\",\"name\":\"xmaehvbbxu\",\"type\":\"iplt\"},{\"properties\":{\"groupId\":\"tbaxk\",\"requiredMembers\":[\"wrck\",\"yklyhpluodpvruud\"],\"requiredZoneNames\":[\"ibthostgktstvd\"],\"shareablePrivateLinkResourceTypes\":[{\"name\":\"zedqbcvhzlhplo\",\"properties\":{}},{\"name\":\"dlwwqfbumlkxt\",\"properties\":{}},{\"name\":\"fsmlmbtxhwgfw\",\"properties\":{}}]},\"id\":\"tawc\",\"name\":\"ezbrhubskh\",\"type\":\"dyg\"}],\"nextLink\":\"okkqfqjbvleo\"}")
                .toObject(PrivateLinkResourceList.class);
        Assertions.assertEquals("ceamtm", model.value().get(0).groupId());
        Assertions.assertEquals("o", model.value().get(0).requiredMembers().get(0));
        Assertions.assertEquals("wcw", model.value().get(0).requiredZoneNames().get(0));
        Assertions.assertEquals("knssxmojm", model.value().get(0).shareablePrivateLinkResourceTypes().get(0).name());
        Assertions.assertEquals("okkqfqjbvleo", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkResourceList model =
            new PrivateLinkResourceList()
                .withValue(
                    Arrays
                        .asList(
                            new PrivateLinkResourceInner()
                                .withGroupId("ceamtm")
                                .withRequiredMembers(Arrays.asList("o"))
                                .withRequiredZoneNames(Arrays.asList("wcw"))
                                .withShareablePrivateLinkResourceTypes(
                                    Arrays
                                        .asList(
                                            new ShareablePrivateLinkResourceType()
                                                .withName("knssxmojm")
                                                .withProperties(new ShareablePrivateLinkResourceProperties()),
                                            new ShareablePrivateLinkResourceType()
                                                .withName("kjprvk")
                                                .withProperties(new ShareablePrivateLinkResourceProperties()),
                                            new ShareablePrivateLinkResourceType()
                                                .withName("zqljyxgtczh")
                                                .withProperties(new ShareablePrivateLinkResourceProperties()))),
                            new PrivateLinkResourceInner()
                                .withGroupId("tbaxk")
                                .withRequiredMembers(Arrays.asList("wrck", "yklyhpluodpvruud"))
                                .withRequiredZoneNames(Arrays.asList("ibthostgktstvd"))
                                .withShareablePrivateLinkResourceTypes(
                                    Arrays
                                        .asList(
                                            new ShareablePrivateLinkResourceType()
                                                .withName("zedqbcvhzlhplo")
                                                .withProperties(new ShareablePrivateLinkResourceProperties()),
                                            new ShareablePrivateLinkResourceType()
                                                .withName("dlwwqfbumlkxt")
                                                .withProperties(new ShareablePrivateLinkResourceProperties()),
                                            new ShareablePrivateLinkResourceType()
                                                .withName("fsmlmbtxhwgfw")
                                                .withProperties(new ShareablePrivateLinkResourceProperties())))))
                .withNextLink("okkqfqjbvleo");
        model = BinaryData.fromObject(model).toObject(PrivateLinkResourceList.class);
        Assertions.assertEquals("ceamtm", model.value().get(0).groupId());
        Assertions.assertEquals("o", model.value().get(0).requiredMembers().get(0));
        Assertions.assertEquals("wcw", model.value().get(0).requiredZoneNames().get(0));
        Assertions.assertEquals("knssxmojm", model.value().get(0).shareablePrivateLinkResourceTypes().get(0).name());
        Assertions.assertEquals("okkqfqjbvleo", model.nextLink());
    }
}
