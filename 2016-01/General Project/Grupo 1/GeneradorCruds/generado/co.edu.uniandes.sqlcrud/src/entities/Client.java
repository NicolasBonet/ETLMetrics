package entities;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import uk.co.jemos.podam.common.PodamExclude;
import java.util.List;
import javax.persistence.Entity;

/**
* Clase para manejo de la tabla Client
*
*/
@Entity
public class Client
{

	@Id
	private int id;
	
	
	private String password;
	
	
	private String name;
	
	@OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
	@PodamExclude
	private List<Carrito> carritos;
	
	
	public Client()
	{
	}
	
	
	public  int getId()
	{
		return id;
	}
	
	public  String getPassword()
	{
		return password;
	}
	
	public  String getName()
	{
		return name;
	}
	
	public  List<Carrito> getCarritos()
	{
		return carritos;
	}
	
	public  void setId(int id)
	{
		this.id = id;
	}
	
	public  void setPassword(String password)
	{
		this.password = password;
	}
	
	public  void setName(String name)
	{
		this.name = name;
	}
	
	public  void setCarritos(List<Carrito> carritos)
	{
		this.carritos = carritos;
	}
	
}

