package it.cnr.istc;

import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import it.cnr.istc.entities.UserEntity;

/**
 * GeoTagResource
 */
@Path("/")
public class GeoTagResource {

    private static final Logger LOG = Logger.getLogger(GeoTagResource.class.getName());

    @PersistenceContext
    private EntityManager em;

    @GET
    @Path("users")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<User> getUsers() {
        LOG.info("Getting GeoTag users..");
        List<UserEntity> users = em.createQuery("SELECT u FROM UserEntity u", UserEntity.class).getResultList();
        return users.stream().map(u -> new User(u.getId())).collect(Collectors.toList());
    }

    static class User {
        Long id;

        public User() {
        }

        public User(Long id) {
            this.id = id;
        }
    }
}