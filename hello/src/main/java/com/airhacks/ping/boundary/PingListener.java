
package com.airhacks.ping.boundary;

import javax.enterprise.event.Observes;
import javax.enterprise.event.TransactionPhase;

/**
 *
 * @author airhacks.com
 */
public class PingListener {

    public void onSuccessfulPing(@Observes(during = TransactionPhase.AFTER_SUCCESS) Ping ping) {
        System.out.println("++ " + ping);
    }

    public void onFailedPing(@Observes(during = TransactionPhase.AFTER_FAILURE) Ping ping) {
        System.out.println("-- " + ping);
    }


}
