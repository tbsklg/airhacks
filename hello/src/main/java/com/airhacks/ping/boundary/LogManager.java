
package com.airhacks.ping.boundary;

import java.util.logging.Logger;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

/**
 *
 * @author airhacks.com
 */
public class LogManager {

    @Produces
    public Logger configure(InjectionPoint ip) {
        String name = ip.getMember().getName();
        return Logger.getLogger(name);
    }


}
