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
public class Carrito{
	
	/**
	* Attributes
	*/
	@Id
	private int id;
	
	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@PrimaryKeyJoinColumn
	@PodamExclude
	private Client client;
	
	@OneToMany(cascade= CascadeType.ALL, mappedBy="carrito")
	private List<Carritoitem> carritoitems;
	
	
	/**
	* Constructor
	*/
	public Carrito () {
	
	}
	
	/**
	* Getters
	*/
	public int getId () {
		return this.id;
	};
	
	public String getName () {
		return this.name;
	};
	
	public Client getClient () {
		return this.client;
	};
	
	public List<Carritoitem> getCarritoitems () {
		return this.carritoitems;
	};
	
	
	/**
	* Setters
	*/
	public void setId (int id) {
		this.id = id;
	};
	
	public void setName (String name) {
		this.name = name;
	};
	
	public void setClient (Client client) {
		this.client = client;
	};
	
	public void setCarritoitems (List<Carritoitem> carritoitems) {
		this.carritoitems = carritoitems;
	};
	
}

