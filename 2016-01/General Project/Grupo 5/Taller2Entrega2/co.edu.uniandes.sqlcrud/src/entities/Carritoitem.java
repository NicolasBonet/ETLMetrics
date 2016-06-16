package entities;

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
		private EEnumLiteral [name=int, value=1, instance=int, literal=int, ] carritoId
		
		private EEnumLiteral [name=int, value=1, instance=int, literal=int, ] itemId
		
	
	@OneToOne	@PodamExclude
	private Carrito id;					
			
	public Carritoitem()
	{
			
	}

		public EEnumLiteral [name=int, value=1, instance=int, literal=int, ] getcarritoId()
		{
			return carritoId;
		}
		
		public void setcarritoId(EEnumLiteral [name=int, value=1, instance=int, literal=int, ] carritoId)
		{
			this.carritoId = carritoId;
		}
		public EEnumLiteral [name=int, value=1, instance=int, literal=int, ] getitemId()
		{
			return itemId;
		}
		
		public void setitemId(EEnumLiteral [name=int, value=1, instance=int, literal=int, ] itemId)
		{
			this.itemId = itemId;
		}
		public Carrito getid()
		{
			return id;
		}
		
		public void setid(Carrito id)
		{
			this.id = id;
		}
