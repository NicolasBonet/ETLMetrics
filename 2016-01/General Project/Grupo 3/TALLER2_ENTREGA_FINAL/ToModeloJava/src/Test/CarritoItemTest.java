package Test;

import static org.junit.Assert.*;
import marketplace.CarritoItem;
import marketplace.MarketPlace;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;


@FixMethodOrder(MethodSorters.NAME_ASCENDING) 
public class CarritoItemTest { 
	private MarketPlace mp;
	private PodamFactory factory; 
	
	@Before
	public void prepareTest()
	{
	    mp = new MarketPlace();
		factory = new PodamFactoryImpl();
	}
	
	@Test
	public void test1CarritoItemAdd()
	{	
	    CarritoItem carritoItem = factory.manufacturePojo(CarritoItem.class);
		factory.populatePojo(carritoItem);
		mp.addCarritoItem(carritoItem);
		
		assertEquals(carritoItem.getId(),mp.getCarritoItem(carritoItem.getId()).getId());
		assertEquals(carritoItem.getCarrito(),mp.getCarritoItem(carritoItem.getId()).getCarrito());
		assertEquals(carritoItem.getItem(),mp.getCarritoItem(carritoItem.getId()).getItem());
		
	}

	@Test
	public void test2GetCarritoItem()
	{
		assertNotNull(mp.getCarritoItem(mp.getCarritoItems().get(0).getId()));
	}
	
	@Test
	public void test3CarritoItemEdit()
	{
	    CarritoItem carritoItem = factory.manufacturePojo(CarritoItem.class);
		factory.populatePojo(carritoItem);
		int primerId = mp.getCarritoItems().get(0).getId();
		
		mp.editCarritoItem( primerId , carritoItem.getCarrito() , carritoItem.getItem());
		
		assertEquals(carritoItem.getCarrito(),mp.getCarritoItem(primerId).getCarrito());
		assertEquals(carritoItem.getItem(),mp.getCarritoItem(primerId).getItem());
	}

	@Test
	public void test4CarritoItemDelete()
	{
		int primerId = mp.getCarritoItems().get(0).getId();

		assertNotNull(mp.getCarritoItem(primerId));
		
		mp.deleteCarritoItem(primerId);
		
		assertNull(mp.getCarritoItem(primerId));
	
	}
	
	 
}

