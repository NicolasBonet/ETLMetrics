package co.edu.uniandes.sistemagestionuniversitario.servicio;

import javax.ejb.*;
import javax.ws.rs.*;
import java.util.*;
import javax.ws.rs.core.*;
import co.edu.uniandes.sistemagestionuniversitario.negocio.interfaces.*;
import co.edu.uniandes.sistemagestionuniversitario.entidad.*;


/**
 * Servicio REST para: CiudadService.
 * 
 * @author Grupo 3
 * 
 */
@Path(value="Ciudad")
public class CiudadService {
	
	/** Atributo ciudadEJBLocal. */
	@EJB
	private CiudadEJBLocal ciudadEJBLocal;
	
  /**
	* M�todo - Servicio Web REST que sirve para encontrarTodos registros a la base de datos
	*
	*
	*
	* @return Tipo de retorno List<Ciudad>
	*/
	@GET
	@Path(value="Ciudads")
	@Produces(value="application/json")
	public List<Ciudad> encontrarTodos (){
		List<Ciudad> lista = null;		
		try{		
			lista = ciudadEJBLocal.encontrarTodos();		
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
	* @return Tipo de retorno Ciudad
	*/
	@GET
	@Path(value="Ciudad/{id}")
	@Produces(value="application/json")
	public Ciudad encontrarPorId (@PathParam("id") Integer id){
		Ciudad ciudad = null;		
		try{		
			ciudad = ciudadEJBLocal.encontrarPorId(id);		
		} catch(Exception e){		
			e.printStackTrace();		
		} finally{		
		}		
		return ciudad;		
	}
	
  /**
	* M�todo - Servicio Web REST que sirve para insertar registros a la base de datos
	*
	* @param ciudad, parametro enviado al metodo con tipo de dato: Ciudad
	*
	* @return Tipo de retorno String
	*/
	@POST
	@Path(value="Ciudad")
	@Produces(value="text/plain")
	@Consumes(value="application/json")
	public String insertar (Ciudad ciudad){
		String mensaje="OK";		
		try{		
			ciudadEJBLocal.insertar(ciudad);		
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
	* @param ciudad, parametro enviado al metodo con tipo de dato: Ciudad
	*
	* @return Tipo de retorno Ciudad
	*/
	@PUT
	@Path(value="Ciudad")
	@Produces(value="application/json")
	@Consumes(value="application/json")
	public Ciudad actualizar (Ciudad ciudad){
		try{		
			ciudad = ciudadEJBLocal.actualizar(ciudad);		
		} catch(Exception e){		
			e.printStackTrace();		
		} finally{		
		}		
		return ciudad;		
	}
	
  /**
	* M�todo - Servicio Web REST que sirve para remover registros a la base de datos
	*
	* @param id, parametro enviado al metodo con tipo de dato: Integer
	*
	* @return Tipo de retorno String
	*/
	@DELETE
	@Path(value="Ciudad/{id}")
	@Produces(value="text/plain")
	public String remover (@PathParam("id") Integer id){
		String mensaje="OK";		
		try{		
			ciudadEJBLocal.remover(id);		
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
	@Path(value="CantidadCiudads")
	@Produces(value="application/json")
	public Integer totalRegistros (){
		Integer cantidad = 0;		
		try{		
			cantidad = ciudadEJBLocal.totalRegistros();		
		} catch(Exception e){		
			e.printStackTrace();		
		} finally{		
		}		
		return cantidad;		
	}
	
}
