
package com.airhacks.ping.boundary;

import javax.json.bind.annotation.JsonbProperty;

/**
 *
 * @author airhacks.com
 */
public class Ping {

    /**
     * overridden: {"hugo":"hello from
     * airport","proxyClass":"com.airhacks.ping.boundary.Pingy$Proxy$_$$_Weld$EnterpriseProxy$"}
     */
    @JsonbProperty("hugo")
    public String message;
    public String proxyClass;

    public Ping(String message, String proxyClass) {
        this.message = message;
        this.proxyClass = proxyClass;
    }
}
