package sqlcrud.sqlcrud;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

import uk.co.jemos.podam.common.PodamExclude;

@Entity
public class Item{
	
	/**
	* Attributes
	*/
	@Id
	private int id;
	
	private int cantidad;
	
	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@PrimaryKeyJoinColumn
	@PodamExclude
	private Producto producto;
	
	@OneToMany(cascade= CascadeType.ALL, mappedBy="item")
	private List<Carritoitem> carritoitems;
	
	
	/**
	* Constructor
	*/
	public Item () {
	
	}
	
	/**
	* Getters
	*/
	public int getId () {
		return this.id;
	};
	
	public int getCantidad () {
		return this.cantidad;
	};
	
	public String getName () {
		return this.name;
	};
	
	public Producto getProducto () {
		return this.producto;
	};
	
	public List<Carritoitem> getCarritoitems () {
		return this.carritoitems;
	};
	
	
	/**
	* Setters
	*/
	public void setId (int id) {
		this.id = id;
	};
	
	public void setCantidad (int cantidad) {
		this.cantidad = cantidad;
	};
	
	public void setName (String name) {
		this.name = name;
	};
	
	public void setProducto (Producto producto) {
		this.producto = producto;
	};
	
	public void setCarritoitems (List<Carritoitem> carritoitems) {
		this.carritoitems = carritoitems;
	};
	
}

