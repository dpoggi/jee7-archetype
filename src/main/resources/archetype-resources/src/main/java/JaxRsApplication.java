package ${package};

import java.util.LinkedHashMap;
import java.util.Map;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
public class JaxRsApplication extends Application {

    private final Map<String, Object> properties = new LinkedHashMap<>();

    public JaxRsApplication() {
        // To enable jersey-media-json-jackson in the presence of MOXy:
        //properties.put("jersey.config.server.disableMoxyJson", true);
    }

    @Override
    public Map<String, Object> getProperties() {
        return properties;
    }
}
