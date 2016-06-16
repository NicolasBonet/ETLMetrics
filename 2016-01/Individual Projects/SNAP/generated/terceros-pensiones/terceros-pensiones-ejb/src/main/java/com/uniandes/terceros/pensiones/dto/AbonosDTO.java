package com.uniandes.terceros.pensiones.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AbonosDTO implements Serializable {

	private String nAbono;
	private String foo;
	private String tipoidentificacion;
	private int id;
	
	public  AbonosDTO(){
		
	}
	
	public String getNabono(){
		return this.nabono;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
		return this.id;
	}
	
	public String getFoo(){
		return this.foo;
	}
	
	public void setFoo(String foo){
		this.foo = foo;
	}
	
	public void setNabono(String nAbono){
		this.nabono = nabono;
	}
	
	
	
}
