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
* Clase para manejo de la tabla Carrito
*
*/
@Entity
public class Carrito
{

	@Id
	private int id;
	
	
	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@PrimaryKeyJoinColumn
	@PodamExclude
	private Client client;
	
	@OneToMany(mappedBy = "carrito", cascade = CascadeType.ALL)
	@PodamExclude
	private List<CarritoItem> carritoItems;
	
	
	public Carrito()
	{
	}
	
	
	public  int getId()
	{
		return id;
	}
	
	public  String getName()
	{
		return name;
	}
	
	public  Client getClient()
	{
		return client;
	}
	
	public  List<CarritoItem> getCarritoItems()
	{
		return carritoItems;
	}
	
	public  void setId(int id)
	{
		this.id = id;
	}
	
	public  void setName(String name)
	{
		this.name = name;
	}
	
	public  void setClient(Client client)
	{
		this.client = client;
	}
	
	public  void setCarritoItems(List<CarritoItem> carritoItems)
	{
		this.carritoItems = carritoItems;
	}
	
}

