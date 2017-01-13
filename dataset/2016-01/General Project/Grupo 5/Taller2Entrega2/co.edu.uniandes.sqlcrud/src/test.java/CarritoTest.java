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

	private PodamFactory factory;
	private MarketPlace mp;

	@Before
	public void prepareTest()
	{
		factory = new PodamFactoryImpl();
		mp = new MarketPlace();
	}
	
	@Test
	public void testCarritoadd()
	{
		Carrito obj = factory.manufacturePojo(Carrito.class);
		factory.populatePojo(obj);
		mp.addCarrito(obj);
		
			assertEquals(obj.getid(), mp.getCarrito(obj.getId()).getid());
			assertEquals(obj.getname(), mp.getCarrito(obj.getId()).getname());
			assertEquals(obj.getclientId(), mp.getCarrito(obj.getId()).getclientId());
 
	}
	
	@Test
	public void testCarritoget()
	{
		assertNotNull(mp.getCarrito(mp.getCarritos().get(0).getId()));
	}
	
	@Test
	public void testCarritoedit()
	{
		Carrito obj = factory.manufacturePojo(Carrito.class);
		factory.populatePojo(obj);
		
		int primerId = mp.getCarritos().get(0).getId();
		
		mp.editCarrito(primerId, obj.getid(), obj.getname(), obj.getclientId(), );
		
			assertEquals(obj.getid(), mp.getCarrito(primerId).getid());
			assertEquals(obj.getname(), mp.getCarrito(primerId).getname());
			assertEquals(obj.getclientId(), mp.getCarrito(primerId).getclientId());
 
	}
	
	@Test
	public void testCarritodelete()
	{
		int primerId = mp.getCarritos().get(0).getId();
		
		assertNotNull(mp.getCarrito(primerId));
		
		mp.deleteCarrito(primerId);
		
		assertNull(mp.getCarrito(primerId));
	}

}