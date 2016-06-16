package entities;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import uk.co.jemos.podam.common.PodamExclude;
import java.util.List;
import javax.persistence.Entity;

/**
* Clase para manejo de la tabla Producto
*
*/
@Entity
public class Producto
{


	private String name;
	
	@Id
	private int id;
	
	@OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
	@PodamExclude
	private List<Item> items;
	
	
	public Producto()
	{
	}
	
	
	public  String getName()
	{
		return name;
	}
	
	public  int getId()
	{
		return id;
	}
	
	public  List<Item> getItems()
	{
		return items;
	}
	
	public  void setName(String name)
	{
		this.name = name;
	}
	
	public  void setId(int id)
	{
		this.id = id;
	}
	
	public  void setItems(List<Item> items)
	{
		this.items = items;
	}
	
}

