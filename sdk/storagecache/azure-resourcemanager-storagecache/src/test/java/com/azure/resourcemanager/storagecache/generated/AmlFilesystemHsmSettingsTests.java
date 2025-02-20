// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagecache.models.AmlFilesystemHsmSettings;
import org.junit.jupiter.api.Assertions;

public final class AmlFilesystemHsmSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AmlFilesystemHsmSettings model =
            BinaryData
                .fromString(
                    "{\"container\":\"jgzjaoyfhrtx\",\"loggingContainer\":\"lnerkujysvleju\",\"importPrefix\":\"qawrlyxwj\"}")
                .toObject(AmlFilesystemHsmSettings.class);
        Assertions.assertEquals("jgzjaoyfhrtx", model.container());
        Assertions.assertEquals("lnerkujysvleju", model.loggingContainer());
        Assertions.assertEquals("qawrlyxwj", model.importPrefix());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AmlFilesystemHsmSettings model =
            new AmlFilesystemHsmSettings()
                .withContainer("jgzjaoyfhrtx")
                .withLoggingContainer("lnerkujysvleju")
                .withImportPrefix("qawrlyxwj");
        model = BinaryData.fromObject(model).toObject(AmlFilesystemHsmSettings.class);
        Assertions.assertEquals("jgzjaoyfhrtx", model.container());
        Assertions.assertEquals("lnerkujysvleju", model.loggingContainer());
        Assertions.assertEquals("qawrlyxwj", model.importPrefix());
    }
}
