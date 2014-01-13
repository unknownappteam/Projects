/**
 * 
 */
package com.unknown.app.team.dao.base;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author KK
 * 
 */
public abstract class AbstractJPADAO<T> {
	@PersistenceContext(unitName = "carpool")
	private EntityManager entityManager;

	public T persist(T t) {

		entityManager.persist(t);

		return t;
	}

	public T save(T t) {

		return entityManager.merge(t);
	}

	public void remove(T t) {

		entityManager.remove(t);
	}

	protected EntityManager getEntityManager() {
		return entityManager;
	}

}
