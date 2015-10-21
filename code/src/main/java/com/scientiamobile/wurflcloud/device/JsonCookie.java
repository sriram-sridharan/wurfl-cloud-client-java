/**
 * Copyright (c) 2015 ScientiaMobile Inc.
 *
 * The WURFL Cloud Client is intended to be used in both open-source and
 * commercial environments. To allow its use in as many situations as possible,
 * the WURFL Cloud Client is dual-licensed. You may choose to use the WURFL
 * Cloud Client under either the GNU GENERAL PUBLIC LICENSE, Version 2.0, or
 * the MIT License.
 *
 * Refer to the COPYING.txt file distributed with this package.
 */
package com.scientiamobile.wurflcloud.device;

import java.util.HashMap;
import java.util.Map;

/**
 * Bean serialized from/to a cookie.
 */
public class JsonCookie {
    private Map<String, Object> capabilities;
    private long date_set;
    private String id;

    /**
     * Gets the capability map.
     * @return The capability map
     */
    public Map<String, Object> getCapabilities() {
        return capabilities;
    }

    /**
     * Sets the capability map
     * @param capabilities The new capability map
     */
    public void setCapabilities(HashMap<String, Object> capabilities) {
        this.capabilities = capabilities;
    }

    public long getDate_set() {
        return date_set;
    }

    public void setDate_set(long date_set) {
        this.date_set = date_set;
    }

    /**
     * Gets the stored cookie identifier
     * @return The cookie identifier
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the cookie identifier
     * @param id The cookie identifier
     */
    public void setId(String id) {
        this.id = id;
    }
}
