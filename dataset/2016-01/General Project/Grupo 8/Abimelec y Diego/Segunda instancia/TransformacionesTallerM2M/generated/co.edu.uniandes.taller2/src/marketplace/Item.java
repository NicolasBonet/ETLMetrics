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
		private String name;
		
		@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
		@PrimaryKeyJoinColumn
		@PodamExclude	
		private Producto productoId; 
	
	@OneToMany(cascade= CascadeType.ALL, mappedBy="item")
	@PodamExclude
    private List<Carritoitem> carritoitems;
    
 
		public Item()
		{
		
		}
		
		public int getId(){
			return id;
		}
		
		public void setId(int Id){
			this.id = Id;
		}
		
		public Producto getProducto()
		{
			return productoId;
		}
		
		public void setProducto (Producto productoid)
		{
			this.productoId = productoId;
		}
		
}
