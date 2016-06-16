package marketplace;

import javax.persistence.*;
import uk.co.jemos.podam.common.PodamExclude;
import java.util.List;

@Entity
public class CarritoItem {

   /*Properties*/
    @Id
	private int id;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@PrimaryKeyJoinColumn
	private Carrito carrito;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@PrimaryKeyJoinColumn
	private Item item;

   /*Getters and Setters*/
	public int getId() { return id; }
	public void setId(int id){this.id= id;}
	public Carrito getCarrito() { return carrito; }
	public void setCarrito(Carrito carrito){this.carrito= carrito;}
	public Item getItem() { return item; }
	public void setItem(Item item){this.item= item;}

   /*Methods*/

}




