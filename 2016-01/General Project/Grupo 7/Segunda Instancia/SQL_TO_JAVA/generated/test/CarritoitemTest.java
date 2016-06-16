import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CarritoitemTest{

	private MarketPlace mp;
	
	private PodamFactory factory;
	
	@Before	
	public void prepareTest () {
		mp = new MarketPlace();
		factory = new PodamFactoryImpl();
	}
	
	@Test	
	public void test1CarritoitemAdd () {
		Carritoitem carritoitem = factory.manufacturePojo(Carritoitem.class);
		factory.populatePojo(carritoitem);
		mp.addCarritoitem(carritoitem);
		
	}
	
	@Test	
	public void test2GetCarritoitem () {
		assertNotNull(mp.getCarritoitem(mp.getCarritoitems().get(0).getId()));
	}
	
	@Test	
	public void test3CarritoitemEdit () {
		Carritoitem carritoitem = factory.manufacturePojo(Carritoitem.class);
		factory.populatePojo(carritoitem);
		
		int primerId = mp.getCarritoitems().get(0).getId();
	}
	
	@Test	
	public void test4CarritoitemDelete () {
		int primerId = mp.getCarritoitems().get(0).getId();
		
		assertNotNull(mp.getCarritoitem(primerId));
		
		mp.deleteCarritoitem(primerId);
		
		assertNull(mp.getCarritoitem(primerId));
	}
	
}
