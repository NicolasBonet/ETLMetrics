import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

///ClassMarketPlace]
public class MarketPlace{
	/**
	* Attributes
	*/
	private 	static 	final String PERSISTENCE_UNIT_NAME;
	
	private 	static EntityManagerFactory emf;
	
	private EntityManager em;
	
	/**
	*Methods
	*/
				/*
				Crud Methods
				*/
	public MarketPlace () {
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
	
	public void addClient () {
		em.getTransaction().begin();
        em.persist(client);
        em.getTransaction().commit();
	}
	
	public void editClient () {
		
	}
	
	public void deleteClient () {
		Client client = em.find(Client.class, id);
		em.getTransaction().begin();
		em.remove(client);
		em.getTransaction().commit();
	}
	
	public Client getClient () {
		return em.find(Client.class, id);
	}
	
	/**
	* Producto
	*/
	public List<Producto> getProductos () {
		Query q = em.createQuery("SELECT e FROM Producto e");
        return q.getResultList();
	}
	
	public void addProducto () {
		em.getTransaction().begin();
        em.persist(producto);
        em.getTransaction().commit();
	}
	
	public void editProducto () {
		
	}
	
	public void deleteProducto () {
		Producto producto = em.find(Producto.class, id);
		em.getTransaction().begin();
		em.remove(producto);
		em.getTransaction().commit();
	}
	
	public Producto getProducto () {
		return em.find(Producto.class, id);
	}
	
	/**
	* Carrito
	*/
	public List<Carrito> getCarritos () {
		Query q = em.createQuery("SELECT e FROM Carrito e");
        return q.getResultList();
	}
	
	public void addCarrito () {
		em.getTransaction().begin();
        em.persist(carrito);
        em.getTransaction().commit();
	}
	
	public void editCarrito () {
		
	}
	
	public void deleteCarrito () {
		Carrito carrito = em.find(Carrito.class, id);
		em.getTransaction().begin();
		em.remove(carrito);
		em.getTransaction().commit();
	}
	
	public Carrito getCarrito () {
		return em.find(Carrito.class, id);
	}
	
	/**
	* Item
	*/
	public List<Item> getItems () {
		Query q = em.createQuery("SELECT e FROM Item e");
        return q.getResultList();
	}
	
	public void addItem () {
		em.getTransaction().begin();
        em.persist(item);
        em.getTransaction().commit();
	}
	
	public void editItem () {
		
	}
	
	public void deleteItem () {
		Item item = em.find(Item.class, id);
		em.getTransaction().begin();
		em.remove(item);
		em.getTransaction().commit();
	}
	
	public Item getItem () {
		return em.find(Item.class, id);
	}
	
	/**
	* Carritoitem
	*/
	public List<Carritoitem> getCarritoitems () {
		Query q = em.createQuery("SELECT e FROM Carritoitem e");
        return q.getResultList();
	}
	
	public void addCarritoitem () {
		em.getTransaction().begin();
        em.persist(carritoitem);
        em.getTransaction().commit();
	}
	
	public void editCarritoitem () {
		
	}
	
	public void deleteCarritoitem () {
		Carritoitem carritoitem = em.find(Carritoitem.class, id);
		em.getTransaction().begin();
		em.remove(carritoitem);
		em.getTransaction().commit();
	}
	
	public Carritoitem getCarritoitem () {
		return em.find(Carritoitem.class, id);
	}
	
}