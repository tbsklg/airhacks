
package com.airhacks.ping.boundary;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.json.bind.config.PropertyVisibilityStrategy;

/**
 *
 * @author airhacks.com
 */
public class AljoschaStrategy implements PropertyVisibilityStrategy {

    @Override
    public boolean isVisible(Field field) {
        return field.isAnnotationPresent(MetaData.class);
    }

    @Override
    public boolean isVisible(Method arg0) {
        return false;
    }


}
