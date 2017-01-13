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
public class Producto{
	
	/**
	* Attributes
	*/
	@Id
	private int id;
	
	private String name;
	
	@OneToMany(cascade= CascadeType.ALL, mappedBy="producto")
	private List<Item> items;
	
	
	/**
	* Constructor
	*/
	public Producto () {
	
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
	
	public List<Item> getItems () {
		return this.items;
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
	
	public void setItems (List<Item> items) {
		this.items = items;
	};
	
}

