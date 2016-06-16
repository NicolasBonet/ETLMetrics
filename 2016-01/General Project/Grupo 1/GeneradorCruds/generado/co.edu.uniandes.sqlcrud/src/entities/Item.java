package entities;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.FetchType;
import javax.persistence.PrimaryKeyJoinColumn;
import uk.co.jemos.podam.common.PodamExclude;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.List;
import javax.persistence.Entity;

/**
* Clase para manejo de la tabla Item
*
*/
@Entity
public class Item
{

	@Id
	private int id;
	
	
	private int cantidad;
	
	
	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@PrimaryKeyJoinColumn
	@PodamExclude
	private Producto producto;
	
	@OneToMany(mappedBy = "item", cascade = CascadeType.ALL)
	@PodamExclude
	private List<CarritoItem> carritoItems;
	
	
	public Item()
	{
	}
	
	
	public  int getId()
	{
		return id;
	}
	
	public  int getCantidad()
	{
		return cantidad;
	}
	
	public  String getName()
	{
		return name;
	}
	
	public  Producto getProducto()
	{
		return producto;
	}
	
	public  List<CarritoItem> getCarritoItems()
	{
		return carritoItems;
	}
	
	public  void setId(int id)
	{
		this.id = id;
	}
	
	public  void setCantidad(int cantidad)
	{
		this.cantidad = cantidad;
	}
	
	public  void setName(String name)
	{
		this.name = name;
	}
	
	public  void setProducto(Producto producto)
	{
		this.producto = producto;
	}
	
	public  void setCarritoItems(List<CarritoItem> carritoItems)
	{
		this.carritoItems = carritoItems;
	}
	
}

