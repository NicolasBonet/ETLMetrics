package com.uniandes.terceros.pensiones.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NamedQuery(name="Personas.findAll", query="SELECT p FROM Personas p")
public class Personas implements Serializable {

	private String tipoidentificacion;
	private String numeroidentificacion;
	private String primerapellido;
	private String segundoapellido;
	private String primernombre;
	private String segundonombre;
	@Id
	@SequenceGenerator(name="PERSONAS_ID_GENERATOR", sequenceName="PERSONAS_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PERSONAS_ID_GENERATOR")
	private int id;
	@OneToMany(mappedBy="personas", orphanRemoval=true, cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
	private List<Abonos> abonos = new ArrayList<Abonos>();
	
	public String getTipoidentificacion(){
		return this.tipoidentificacion;
	}
	
	public String getPrimerapellido(){
		return this.primerapellido;
	}
	
	public void setSegundonombre(String segundonombre){
		this.segundonombre = segundonombre;
	}
	
	public void setNumeroidentificacion(String numeroidentificacion){
		this.numeroidentificacion = numeroidentificacion;
	}
	
	public void setSegundoapellido(String segundoapellido){
		this.segundoapellido = segundoapellido;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getNumeroidentificacion(){
		return this.numeroidentificacion;
	}
	
	public String getSegundoapellido(){
		return this.segundoapellido;
	}
	
	public void setPrimerapellido(String primerapellido){
		this.primerapellido = primerapellido;
	}
	
	public int getId(){
		return this.id;
	}
	
	public String getSegundonombre(){
		return this.segundonombre;
	}
	
	public Abonos removeAbonos(Abonos abonos){
		getAbonos().remove(abonos);
		abonos.setPersonas(null);
		return abonos;
	}
	
	public void setTipoidentificacion(String tipoidentificacion){
		this.tipoidentificacion = tipoidentificacion;
	}
	
	public String getPrimernombre(){
		return this.primernombre;
	}
	
	public List<Abonos> getAbonos(){
		return this.abonos;
	}
	
	public  Personas(){
		
	}
	
	public Abonos addAbonos(Abonos abonos){
		getAbonos().add(abonos);
		abonos.setPersonas(this);
		return abonos;
	}
	
	public void setAbonos(List<Abonos> abonos){
		this.abonos=abonos;
	}
	
	public void setPrimernombre(String primernombre){
		this.primernombre = primernombre;
	}
	
	
	
}
