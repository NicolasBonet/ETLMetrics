package co.edu.uniandes.sistemagestionuniversitario.negocio.implementaciones;

import javax.persistence.*;
import javax.ejb.*;
import java.util.*;
import co.edu.uniandes.sistemagestionuniversitario.negocio.interfaces.*;
import co.edu.uniandes.sistemagestionuniversitario.entidad.*;

/**
 * Implementacion para Session Bean PersonaEJB.
 * 
 * @author Grupo 3
 * 
 */
@Stateless
@Local(value=PersonaEJBLocal.class)
public class PersonaEJB implements PersonaEJBLocal {
	
	/** Atributo entityManager. */
	@PersistenceContext(unitName="puProyecto")
	private EntityManager entityManager;
	
  /**
	* M�todo que sirve para insertar registros a la base de datos
	*
	* @param persona, parametro enviado al metodo con tipo de dato: Persona
	*
	*/
	public void insertar (Persona persona){
		entityManager.persist(persona);		
	}
	
  /**
	* M�todo que sirve para actualizar registros a la base de datos
	*
	* @param persona, parametro enviado al metodo con tipo de dato: Persona
	*
	* @return Tipo de retorno Persona
	*/
	public Persona actualizar (Persona persona){
		return entityManager.merge(persona);		
	}
	
  /**
	* M�todo que sirve para encontrarTodos registros a la base de datos
	*
	*
	*
	* @return Tipo de retorno List<Persona>
	*/
	public List<Persona> encontrarTodos (){
		List<Persona> lista = null;		
		try{		
			TypedQuery<Persona> typedQuery = entityManager.createQuery("SELECT t FROM persona t ", Persona.class);		
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
	* @return Tipo de retorno Persona
	*/
	public Persona encontrarPorId (Object id){
		Persona persona = null;		
		try{		
			persona = entityManager.find(Persona.class, id);		
		} catch(Exception e){		
			e.printStackTrace();		
		} finally{		
		}		
		return persona;		
	}
	
  /**
	* M�todo que sirve para remover registros a la base de datos
	*
	* @param id, parametro enviado al metodo con tipo de dato: Object
	*
	*/
	public void remover (Object id){
		try{		
			Persona persona = entityManager.find(Persona.class, id);		
			entityManager.remove(persona);		
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
			cantidadRegistros = (Number)entityManager.createQuery("SELECT COUNT(t) FROM persona t ").getSingleResult();		
		} catch(Exception e){		
			e.printStackTrace();		
		} finally{		
		}		
		return cantidadRegistros.intValue();		
	}
	
}
