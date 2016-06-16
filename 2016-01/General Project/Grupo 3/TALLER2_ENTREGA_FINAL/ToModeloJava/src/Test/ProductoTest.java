package Test;

import static org.junit.Assert.*;
import marketplace.Producto;
import marketplace.MarketPlace;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;


@FixMethodOrder(MethodSorters.NAME_ASCENDING) 
public class ProductoTest { 
	private MarketPlace mp;
	private PodamFactory factory; 
	
	@Before
	public void prepareTest()
	{
	    mp = new MarketPlace();
		factory = new PodamFactoryImpl();
	}
	
	@Test
	public void test1ProductoAdd()
	{	
	    Producto producto = factory.manufacturePojo(Producto.class);
		factory.populatePojo(producto);
		mp.addProducto(producto);
		
		assertEquals(producto.getId(),mp.getProducto(producto.getId()).getId());
		assertEquals(producto.getName(),mp.getProducto(producto.getId()).getName());
		
	}

	@Test
	public void test2GetProducto()
	{
		assertNotNull(mp.getProducto(mp.getProductos().get(0).getId()));
	}
	
	@Test
	public void test3ProductoEdit()
	{
	    Producto producto = factory.manufacturePojo(Producto.class);
		factory.populatePojo(producto);
		int primerId = mp.getProductos().get(0).getId();
		
		mp.editProducto( primerId , producto.getName());
		
		assertEquals(producto.getName(),mp.getProducto(primerId).getName());
	}

	@Test
	public void test4ProductoDelete()
	{
		int primerId = mp.getProductos().get(0).getId();

		assertNotNull(mp.getProducto(primerId));
		
		mp.deleteProducto(primerId);
		
		assertNull(mp.getProducto(primerId));
	
	}
	
	 
}

