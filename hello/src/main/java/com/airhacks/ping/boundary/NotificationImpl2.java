
package com.airhacks.ping.boundary;

/**
 *
 * @author airhacks.com
 */
public class NotificationImpl2 implements Notification {

    @Override
    public void send(String message) {
        System.out.println("--2 " + message);
    }


}
