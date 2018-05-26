package it.cnr.istc;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 * GeoTagBean
 */
@Singleton
@Startup
public class GeoTagBean {

    private static final Logger LOG = Logger.getLogger(GeoTagBean.class.getName());

    @PostConstruct
    private void startup() {
        LOG.info("Starting GeoTag Server");
    }
}