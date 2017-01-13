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

package test.java;

import static org.junit.Assert.*;

import marketplace.Carrito;
import marketplace.MarketPlace;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CarritoTest
{
	private MarketPlace mp;
	private PodamFactory factory;
	
	@Before
	public void prepareTest()
	{
		mp = new MarketPlace();
		factory = new PodamFactoryImpl();
	}
	@Test
	public void test1CarritoAdd()
	{	
		Carrito carrito = factory.manufacturePojo(Carrito.class);
		factory.populatePojo(carrito);
		mp.addCarrito(carrito);
		
		assertEquals(carrito.getId(), mp.getCarrito(carrito.getId()).getId());
		assertEquals(carrito.getName(), mp.getCarrito(carrito.getId()).getName()); 
assertEquals(carrito.getClientId(), mp.getCarrito(carrito.getId()).getClientId()); 
	
	}
	@Test
	public void test2GetCarrito()
	{	
		
		assertEquals(mp.getCarrito(mp.getCarrito().get(0).getId()));
		
	}
	@Test
	public void test3CarritoEdit()
	{	
		Carrito carrito = factory.manufacturePojo(Carrito.class);
		factory.populatePojo(carrito);
		int primerId = mp.getCarrito().get(0).getId();
					
		assertEquals(carrito.getName(), mp.getCarrito(carrito.getId()).getName()); 
assertEquals(carrito.getClientId(), mp.getCarrito(carrito.getId()).getClientId()); 
assertEquals(carrito.getName(), mp.getCarrito(primerId).getName()); 
assertEquals(carrito.getClientId(), mp.getCarrito(primerId).getClientId()); 

	
	}
	@Test
	public void test4CarritoDelete()
	{
		
		int primerId = mp.getCarrito().get(0).getId();
		
		assertNotNull(mp.getCarrito(primerId));
		
		mp.deleteCarrito(primerId);
		
		assertNull(mp.getCarrito(primerId));
		
		 
		
	}
	
	
	
}	
