package co.edu.uniandes.sistemagestionuniversitario.servicio;

import javax.ejb.*;
import javax.ws.rs.*;
import java.util.*;
import javax.ws.rs.core.*;
import co.edu.uniandes.sistemagestionuniversitario.negocio.interfaces.*;
import co.edu.uniandes.sistemagestionuniversitario.entidad.*;


/**
 * Servicio REST para: PersonaService.
 * 
 * @author Grupo 3
 * 
 */
@Path(value="Persona")
public class PersonaService {
	
	/** Atributo personaEJBLocal. */
	@EJB
	private PersonaEJBLocal personaEJBLocal;
	
  /**
	* M�todo - Servicio Web REST que sirve para encontrarTodos registros a la base de datos
	*
	*
	*
	* @return Tipo de retorno List<Persona>
	*/
	@GET
	@Path(value="Personas")
	@Produces(value="application/json")
	public List<Persona> encontrarTodos (){
		List<Persona> lista = null;		
		try{		
			lista = personaEJBLocal.encontrarTodos();		
		} catch(Exception e){		
			e.printStackTrace();		
		} finally{		
		}		
		return lista;		
	}
	
  /**
	* M�todo - Servicio Web REST que sirve para encontrarPorId registros a la base de datos
	*
	* @param id, parametro enviado al metodo con tipo de dato: Integer
	*
	* @return Tipo de retorno Persona
	*/
	@GET
	@Path(value="Persona/{id}")
	@Produces(value="application/json")
	public Persona encontrarPorId (@PathParam("id") Integer id){
		Persona persona = null;		
		try{		
			persona = personaEJBLocal.encontrarPorId(id);		
		} catch(Exception e){		
			e.printStackTrace();		
		} finally{		
		}		
		return persona;		
	}
	
  /**
	* M�todo - Servicio Web REST que sirve para insertar registros a la base de datos
	*
	* @param persona, parametro enviado al metodo con tipo de dato: Persona
	*
	* @return Tipo de retorno String
	*/
	@POST
	@Path(value="Persona")
	@Produces(value="text/plain")
	@Consumes(value="application/json")
	public String insertar (Persona persona){
		String mensaje="OK";		
		try{		
			personaEJBLocal.insertar(persona);		
		} catch(Exception e){		
			mensaje = "BAD";		
			e.printStackTrace();		
		} finally{		
		}		
		return mensaje;		
	}
	
  /**
	* M�todo - Servicio Web REST que sirve para actualizar registros a la base de datos
	*
	* @param persona, parametro enviado al metodo con tipo de dato: Persona
	*
	* @return Tipo de retorno Persona
	*/
	@PUT
	@Path(value="Persona")
	@Produces(value="application/json")
	@Consumes(value="application/json")
	public Persona actualizar (Persona persona){
		try{		
			persona = personaEJBLocal.actualizar(persona);		
		} catch(Exception e){		
			e.printStackTrace();		
		} finally{		
		}		
		return persona;		
	}
	
  /**
	* M�todo - Servicio Web REST que sirve para remover registros a la base de datos
	*
	* @param id, parametro enviado al metodo con tipo de dato: Integer
	*
	* @return Tipo de retorno String
	*/
	@DELETE
	@Path(value="Persona/{id}")
	@Produces(value="text/plain")
	public String remover (@PathParam("id") Integer id){
		String mensaje="OK";		
		try{		
			personaEJBLocal.remover(id);		
		} catch(Exception e){		
			mensaje = "BAD";		
			e.printStackTrace();		
		} finally{		
		}		
		return mensaje;		
	}
	
  /**
	* M�todo - Servicio Web REST que sirve para totalRegistros registros a la base de datos
	*
	*
	*
	* @return Tipo de retorno Integer
	*/
	@GET
	@Path(value="CantidadPersonas")
	@Produces(value="application/json")
	public Integer totalRegistros (){
		Integer cantidad = 0;		
		try{		
			cantidad = personaEJBLocal.totalRegistros();		
		} catch(Exception e){		
			e.printStackTrace();		
		} finally{		
		}		
		return cantidad;		
	}
	
}
