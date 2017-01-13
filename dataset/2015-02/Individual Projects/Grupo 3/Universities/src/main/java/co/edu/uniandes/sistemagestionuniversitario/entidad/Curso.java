package co.edu.uniandes.sistemagestionuniversitario.entidad;

import javax.persistence.*;
import java.io.*;
import java.util.*;
import javax.validation.constraints.*;

/**
 * Entidad Curso.
 * 
 * @author Grupo 3
 * 
 */
@Entity(name="curso")
@Table(name="CURSO")
public class Curso  implements Serializable{
	
	/** Constante serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** Atributo cursoId. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CURSO_ID")
	private Integer cursoId;
	
	/** Atributo nombre. */
	@Column(name="NOMBRE")
	private String nombre;
	
	/** Atributo profesor. */
	@ManyToOne
	@JoinColumn(name="PROFESOR_ID")
	private Profesor profesor;
	
	
	/**
	 * Constructor por defecto de la clase.
	 */
	public Curso(){}

	/**
	 * Constructor con parametros.
	 *
	* @param cursoId, parametro enviado al metodo con tipo de dato: Integer
	* @param nombre, parametro enviado al metodo con tipo de dato: String
	* @param profesor, parametro enviado al metodo con tipo de dato: Profesor
	 */
	public Curso (Integer cursoId, String nombre, Profesor profesor){
		this.cursoId = cursoId;
		this.nombre = nombre;
		this.profesor = profesor;
	}
	
	/**
	 * Obtiene el atributo cursoId.
	 *
	 * @return atributo cursoId
	 */
	public Integer getCursoId(){
		return cursoId;
	}
	
	/**
	 * Modifica el atributo cursoId.
	 *
	 * @param cursoId, es el nuevo valor para el atributo cursoId
	 */
	public void setCursoId(Integer cursoId){
		this.cursoId = cursoId;
	}
	/**
	 * Obtiene el atributo nombre.
	 *
	 * @return atributo nombre
	 */
	public String getNombre(){
		return nombre;
	}
	
	/**
	 * Modifica el atributo nombre.
	 *
	 * @param nombre, es el nuevo valor para el atributo nombre
	 */
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	/**
	 * Obtiene el atributo profesor.
	 *
	 * @return atributo profesor
	 */
	public Profesor getProfesor(){
		return profesor;
	}
	
	/**
	 * Modifica el atributo profesor.
	 *
	 * @param profesor, es el nuevo valor para el atributo profesor
	 */
	public void setProfesor(Profesor profesor){
		this.profesor = profesor;
	}
}
