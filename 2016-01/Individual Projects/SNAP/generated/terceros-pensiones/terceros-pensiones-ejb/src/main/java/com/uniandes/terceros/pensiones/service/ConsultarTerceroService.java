package com.uniandes.terceros.pensiones.service;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import com.uniandes.terceros.pensiones.domain.Personas;
import com.uniandes.terceros.pensiones.dto.PersonasDTO;
import com.uniandes.terceros.pensiones.dao.PersonasDAOLocal;
import com.uniandes.terceros.pensiones.domain.Abonos;
import com.uniandes.terceros.pensiones.dto.AbonosDTO;
import com.uniandes.terceros.pensiones.dao.AbonosDAOLocal;
import com.uniandes.terceros.pensiones.utils.Utils;

@Stateless
public class ConsultarTerceroService implements ConsultarTerceroServiceLocal {

	@EJB
	private PersonasDAOLocal personasDAOLocal;
	@EJB
	private AbonosDAOLocal abonosDAOLocal;
	
	public void tercerospensionesOtro(){
		/*
		    Prueba
		    */
	}
	
	@Override
	public List<AbonosDTO> getAllAbonos(){
		List<AbonosDTO> abonosDTOs = new ArrayList<AbonosDTO>();
			List<Abonos> abonoss = abonosDAOLocal.getAbonos();
			for (Abonos p : abonoss){
				AbonosDTO abonosDTO = new AbonosDTO();
				Utils.convertToAbonosDTO(abonosDTO,p);
				abonosDTOs.add(abonosDTO);
			}
			return abonosDTOs;
	}
	
	@Override
	public void createPersonas(PersonasDTO personasDTO){
		Personas personas = new Personas();
			Utils.convertToPersonas(personas,personasDTO);
			personasDAOLocal.create(personas);
	}
	
	@Override
	public void createAbonos(AbonosDTO abonosDTO){
		Abonos abonos = new Abonos();
			Utils.convertToAbonos(abonos,abonosDTO);
			abonosDAOLocal.create(abonos);
	}
	
	@Override
	public void deleteAbonos(AbonosDTO abonosDTO){
		Abonos abonos = new Abonos();
			Utils.convertToAbonos(abonos,abonosDTO);
			abonosDAOLocal.delete(abonos);
	}
	
	@Override
	public List<PersonasDTO> getAllPersonas(){
		List<PersonasDTO> personasDTOs = new ArrayList<PersonasDTO>();
			List<Personas> personass = personasDAOLocal.getPersonas();
			for (Personas p : personass){
				PersonasDTO personasDTO = new PersonasDTO();
				Utils.convertToPersonasDTO(personasDTO,p);
				personasDTOs.add(personasDTO);
			}
			return personasDTOs;
	}
	
	public void tercerospensionesM000001(){
		/*
		    RECUPERAR TERARC (ZTIPID ZNUMID) 
		    SI ERE(TERARC) 
		    PASAR ZFOPAG TERFOR
		    PASAR ZNUMCT TERNU1
		    PASAR ZTELEF TERTEL
		    PASAR ZTIPCU TERTI1
		    EDTDDS 'PAGFOR' ZFOPAG ZDESFO
		    EDTDDS 'AJUT02' ZTIPCU ZDESTC
		    **ZDESEN 
		    FIN
		    */
	}
	
	@Override
	public void updateAbonos(AbonosDTO abonosDTO){
		Abonos abonos = new Abonos();
			Utils.convertToAbonos(abonos,abonosDTO);
			abonosDAOLocal.edit(abonos);
	}
	
	public void tercerospensionesMain(){
		/*
		    PARAMETROS (ZTIPID ZNUMID) 
		    EJECUTAR M00001
		    MIENTRAS *F12<> '1'
		    CONVERSAR PANT02
		    FIN
		    */
	}
	
	@Override
	public void deletePersonas(PersonasDTO personasDTO){
		Personas personas = new Personas();
			Utils.convertToPersonas(personas,personasDTO);
			personasDAOLocal.delete(personas);
	}
	
	@Override
	public void updatePersonas(PersonasDTO personasDTO){
		Personas personas = new Personas();
			Utils.convertToPersonas(personas,personasDTO);
			personasDAOLocal.edit(personas);
	}
	
	public  ConsultarTerceroService(){
		
	}
	
	
	
}
