package com.airhacks.ping.boundary;

import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author airhacks.com
 */
@Path("ping")
public class PingResource {

    @GET
    public JsonObject ping() {
        return new Ping("duke").toJson();
    }

}
