package com.uniandes.terceros.pensiones.dao;

import javax.ejb.Local;

@Local
public interface GenericDAOLocal<T>{

	public void create(T p);
	public void delete(T p);
	public void edit(T p);
	public T searchById(Object p);
	
	
}
