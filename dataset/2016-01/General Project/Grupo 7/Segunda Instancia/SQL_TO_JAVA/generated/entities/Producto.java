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
* class Producto
*/
@Entity
public class Producto{
	
	/**
	* Attributes
	*/
	@Id	
	private int id;
	
	private String name;
	
	
	/**
	* Methods
	*/
	
	/**
	* Constructor
	*/
	public Producto () {
	
	}
	
	public int  getId () {
		return this.id;
	}
	
	public void setId (id) {
		this.id = id; 
	}
	
	public String  getName () {
		return this.name;
	}
	
	public void setName (name) {
		this.name = name; 
	}
	
}
