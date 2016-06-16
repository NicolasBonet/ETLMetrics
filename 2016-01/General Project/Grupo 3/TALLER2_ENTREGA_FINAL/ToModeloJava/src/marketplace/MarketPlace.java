package marketplace;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MarketPlace
{
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

	
	/*
	 * Producto
	 */
	public List<Producto> getProductos()
	{
		Query q = em.createQuery("SELECT c FROM Producto c");
        return q.getResultList();
	}
	
	public void addProducto(Producto producto)
	{
		em.getTransaction().begin();
        em.persist(producto);
        em.getTransaction().commit();
	}
	
	public void editProducto(int id , String name)
	{
		Producto producto = em.find(Producto.class, id);
		em.getTransaction().begin();
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

	
	/*
	 * Cliente
	 */
	public List<Cliente> getClientes()
	{
		Query q = em.createQuery("SELECT c FROM Cliente c");
        return q.getResultList();
	}
	
	public void addCliente(Cliente cliente)
	{
		em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();
	}
	
	public void editCliente(int id , String name , String password)
	{
		Cliente cliente = em.find(Cliente.class, id);
		em.getTransaction().begin();
		cliente.setName(name);
		cliente.setPassword(password);
		em.getTransaction().commit();
	}
		
	public void deleteCliente(int id)
	{
		Cliente cliente = em.find(Cliente.class, id);
		em.getTransaction().begin();
		em.remove(cliente);
		em.getTransaction().commit();
	}
	
	public Cliente getCliente(int id)
	{
		return em.find(Cliente.class, id);
	}

	
	/*
	 * Carrito
	 */
	public List<Carrito> getCarritos()
	{
		Query q = em.createQuery("SELECT c FROM Carrito c");
        return q.getResultList();
	}
	
	public void addCarrito(Carrito carrito)
	{
		em.getTransaction().begin();
        em.persist(carrito);
        em.getTransaction().commit();
	}
	
	public void editCarrito(int id , String name , Cliente cliente)
	{
		Carrito carrito = em.find(Carrito.class, id);
		em.getTransaction().begin();
		carrito.setName(name);
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

	
	/*
	 * Item
	 */
	public List<Item> getItems()
	{
		Query q = em.createQuery("SELECT c FROM Item c");
        return q.getResultList();
	}
	
	public void addItem(Item item)
	{
		em.getTransaction().begin();
        em.persist(item);
        em.getTransaction().commit();
	}
	
	public void editItem(int id , String name , double cantidad , Producto producto)
	{
		Item item = em.find(Item.class, id);
		em.getTransaction().begin();
		item.setName(name);
		item.setCantidad(cantidad);
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

	
	/*
	 * CarritoItem
	 */
	public List<CarritoItem> getCarritoItems()
	{
		Query q = em.createQuery("SELECT c FROM CarritoItem c");
        return q.getResultList();
	}
	
	public void addCarritoItem(CarritoItem carritoItem)
	{
		em.getTransaction().begin();
        em.persist(carritoItem);
        em.getTransaction().commit();
	}
	
	public void editCarritoItem(int id , Carrito carrito , Item item)
	{
		CarritoItem carritoItem = em.find(CarritoItem.class, id);
		em.getTransaction().begin();
		em.getTransaction().commit();
	}
		
	public void deleteCarritoItem(int id)
	{
		CarritoItem carritoItem = em.find(CarritoItem.class, id);
		em.getTransaction().begin();
		em.remove(carritoItem);
		em.getTransaction().commit();
	}
	
	public CarritoItem getCarritoItem(int id)
	{
		return em.find(CarritoItem.class, id);
	}

}

