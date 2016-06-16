package test;

import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import entities.Client;
import marketplace.MarketPlace;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

/**
* Clase para manejo de test ClientTest
*
*/
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ClientTest
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
	public  void test1ClientAdd()
	{
		//test1 Add Client
		Client client = factory.manufacturePojo(Client.class);
		factory.populatePojo(client);
		
		mp.addClient(client);
		
		assertEquals(client.getId(), mp.getClient(client.getId()).getId());
		assertEquals(client.getPassword(), mp.getClient(client.getId()).getPassword());
		assertEquals(client.getName(), mp.getClient(client.getId()).getName());
	}
	
	@Test
	public  void test2GetClient()
	{
		//test2 Get Singular Client
		assertNotNull(mp.getClient(mp.getClients().get(0).getId()));
	}
	
	@Test
	public  void test3ClientEdit()
	{
		//test3 Edit Client
		Client client = factory.manufacturePojo(Client.class);
		factory.populatePojo(client);
		
		int primerId = mp.getClients().get(0).getId();
		
		mp.editClient(primerId, client.getPassword(), client.getName());
		
		assertEquals(client.getPassword(), mp.getClient(primerId).getPassword());
		assertEquals(client.getName(), mp.getClient(primerId).getName());
		
	}
	
	@Test
	public  void test4ClientDelete()
	{
		//test4 Delete Client
		int primerId = mp.getClients().get(0).getId();
		
		assertNotNull(mp.getClient(primerId));
		
		mp.deleteClient(primerId);
		
		assertNull(mp.getClient(primerId));
	}
}