package co.edu.uniandes.sistemagestionuniversitario.negocio.interfaces;

import java.util.*;
import co.edu.uniandes.sistemagestionuniversitario.entidad.*;
/**
 * Interface para el EJB: CursoEJB.
 * 
 * @author Grupo 3
 * 
 */
public interface CursoEJBLocal{

	
  /**
	* M�todo que sirve para insertar registros a la base de datos
	*
	* @param curso, parametro enviado al metodo con tipo de dato: Curso
	*
	*/
	void insertar (Curso curso);
	
  /**
	* M�todo que sirve para actualizar registros a la base de datos
	*
	* @param curso, parametro enviado al metodo con tipo de dato: Curso
	*
	* @return Tipo de retorno Curso
	*/
	Curso actualizar (Curso curso);
	
  /**
	* M�todo que sirve para encontrarTodos registros a la base de datos
	*

	*
	* @return Tipo de retorno List<Curso>
	*/
	List<Curso> encontrarTodos ();
	
  /**
	* M�todo que sirve para encontrarPorId registros a la base de datos
	*
	* @param id, parametro enviado al metodo con tipo de dato: Object
	*
	* @return Tipo de retorno Curso
	*/
	Curso encontrarPorId (Object id);
	
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
