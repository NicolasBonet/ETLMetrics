package Test;

import static org.junit.Assert.*;
import marketplace.Item;
import marketplace.MarketPlace;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;


@FixMethodOrder(MethodSorters.NAME_ASCENDING) 
public class ItemTest { 
	private MarketPlace mp;
	private PodamFactory factory; 
	
	@Before
	public void prepareTest()
	{
	    mp = new MarketPlace();
		factory = new PodamFactoryImpl();
	}
	
	@Test
	public void test1ItemAdd()
	{	
	    Item item = factory.manufacturePojo(Item.class);
		factory.populatePojo(item);
		mp.addItem(item);
		
		assertEquals(item.getId(),mp.getItem(item.getId()).getId());
		assertEquals(item.getName(),mp.getItem(item.getId()).getName());
		assertEquals(item.getCantidad(),mp.getItem(item.getId()).getCantidad());
		assertEquals(item.getProducto(),mp.getItem(item.getId()).getProducto());
		
	}

	@Test
	public void test2GetItem()
	{
		assertNotNull(mp.getItem(mp.getItems().get(0).getId()));
	}
	
	@Test
	public void test3ItemEdit()
	{
	    Item item = factory.manufacturePojo(Item.class);
		factory.populatePojo(item);
		int primerId = mp.getItems().get(0).getId();
		
		mp.editItem( primerId , item.getName() , item.getCantidad() , item.getProducto());
		
		assertEquals(item.getName(),mp.getItem(primerId).getName());
		assertEquals(item.getCantidad(),mp.getItem(primerId).getCantidad());
		assertEquals(item.getProducto(),mp.getItem(primerId).getProducto());
	}

	@Test
	public void test4ItemDelete()
	{
		int primerId = mp.getItems().get(0).getId();

		assertNotNull(mp.getItem(primerId));
		
		mp.deleteItem(primerId);
		
		assertNull(mp.getItem(primerId));
	
	}
	
	 
}

