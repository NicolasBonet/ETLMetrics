package test;

import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import entities.Carrito;
import marketplace.MarketPlace;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

/**
* Clase para manejo de test CarritoTest
*
*/
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CarritoTest
{
	private MarketPlace mp;
	private PodamFactory factory;
	
	
	
	@Before
	public  void prepareTest()
	{
		mp = new MarketPlace();
		factory = new PodamFactoryImpl();
	}
	
	@Test
	public  void test1CarritoAdd()
	{
		//test1 Add Carrito
		Carrito carrito = factory.manufacturePojo(Carrito.class);
		factory.populatePojo(carrito);
		
		mp.addCarrito(carrito);
		
		assertEquals(carrito.getId(), mp.getCarrito(carrito.getId()).getId());
		assertEquals(carrito.getName(), mp.getCarrito(carrito.getId()).getName());
		assertEquals(carrito.getClient(), mp.getCarrito(carrito.getId()).getClient());
	}
	
	@Test
	public  void test2GetCarrito()
	{
		//test2 Get Singular Carrito
		assertNotNull(mp.getCarrito(mp.getCarritos().get(0).getId()));
	}
	
	@Test
	public  void test3CarritoEdit()
	{
		//test3 Edit Carrito
		Carrito carrito = factory.manufacturePojo(Carrito.class);
		factory.populatePojo(carrito);
		
		int primerId = mp.getCarritos().get(0).getId();
		
		mp.editCarrito(primerId, carrito.getName(), carrito.getClient());
		
		assertEquals(carrito.getName(), mp.getCarrito(primerId).getName());
		assertEquals(carrito.getClient(), mp.getCarrito(primerId).getClient());
		
	}
	
	@Test
	public  void test4CarritoDelete()
	{
		//test4 Delete Carrito
		int primerId = mp.getCarritos().get(0).getId();
		
		assertNotNull(mp.getCarrito(primerId));
		
		mp.deleteCarrito(primerId);
		
		assertNull(mp.getCarrito(primerId));
	}
}