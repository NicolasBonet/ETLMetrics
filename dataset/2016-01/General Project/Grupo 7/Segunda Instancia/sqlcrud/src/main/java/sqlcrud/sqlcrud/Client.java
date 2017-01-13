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
public class Client{
	
	/**
	* Attributes
	*/
	@Id
	private int id;
	
	private String password;
	
	private String name;
	
	@OneToMany(cascade= CascadeType.ALL, mappedBy="client")
	private List<Carrito> carritos;
	
	
	/**
	* Constructor
	*/
	public Client () {
	
	}
	
	/**
	* Getters
	*/
	public int getId () {
		return this.id;
	};
	
	public String getPassword () {
		return this.password;
	};
	
	public String getName () {
		return this.name;
	};
	
	public List<Carrito> getCarritos () {
		return this.carritos;
	};
	
	
	/**
	* Setters
	*/
	public void setId (int id) {
		this.id = id;
	};
	
	public void setPassword (String password) {
		this.password = password;
	};
	
	public void setName (String name) {
		this.name = name;
	};
	
	public void setCarritos (List<Carrito> carritos) {
		this.carritos = carritos;
	};
	
}

