package co.edu.uniandes.sistemagestionuniversitario.negocio.interfaces;

import java.util.*;
import co.edu.uniandes.sistemagestionuniversitario.entidad.*;
/**
 * Interface para el EJB: CiudadEJB.
 * 
 * @author Grupo 3
 * 
 */
public interface CiudadEJBLocal{

	
  /**
	* M�todo que sirve para insertar registros a la base de datos
	*
	* @param ciudad, parametro enviado al metodo con tipo de dato: Ciudad
	*
	*/
	void insertar (Ciudad ciudad);
	
  /**
	* M�todo que sirve para actualizar registros a la base de datos
	*
	* @param ciudad, parametro enviado al metodo con tipo de dato: Ciudad
	*
	* @return Tipo de retorno Ciudad
	*/
	Ciudad actualizar (Ciudad ciudad);
	
  /**
	* M�todo que sirve para encontrarTodos registros a la base de datos
	*

	*
	* @return Tipo de retorno List<Ciudad>
	*/
	List<Ciudad> encontrarTodos ();
	
  /**
	* M�todo que sirve para encontrarPorId registros a la base de datos
	*
	* @param id, parametro enviado al metodo con tipo de dato: Object
	*
	* @return Tipo de retorno Ciudad
	*/
	Ciudad encontrarPorId (Object id);
	
  /**
	* M�todo que sirve para remover registros a la base de datos
	*
	* @param id, parametro enviado al metodo con tipo de dato: Object
	*
	*/
	void remover (Object id);
	
  /**
	* M�todo que sirve para totalRegistros registros a la base de datos
	*

	*
	* @return Tipo de retorno Integer
	*/
	Integer totalRegistros ();
	
}
