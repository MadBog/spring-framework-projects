package ro.esolutions.repositories.impl;

import ro.esolutions.entities.User;
import ro.esolutions.repositories.UserRepositoryCustom;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Bogdan Stoean on 15.02.2015.
 */
public class UserRepositoryCustomImpl implements UserRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<User> customOperation(String hql) {
        return entityManager.createQuery(hql).getResultList();
    }
}
