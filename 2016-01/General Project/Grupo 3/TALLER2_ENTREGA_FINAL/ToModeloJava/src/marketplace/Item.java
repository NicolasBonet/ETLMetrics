package marketplace;

import javax.persistence.*;
import uk.co.jemos.podam.common.PodamExclude;
import java.util.List;

@Entity
public class Item {

   /*Properties*/
    @Id
	private int id;
    
	private String name;
    
	private double cantidad;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@PrimaryKeyJoinColumn
	private Producto producto;

   /*Getters and Setters*/
	public int getId() { return id; }
	public void setId(int id){this.id= id;}
	public String getName() { return name; }
	public void setName(String name){this.name= name;}
	public double getCantidad() { return cantidad; }
	public void setCantidad(double cantidad){this.cantidad= cantidad;}
	public Producto getProducto() { return producto; }
	public void setProducto(Producto producto){this.producto= producto;}

   /*Methods*/

}




