package marketplace;

import javax.persistence.*;
import uk.co.jemos.podam.common.PodamExclude;
import java.util.List;

@Entity
public class Producto {

   /*Properties*/
    @Id
	private int id;
    
	private String name;
	@OneToMany(cascade= CascadeType.ALL, mappedBy="producto")
	@PodamExclude
	private List<Item> items;

   /*Getters and Setters*/
	public int getId() { return id; }
	public void setId(int id){this.id= id;}
	public String getName() { return name; }
	public void setName(String name){this.name= name;}
	public List<Item> getItems() { return items; }
	public void setItems(List<Item> items){this.items = items;}

   /*Methods*/

}




