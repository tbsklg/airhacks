
package com.airhacks.ping.boundary;

/**
 *
 * @author airhacks.com
 */
@Age(Age.Time.OLD)
public class NotificationImpl implements Notification {

    @Override
    public void send(String message) {
        System.out.println("old message = " + message);
    }

}
