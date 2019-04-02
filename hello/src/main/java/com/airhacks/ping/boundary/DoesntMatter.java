
package com.airhacks.ping.boundary;

import javax.annotation.Resource;
import javax.ejb.Asynchronous;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

@Stateless
public class DoesntMatter {

    @Resource
    SessionContext sc;

    @Asynchronous
    public void save() {
        sc.setRollbackOnly();
    }


}
