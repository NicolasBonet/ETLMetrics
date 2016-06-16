package test.java;

import static org.junit.Assert.*;

import marketplace.Client;
import marketplace.MarketPlace;

import org.junit.runners.MethodSorters;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;

import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ClientTest
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
	public void test1ClientAdd()
	{	
		Client client = factory.manufacturePojo(Client.class);
		factory.populatePojo(client);
		mp.addClient(client);
		
		assertEquals(client.getId(), mp.getClient(client.getId()).getId());
		
		assertEquals(client.getPassword(), mp.getClient(client.getId()).getPassword());
		
		assertEquals(client.getName(), mp.getClient(client.getId()).getName());
	}
	
	@Test
	public void test2GetClient()
	{	
		assertNotNull(mp.getClient(mp.getClients().get(0).getId()));
	}
	
	@Test
	public void test3ClientEdit()
	{	
		Client client = factory.manufacturePojo(Client.class);
		factory.populatePojo(client);
		
		int primerId = mp.getClients().get(0).getId();
		
		mp.editClient(primerId
			, client.getPassword()
			, client.getName()
		);
		
		assertEquals(client.getPassword(), mp.getClient(primerId).getPassword());
		assertEquals(client.getName(), mp.getClient(primerId).getName());
		
	}
	
	@Test
	public void test4ClientDelete()
	{	
		int primerId = mp.getClients().get(0).getId();
		
		assertNotNull(mp.getClient(primerId));
		
		mp.deleteClient(primerId);
		
		assertNull(mp.getClient(primerId));
	}

}




