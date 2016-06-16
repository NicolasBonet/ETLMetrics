package co.edu.uniandes.hospital.persistence;

import co.edu.uniandes.hospital.entities.PacienteEntity;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class PacientePersistence {

    private static final Logger logger = Logger.getLogger(PacientePersistence.class.getName());

    @PersistenceContext(unitName = "HospitalPU")
    protected EntityManager em;

    public PacienteEntity create(PacienteEntity entity) {
        logger.info("Creando un Paciente nuevo");

        try {
			//Verificar si existe ya la cedula
	        Long documento = entity.getDocumento();
	        
	        PacienteEntity PacienteExiste = findByPK(documento);            
            if (PacienteExiste != null) {
                if (PacienteExiste.getDocumento() == documento) {
                    logger.info("Paciente ya existe, con el siguiente documento");
                }
                return null;
            } else {
                em.persist(entity);
                logger.info("Paciente creado");
                return entity;
            }
	        
        
        
            
        } catch (NoResultException e) {
            return null;
        }
    }

    public PacienteEntity update(PacienteEntity entity) {
        logger.log(Level.INFO, "Actualizando Paciente con id={0}", entity.getId());
        return em.merge(entity);
    }

    public void delete(Long id) {
        logger.log(Level.INFO, "Borrando Paciente con id={0}", id);
        PacienteEntity entity = em.find(PacienteEntity.class, id);
        em.remove(entity);
    }

    public PacienteEntity find(Long id) {
        try {
            logger.log(Level.INFO, "Consultando Paciente con id={0}", id);
            return em.find(PacienteEntity.class, id);
        } catch (NoResultException e) {

            return null;
        }

    }
    public PacienteEntity findByPK(Long documento) {

        try {
            logger.log(Level.INFO, "Consultando Paciente con documento={0}", documento);
            Query q = em.createQuery("select u from PacienteEntity u where u.documento=:documento", PacienteEntity.class);
            return (PacienteEntity) q.setParameter("documento", documento).getSingleResult();
        } catch (NoResultException e) {
            return null;
        }

    }
    public List<PacienteEntity> findAll() {
        logger.info("Consultando todos los Pacientes findAll");
        Query q = em.createQuery("select u from PacienteEntity u");
        return q.getResultList();
    }
}
