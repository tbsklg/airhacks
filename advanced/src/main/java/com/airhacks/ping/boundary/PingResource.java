package com.airhacks.ping.boundary;

import java.security.Principal;
import javax.inject.Inject;
import javax.json.JsonObject;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;

/**
 *
 * @author airhacks.com
 */
@Path("ping")
public class PingResource {

    @Inject
    Principal user;

    @GET
    public JsonObject ping() {
        return new Ping("duke").toJson();
    }

    @GET
    @Path("picture")
    //@RolesAllowed("chief")
    public String picture(@Context HttpHeaders headers) {
        System.out.println("-- = " + this.user);
        JsonbConfig config = new JsonbConfig().
                withPropertyVisibilityStrategy(new AljoschaStrategy(false));

        Jsonb jsonb = JsonbBuilder.newBuilder().
                withConfig(config).
                build();

        return jsonb.toJson(new Picture("aljoscha", 42, "nice face"));

    }


}
