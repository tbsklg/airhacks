
package com.airhacks.ping.boundary;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.json.bind.config.PropertyVisibilityStrategy;

/**
 *
 * @author airhacks.com
 */
public class AljoschaStrategy implements PropertyVisibilityStrategy {

    private boolean everything;

    public AljoschaStrategy(boolean everything) {
        this.everything = everything;
    }


    @Override
    public boolean isVisible(Field field) {
        if (everything) {
            return true;
        }
        return field.isAnnotationPresent(MetaData.class);
    }

    @Override
    public boolean isVisible(Method arg0) {
        return false;
    }


}
