
package com.airhacks.ping.boundary;

import javax.ejb.Stateless;

/**
 *
 * @author airhacks.com
 */
@Stateless
public class Pingy {

    public String pingMe() {
        return "hello from airport";
    }

}
