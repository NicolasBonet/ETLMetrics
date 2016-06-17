package co.com.ap.dao;

import co.com.ap.dao.exception.DaoException;

public interface IGenericDao {
	
	void insertarRegistros(String[] sentencias) throws DaoException;
	
}
