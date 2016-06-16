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
public class Producto
{
   private String name;
   @Id 
private int id;
  
     @OneToMany(cascade = CascadeType.ALL, mappedBy="producto")
     @PodamExclude
     private List<Item> item;
  
  
  public Producto()
  {
  
  }
  
   public String getName(){ return name;}
   public void setName(String name){this.name=name;}
   public int getId(){ return id;}
   public void setId(int id){this.id=id;}
  
      public List<Item> getItems(){return item ;}
      public void setItems(List<Item> items){this.item = items;}
  
}