
package com.airhacks.ping.boundary;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author airhacks.com
 */
@Provider
public class Strategy implements ContextResolver {

    @Override
    public Jsonb getContext(Class type) {
        JsonbConfig config = new JsonbConfig().
                withPropertyVisibilityStrategy(new AljoschaStrategy());
        return JsonbBuilder.newBuilder().
                withConfig(config).
                build();
    }
}
