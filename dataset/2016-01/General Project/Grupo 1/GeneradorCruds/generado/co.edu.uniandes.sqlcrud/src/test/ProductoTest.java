package test;

import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import entities.Producto;
import marketplace.MarketPlace;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

/**
* Clase para manejo de test ProductoTest
*
*/
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProductoTest
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
	public  void test1ProductoAdd()
	{
		//test1 Add Producto
		Producto producto = factory.manufacturePojo(Producto.class);
		factory.populatePojo(producto);
		
		mp.addProducto(producto);
		
		assertEquals(producto.getName(), mp.getProducto(producto.getId()).getName());
		assertEquals(producto.getId(), mp.getProducto(producto.getId()).getId());
	}
	
	@Test
	public  void test2GetProducto()
	{
		//test2 Get Singular Producto
		assertNotNull(mp.getProducto(mp.getProductos().get(0).getId()));
	}
	
	@Test
	public  void test3ProductoEdit()
	{
		//test3 Edit Producto
		Producto producto = factory.manufacturePojo(Producto.class);
		factory.populatePojo(producto);
		
		int primerId = mp.getProductos().get(0).getId();
		
		mp.editProducto(primerId, producto.getName());
		
		assertEquals(producto.getName(), mp.getProducto(primerId).getName());
		
	}
	
	@Test
	public  void test4ProductoDelete()
	{
		//test4 Delete Producto
		int primerId = mp.getProductos().get(0).getId();
		
		assertNotNull(mp.getProducto(primerId));
		
		mp.deleteProducto(primerId);
		
		assertNull(mp.getProducto(primerId));
	}
}