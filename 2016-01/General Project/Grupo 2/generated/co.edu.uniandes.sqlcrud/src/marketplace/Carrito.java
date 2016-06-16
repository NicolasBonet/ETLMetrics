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
public class Carrito
{

	@Id	
	private int id;
	
	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)	
	@PrimaryKeyJoinColumn	
	@PodamExclude	
	private Client client;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="carrito")	
	@PodamExclude	
	private List<Carritoitem> carritoitems;
	
	
	public Carrito(){
	
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public Client getClient(){
		return client;
	}
	
	public void setClient(Client client){
		this.client = client;
	}
	
	public List<Carritoitem> getCarritoitems(){
		return carritoitems;
	}
	
	public void setCarritoitems(List<Carritoitem> carritoitems){
		this.carritoitems = carritoitems;
	}
	
	
	
}