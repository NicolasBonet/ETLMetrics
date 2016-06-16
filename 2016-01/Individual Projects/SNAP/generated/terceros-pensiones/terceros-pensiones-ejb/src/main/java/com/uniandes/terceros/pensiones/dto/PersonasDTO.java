package com.uniandes.terceros.pensiones.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PersonasDTO implements Serializable {

	private String tipoidentificacion;
	private String numeroidentificacion;
	private String primerapellido;
	private String segundoapellido;
	private String primernombre;
	private String segundonombre;
	private int id;
	private List<AbonosDTO> abonos = new ArrayList<AbonosDTO>();
	
	public  PersonasDTO(){
		
	}
	
	public String getPrimernombre(){
		return this.primernombre;
	}
	
	public void setSegundoapellido(String segundoapellido){
		this.segundoapellido = segundoapellido;
	}
	
	public void setPrimerapellido(String primerapellido){
		this.primerapellido = primerapellido;
	}
	
	public String getSegundoapellido(){
		return this.segundoapellido;
	}
	
	public void setNumeroidentificacion(String numeroidentificacion){
		this.numeroidentificacion = numeroidentificacion;
	}
	
	public void setSegundonombre(String segundonombre){
		this.segundonombre = segundonombre;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getNumeroidentificacion(){
		return this.numeroidentificacion;
	}
	
	public String getSegundonombre(){
		return this.segundonombre;
	}
	
	public String getTipoidentificacion(){
		return this.tipoidentificacion;
	}
	
	public String getPrimerapellido(){
		return this.primerapellido;
	}
	
	public void setPrimernombre(String primernombre){
		this.primernombre = primernombre;
	}
	
	public void setTipoidentificacion(String tipoidentificacion){
		this.tipoidentificacion = tipoidentificacion;
	}
	
	public int getId(){
		return this.id;
	}
	
	public List<AbonosDTO> getAbonos(){
		return this.abonos;
	}
	
	public void setAbonos(List<AbonosDTO> abonos){
		this.abonos=abonos;
	}
	
	
	
}
