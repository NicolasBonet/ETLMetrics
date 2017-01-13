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
* class Carrito
*/
@Entity
public class Carrito{
	
	/**
	* Attributes
	*/
	@Id	
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@PrimaryKeyJoinColumn	
	@PodamExclude	
	private Client client;
	
	private String name;
	
	
	/**
	* Methods
	*/
	
	/**
	* Constructor
	*/
	public Carrito () {
	
	}
	
	public int  getId () {
		return this.id;
	}
	
	public void setId (id) {
		this.id = id; 
	}
	
	public Client  getClient () {
		return this.client;
	}
	
	public void setClient (client) {
		this.client = client; 
	}
	
	public String  getName () {
		return this.name;
	}
	
	public void setName (name) {
		this.name = name; 
	}
	
}
