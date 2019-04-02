
package com.airhacks.ping.boundary;

/**
 *
 * @author airhacks.com
 */
@Age(Age.Time.RECENT)
public class NotificationImpl2 implements Notification {

    @Override
    public void send(String message) {
        System.out.println("recent --2 " + message);
    }


}
