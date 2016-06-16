package com.uniandes.terceros.pensiones.dao;

import java.util.List;
import javax.ejb.Local;
import com.uniandes.terceros.pensiones.domain.Abonos;

@Local
public interface AbonosDAOLocal extends GenericDAOLocal<Abonos>{

	public List<Abonos> getAbonos();
	
	
}
