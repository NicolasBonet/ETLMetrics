package com.uniandes.terceros.pensiones.utils;

import com.uniandes.terceros.pensiones.domain.Personas;
import com.uniandes.terceros.pensiones.dto.PersonasDTO;
import com.uniandes.terceros.pensiones.domain.Abonos;
import com.uniandes.terceros.pensiones.dto.AbonosDTO;

public class Utils {

	
	public static void convertToPersonasDTO(PersonasDTO personasDTO,Personas personas){
		personasDTO.setTipoidentificacion(personas.getTipoidentificacion());
		personasDTO.setNumeroidentificacion(personas.getNumeroidentificacion());
		personasDTO.setPrimerapellido(personas.getPrimerapellido());
		personasDTO.setSegundoapellido(personas.getSegundoapellido());
		personasDTO.setPrimernombre(personas.getPrimernombre());
		personasDTO.setSegundonombre(personas.getSegundonombre());
		personasDTO.setId(personas.getId());
		
		for (Abonos abonos :  personas.getAbonos()){
		AbonosDTO abonosDTO = new AbonosDTO();
		convertToAbonosDTO(abonosDTO, abonos);
		personasDTO.getAbonos().add(abonosDTO);
		}
	}
	
	public static void convertToPersonas(Personas personas,PersonasDTO personasDTO){
		personas.setTipoidentificacion(personasDTO.getTipoidentificacion());
		personas.setNumeroidentificacion(personasDTO.getNumeroidentificacion());
		personas.setPrimerapellido(personasDTO.getPrimerapellido());
		personas.setSegundoapellido(personasDTO.getSegundoapellido());
		personas.setPrimernombre(personasDTO.getPrimernombre());
		personas.setSegundonombre(personasDTO.getSegundonombre());
		personas.setId(personasDTO.getId());
		
		for (AbonosDTO abonosDTO :  personasDTO.getAbonos()){
		Abonos abonos = new Abonos();
		convertToAbonos(abonos, abonosDTO);
		abonos.setPersonas(personas);
		personas.getAbonos().add(abonos);
		}
	}
	
	public static void convertToAbonosDTO(AbonosDTO abonosDTO,Abonos abonos){
		abonosDTO.setNAbono(abonos.getNAbono());
		abonosDTO.setFoo(abonos.getFoo());
		abonosDTO.setId(abonos.getId());
	}
	
	public static void convertToAbonos(Abonos abonos,AbonosDTO abonosDTO){
		abonos.setNAbono(abonosDTO.getNAbono());
		abonos.setFoo(abonosDTO.getFoo());
		abonos.setId(abonosDTO.getId());
	}
	
	
	
}
