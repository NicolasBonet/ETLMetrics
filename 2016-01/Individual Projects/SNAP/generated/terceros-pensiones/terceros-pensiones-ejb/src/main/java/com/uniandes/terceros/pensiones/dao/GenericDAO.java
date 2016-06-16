package com.uniandes.terceros.pensiones.dao;

import java.lang.reflect.ParameterizedType;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class GenericDAO<T> implements GenericDAOLocal<T> {

	@PersistenceContext(unitName = "tercerosPensionesPU")
	protected EntityManager em;
	
	@Override
	public void edit(T p){
		em.merge(p);
	}
	
	@Override
	public T searchById(Object p){
		Class<T> classEntity = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
			return em.find(classEntity, p);
	}
	
	@Override
	public void create(T p){
		em.persist(p);
	}
	
	@Override
	public void delete(T p){
		em.remove(em.merge(p));
	}
	
	
	
}
