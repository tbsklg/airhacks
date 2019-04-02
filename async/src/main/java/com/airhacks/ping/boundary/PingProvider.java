
package com.airhacks.ping.boundary;

import java.util.concurrent.CompletionStage;
import java.util.concurrent.TimeUnit;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.enterprise.concurrent.ManagedExecutorService;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author airhacks.com
 */
public class PingProvider {

    @Resource
    ManagedExecutorService clientService;
    private Client client;

    @PostConstruct
    public void init() {
        this.client = ClientBuilder.newBuilder().
                connectTimeout(2, TimeUnit.SECONDS).
                readTimeout(2, TimeUnit.SECONDS).
                executorService(clientService).build();
    }


    public CompletionStage<String> nextPing() {
        return this.client.target("http://airhacks.com").
                request(MediaType.TEXT_PLAIN).rx().
                get(String.class);
    }

}
