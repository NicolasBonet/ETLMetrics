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
public class CarritoitemTest
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
	public void testCarritoitemadd()
	{
		Carritoitem obj = factory.manufacturePojo(Carritoitem.class);
		factory.populatePojo(obj);
		mp.addCarritoitem(obj);
		
			assertEquals(obj.getcarritoId(), mp.getCarritoitem(obj.getId()).getcarritoId());
			assertEquals(obj.getitemId(), mp.getCarritoitem(obj.getId()).getitemId());
 
	}
	
	@Test
	public void testCarritoitemget()
	{
		assertNotNull(mp.getCarritoitem(mp.getCarritoitems().get(0).getId()));
	}
	
	@Test
	public void testCarritoitemedit()
	{
		Carritoitem obj = factory.manufacturePojo(Carritoitem.class);
		factory.populatePojo(obj);
		
		int primerId = mp.getCarritoitems().get(0).getId();
		
		mp.editCarritoitem(primerId, obj.getcarritoId(), obj.getitemId(), );
		
			assertEquals(obj.getcarritoId(), mp.getCarritoitem(primerId).getcarritoId());
			assertEquals(obj.getitemId(), mp.getCarritoitem(primerId).getitemId());
 
	}
	
	@Test
	public void testCarritoitemdelete()
	{
		int primerId = mp.getCarritoitems().get(0).getId();
		
		assertNotNull(mp.getCarritoitem(primerId));
		
		mp.deleteCarritoitem(primerId);
		
		assertNull(mp.getCarritoitem(primerId));
	}

}