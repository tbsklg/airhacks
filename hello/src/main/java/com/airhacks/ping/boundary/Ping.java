
package com.airhacks.ping.boundary;

import javax.json.bind.annotation.JsonbProperty;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 *
 * @author airhacks.com
 */
@Entity
@NamedQuery(name = "all", query = "SELECT p from Ping p")
public class Ping {

    /**
     * overridden: {"hugo":"hello from
     * airport","proxyClass":"com.airhacks.ping.boundary.Pingy$Proxy$_$$_Weld$EnterpriseProxy$"}
     */
    @JsonbProperty("hugo")
    public String message;
    public String proxyClass;

    @Id
    @GeneratedValue
    private long idKey;

    public Ping() {
    }


    public Ping(String message, String proxyClass) {
        this.message = message;
        this.proxyClass = proxyClass;
    }

    @Override
    public String toString() {
        return "Ping{" + "message=" + message + ", proxyClass=" + proxyClass + ", idKey=" + idKey + '}';
    }

}
