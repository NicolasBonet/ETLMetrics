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
public class ProductoTest
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
	public void testProductoadd()
	{
		Producto obj = factory.manufacturePojo(Producto.class);
		factory.populatePojo(obj);
		mp.addProducto(obj);
		
			assertEquals(obj.getname(), mp.getProducto(obj.getId()).getname());
			assertEquals(obj.getid(), mp.getProducto(obj.getId()).getid());
 
	}
	
	@Test
	public void testProductoget()
	{
		assertNotNull(mp.getProducto(mp.getProductos().get(0).getId()));
	}
	
	@Test
	public void testProductoedit()
	{
		Producto obj = factory.manufacturePojo(Producto.class);
		factory.populatePojo(obj);
		
		int primerId = mp.getProductos().get(0).getId();
		
		mp.editProducto(primerId, obj.getname(), obj.getid(), );
		
			assertEquals(obj.getname(), mp.getProducto(primerId).getname());
			assertEquals(obj.getid(), mp.getProducto(primerId).getid());
 
	}
	
	@Test
	public void testProductodelete()
	{
		int primerId = mp.getProductos().get(0).getId();
		
		assertNotNull(mp.getProducto(primerId));
		
		mp.deleteProducto(primerId);
		
		assertNull(mp.getProducto(primerId));
	}

}