package marketplace;

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
public class Carritoitem
{

	@Id	
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)	
	@PrimaryKeyJoinColumn	
	@PodamExclude	
	private Item item;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)	
	@PrimaryKeyJoinColumn	
	@PodamExclude	
	private Carrito carrito;
	
	
	public Carritoitem(){
	
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public Item getItem(){
		return item;
	}
	
	public void setItem(Item item){
		this.item = item;
	}
	
	public Carrito getCarrito(){
		return carrito;
	}
	
	public void setCarrito(Carrito carrito){
		this.carrito = carrito;
	}
	
	
	
}