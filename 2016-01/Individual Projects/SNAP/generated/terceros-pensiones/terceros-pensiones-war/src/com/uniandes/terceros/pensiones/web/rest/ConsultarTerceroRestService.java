package com.uniandes.terceros.pensiones.web.rest;

import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.uniandes.terceros.pensiones.service.ConsultarTerceroServiceLocal;
import com.uniandes.terceros.pensiones.dto.PersonasDTO;
import com.uniandes.terceros.pensiones.dto.AbonosDTO;

@Path("/consultarTercero")
public class ConsultarTerceroRestService {

	@EJB
	private ConsultarTerceroServiceLocal consultarTerceroServiceLocal;
	
	@PUT
	@Path("/createPersonas")
	@Consumes(MediaType.APPLICATION_JSON)
	public void createPersonas(PersonasDTO personasDTO){
		consultarTerceroServiceLocal.createPersonas(personasDTO);
	}
	
	@PUT
	@Path("/createAbonos")
	@Consumes(MediaType.APPLICATION_JSON)
	public void createAbonos(AbonosDTO abonosDTO){
		consultarTerceroServiceLocal.createAbonos(abonosDTO);
	}
	
	@PUT
	@Path("/updatePersonas")
	@Consumes(MediaType.APPLICATION_JSON)
	public void updatePersonas(PersonasDTO personasDTO){
		consultarTerceroServiceLocal.updatePersonas(personasDTO);
	}
	
	@PUT
	@Path("/updateAbonos")
	@Consumes(MediaType.APPLICATION_JSON)
	public void updateAbonos(AbonosDTO abonosDTO){
		consultarTerceroServiceLocal.updateAbonos(abonosDTO);
	}
	
	@PUT
	@Path("/deletePersonas")
	@Consumes(MediaType.APPLICATION_JSON)
	public void deletePersonas(PersonasDTO personasDTO){
		consultarTerceroServiceLocal.deletePersonas(personasDTO);
	}
	
	@PUT
	@Path("/deleteAbonos")
	@Consumes(MediaType.APPLICATION_JSON)
	public void deleteAbonos(AbonosDTO abonosDTO){
		consultarTerceroServiceLocal.deleteAbonos(abonosDTO);
	}
	
	@GET
	@Path("/allPersonas")
	@Produces(MediaType.APPLICATION_JSON)
	public List<PersonasDTO> getAllPersonas(PersonasDTO personasDTO){
		return consultarTerceroServiceLocal.getAllPersonas();
	}
	
	@GET
	@Path("/allAbonos")
	@Produces(MediaType.APPLICATION_JSON)
	public List<AbonosDTO> getAllAbonos(AbonosDTO abonosDTO){
		return consultarTerceroServiceLocal.getAllAbonos();
	}
	
	
	
}
