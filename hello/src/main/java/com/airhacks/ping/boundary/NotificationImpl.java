
package com.airhacks.ping.boundary;

/**
 *
 * @author airhacks.com
 */
public class NotificationImpl implements Notification {

    @Override
    public void send(String message) {
        System.out.println("message = " + message);
    }

}
