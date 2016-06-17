package co.edu.uniandes.sistemagestionuniversitario.entidad;

import javax.persistence.*;
import java.io.*;
import java.util.*;
import javax.validation.constraints.*;

/**
 * Entidad Ciudad.
 * 
 * @author Grupo 3
 * 
 */
@Entity(name="ciudad")
@Table(name="CIUDAD")
public class Ciudad  implements Serializable{
	
	/** Constante serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** Atributo ciudadId. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CIUDAD_ID")
	private Integer ciudadId;
	
	/** Atributo nombre. */
	@Column(name="NOMBRE")
	private String nombre;
	
	
	/**
	 * Constructor por defecto de la clase.
	 */
	public Ciudad(){}

	/**
	 * Constructor con parametros.
	 *
	* @param ciudadId, parametro enviado al metodo con tipo de dato: Integer
	* @param nombre, parametro enviado al metodo con tipo de dato: String
	 */
	public Ciudad (Integer ciudadId, String nombre){
		this.ciudadId = ciudadId;
		this.nombre = nombre;
	}
	
	/**
	 * Obtiene el atributo ciudadId.
	 *
	 * @return atributo ciudadId
	 */
	public Integer getCiudadId(){
		return ciudadId;
	}
	
	/**
	 * Modifica el atributo ciudadId.
	 *
	 * @param ciudadId, es el nuevo valor para el atributo ciudadId
	 */
	public void setCiudadId(Integer ciudadId){
		this.ciudadId = ciudadId;
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
}
