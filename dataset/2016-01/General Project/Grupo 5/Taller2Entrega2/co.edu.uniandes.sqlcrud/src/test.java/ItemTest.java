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
public class ItemTest
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
	public void testItemadd()
	{
		Item obj = factory.manufacturePojo(Item.class);
		factory.populatePojo(obj);
		mp.addItem(obj);
		
			assertEquals(obj.getid(), mp.getItem(obj.getId()).getid());
			assertEquals(obj.getcantidad(), mp.getItem(obj.getId()).getcantidad());
			assertEquals(obj.getname(), mp.getItem(obj.getId()).getname());
			assertEquals(obj.getproductoId(), mp.getItem(obj.getId()).getproductoId());
 
	}
	
	@Test
	public void testItemget()
	{
		assertNotNull(mp.getItem(mp.getItems().get(0).getId()));
	}
	
	@Test
	public void testItemedit()
	{
		Item obj = factory.manufacturePojo(Item.class);
		factory.populatePojo(obj);
		
		int primerId = mp.getItems().get(0).getId();
		
		mp.editItem(primerId, obj.getid(), obj.getcantidad(), obj.getname(), obj.getproductoId(), );
		
			assertEquals(obj.getid(), mp.getItem(primerId).getid());
			assertEquals(obj.getcantidad(), mp.getItem(primerId).getcantidad());
			assertEquals(obj.getname(), mp.getItem(primerId).getname());
			assertEquals(obj.getproductoId(), mp.getItem(primerId).getproductoId());
 
	}
	
	@Test
	public void testItemdelete()
	{
		int primerId = mp.getItems().get(0).getId();
		
		assertNotNull(mp.getItem(primerId));
		
		mp.deleteItem(primerId);
		
		assertNull(mp.getItem(primerId));
	}

}