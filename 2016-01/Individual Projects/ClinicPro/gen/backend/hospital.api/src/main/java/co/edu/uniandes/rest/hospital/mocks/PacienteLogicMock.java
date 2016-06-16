package co.edu.uniandes.rest.hospital.mocks;

/**
 * Mock del recurso Paciente (Mock del servicio REST)
 * @author Diego F.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;


import co.edu.uniandes.rest.hospital.dtos.PacienteDTO;
import co.edu.uniandes.rest.hospital.exceptions.PacienteLogicException;

/**
 * Mock del recurso Paciente (Mock del servicio REST)
 */
@Named
@ApplicationScoped
public class PacienteLogicMock {
	
	// objeto para presentar logs de las operaciones
	private final static Logger logger = Logger.getLogger(PacienteLogicMock.class.getName());
	
	// listado de Pacienteas
    private static ArrayList<PacienteDTO> Pacientes;

    /**
     * Constructor. Crea los datos de ejemplo.
     */
    public PacienteLogicMock() {

    	if (Pacientes == null) {
            Pacientes = new ArrayList<>();
        }
        
    	// indica que se muestren todos los mensajes
    	logger.setLevel(Level.INFO);
    	
    	// muestra información 
    	logger.info("Inicializa la lista de Pacienteas");
    	logger.info("Pacienteas" + Pacientes );
    }    
    
	/**
	 * Obtiene el listado de Pacientes. 
	 * @return lista de Pacientes
	 * @throws PacienteLogicException cuando no existe la lista en memoria  
	 */    
    public List<PacienteDTO> getPacientes() throws PacienteLogicException {
    	if (Pacientes == null) {
    		logger.severe("Error interno: lista de Pacienteas no existe.");
    		throw new PacienteLogicException("Error interno: lista de Pacienteas no existe.");    		
    	}
    	
    	logger.info("retornando todas las Pacienteas");
    	return Pacientes;
    }

    /**
     * Obtiene una Pacientea
     * @param id identificador de la Pacientea
     * @return Pacientea encontrada
     * @throws PacienteLogicException cuando la Pacientea no existe
     */
    public PacienteDTO getPaciente(Long id) throws PacienteLogicException {
    	logger.info("recibiendo solicitud de Pacientea con id " + id);
    	
    	// busca la Pacientea con el id suministrado - en realidad la cedula
       /* for (PacienteDTO Paciente : Pacientes) {
            if (Objects.equals(Paciente.getCedula(), id)){
            	logger.info("retornando Pacientea " + Paciente);
                return Paciente;
            }
        }*/
        
        // si no encuentra la Paciente
        logger.severe("No existe Paciente con ese id");
        throw new PacienteLogicException("No existe Paciente con ese id");
    }

    /**
     * Agrega una Paciente a la lista.
     * @param newPaciente Paciente a adicionar
     * @throws PacienteLogicException cuando ya existe una Paciente con el id suministrado
     * @return Paciente agregada
     */
    public PacienteDTO createPaciente(PacienteDTO newPaciente) throws PacienteLogicException {
    	logger.info("recibiendo solicitud de agregar Paciente " + newPaciente);
    	
    	// la nueva Paciente tiene id ?
    	if ( newPaciente.getId() != null ) {
	    	// busca la Pacientea con el id suministrado
	        for (PacienteDTO Paciente : Pacientes) {
	        	// si existe una Pacientea con ese id
	            if (Objects.equals(Paciente.getId(), newPaciente.getId())){
	            	logger.severe("Ya existe una Pacientea con ese id");
	                throw new PacienteLogicException("Ya existe una Pacientea con ese id");
	            }
	        }
	        
	    // la nueva Pacientea no tiene id ? 
    	} else {

    		// genera un id para la Pacientea
    		logger.info("Generando id paa la nueva Pacientea");
    		long newId = 1;
	        for (PacienteDTO Paciente : Pacientes) {
	            if (newId <= Paciente.getId()){
	                newId =  Paciente.getId() + 1;
	            }
	        }
	        newPaciente.setId(newId);
    	}
    	
        // agrega la Pacientea
    	logger.info("agregando Pacientea " + newPaciente);
        Pacientes.add(newPaciente);
        return newPaciente;
    }

    /**
     * Actualiza los datos de una Pacientea
     * @param id identificador de la Pacientea a modificar
     * @param updatePaciente Pacientea a modificar
     * @return datos de la Pacientea modificada 
     * @throws PacienteLogicException cuando no existe una Pacientea con el id suministrado
     */
    public PacienteDTO updatePaciente(Long id, PacienteDTO updatedPaciente) throws PacienteLogicException {
    	logger.info("recibiendo solictud de modificar Pacientea " + updatedPaciente);
    	
    	// busca la Pacientea con el id suministrado
        for (PacienteDTO Paciente : Pacientes) {
            if (Objects.equals(Paciente.getId(), id)) {
            	
            	// modifica la Pacientea
            	Paciente.setId(updatedPaciente.getId());
    			Paciente.setDocumento(updatedPaciente.getDocumento());
    			Paciente.setNombres(updatedPaciente.getNombres());
    			Paciente.setApellidos(updatedPaciente.getApellidos());
    			Paciente.setDireccion(updatedPaciente.getDireccion());
                
                // retorna la Pacientea modificada
            	logger.info("Modificando Pacientea " + Paciente);
                return Paciente;
            }
        }
        
        // no encontró la Pacientea con ese id ?
        logger.severe("No existe una Pacientea con ese id");
        throw new PacienteLogicException("No existe una Pacientea con ese id");
    }

    /**
     * Elimina los datos de una Pacientea
     * @param id identificador de la Pacientea a eliminar
     * @throws PacienteLogicException cuando no existe una Pacientea con el id suministrado
     */
    public void deletePaciente(Long id) throws PacienteLogicException {
    	logger.info("recibiendo solictud de eliminar Pacientea con id " + id);
    	
    	// busca la Pacientea con el id suministrado
      /*  for (PacienteDTO Paciente : Pacientes) {
            if (Objects.equals(Paciente.getCedula(), id)) {
            	
            	// elimina la Pacientea
            	logger.info("eliminando Pacientea " + Paciente);
                Pacientes.remove(Paciente);
                return;
            }
        }*/

        // no encontró la Pacientea con ese id ?
        logger.severe("No existe una Pacientea con ese id");
        throw new PacienteLogicException("No existe una Pacientea con ese id");
    }
}
