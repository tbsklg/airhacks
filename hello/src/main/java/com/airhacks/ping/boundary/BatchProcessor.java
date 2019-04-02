
package com.airhacks.ping.boundary;

import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

/**
 *
 * @author airhacks.com
 */
@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
@Startup
@Singleton
public class BatchProcessor {

    @Inject
    DBExtraction extraction;

    @Schedule(second = "*/1", minute = "*", hour = "*")
    public void checkJobs() {
        this.extraction.extractSaveAndZipTenMegs();
    }


}
