package com.airhacks.ping.boundary;

import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import org.eclipse.microprofile.metrics.annotation.Metered;

/**
 *
 * @author airhacks.com
 */
@Stateless
@Path("/ping")
public class PingResource {

    @Inject
    Pingy pingy;

    @Inject
    DoesntMatter matter;

    @Inject
    Event<Ping> listeners;

    @Inject
    String duke;

    @Inject
    String hugo;

    @Inject
    Logger LOG;

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
    @Metered
    public void save(Ping ping) {
        LOG.info("I'm injected");
        System.out.println("-- " + this.duke + " " + this.hugo);
        listeners.fire(ping);
        this.pingy.save(ping);
        matter.save();

    }


}
