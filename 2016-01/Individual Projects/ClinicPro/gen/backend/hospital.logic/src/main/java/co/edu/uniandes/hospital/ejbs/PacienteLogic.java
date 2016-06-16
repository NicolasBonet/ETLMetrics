package co.edu.uniandes.hospital.ejbs;

import co.edu.uniandes.hospital.api.IPacienteLogic;
import co.edu.uniandes.hospital.entities.PacienteEntity;
import co.edu.uniandes.hospital.exceptions.BusinessLogicException;
import co.edu.uniandes.hospital.persistence.PacientePersistence;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class PacienteLogic implements IPacienteLogic {

    private static final Logger logger = Logger.getLogger(PacienteLogic.class.getName());

    @Inject
    private PacientePersistence persistence;

    /*@Inject
    IBookLogic bookLogic;*/
    @Override
    public List<PacienteEntity> getPacientes() {
        logger.info("Inicia proceso de consultar todos los Pacientes");
        List<PacienteEntity> Pacientes = persistence.findAll();
        logger.info("Termina proceso de consultar todos los Paciente");
        return Pacientes;
    }

    @Override
    public PacienteEntity getPaciente(Long id) {
        logger.log(Level.INFO, "Inicia proceso de consultar Paciente con id={0}", id);
        PacienteEntity service = persistence.find(id);
        if (service == null) {
            logger.log(Level.SEVERE, "El Paciente con el id {0} no existe", id);
            throw new IllegalArgumentException("El Paciente solicitado no existe");
        }
        logger.log(Level.INFO, "Termina proceso de consultar Paciente con id={0}", id);
        return service;
    }

    @Override
    public PacienteEntity createPaciente(PacienteEntity entity) {
        logger.info("Inicia proceso de creación de Paciente");
        persistence.create(entity);
        logger.info("Termina proceso de creación de Paciente");
        return entity;
    }

    @Override
    public PacienteEntity updatePaciente(PacienteEntity entity) {
        logger.log(Level.INFO, "Inicia proceso de actualizar Paciente con id={0}", entity.getId());
        PacienteEntity newEntity = persistence.update(entity);
        logger.log(Level.INFO, "Termina proceso de actualizar Paciente con id={0}", entity.getId());
        return newEntity;
    }

    @Override
    public void deletePaciente(Long id) {
        logger.log(Level.INFO, "Inicia proceso de borrar Paciente con id={0}", id);
        persistence.delete(id);
        logger.log(Level.INFO, "Termina proceso de borrar Paciente con id={0}", id);
    }
    @Override
    public PacienteEntity getPacienteByPK(Long documento){
        logger.log(Level.INFO, "Inicia proceso de consultar Paciente con documento={0}", documento);
        PacienteEntity Paciente = persistence.findByPK(documento);
        if (Paciente == null) {
            logger.log(Level.SEVERE, "El Paciente con el documento {0} no existe", documento);
            throw new IllegalArgumentException("El Paciente solicitado no existe");
        }
        logger.log(Level.INFO, "Termina proceso de consultar Paciente con documento={0}", documento);
        return Paciente;
    }
   
}
