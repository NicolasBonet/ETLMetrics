package co.edu.uniandes.hospital.persistence;

import co.edu.uniandes.hospital.entities.DoctorEntity;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class DoctorPersistence {

    private static final Logger logger = Logger.getLogger(DoctorPersistence.class.getName());

    @PersistenceContext(unitName = "HospitalPU")
    protected EntityManager em;

    public DoctorEntity create(DoctorEntity entity) {
        logger.info("Creando un Doctor nuevo");

        try {
			//Verificar si existe ya la cedula
	        Long cedula = entity.getCedula();
	        
	        DoctorEntity DoctorExiste = findByPK(cedula);            
            if (DoctorExiste != null) {
                if (DoctorExiste.getCedula() == cedula) {
                    logger.info("Doctor ya existe, con el siguiente cedula");
                }
                return null;
            } else {
                em.persist(entity);
                logger.info("Doctor creado");
                return entity;
            }
	        
        
        
            
        } catch (NoResultException e) {
            return null;
        }
    }

    public DoctorEntity update(DoctorEntity entity) {
        logger.log(Level.INFO, "Actualizando Doctor con id={0}", entity.getId());
        return em.merge(entity);
    }

    public void delete(Long id) {
        logger.log(Level.INFO, "Borrando Doctor con id={0}", id);
        DoctorEntity entity = em.find(DoctorEntity.class, id);
        em.remove(entity);
    }

    public DoctorEntity find(Long id) {
        try {
            logger.log(Level.INFO, "Consultando Doctor con id={0}", id);
            return em.find(DoctorEntity.class, id);
        } catch (NoResultException e) {

            return null;
        }

    }
    public DoctorEntity findByPK(Long cedula) {

        try {
            logger.log(Level.INFO, "Consultando Doctor con cedula={0}", cedula);
            Query q = em.createQuery("select u from DoctorEntity u where u.cedula=:cedula", DoctorEntity.class);
            return (DoctorEntity) q.setParameter("cedula", cedula).getSingleResult();
        } catch (NoResultException e) {
            return null;
        }

    }
    public List<DoctorEntity> findAll() {
        logger.info("Consultando todos los Doctors findAll");
        Query q = em.createQuery("select u from DoctorEntity u");
        return q.getResultList();
    }
}
