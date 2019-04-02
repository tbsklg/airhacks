
package com.airhacks.ping.boundary;

import javax.enterprise.inject.Alternative;

/**
 *
 * @author airhacks.com
 */
@Alternative
public class NotificationImpl implements Notification {

    @Override
    public void send(String message) {
        System.out.println("message = " + message);
    }

}
