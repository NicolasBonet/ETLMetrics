package com.uniandes.terceros.pensiones.service;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Local;
import com.uniandes.terceros.pensiones.domain.Personas;
import com.uniandes.terceros.pensiones.dto.PersonasDTO;
import com.uniandes.terceros.pensiones.domain.Abonos;
import com.uniandes.terceros.pensiones.dto.AbonosDTO;

@Local
public interface ConsultarTerceroServiceLocal{

	public void createPersonas(PersonasDTO personasDTO);
	public void createAbonos(AbonosDTO abonosDTO);
	public void updatePersonas(PersonasDTO personasDTO);
	public void updateAbonos(AbonosDTO abonosDTO);
	public void deletePersonas(PersonasDTO personasDTO);
	public void deleteAbonos(AbonosDTO abonosDTO);
	public List<PersonasDTO> getAllPersonas();
	public List<AbonosDTO> getAllAbonos();
	
	
}
