package it.cnr.istc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * GeoTagApplication
 */
@ApplicationPath("GeoTag")
public class GeoTagApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        System.out.println("Finding resources..");
        return new HashSet<>(Arrays.asList(GeoTagResource.class));
    }
}