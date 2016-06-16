package co.edu.uniandes.hospital.ejbs;

import co.edu.uniandes.hospital.api.IDoctorLogic;
import co.edu.uniandes.hospital.entities.DoctorEntity;
import co.edu.uniandes.hospital.exceptions.BusinessLogicException;
import co.edu.uniandes.hospital.persistence.DoctorPersistence;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class DoctorLogic implements IDoctorLogic {

    private static final Logger logger = Logger.getLogger(DoctorLogic.class.getName());

    @Inject
    private DoctorPersistence persistence;

    /*@Inject
    IBookLogic bookLogic;*/
    @Override
    public List<DoctorEntity> getDoctors() {
        logger.info("Inicia proceso de consultar todos los Doctors");
        List<DoctorEntity> Doctors = persistence.findAll();
        logger.info("Termina proceso de consultar todos los Doctor");
        return Doctors;
    }

    @Override
    public DoctorEntity getDoctor(Long id) {
        logger.log(Level.INFO, "Inicia proceso de consultar Doctor con id={0}", id);
        DoctorEntity service = persistence.find(id);
        if (service == null) {
            logger.log(Level.SEVERE, "El Doctor con el id {0} no existe", id);
            throw new IllegalArgumentException("El Doctor solicitado no existe");
        }
        logger.log(Level.INFO, "Termina proceso de consultar Doctor con id={0}", id);
        return service;
    }

    @Override
    public DoctorEntity createDoctor(DoctorEntity entity) {
        logger.info("Inicia proceso de creación de Doctor");
        persistence.create(entity);
        logger.info("Termina proceso de creación de Doctor");
        return entity;
    }

    @Override
    public DoctorEntity updateDoctor(DoctorEntity entity) {
        logger.log(Level.INFO, "Inicia proceso de actualizar Doctor con id={0}", entity.getId());
        DoctorEntity newEntity = persistence.update(entity);
        logger.log(Level.INFO, "Termina proceso de actualizar Doctor con id={0}", entity.getId());
        return newEntity;
    }

    @Override
    public void deleteDoctor(Long id) {
        logger.log(Level.INFO, "Inicia proceso de borrar Doctor con id={0}", id);
        persistence.delete(id);
        logger.log(Level.INFO, "Termina proceso de borrar Doctor con id={0}", id);
    }
    @Override
    public DoctorEntity getDoctorByPK(Long cedula){
        logger.log(Level.INFO, "Inicia proceso de consultar Doctor con cedula={0}", cedula);
        DoctorEntity Doctor = persistence.findByPK(cedula);
        if (Doctor == null) {
            logger.log(Level.SEVERE, "El Doctor con el cedula {0} no existe", cedula);
            throw new IllegalArgumentException("El Doctor solicitado no existe");
        }
        logger.log(Level.INFO, "Termina proceso de consultar Doctor con cedula={0}", cedula);
        return Doctor;
    }
   
}
