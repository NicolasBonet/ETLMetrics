package marketplace;

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
public class Item
{
   @Id 
private int id;
   private int cantidad;
   private String name;
   @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST) 
@PrimaryKeyJoinColumn 
@PodamExclude  
private Producto producto;
  
     @OneToMany(cascade = CascadeType.ALL, mappedBy="item")
     @PodamExclude
     private List<Carritoitem> carritoitem;
  
  
  public Item()
  {
  
  }
  
   public int getId(){ return id;}
   public void setId(int id){this.id=id;}
   public int getCantidad(){ return cantidad;}
   public void setCantidad(int cantidad){this.cantidad=cantidad;}
   public String getName(){ return name;}
   public void setName(String name){this.name=name;}
   public Producto getProducto(){ return producto;}
   public void setProducto(Producto producto){this.producto=producto;}
  
      public List<Carritoitem> getCarritoitems(){return carritoitem ;}
      public void setCarritoitems(List<Carritoitem> carritoitems){this.carritoitem = carritoitems;}
  
}