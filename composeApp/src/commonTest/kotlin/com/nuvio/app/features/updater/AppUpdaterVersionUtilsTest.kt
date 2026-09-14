package com.nuvio.app.features.updater

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class AppUpdaterVersionUtilsTest {
    @Test
    fun comparesNumericVersionPartsInsteadOfTextOrder() {
        assertTrue(VersionUtils.compareVersions("0.1.23-personal.10", "0.1.23-personal.9") > 0)
        assertTrue(VersionUtils.isRemoteNewer("0.1.24-personal.1", "0.1.23-personal.99"))
        assertFalse(VersionUtils.isRemoteNewer("0.1.23-personal.9", "0.1.23-personal.10"))
        assertEquals(0, VersionUtils.compareVersions("v0.1.23", "0.1.23"))
    }
}
