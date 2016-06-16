package com.uniandes.terceros.pensiones.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NamedQuery(name="Abonos.findAll", query="SELECT p FROM Abonos p")
public class Abonos implements Serializable {

	private String nAbono;
	private String foo;
	@ManyToOne
	@JoinColumn(name="ID_PERSONAS")
	private Personas personas;
	@Id
	@SequenceGenerator(name="ABONOS_ID_GENERATOR", sequenceName="ABONOS_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ABONOS_ID_GENERATOR")
	private int id;
	
	public int getId(){
		return this.id;
	}
	
	public String getNAbono(){
		return this.nAbono;
	}
	
	public Personas getPersonas(){
		return this.personas;
	}
	
	public  Abonos(){
		
	}
	
	public String getFoo(){
		return this.foo;
	}
	
	public void setPersonas(Personas personas){
		this.personas = personas;
	}
	
	public void setNAbono(String nAbono){
		this.nAbono = nAbono;
	}
	
	public void setFoo(String foo){
		this.foo = foo;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	
	
}
