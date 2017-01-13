package co.edu.uniandes.sistemagestionuniversitario.negocio.interfaces;

import java.util.*;
import co.edu.uniandes.sistemagestionuniversitario.entidad.*;
/**
 * Interface para el EJB: PersonaEJB.
 * 
 * @author Grupo 3
 * 
 */
public interface PersonaEJBLocal{

	
  /**
	* M�todo que sirve para insertar registros a la base de datos
	*
	* @param persona, parametro enviado al metodo con tipo de dato: Persona
	*
	*/
	void insertar (Persona persona);
	
  /**
	* M�todo que sirve para actualizar registros a la base de datos
	*
	* @param persona, parametro enviado al metodo con tipo de dato: Persona
	*
	* @return Tipo de retorno Persona
	*/
	Persona actualizar (Persona persona);
	
  /**
	* M�todo que sirve para encontrarTodos registros a la base de datos
	*

	*
	* @return Tipo de retorno List<Persona>
	*/
	List<Persona> encontrarTodos ();
	
  /**
	* M�todo que sirve para encontrarPorId registros a la base de datos
	*
	* @param id, parametro enviado al metodo con tipo de dato: Object
	*
	* @return Tipo de retorno Persona
	*/
	Persona encontrarPorId (Object id);
	
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
