import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

import uk.co.jemos.podam.common.PodamExclude;

/*
* class Item
*/
@Entity
public class Item{
	
	/**
	* Attributes
	*/
	@Id	
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@PrimaryKeyJoinColumn	
	@PodamExclude	
	private Producto producto;
	
	private int cantidad;
	
	private String name;
	
	
	/**
	* Methods
	*/
	
	/**
	* Constructor
	*/
	public Item () {
	
	}
	
	public int  getId () {
		return this.id;
	}
	
	public void setId (id) {
		this.id = id; 
	}
	
	public Producto  getProducto () {
		return this.producto;
	}
	
	public void setProducto (producto) {
		this.producto = producto; 
	}
	
	public int  getCantidad () {
		return this.cantidad;
	}
	
	public void setCantidad (cantidad) {
		this.cantidad = cantidad; 
	}
	
	public String  getName () {
		return this.name;
	}
	
	public void setName (name) {
		this.name = name; 
	}
	
}
