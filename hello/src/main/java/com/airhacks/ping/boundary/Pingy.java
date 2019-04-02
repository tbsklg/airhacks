
package com.airhacks.ping.boundary;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author airhacks.com
 */
//@Interceptors(CallTracer.class)
@Stateless
public class Pingy {

    @PersistenceContext
    EntityManager em;

    @Inject
    Notification notification;

    @PostConstruct
    public void init() {
        System.out.println("--- initialized");
    }


    public void save(Ping ping) {
        this.em.merge(ping);
        //jdbc.searchForPing

        // --> DB
        //this.em.flush();
        // <-- DB
        //this.em.refresh(ping);

        ping.message = "new content " + System.currentTimeMillis();
        notification.send("hey joe");
    }
    //tx.commit

    public List<Ping> all() {
        return this.em.createNamedQuery("all", Ping.class).getResultList();
    }



}
