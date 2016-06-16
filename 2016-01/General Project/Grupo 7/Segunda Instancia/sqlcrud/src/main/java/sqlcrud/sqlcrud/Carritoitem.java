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
public class Carritoitem{
	
	/**
	* Attributes
	*/
	@Id
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@PrimaryKeyJoinColumn
	@PodamExclude
	private Carrito carrito;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@PrimaryKeyJoinColumn
	@PodamExclude
	private Item item;
	
	
	/**
	* Constructor
	*/
	public Carritoitem () {
	
	}
	
	/**
	* Getters
	*/
	public int getId () {
		return this.id;
	};
	
	public Carrito getCarrito () {
		return this.carrito;
	};
	
	public Item getItem () {
		return this.item;
	};
	
	
	/**
	* Setters
	*/
	public void setId (int id) {
		this.id = id;
	};
	
	public void setCarrito (Carrito carrito) {
		this.carrito = carrito;
	};
	
	public void setItem (Item item) {
		this.item = item;
	};
	
}

