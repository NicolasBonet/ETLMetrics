package com.uniandes.terceros.pensiones.dao;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.Query;
import com.uniandes.terceros.pensiones.domain.Personas;

@Stateless
@LocalBean
public class PersonasDAO extends GenericDAO<Personas> implements PersonasDAOLocal {

	
	public  PersonasDAO(){
		
	}
	
	@Override
	public List<Personas> getPersonas(){
		Query q = em.createQuery("SELECT p FROM Personas p");
			List<Personas> a = q.getResultList();
			return a;
	}
	
	
	
}
