package com.airhacks.ping.boundary;

import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;

/**
 *
 * @author airhacks.com
 */
@Path("ping")
public class PingResource {

    @Inject
    PingProvider provider;

    @GET
    public void ping(@Suspended AsyncResponse response) {
        response.setTimeout(2, TimeUnit.SECONDS);
        provider.nextPing().thenApply(this::transform).thenAccept(response::resume);

    }

    String transform(String input) {
        return "+++ " + input + "+++";
    }

}
