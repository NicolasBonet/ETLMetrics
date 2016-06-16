package co.edu.uniandes.hospital.persistence;

import co.edu.uniandes.hospital.entities.ServicioEntity;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class ServicioPersistence {

    private static final Logger logger = Logger.getLogger(ServicioPersistence.class.getName());

    @PersistenceContext(unitName = "HospitalPU")
    protected EntityManager em;

    public ServicioEntity create(ServicioEntity entity) {
        logger.info("Creando un Servicio nuevo");

        try {
			//Verificar si existe ya la cedula
	        String codigo = entity.getCodigo();
	        
	        ServicioEntity ServicioExiste = findByPK(codigo);            
            if (ServicioExiste != null) {
                if (ServicioExiste.getCodigo() == codigo) {
                    logger.info("Servicio ya existe, con el siguiente codigo");
                }
                return null;
            } else {
                em.persist(entity);
                logger.info("Servicio creado");
                return entity;
            }
	        
        
        
            
        } catch (NoResultException e) {
            return null;
        }
    }

    public ServicioEntity update(ServicioEntity entity) {
        logger.log(Level.INFO, "Actualizando Servicio con id={0}", entity.getId());
        return em.merge(entity);
    }

    public void delete(Long id) {
        logger.log(Level.INFO, "Borrando Servicio con id={0}", id);
        ServicioEntity entity = em.find(ServicioEntity.class, id);
        em.remove(entity);
    }

    public ServicioEntity find(Long id) {
        try {
            logger.log(Level.INFO, "Consultando Servicio con id={0}", id);
            return em.find(ServicioEntity.class, id);
        } catch (NoResultException e) {

            return null;
        }

    }
    public ServicioEntity findByPK(String codigo) {

        try {
            logger.log(Level.INFO, "Consultando Servicio con codigo={0}", codigo);
            Query q = em.createQuery("select u from ServicioEntity u where u.codigo=:codigo", ServicioEntity.class);
            return (ServicioEntity) q.setParameter("codigo", codigo).getSingleResult();
        } catch (NoResultException e) {
            return null;
        }

    }
    public List<ServicioEntity> findAll() {
        logger.info("Consultando todos los Servicios findAll");
        Query q = em.createQuery("select u from ServicioEntity u");
        return q.getResultList();
    }
}
