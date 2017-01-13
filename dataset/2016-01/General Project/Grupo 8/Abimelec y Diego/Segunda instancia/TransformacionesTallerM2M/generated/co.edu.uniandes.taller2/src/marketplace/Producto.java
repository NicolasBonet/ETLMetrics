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
 
		@Id
		private int id;
		private String name;
		
	@OneToMany(cascade= CascadeType.ALL, mappedBy="producto")
	@PodamExclude
    private List<Item> items;
    
 
		public Producto()
		{
		
		}
		
		public int getId(){
			return id;
		}
		
		public void setId(int Id){
			this.id = Id;
		}
		
}
