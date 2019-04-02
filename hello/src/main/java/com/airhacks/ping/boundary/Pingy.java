
package com.airhacks.ping.boundary;

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


    public String pingMe() {
        this.em.merge(new Ping("to DB", "I dont know"));
        return "hello from airport";
    }

}
