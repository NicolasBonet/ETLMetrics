package co.edu.uniandes.sistemagestionuniversitario.negocio.implementaciones;

import javax.persistence.*;
import javax.ejb.*;
import java.util.*;
import co.edu.uniandes.sistemagestionuniversitario.negocio.interfaces.*;
import co.edu.uniandes.sistemagestionuniversitario.entidad.*;

/**
 * Implementacion para Session Bean CiudadEJB.
 * 
 * @author Grupo 3
 * 
 */
@Stateless
@Local(value=CiudadEJBLocal.class)
public class CiudadEJB implements CiudadEJBLocal {
	
	/** Atributo entityManager. */
	@PersistenceContext(unitName="puProyecto")
	private EntityManager entityManager;
	
  /**
	* M�todo que sirve para insertar registros a la base de datos
	*
	* @param ciudad, parametro enviado al metodo con tipo de dato: Ciudad
	*
	*/
	public void insertar (Ciudad ciudad){
		entityManager.persist(ciudad);		
	}
	
  /**
	* M�todo que sirve para actualizar registros a la base de datos
	*
	* @param ciudad, parametro enviado al metodo con tipo de dato: Ciudad
	*
	* @return Tipo de retorno Ciudad
	*/
	public Ciudad actualizar (Ciudad ciudad){
		return entityManager.merge(ciudad);		
	}
	
  /**
	* M�todo que sirve para encontrarTodos registros a la base de datos
	*
	*
	*
	* @return Tipo de retorno List<Ciudad>
	*/
	public List<Ciudad> encontrarTodos (){
		List<Ciudad> lista = null;		
		try{		
			TypedQuery<Ciudad> typedQuery = entityManager.createQuery("SELECT t FROM ciudad t ", Ciudad.class);		
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
	* @return Tipo de retorno Ciudad
	*/
	public Ciudad encontrarPorId (Object id){
		Ciudad ciudad = null;		
		try{		
			ciudad = entityManager.find(Ciudad.class, id);		
		} catch(Exception e){		
			e.printStackTrace();		
		} finally{		
		}		
		return ciudad;		
	}
	
  /**
	* M�todo que sirve para remover registros a la base de datos
	*
	* @param id, parametro enviado al metodo con tipo de dato: Object
	*
	*/
	public void remover (Object id){
		try{		
			Ciudad ciudad = entityManager.find(Ciudad.class, id);		
			entityManager.remove(ciudad);		
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
			cantidadRegistros = (Number)entityManager.createQuery("SELECT COUNT(t) FROM ciudad t ").getSingleResult();		
		} catch(Exception e){		
			e.printStackTrace();		
		} finally{		
		}		
		return cantidadRegistros.intValue();		
	}
	
}
