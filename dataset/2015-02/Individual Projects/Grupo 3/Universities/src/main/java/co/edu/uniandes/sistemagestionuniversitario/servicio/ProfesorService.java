package co.edu.uniandes.sistemagestionuniversitario.servicio;

import javax.ejb.*;
import javax.ws.rs.*;
import java.util.*;
import javax.ws.rs.core.*;
import co.edu.uniandes.sistemagestionuniversitario.negocio.interfaces.*;
import co.edu.uniandes.sistemagestionuniversitario.entidad.*;


/**
 * Servicio REST para: ProfesorService.
 * 
 * @author Grupo 3
 * 
 */
@Path(value="Profesor")
public class ProfesorService {
	
	/** Atributo profesorEJBLocal. */
	@EJB
	private ProfesorEJBLocal profesorEJBLocal;
	
  /**
	* M�todo - Servicio Web REST que sirve para encontrarTodos registros a la base de datos
	*
	*
	*
	* @return Tipo de retorno List<Profesor>
	*/
	@GET
	@Path(value="Profesors")
	@Produces(value="application/json")
	public List<Profesor> encontrarTodos (){
		List<Profesor> lista = null;		
		try{		
			lista = profesorEJBLocal.encontrarTodos();		
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
	* @return Tipo de retorno Profesor
	*/
	@GET
	@Path(value="Profesor/{id}")
	@Produces(value="application/json")
	public Profesor encontrarPorId (@PathParam("id") Integer id){
		Profesor profesor = null;		
		try{		
			profesor = profesorEJBLocal.encontrarPorId(id);		
		} catch(Exception e){		
			e.printStackTrace();		
		} finally{		
		}		
		return profesor;		
	}
	
  /**
	* M�todo - Servicio Web REST que sirve para insertar registros a la base de datos
	*
	* @param profesor, parametro enviado al metodo con tipo de dato: Profesor
	*
	* @return Tipo de retorno String
	*/
	@POST
	@Path(value="Profesor")
	@Produces(value="text/plain")
	@Consumes(value="application/json")
	public String insertar (Profesor profesor){
		String mensaje="OK";		
		try{		
			profesorEJBLocal.insertar(profesor);		
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
	* @param profesor, parametro enviado al metodo con tipo de dato: Profesor
	*
	* @return Tipo de retorno Profesor
	*/
	@PUT
	@Path(value="Profesor")
	@Produces(value="application/json")
	@Consumes(value="application/json")
	public Profesor actualizar (Profesor profesor){
		try{		
			profesor = profesorEJBLocal.actualizar(profesor);		
		} catch(Exception e){		
			e.printStackTrace();		
		} finally{		
		}		
		return profesor;		
	}
	
  /**
	* M�todo - Servicio Web REST que sirve para remover registros a la base de datos
	*
	* @param id, parametro enviado al metodo con tipo de dato: Integer
	*
	* @return Tipo de retorno String
	*/
	@DELETE
	@Path(value="Profesor/{id}")
	@Produces(value="text/plain")
	public String remover (@PathParam("id") Integer id){
		String mensaje="OK";		
		try{		
			profesorEJBLocal.remover(id);		
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
	@Path(value="CantidadProfesors")
	@Produces(value="application/json")
	public Integer totalRegistros (){
		Integer cantidad = 0;		
		try{		
			cantidad = profesorEJBLocal.totalRegistros();		
		} catch(Exception e){		
			e.printStackTrace();		
		} finally{		
		}		
		return cantidad;		
	}
	
}
