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
public class Client
{
 
		@Id
		private int id;
		private String password;
		
		private String name;
		
	@OneToMany(cascade= CascadeType.ALL, mappedBy="client")
	@PodamExclude
    private List<Carrito> carritos;
    
 
		public Client()
		{
		
		}
		
		public int getId(){
			return id;
		}
		
		public void setId(int Id){
			this.id = Id;
		}
		
}
