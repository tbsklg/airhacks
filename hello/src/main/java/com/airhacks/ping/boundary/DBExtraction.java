
package com.airhacks.ping.boundary;

import javax.inject.Inject;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.Retry;

/**
 *
 * @author airhacks.com
 */
public class DBExtraction {

    @Inject
    @ConfigProperty(name = "DB_LOCATION", defaultValue = "oracle")
    String dbLocation;

    @Fallback(fallbackMethod = "extractFromFile")
    @Retry(maxRetries = 2)
    public void extractSaveAndZipTenMegs() {
        System.out.println("-- extracting from " + this.dbLocation);
        throw new IllegalStateException("DB not available today");
    }

    public void extractFromFile() {
        System.out.println("--- extraction");
    }


}
