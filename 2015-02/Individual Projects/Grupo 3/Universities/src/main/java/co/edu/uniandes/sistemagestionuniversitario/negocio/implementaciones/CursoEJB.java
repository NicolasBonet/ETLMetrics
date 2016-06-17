package co.edu.uniandes.sistemagestionuniversitario.negocio.implementaciones;

import javax.persistence.*;
import javax.ejb.*;
import java.util.*;
import co.edu.uniandes.sistemagestionuniversitario.negocio.interfaces.*;
import co.edu.uniandes.sistemagestionuniversitario.entidad.*;

/**
 * Implementacion para Session Bean CursoEJB.
 * 
 * @author Grupo 3
 * 
 */
@Stateless
@Local(value=CursoEJBLocal.class)
public class CursoEJB implements CursoEJBLocal {
	
	/** Atributo entityManager. */
	@PersistenceContext(unitName="puProyecto")
	private EntityManager entityManager;
	
  /**
	* M�todo que sirve para insertar registros a la base de datos
	*
	* @param curso, parametro enviado al metodo con tipo de dato: Curso
	*
	*/
	public void insertar (Curso curso){
		entityManager.persist(curso);		
	}
	
  /**
	* M�todo que sirve para actualizar registros a la base de datos
	*
	* @param curso, parametro enviado al metodo con tipo de dato: Curso
	*
	* @return Tipo de retorno Curso
	*/
	public Curso actualizar (Curso curso){
		return entityManager.merge(curso);		
	}
	
  /**
	* M�todo que sirve para encontrarTodos registros a la base de datos
	*
	*
	*
	* @return Tipo de retorno List<Curso>
	*/
	public List<Curso> encontrarTodos (){
		List<Curso> lista = null;		
		try{		
			TypedQuery<Curso> typedQuery = entityManager.createQuery("SELECT t FROM curso t ", Curso.class);		
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
	* @return Tipo de retorno Curso
	*/
	public Curso encontrarPorId (Object id){
		Curso curso = null;		
		try{		
			curso = entityManager.find(Curso.class, id);		
		} catch(Exception e){		
			e.printStackTrace();		
		} finally{		
		}		
		return curso;		
	}
	
  /**
	* M�todo que sirve para remover registros a la base de datos
	*
	* @param id, parametro enviado al metodo con tipo de dato: Object
	*
	*/
	public void remover (Object id){
		try{		
			Curso curso = entityManager.find(Curso.class, id);		
			entityManager.remove(curso);		
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
			cantidadRegistros = (Number)entityManager.createQuery("SELECT COUNT(t) FROM curso t ").getSingleResult();		
		} catch(Exception e){		
			e.printStackTrace();		
		} finally{		
		}		
		return cantidadRegistros.intValue();		
	}
	
}
