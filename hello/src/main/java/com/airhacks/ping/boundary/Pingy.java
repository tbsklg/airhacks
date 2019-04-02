
package com.airhacks.ping.boundary;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author airhacks.com
 */
//@Interceptors(CallTracer.class)
@Stateless
//@RequestScoped
public class Pingy {

    @PersistenceContext
    EntityManager em;

    @PostConstruct
    public void init() {
        System.out.println("--- initialized");
    }


    public void save(Ping ping) {
        this.em.merge(ping);
    }

    public List<Ping> all() {
        return this.em.createNamedQuery("all", Ping.class).getResultList();
    }


}
