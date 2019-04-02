
package com.airhacks.ping.boundary;

import javax.json.Json;
import javax.json.JsonObject;

/**
 *
 * @author airhacks.com
 */
public class Ping {

    private String name;
    private String aljoscha;

    public Ping(String name) {
        this.name = name;
    }

    public JsonObject toJson() {
        return Json.createObjectBuilder().
                add("name", this.name).
                build();
    }

    public JsonObject heavyAljoscha() {
        return Json.createObjectBuilder(this.toJson()).add("aljoscha", this.aljoscha).build();
    }


}
