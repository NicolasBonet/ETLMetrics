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
public class Carrito
{
@Id		private EEnumLiteral [name=int, value=1, instance=int, literal=int, ] id
		
		private EEnumLiteral [name=String, value=0, instance=String, literal=String, ] name
		
		private EEnumLiteral [name=int, value=1, instance=int, literal=int, ] clientId
		
	
	@OneToOne	@PodamExclude
	private Client id;					
			
	public Carrito()
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
		public EEnumLiteral [name=String, value=0, instance=String, literal=String, ] getname()
		{
			return name;
		}
		
		public void setname(EEnumLiteral [name=String, value=0, instance=String, literal=String, ] name)
		{
			this.name = name;
		}
		public EEnumLiteral [name=int, value=1, instance=int, literal=int, ] getclientId()
		{
			return clientId;
		}
		
		public void setclientId(EEnumLiteral [name=int, value=1, instance=int, literal=int, ] clientId)
		{
			this.clientId = clientId;
		}
		public Client getid()
		{
			return id;
		}
		
		public void setid(Client id)
		{
			this.id = id;
		}
