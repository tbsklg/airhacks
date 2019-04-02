
package com.airhacks.ping.boundary;

import javax.inject.Inject;

/**
 *
 * @author airhacks.com
 */
public class InjectMe {

    private final String message;

    @Inject
    public InjectMe(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "InjectMe{" + "message=" + message + '}';
    }


}
