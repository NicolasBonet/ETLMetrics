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

import marketplace.Carritoitem;
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
	private MarketPlace mp;
	private PodamFactory factory;
	
	@Before
	public void prepareTest()
	{
		mp = new MarketPlace();
		factory = new PodamFactoryImpl();
	}
	@Test
	public void test1CarritoitemAdd()
	{	
		Carritoitem carritoitem = factory.manufacturePojo(Carritoitem.class);
		factory.populatePojo(carritoitem);
		mp.addCarritoitem(carritoitem);
		
		assertEquals(carritoitem.getId(), mp.getCarritoitem(carritoitem.getId()).getId());
		assertEquals(carritoitem.getCarritoId(), mp.getCarritoitem(carritoitem.getId()).getCarritoId()); 
assertEquals(carritoitem.getItemId(), mp.getCarritoitem(carritoitem.getId()).getItemId()); 
	
	}
	@Test
	public void test2GetCarritoitem()
	{	
		
		assertEquals(mp.getCarritoitem(mp.getCarritoitem().get(0).getId()));
		
	}
	@Test
	public void test3CarritoitemEdit()
	{	
		Carritoitem carritoitem = factory.manufacturePojo(Carritoitem.class);
		factory.populatePojo(carritoitem);
		int primerId = mp.getCarritoitem().get(0).getId();
					
		assertEquals(carritoitem.getCarritoId(), mp.getCarritoitem(carritoitem.getId()).getCarritoId()); 
assertEquals(carritoitem.getItemId(), mp.getCarritoitem(carritoitem.getId()).getItemId()); 
assertEquals(carritoitem.getCarritoId(), mp.getCarritoitem(primerId).getCarritoId()); 
assertEquals(carritoitem.getItemId(), mp.getCarritoitem(primerId).getItemId()); 

	
	}
	@Test
	public void test4CarritoitemDelete()
	{
		
		int primerId = mp.getCarritoitem().get(0).getId();
		
		assertNotNull(mp.getCarritoitem(primerId));
		
		mp.deleteCarritoitem(primerId);
		
		assertNull(mp.getCarritoitem(primerId));
		
		 
		
	}
	
	
	
}	
