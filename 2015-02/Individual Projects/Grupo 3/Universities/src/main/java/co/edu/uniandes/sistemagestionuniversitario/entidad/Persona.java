package co.edu.uniandes.sistemagestionuniversitario.entidad;

import javax.persistence.*;
import java.io.*;
import java.util.*;
import javax.validation.constraints.*;

/**
 * Entidad Persona.
 * 
 * @author Grupo 3
 * 
 */
@Entity(name="persona")
@Table(name="PERSONA")
public class Persona  implements Serializable{
	
	/** Constante serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** Atributo personaId. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PERSONA_ID")
	private Integer personaId;
	
	/** Atributo nombre. */
	@Column(name="NOMBRE")
	private String nombre;
	
	/** Atributo apellido. */
	@Column(name="APELLIDO")
	private String apellido;
	
	/** Atributo documento. */
	@Column(name="DOCUMENTO")
	private String documento;
	
	/** Atributo direccion. */
	@Column(name="DIRECCION")
	private String direccion;
	
	/** Atributo edad. */
	@Column(name="EDAD")
	@Min(value=18)
	private Integer edad;
	
	/** Atributo viveBogota. */
	@Column(name="VIVEBOGOTA")
	private Boolean viveBogota;
	
	
	/**
	 * Constructor por defecto de la clase.
	 */
	public Persona(){}

	/**
	 * Constructor con parametros.
	 *
	* @param personaId, parametro enviado al metodo con tipo de dato: Integer
	* @param nombre, parametro enviado al metodo con tipo de dato: String
	* @param apellido, parametro enviado al metodo con tipo de dato: String
	* @param documento, parametro enviado al metodo con tipo de dato: String
	* @param direccion, parametro enviado al metodo con tipo de dato: String
	* @param edad, parametro enviado al metodo con tipo de dato: Integer
	* @param viveBogota, parametro enviado al metodo con tipo de dato: Boolean
	 */
	public Persona (Integer personaId, String nombre, String apellido, String documento, String direccion, Integer edad, Boolean viveBogota){
		this.personaId = personaId;
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.direccion = direccion;
		this.edad = edad;
		this.viveBogota = viveBogota;
	}
	
	/**
	 * Obtiene el atributo personaId.
	 *
	 * @return atributo personaId
	 */
	public Integer getPersonaId(){
		return personaId;
	}
	
	/**
	 * Modifica el atributo personaId.
	 *
	 * @param personaId, es el nuevo valor para el atributo personaId
	 */
	public void setPersonaId(Integer personaId){
		this.personaId = personaId;
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
	 * Obtiene el atributo apellido.
	 *
	 * @return atributo apellido
	 */
	public String getApellido(){
		return apellido;
	}
	
	/**
	 * Modifica el atributo apellido.
	 *
	 * @param apellido, es el nuevo valor para el atributo apellido
	 */
	public void setApellido(String apellido){
		this.apellido = apellido;
	}
	/**
	 * Obtiene el atributo documento.
	 *
	 * @return atributo documento
	 */
	public String getDocumento(){
		return documento;
	}
	
	/**
	 * Modifica el atributo documento.
	 *
	 * @param documento, es el nuevo valor para el atributo documento
	 */
	public void setDocumento(String documento){
		this.documento = documento;
	}
	/**
	 * Obtiene el atributo direccion.
	 *
	 * @return atributo direccion
	 */
	public String getDireccion(){
		return direccion;
	}
	
	/**
	 * Modifica el atributo direccion.
	 *
	 * @param direccion, es el nuevo valor para el atributo direccion
	 */
	public void setDireccion(String direccion){
		this.direccion = direccion;
	}
	/**
	 * Obtiene el atributo edad.
	 *
	 * @return atributo edad
	 */
	public Integer getEdad(){
		return edad;
	}
	
	/**
	 * Modifica el atributo edad.
	 *
	 * @param edad, es el nuevo valor para el atributo edad
	 */
	public void setEdad(Integer edad){
		this.edad = edad;
	}
	/**
	 * Obtiene el atributo viveBogota.
	 *
	 * @return atributo viveBogota
	 */
	public Boolean getViveBogota(){
		return viveBogota;
	}
	
	/**
	 * Modifica el atributo viveBogota.
	 *
	 * @param viveBogota, es el nuevo valor para el atributo viveBogota
	 */
	public void setViveBogota(Boolean viveBogota){
		this.viveBogota = viveBogota;
	}
}
