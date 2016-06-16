package co.edu.uniandes.hospital.ejbs;

import co.edu.uniandes.hospital.api.IServicioLogic;
import co.edu.uniandes.hospital.entities.ServicioEntity;
import co.edu.uniandes.hospital.exceptions.BusinessLogicException;
import co.edu.uniandes.hospital.persistence.ServicioPersistence;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class ServicioLogic implements IServicioLogic {

    private static final Logger logger = Logger.getLogger(ServicioLogic.class.getName());

    @Inject
    private ServicioPersistence persistence;

    /*@Inject
    IBookLogic bookLogic;*/
    @Override
    public List<ServicioEntity> getServicios() {
        logger.info("Inicia proceso de consultar todos los Servicios");
        List<ServicioEntity> Servicios = persistence.findAll();
        logger.info("Termina proceso de consultar todos los Servicio");
        return Servicios;
    }

    @Override
    public ServicioEntity getServicio(Long id) {
        logger.log(Level.INFO, "Inicia proceso de consultar Servicio con id={0}", id);
        ServicioEntity service = persistence.find(id);
        if (service == null) {
            logger.log(Level.SEVERE, "El Servicio con el id {0} no existe", id);
            throw new IllegalArgumentException("El Servicio solicitado no existe");
        }
        logger.log(Level.INFO, "Termina proceso de consultar Servicio con id={0}", id);
        return service;
    }

    @Override
    public ServicioEntity createServicio(ServicioEntity entity) {
        logger.info("Inicia proceso de creación de Servicio");
        persistence.create(entity);
        logger.info("Termina proceso de creación de Servicio");
        return entity;
    }

    @Override
    public ServicioEntity updateServicio(ServicioEntity entity) {
        logger.log(Level.INFO, "Inicia proceso de actualizar Servicio con id={0}", entity.getId());
        ServicioEntity newEntity = persistence.update(entity);
        logger.log(Level.INFO, "Termina proceso de actualizar Servicio con id={0}", entity.getId());
        return newEntity;
    }

    @Override
    public void deleteServicio(Long id) {
        logger.log(Level.INFO, "Inicia proceso de borrar Servicio con id={0}", id);
        persistence.delete(id);
        logger.log(Level.INFO, "Termina proceso de borrar Servicio con id={0}", id);
    }
    @Override
    public ServicioEntity getServicioByPK(String codigo){
        logger.log(Level.INFO, "Inicia proceso de consultar Servicio con codigo={0}", codigo);
        ServicioEntity Servicio = persistence.findByPK(codigo);
        if (Servicio == null) {
            logger.log(Level.SEVERE, "El Servicio con el codigo {0} no existe", codigo);
            throw new IllegalArgumentException("El Servicio solicitado no existe");
        }
        logger.log(Level.INFO, "Termina proceso de consultar Servicio con codigo={0}", codigo);
        return Servicio;
    }
   
}
