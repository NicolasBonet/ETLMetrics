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
		private int id;
		@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
		@PrimaryKeyJoinColumn
		@PodamExclude	
		private Carrito carritoId; 
	
 
		public Carritoitem()
		{
		
		}
		
		public int getId(){
			return id;
		}
		
		public void setId(int id){
			this.id = id;
		}
		public Carrito getCarrito()
		{
			return carritoId;
		}
		
		public void setCarrito (Carrito carritoid)
		{
			this.carritoId = carritoId;
		}
		
}
