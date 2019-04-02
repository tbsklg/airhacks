package com.airhacks.ping.boundary;

import static java.util.concurrent.CompletableFuture.supplyAsync;
import java.util.function.Consumer;
import java.util.function.Supplier;
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

        Supplier<String> supplier = provider::nextPing;
        Consumer<String> consumer = response::resume;

        supplyAsync(supplier, mes).thenAccept(consumer);
    }

}
