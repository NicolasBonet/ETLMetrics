package Test;

import static org.junit.Assert.*;
import marketplace.Cliente;
import marketplace.MarketPlace;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;


@FixMethodOrder(MethodSorters.NAME_ASCENDING) 
public class ClienteTest { 
	private MarketPlace mp;
	private PodamFactory factory; 
	
	@Before
	public void prepareTest()
	{
	    mp = new MarketPlace();
		factory = new PodamFactoryImpl();
	}
	
	@Test
	public void test1ClienteAdd()
	{	
	    Cliente cliente = factory.manufacturePojo(Cliente.class);
		factory.populatePojo(cliente);
		mp.addCliente(cliente);
		
		assertEquals(cliente.getId(),mp.getCliente(cliente.getId()).getId());
		assertEquals(cliente.getName(),mp.getCliente(cliente.getId()).getName());
		assertEquals(cliente.getPassword(),mp.getCliente(cliente.getId()).getPassword());
		
	}

	@Test
	public void test2GetCliente()
	{
		assertNotNull(mp.getCliente(mp.getClientes().get(0).getId()));
	}
	
	@Test
	public void test3ClienteEdit()
	{
	    Cliente cliente = factory.manufacturePojo(Cliente.class);
		factory.populatePojo(cliente);
		int primerId = mp.getClientes().get(0).getId();
		
		mp.editCliente( primerId , cliente.getName() , cliente.getPassword());
		
		assertEquals(cliente.getName(),mp.getCliente(primerId).getName());
		assertEquals(cliente.getPassword(),mp.getCliente(primerId).getPassword());
	}

	@Test
	public void test4ClienteDelete()
	{
		int primerId = mp.getClientes().get(0).getId();

		assertNotNull(mp.getCliente(primerId));
		
		mp.deleteCliente(primerId);
		
		assertNull(mp.getCliente(primerId));
	
	}
	
	 
}

