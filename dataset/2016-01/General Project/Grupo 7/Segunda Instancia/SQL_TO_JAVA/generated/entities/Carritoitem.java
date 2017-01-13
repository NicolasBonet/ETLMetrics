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
* class Carritoitem
*/
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
	* Methods
	*/
	
	/**
	* Constructor
	*/
	public Carritoitem () {
	
	}
	
	public int  getId () {
		return this.id;
	}
	
	public void setId (id) {
		this.id = id; 
	}
	
	public Carrito  getCarrito () {
		return this.carrito;
	}
	
	public void setCarrito (carrito) {
		this.carrito = carrito; 
	}
	
	public Item  getItem () {
		return this.item;
	}
	
	public void setItem (item) {
		this.item = item; 
	}
	
}
