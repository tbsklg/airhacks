
package com.airhacks.ping.boundary;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *
 * @author airhacks.com
 */
@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
@Startup
@Singleton
public class CacheRefresher {

    private Map<String, String> cache;

    @PostConstruct
    public void init() {
        this.cache = new ConcurrentHashMap<>();
        System.out.println("initialized at the very beginning!");
    }

    @Schedule(second = "*/1", minute = "*", hour = "*")
    public void refreshCache() {
        System.out.println("--- " + new Date());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(CacheRefresher.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Woke up!");
    }


}
