package co.edu.uniandes.sistemagestionuniversitario.negocio.implementaciones;

import javax.persistence.*;
import javax.ejb.*;
import java.util.*;
import co.edu.uniandes.sistemagestionuniversitario.negocio.interfaces.*;
import co.edu.uniandes.sistemagestionuniversitario.entidad.*;

/**
 * Implementacion para Session Bean ProfesorEJB.
 * 
 * @author Grupo 3
 * 
 */
@Stateless
@Local(value=ProfesorEJBLocal.class)
public class ProfesorEJB implements ProfesorEJBLocal {
	
	/** Atributo entityManager. */
	@PersistenceContext(unitName="puProyecto")
	private EntityManager entityManager;
	
  /**
	* M�todo que sirve para insertar registros a la base de datos
	*
	* @param profesor, parametro enviado al metodo con tipo de dato: Profesor
	*
	*/
	public void insertar (Profesor profesor){
		entityManager.persist(profesor);		
	}
	
  /**
	* M�todo que sirve para actualizar registros a la base de datos
	*
	* @param profesor, parametro enviado al metodo con tipo de dato: Profesor
	*
	* @return Tipo de retorno Profesor
	*/
	public Profesor actualizar (Profesor profesor){
		return entityManager.merge(profesor);		
	}
	
  /**
	* M�todo que sirve para encontrarTodos registros a la base de datos
	*
	*
	*
	* @return Tipo de retorno List<Profesor>
	*/
	public List<Profesor> encontrarTodos (){
		List<Profesor> lista = null;		
		try{		
			TypedQuery<Profesor> typedQuery = entityManager.createQuery("SELECT t FROM profesor t ", Profesor.class);		
			lista = typedQuery.getResultList();		
		} catch(Exception e){		
			e.printStackTrace();		
		} finally{		
		}		
		return lista;		
	}
	
  /**
	* M�todo que sirve para encontrarPorId registros a la base de datos
	*
	* @param id, parametro enviado al metodo con tipo de dato: Object
	*
	* @return Tipo de retorno Profesor
	*/
	public Profesor encontrarPorId (Object id){
		Profesor profesor = null;		
		try{		
			profesor = entityManager.find(Profesor.class, id);		
		} catch(Exception e){		
			e.printStackTrace();		
		} finally{		
		}		
		return profesor;		
	}
	
  /**
	* M�todo que sirve para remover registros a la base de datos
	*
	* @param id, parametro enviado al metodo con tipo de dato: Object
	*
	*/
	public void remover (Object id){
		try{		
			Profesor profesor = entityManager.find(Profesor.class, id);		
			entityManager.remove(profesor);		
		} catch(Exception e){		
			e.printStackTrace();		
		} finally{		
		}		
	}
	
  /**
	* M�todo que sirve para totalRegistros registros a la base de datos
	*
	*
	*
	* @return Tipo de retorno Integer
	*/
	public Integer totalRegistros (){
		Number cantidadRegistros = new Integer(0);		
		try{		
			cantidadRegistros = (Number)entityManager.createQuery("SELECT COUNT(t) FROM profesor t ").getSingleResult();		
		} catch(Exception e){		
			e.printStackTrace();		
		} finally{		
		}		
		return cantidadRegistros.intValue();		
	}
	
}
