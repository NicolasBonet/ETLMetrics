package co.edu.uniandes.sistemagestionuniversitario.negocio.interfaces;

import java.util.*;
import co.edu.uniandes.sistemagestionuniversitario.entidad.*;
/**
 * Interface para el EJB: ProfesorEJB.
 * 
 * @author Grupo 3
 * 
 */
public interface ProfesorEJBLocal{

	
  /**
	* M�todo que sirve para insertar registros a la base de datos
	*
	* @param profesor, parametro enviado al metodo con tipo de dato: Profesor
	*
	*/
	void insertar (Profesor profesor);
	
  /**
	* M�todo que sirve para actualizar registros a la base de datos
	*
	* @param profesor, parametro enviado al metodo con tipo de dato: Profesor
	*
	* @return Tipo de retorno Profesor
	*/
	Profesor actualizar (Profesor profesor);
	
  /**
	* M�todo que sirve para encontrarTodos registros a la base de datos
	*

	*
	* @return Tipo de retorno List<Profesor>
	*/
	List<Profesor> encontrarTodos ();
	
  /**
	* M�todo que sirve para encontrarPorId registros a la base de datos
	*
	* @param id, parametro enviado al metodo con tipo de dato: Object
	*
	* @return Tipo de retorno Profesor
	*/
	Profesor encontrarPorId (Object id);
	
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
