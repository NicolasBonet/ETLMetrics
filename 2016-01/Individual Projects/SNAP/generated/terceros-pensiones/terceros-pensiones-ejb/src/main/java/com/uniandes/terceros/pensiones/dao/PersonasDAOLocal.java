package com.uniandes.terceros.pensiones.dao;

import java.util.List;
import javax.ejb.Local;
import com.uniandes.terceros.pensiones.domain.Personas;

@Local
public interface PersonasDAOLocal extends GenericDAOLocal<Personas>{

	public List<Personas> getPersonas();
	
	
}
