package sqlcrud.sqlcrud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MarketPlace {
	
	private static final String PERSISTENCE_UNIT_NAME = "MarketPlace-Test";
    private static EntityManagerFactory emf;
    private EntityManager em;
    
    /*
	 * MarketPlace
	 */
	public MarketPlace()
	{
		emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        em = emf.createEntityManager();
	}
	
	/**
	* Client
	*/
	public List<Client> getClients () {
		Query q = em.createQuery("SELECT e FROM Client e");
        return q.getResultList();
	} 
	
	public void addClient(Client client)
	{
		em.getTransaction().begin();
        em.persist(client);
        em.getTransaction().commit();
	}
	
	public void editClient(int id, String password, String name)
	{
		Client client = em.find(Client.class, id);
		em.getTransaction().begin();
		client.setId(id);
		client.setPassword(password);
		client.setName(name);
		em.getTransaction().commit();
	}
	
	public void deleteClient(int id)
	{
		Client client = em.find(Client.class, id);
		em.getTransaction().begin();
		em.remove(client);
		em.getTransaction().commit();
	}
	
	public Client getClient(int id)
	{
		return em.find(Client.class, id);
	} 
	
	/**
	* Producto
	*/
	public List<Producto> getProductos () {
		Query q = em.createQuery("SELECT e FROM Producto e");
        return q.getResultList();
	} 
	
	public void addProducto(Producto producto)
	{
		em.getTransaction().begin();
        em.persist(producto);
        em.getTransaction().commit();
	}
	
	public void editProducto(int id, String name)
	{
		Producto producto = em.find(Producto.class, id);
		em.getTransaction().begin();
		producto.setId(id);
		producto.setName(name);
		em.getTransaction().commit();
	}
	
	public void deleteProducto(int id)
	{
		Producto producto = em.find(Producto.class, id);
		em.getTransaction().begin();
		em.remove(producto);
		em.getTransaction().commit();
	}
	
	public Producto getProducto(int id)
	{
		return em.find(Producto.class, id);
	} 
	
	/**
	* Carrito
	*/
	public List<Carrito> getCarritos () {
		Query q = em.createQuery("SELECT e FROM Carrito e");
        return q.getResultList();
	} 
	
	public void addCarrito(Carrito carrito)
	{
		em.getTransaction().begin();
        em.persist(carrito);
        em.getTransaction().commit();
	}
	
	public void editCarrito(int id, String name, Client client)
	{
		Carrito carrito = em.find(Carrito.class, id);
		em.getTransaction().begin();
		carrito.setId(id);
		carrito.setName(name);
		carrito.setClient(client);
		em.getTransaction().commit();
	}
	
	public void deleteCarrito(int id)
	{
		Carrito carrito = em.find(Carrito.class, id);
		em.getTransaction().begin();
		em.remove(carrito);
		em.getTransaction().commit();
	}
	
	public Carrito getCarrito(int id)
	{
		return em.find(Carrito.class, id);
	} 
	
	/**
	* Carritoitem
	*/
	public List<Carritoitem> getCarritoitems () {
		Query q = em.createQuery("SELECT e FROM Carritoitem e");
        return q.getResultList();
	} 
	
	public void addCarritoitem(Carritoitem carritoitem)
	{
		em.getTransaction().begin();
        em.persist(carritoitem);
        em.getTransaction().commit();
	}
	
	public void editCarritoitem(int id, Carrito carrito, Item item)
	{
		Carritoitem carritoitem = em.find(Carritoitem.class, id);
		em.getTransaction().begin();
		carritoitem.setId(id);
		carritoitem.setCarrito(carrito);
		carritoitem.setItem(item);
		em.getTransaction().commit();
	}
	
	public void deleteCarritoitem(int id)
	{
		Carritoitem carritoitem = em.find(Carritoitem.class, id);
		em.getTransaction().begin();
		em.remove(carritoitem);
		em.getTransaction().commit();
	}
	
	public Carritoitem getCarritoitem(int id)
	{
		return em.find(Carritoitem.class, id);
	} 
	
	/**
	* Item
	*/
	public List<Item> getItems () {
		Query q = em.createQuery("SELECT e FROM Item e");
        return q.getResultList();
	} 
	
	public void addItem(Item item)
	{
		em.getTransaction().begin();
        em.persist(item);
        em.getTransaction().commit();
	}
	
	public void editItem(int id, int cantidad, String name, Producto producto)
	{
		Item item = em.find(Item.class, id);
		em.getTransaction().begin();
		item.setId(id);
		item.setCantidad(cantidad);
		item.setName(name);
		item.setProducto(producto);
		em.getTransaction().commit();
	}
	
	public void deleteItem(int id)
	{
		Item item = em.find(Item.class, id);
		em.getTransaction().begin();
		em.remove(item);
		em.getTransaction().commit();
	}
	
	public Item getItem(int id)
	{
		return em.find(Item.class, id);
	} 
	
}

