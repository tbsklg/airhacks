
package com.airhacks.ping.boundary;

import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

@Stateless
public class DoesntMatter {

    @Resource
    SessionContext sc;

    public void save() {
        sc.setRollbackOnly();
    }


}
