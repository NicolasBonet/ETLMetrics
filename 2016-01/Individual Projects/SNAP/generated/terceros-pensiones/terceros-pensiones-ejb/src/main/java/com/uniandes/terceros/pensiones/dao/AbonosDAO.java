package com.uniandes.terceros.pensiones.dao;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.Query;
import com.uniandes.terceros.pensiones.domain.Abonos;

@Stateless
@LocalBean
public class AbonosDAO extends GenericDAO<Abonos> implements AbonosDAOLocal {

	
	public  AbonosDAO(){
		
	}
	
	@Override
	public List<Abonos> getAbonos(){
		Query q = em.createQuery("SELECT p FROM Abonos p");
			List<Abonos> a = q.getResultList();
			return a;
	}
	
	
	
}
