
package com.airhacks.ping.boundary;

import javax.enterprise.event.Observes;
import javax.enterprise.event.TransactionPhase;
import javax.inject.Inject;
import org.eclipse.microprofile.metrics.MetricRegistry;
import org.eclipse.microprofile.metrics.annotation.RegistryType;

/**
 *
 * @author airhacks.com
 */
public class PingListener {

    @Inject
    @RegistryType(type = MetricRegistry.Type.APPLICATION)
    MetricRegistry registry;

    public void onSuccessfulPing(@Observes(during = TransactionPhase.AFTER_SUCCESS) Ping ping) {
        registry.counter("ping_created").inc();
        System.out.println("++ " + ping);
    }

    public void onFailedPing(@Observes(during = TransactionPhase.AFTER_FAILURE) Ping ping) {
        registry.counter("ping_failed").inc();
        System.out.println("-- " + ping);
    }


}
