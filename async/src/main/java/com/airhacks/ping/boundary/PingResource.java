package com.airhacks.ping.boundary;

import static java.util.concurrent.CompletableFuture.supplyAsync;
import java.util.concurrent.TimeUnit;
import javax.annotation.Resource;
import javax.enterprise.concurrent.ManagedExecutorService;
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

    @Resource
    ManagedExecutorService mes;

    @GET
    public void ping(@Suspended AsyncResponse response) {
        response.setTimeout(2, TimeUnit.SECONDS);
        supplyAsync(provider::nextPing, mes).
                thenApply(this::transform).
                thenAccept(response::resume);
    }

    String transform(String input) {
        return "+++ " + input + "+++";
    }

}
