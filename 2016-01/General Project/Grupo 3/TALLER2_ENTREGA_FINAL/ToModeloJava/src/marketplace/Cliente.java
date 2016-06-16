package marketplace;

import javax.persistence.*;
import uk.co.jemos.podam.common.PodamExclude;
import java.util.List;

@Entity
public class Cliente {

   /*Properties*/
    @Id
	private int id;
    
	private String name;
    
	private String password;
	@OneToMany(cascade= CascadeType.ALL, mappedBy="cliente")
	@PodamExclude
	private List<Carrito> carritos;

   /*Getters and Setters*/
	public int getId() { return id; }
	public void setId(int id){this.id= id;}
	public String getName() { return name; }
	public void setName(String name){this.name= name;}
	public String getPassword() { return password; }
	public void setPassword(String password){this.password= password;}
	public List<Carrito> getCarritos() { return carritos; }
	public void setCarritos(List<Carrito> carritos){this.carritos = carritos;}

   /*Methods*/

}




