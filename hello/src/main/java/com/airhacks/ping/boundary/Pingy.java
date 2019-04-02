
package com.airhacks.ping.boundary;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

/**
 *
 * @author airhacks.com
 */
//@Interceptors(CallTracer.class)
@Stateless
//@RequestScoped
public class Pingy {

    @PostConstruct
    public void init() {
        System.out.println("--- initialized");
    }


    public String pingMe() {
        return "hello from airport";
    }

}
