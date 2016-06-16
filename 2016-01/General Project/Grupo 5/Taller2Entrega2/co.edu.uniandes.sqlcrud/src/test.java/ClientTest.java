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
public class ClientTest
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
	public void testClientadd()
	{
		Client obj = factory.manufacturePojo(Client.class);
		factory.populatePojo(obj);
		mp.addClient(obj);
		
			assertEquals(obj.getid(), mp.getClient(obj.getId()).getid());
			assertEquals(obj.getpassword(), mp.getClient(obj.getId()).getpassword());
			assertEquals(obj.getname(), mp.getClient(obj.getId()).getname());
 
	}
	
	@Test
	public void testClientget()
	{
		assertNotNull(mp.getClient(mp.getClients().get(0).getId()));
	}
	
	@Test
	public void testClientedit()
	{
		Client obj = factory.manufacturePojo(Client.class);
		factory.populatePojo(obj);
		
		int primerId = mp.getClients().get(0).getId();
		
		mp.editClient(primerId, obj.getid(), obj.getpassword(), obj.getname(), );
		
			assertEquals(obj.getid(), mp.getClient(primerId).getid());
			assertEquals(obj.getpassword(), mp.getClient(primerId).getpassword());
			assertEquals(obj.getname(), mp.getClient(primerId).getname());
 
	}
	
	@Test
	public void testClientdelete()
	{
		int primerId = mp.getClients().get(0).getId();
		
		assertNotNull(mp.getClient(primerId));
		
		mp.deleteClient(primerId);
		
		assertNull(mp.getClient(primerId));
	}

}