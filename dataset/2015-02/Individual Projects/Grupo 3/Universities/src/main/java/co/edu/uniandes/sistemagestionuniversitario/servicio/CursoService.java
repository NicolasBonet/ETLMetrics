package co.edu.uniandes.sistemagestionuniversitario.servicio;

import javax.ejb.*;
import javax.ws.rs.*;
import java.util.*;
import javax.ws.rs.core.*;
import co.edu.uniandes.sistemagestionuniversitario.negocio.interfaces.*;
import co.edu.uniandes.sistemagestionuniversitario.entidad.*;


/**
 * Servicio REST para: CursoService.
 * 
 * @author Grupo 3
 * 
 */
@Path(value="Curso")
public class CursoService {
	
	/** Atributo cursoEJBLocal. */
	@EJB
	private CursoEJBLocal cursoEJBLocal;
	
  /**
	* M�todo - Servicio Web REST que sirve para encontrarTodos registros a la base de datos
	*
	*
	*
	* @return Tipo de retorno List<Curso>
	*/
	@GET
	@Path(value="Cursos")
	@Produces(value="application/json")
	public List<Curso> encontrarTodos (){
		List<Curso> lista = null;		
		try{		
			lista = cursoEJBLocal.encontrarTodos();		
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
	* @return Tipo de retorno Curso
	*/
	@GET
	@Path(value="Curso/{id}")
	@Produces(value="application/json")
	public Curso encontrarPorId (@PathParam("id") Integer id){
		Curso curso = null;		
		try{		
			curso = cursoEJBLocal.encontrarPorId(id);		
		} catch(Exception e){		
			e.printStackTrace();		
		} finally{		
		}		
		return curso;		
	}
	
  /**
	* M�todo - Servicio Web REST que sirve para insertar registros a la base de datos
	*
	* @param curso, parametro enviado al metodo con tipo de dato: Curso
	*
	* @return Tipo de retorno String
	*/
	@POST
	@Path(value="Curso")
	@Produces(value="text/plain")
	@Consumes(value="application/json")
	public String insertar (Curso curso){
		String mensaje="OK";		
		try{		
			cursoEJBLocal.insertar(curso);		
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
	* @param curso, parametro enviado al metodo con tipo de dato: Curso
	*
	* @return Tipo de retorno Curso
	*/
	@PUT
	@Path(value="Curso")
	@Produces(value="application/json")
	@Consumes(value="application/json")
	public Curso actualizar (Curso curso){
		try{		
			curso = cursoEJBLocal.actualizar(curso);		
		} catch(Exception e){		
			e.printStackTrace();		
		} finally{		
		}		
		return curso;		
	}
	
  /**
	* M�todo - Servicio Web REST que sirve para remover registros a la base de datos
	*
	* @param id, parametro enviado al metodo con tipo de dato: Integer
	*
	* @return Tipo de retorno String
	*/
	@DELETE
	@Path(value="Curso/{id}")
	@Produces(value="text/plain")
	public String remover (@PathParam("id") Integer id){
		String mensaje="OK";		
		try{		
			cursoEJBLocal.remover(id);		
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
	@Path(value="CantidadCursos")
	@Produces(value="application/json")
	public Integer totalRegistros (){
		Integer cantidad = 0;		
		try{		
			cantidad = cursoEJBLocal.totalRegistros();		
		} catch(Exception e){		
			e.printStackTrace();		
		} finally{		
		}		
		return cantidad;		
	}
	
}
