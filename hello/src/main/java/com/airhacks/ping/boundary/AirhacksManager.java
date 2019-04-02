
package com.airhacks.ping.boundary;

import java.util.Set;

/**
 * A historic home assignment / airhacks.com
 *
 * @author airhacks.com
 */
public class AirhacksManager {

    private Set<Object> freshlyCreated;

    public void persist(Object input) {
        freshlyCreated.add(input);
    }
    public Object merge(Object input) {
        Object copy = null;
        /*
        try {
            copy = input.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(AirhacksManager.class.getName()).log(Level.SEVERE, null, ex);
        }
         */
        freshlyCreated.add(copy);
        return copy;
    }


}
