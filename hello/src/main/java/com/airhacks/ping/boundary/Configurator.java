
package com.airhacks.ping.boundary;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

/**
 *
 * @author airhacks.com
 */
public class Configurator {

    @Produces
    public String expose(InjectionPoint point) {
        Class<?> clazz = point.getMember().getDeclaringClass();
        String name = point.getMember().getName();
        return "hello " + clazz.getName() + " " + name;
    }

}
