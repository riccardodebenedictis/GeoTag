package it.cnr.istc.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * UserEntity
 */
@Entity
public class UserEntity {
    @Id
    private Long id;

    public UserEntity() {
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }
}