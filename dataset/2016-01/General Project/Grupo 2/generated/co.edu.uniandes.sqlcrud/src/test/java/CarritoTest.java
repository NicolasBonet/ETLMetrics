package test.java;

import static org.junit.Assert.*;

import marketplace.Carrito;
import marketplace.MarketPlace;

import org.junit.runners.MethodSorters;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;

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
		
		assertEquals(carrito.getClient(), mp.getCarrito(carrito.getId()).getClient());
	}
	
	@Test
	public void test2GetCarrito()
	{	
		assertNotNull(mp.getCarrito(mp.getCarritos().get(0).getId()));
	}
	
	@Test
	public void test3CarritoEdit()
	{	
		Carrito carrito = factory.manufacturePojo(Carrito.class);
		factory.populatePojo(carrito);
		
		int primerId = mp.getCarritos().get(0).getId();
		
		mp.editCarrito(primerId
			, carrito.getName()
			, carrito.getClient()
		);
		
		assertEquals(carrito.getName(), mp.getCarrito(primerId).getName());
		assertEquals(carrito.getClient(), mp.getCarrito(primerId).getClient());
		
	}
	
	@Test
	public void test4CarritoDelete()
	{	
		int primerId = mp.getCarritos().get(0).getId();
		
		assertNotNull(mp.getCarrito(primerId));
		
		mp.deleteCarrito(primerId);
		
		assertNull(mp.getCarrito(primerId));
	}

}




