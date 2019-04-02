package com.airhacks.ping.boundary;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 *
 * @author airhacks.com
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
@Path("ping")
public class PingResource {

    @Inject
    Pingy pingy;

    @Inject
    DoesntMatter matter;

    @Inject
    Event<Ping> listeners;

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
        listeners.fire(ping);
        this.pingy.save(ping);
        matter.save();

    }


}
