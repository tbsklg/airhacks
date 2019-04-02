
package com.airhacks.ping.boundary;

import java.time.temporal.ChronoUnit;
import javax.inject.Inject;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.faulttolerance.Bulkhead;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.Retry;
import org.eclipse.microprofile.faulttolerance.Timeout;

/**
 *
 * @author airhacks.com
 */
public class DBExtraction {

    @Inject
    @ConfigProperty(name = "DB_LOCATION", defaultValue = "oracle")
    String dbLocation;

    @Timeout(unit = ChronoUnit.SECONDS, value = 5)
    @Retry(maxRetries = 2)
    @Fallback(fallbackMethod = "extractFromFile")
    @Bulkhead(waitingTaskQueue = 10, value = 2)

    public void extractSaveAndZipTenMegs() {
        System.out.println("-- extracting from " + this.dbLocation);
        throw new IllegalStateException("DB not available today");
    }

    public void extractFromFile() {
        System.out.println("--- extraction");
    }


}
