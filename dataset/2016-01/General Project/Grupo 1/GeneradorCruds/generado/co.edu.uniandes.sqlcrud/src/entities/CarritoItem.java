package entities;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.FetchType;
import javax.persistence.PrimaryKeyJoinColumn;
import uk.co.jemos.podam.common.PodamExclude;
import javax.persistence.CascadeType;
import javax.persistence.Entity;

/**
* Clase para manejo de la tabla CarritoItem
*
*/
@Entity
public class CarritoItem
{

	@Id
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@PrimaryKeyJoinColumn
	@PodamExclude
	private Carrito carrito;
	
	@Id
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@PrimaryKeyJoinColumn
	@PodamExclude
	private Item item;
	
	
	public CarritoItem()
	{
	}
	
	
	public  Carrito getCarrito()
	{
		return carrito;
	}
	
	public  Item getItem()
	{
		return item;
	}
	
	public  void setCarrito(Carrito carrito)
	{
		this.carrito = carrito;
	}
	
	public  void setItem(Item item)
	{
		this.item = item;
	}
	
}

