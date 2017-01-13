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
public class Carritoitem
{
   @Id 
@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST) 
@PrimaryKeyJoinColumn 
@PodamExclude  
private Carrito carrito;
   @Id 
@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST) 
@PrimaryKeyJoinColumn 
@PodamExclude  
private Item item;
  
  
  
  public Carritoitem()
  {
  
  }
  
   public Carrito getCarrito(){ return carrito;}
   public void setCarrito(Carrito carrito){this.carrito=carrito;}
   public Item getItem(){ return item;}
   public void setItem(Item item){this.item=item;}
  
  
}