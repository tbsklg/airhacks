package com.airhacks.ping.boundary;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author airhacks.com
 */
@Path("ping")
public class PingResource {

    @Inject
    Pingy pingy;

    @GET
    public Ping ping() {
        return new Ping(this.pingy.pingMe(), this.pingy.getClass().getName());
    }

}
