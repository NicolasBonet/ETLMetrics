package marketplace;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import entities.*;

/**
* Clase que administra la persistencia 
* manipulando las entidades MarketPlace
*/

public class MarketPlace
{

	private static final String PERSISTENCE_UNIT_NAME = "ManejadorPersistencia-Test";
	
	private static EntityManagerFactory emf;
	
	private EntityManager em;
	
	/*
	* MarketPlace, Manejador de 5 entities
	*/
	public MarketPlace()
	{	
		emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		em = emf.createEntityManager();
	}
	
	
	public  List<Client> getClients()
	{
		// get plural Client
		Query q = em.createQuery("SELECT c FROM Client c");
		return q.getResultList();
		
	}
	
	public  void addClient(Client client)
	{
		// add body Client
		em.getTransaction().begin();
		em.persist(client);
		em.getTransaction().commit();
	}
	
	public  void editClient(int id, String password, String name)
	{
		// edit body Client
		Client client = em.find(Client.class, id);
		em.getTransaction().begin();
		client.setPassword(password);
		client.setName(name);
		em.getTransaction().commit();
	}
	
	public  void deleteClient(int id)
	{
		// delete body Client
		Client client = em.find(Client.class, id);
		em.getTransaction().begin();
		em.remove(client);
		em.getTransaction().commit();
	}
	
	public  Client getClient(int id)
	{
		// get singular Client
		return em.find(Client.class, id);
	}
	
	public  List<Producto> getProductos()
	{
		// get plural Producto
		Query q = em.createQuery("SELECT c FROM Producto c");
		return q.getResultList();
		
	}
	
	public  void addProducto(Producto producto)
	{
		// add body Producto
		em.getTransaction().begin();
		em.persist(producto);
		em.getTransaction().commit();
	}
	
	public  void editProducto(int id, String name)
	{
		// edit body Producto
		Producto producto = em.find(Producto.class, id);
		em.getTransaction().begin();
		producto.setName(name);
		em.getTransaction().commit();
	}
	
	public  void deleteProducto(int id)
	{
		// delete body Producto
		Producto producto = em.find(Producto.class, id);
		em.getTransaction().begin();
		em.remove(producto);
		em.getTransaction().commit();
	}
	
	public  Producto getProducto(int id)
	{
		// get singular Producto
		return em.find(Producto.class, id);
	}
	
	public  List<Carrito> getCarritos()
	{
		// get plural Carrito
		Query q = em.createQuery("SELECT c FROM Carrito c");
		return q.getResultList();
		
	}
	
	public  void addCarrito(Carrito carrito)
	{
		// add body Carrito
		em.getTransaction().begin();
		em.persist(carrito);
		em.getTransaction().commit();
	}
	
	public  void editCarrito(int id, String name, Client client)
	{
		// edit body Carrito
		Carrito carrito = em.find(Carrito.class, id);
		em.getTransaction().begin();
		carrito.setName(name);
		carrito.setClient(client);
		em.getTransaction().commit();
	}
	
	public  void deleteCarrito(int id)
	{
		// delete body Carrito
		Carrito carrito = em.find(Carrito.class, id);
		em.getTransaction().begin();
		em.remove(carrito);
		em.getTransaction().commit();
	}
	
	public  Carrito getCarrito(int id)
	{
		// get singular Carrito
		return em.find(Carrito.class, id);
	}
	
	public  List<Item> getItems()
	{
		// get plural Item
		Query q = em.createQuery("SELECT c FROM Item c");
		return q.getResultList();
		
	}
	
	public  void addItem(Item item)
	{
		// add body Item
		em.getTransaction().begin();
		em.persist(item);
		em.getTransaction().commit();
	}
	
	public  void editItem(int id, int cantidad, String name, Producto producto)
	{
		// edit body Item
		Item item = em.find(Item.class, id);
		em.getTransaction().begin();
		item.setCantidad(cantidad);
		item.setName(name);
		item.setProducto(producto);
		em.getTransaction().commit();
	}
	
	public  void deleteItem(int id)
	{
		// delete body Item
		Item item = em.find(Item.class, id);
		em.getTransaction().begin();
		em.remove(item);
		em.getTransaction().commit();
	}
	
	public  Item getItem(int id)
	{
		// get singular Item
		return em.find(Item.class, id);
	}
	
	
}