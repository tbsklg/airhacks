package com.airhacks.ping.boundary;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
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
    public List<Ping> ping() {
        return this.pingy.all();
    }

    @GET
    @Path("sample")
    public Ping sample() {
        return new Ping("m", "p");
    }


    @POST
    public void save(Ping ping) {
        this.pingy.save(ping);
    }


}
