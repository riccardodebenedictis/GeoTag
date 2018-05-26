package it.cnr.istc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * GeoTagApplication
 */
@ApplicationPath("/")
public class GeoTagApplication extends Application {

    private static final Logger LOG = Logger.getLogger(GeoTagApplication.class.getName());

    @Override
    public Set<Class<?>> getClasses() {
        LOG.info("Registering GeoTag resources..");
        return new HashSet<>(Arrays.asList(GeoTagResource.class));
    }
}