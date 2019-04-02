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
    public String ping() {

        return this.pingy.pingMe() + " with  " + this.pingy.getClass().getName();
    }

}
