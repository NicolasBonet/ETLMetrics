package marketplace;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

import uk.co.jemos.podam.common.PodamExclude;

package test.java;

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
public class ItemTest
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
	public void test1ItemAdd()
	{	
		Item item = factory.manufacturePojo(Item.class);
		factory.populatePojo(item);
		mp.addItem(item);
		
		assertEquals(item.getId(), mp.getItem(item.getId()).getId());
		assertEquals(item.getCantidad(), mp.getItem(item.getId()).getCantidad()); 
assertEquals(item.getName(), mp.getItem(item.getId()).getName()); 
assertEquals(item.getProductoId(), mp.getItem(item.getId()).getProductoId()); 
	
	}
	@Test
	public void test2GetItem()
	{	
		
		assertEquals(mp.getItem(mp.getItem().get(0).getId()));
		
	}
	@Test
	public void test3ItemEdit()
	{	
		Item item = factory.manufacturePojo(Item.class);
		factory.populatePojo(item);
		int primerId = mp.getItem().get(0).getId();
					
		assertEquals(item.getCantidad(), mp.getItem(item.getId()).getCantidad()); 
assertEquals(item.getName(), mp.getItem(item.getId()).getName()); 
assertEquals(item.getProductoId(), mp.getItem(item.getId()).getProductoId()); 
assertEquals(item.getCantidad(), mp.getItem(primerId).getCantidad()); 
assertEquals(item.getName(), mp.getItem(primerId).getName()); 
assertEquals(item.getProductoId(), mp.getItem(primerId).getProductoId()); 

	
	}
	@Test
	public void test4ItemDelete()
	{
		
		int primerId = mp.getItem().get(0).getId();
		
		assertNotNull(mp.getItem(primerId));
		
		mp.deleteItem(primerId);
		
		assertNull(mp.getItem(primerId));
		
		 
		
	}
	
	
	
}	
