package marketplace;

import javax.persistence.*;
import uk.co.jemos.podam.common.PodamExclude;
import java.util.List;

@Entity
public class Carrito {

   /*Properties*/
    @Id
	private int id;
    
	private String name;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@PrimaryKeyJoinColumn
	private Cliente cliente;
	@OneToMany(cascade= CascadeType.ALL, mappedBy="carrito")
	@PodamExclude
	private List<CarritoItem> carritoItems;

   /*Getters and Setters*/
	public int getId() { return id; }
	public void setId(int id){this.id= id;}
	public String getName() { return name; }
	public void setName(String name){this.name= name;}
	public Cliente getCliente() { return cliente; }
	public void setCliente(Cliente cliente){this.cliente= cliente;}
	public List<CarritoItem> getCarritoItems() { return carritoItems; }
	public void setCarritoItems(List<CarritoItem> carritoItems){this.carritoItems = carritoItems;}

   /*Methods*/

}




