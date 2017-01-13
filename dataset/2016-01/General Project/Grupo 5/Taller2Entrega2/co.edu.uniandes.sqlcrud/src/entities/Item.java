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
public class Item
{
@Id		private EEnumLiteral [name=int, value=1, instance=int, literal=int, ] id
		
		private EEnumLiteral [name=int, value=1, instance=int, literal=int, ] cantidad
		
		private EEnumLiteral [name=String, value=0, instance=String, literal=String, ] name
		
		private EEnumLiteral [name=int, value=1, instance=int, literal=int, ] productoId
		
			
	public Item()
	{
			
	}

		public EEnumLiteral [name=int, value=1, instance=int, literal=int, ] getid()
		{
			return id;
		}
		
		public void setid(EEnumLiteral [name=int, value=1, instance=int, literal=int, ] id)
		{
			this.id = id;
		}
		public EEnumLiteral [name=int, value=1, instance=int, literal=int, ] getcantidad()
		{
			return cantidad;
		}
		
		public void setcantidad(EEnumLiteral [name=int, value=1, instance=int, literal=int, ] cantidad)
		{
			this.cantidad = cantidad;
		}
		public EEnumLiteral [name=String, value=0, instance=String, literal=String, ] getname()
		{
			return name;
		}
		
		public void setname(EEnumLiteral [name=String, value=0, instance=String, literal=String, ] name)
		{
			this.name = name;
		}
		public EEnumLiteral [name=int, value=1, instance=int, literal=int, ] getproductoId()
		{
			return productoId;
		}
		
		public void setproductoId(EEnumLiteral [name=int, value=1, instance=int, literal=int, ] productoId)
		{
			this.productoId = productoId;
		}
