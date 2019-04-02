
package com.airhacks.ping.boundary;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

/**
 *
 * @author airhacks.com
 */
public class CallTracer {

    @AroundInvoke
    public Object trace(InvocationContext context) throws Exception {
        System.out.println("-- before " + context.getMethod());
        try {
            return context.proceed();
        } finally {
            System.out.println("-- after");
        }
    }

}
