
package com.airhacks.ping.boundary;

/**
 *
 * @author airhacks.com
 */
public class PingProvider {

    public String nextPing() {
        return "ping " + System.currentTimeMillis();
    }

}
