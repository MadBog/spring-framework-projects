package ro.esolutions.repositories.impl;

import ro.esolutions.entities.User;
import ro.esolutions.repositories.UserRepositoryCustom;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

/**
 * Created by Bogdan Stoean on 17.02.2015.
 */
public class UserRepositoryCustomImpl implements UserRepositoryCustom {

	@PersistenceContext private EntityManager em;

	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	public List<User> myCustomBatchOperation() {

		CriteriaQuery<User> criteriaQuery = em.getCriteriaBuilder().createQuery(User.class);
		criteriaQuery.select(criteriaQuery.from(User.class));
		return em.createQuery(criteriaQuery).getResultList();
	}
}
