package co.edu.uniandes.sistemagestionuniversitario.entidad;

import javax.persistence.*;
import java.io.*;
import java.util.*;
import javax.validation.constraints.*;

/**
 * Entidad Profesor.
 * 
 * @author Grupo 3
 * 
 */
@Entity(name="profesor")
@Table(name="PROFESOR")
public class Profesor  implements Serializable{
	
	/** Constante serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** Atributo profesorId. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PROFESOR_ID")
	private Integer profesorId;
	
	/** Atributo codigo. */
	@Column(name="CODIGO")
	private String codigo;
	
	
	/**
	 * Constructor por defecto de la clase.
	 */
	public Profesor(){}

	/**
	 * Constructor con parametros.
	 *
	* @param profesorId, parametro enviado al metodo con tipo de dato: Integer
	* @param codigo, parametro enviado al metodo con tipo de dato: String
	 */
	public Profesor (Integer profesorId, String codigo){
		this.profesorId = profesorId;
		this.codigo = codigo;
	}
	
	/**
	 * Obtiene el atributo profesorId.
	 *
	 * @return atributo profesorId
	 */
	public Integer getProfesorId(){
		return profesorId;
	}
	
	/**
	 * Modifica el atributo profesorId.
	 *
	 * @param profesorId, es el nuevo valor para el atributo profesorId
	 */
	public void setProfesorId(Integer profesorId){
		this.profesorId = profesorId;
	}
	/**
	 * Obtiene el atributo codigo.
	 *
	 * @return atributo codigo
	 */
	public String getCodigo(){
		return codigo;
	}
	
	/**
	 * Modifica el atributo codigo.
	 *
	 * @param codigo, es el nuevo valor para el atributo codigo
	 */
	public void setCodigo(String codigo){
		this.codigo = codigo;
	}
}
