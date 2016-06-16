package co.edu.uniandes.rest.hospital.mocks;

/**
 * Mock del recurso Doctor (Mock del servicio REST)
 * @author Diego F.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;


import co.edu.uniandes.rest.hospital.dtos.DoctorDTO;
import co.edu.uniandes.rest.hospital.exceptions.DoctorLogicException;

/**
 * Mock del recurso Doctor (Mock del servicio REST)
 */
@Named
@ApplicationScoped
public class DoctorLogicMock {
	
	// objeto para presentar logs de las operaciones
	private final static Logger logger = Logger.getLogger(DoctorLogicMock.class.getName());
	
	// listado de Doctoras
    private static ArrayList<DoctorDTO> Doctors;

    /**
     * Constructor. Crea los datos de ejemplo.
     */
    public DoctorLogicMock() {

    	if (Doctors == null) {
            Doctors = new ArrayList<>();
        }
        
    	// indica que se muestren todos los mensajes
    	logger.setLevel(Level.INFO);
    	
    	// muestra información 
    	logger.info("Inicializa la lista de Doctoras");
    	logger.info("Doctoras" + Doctors );
    }    
    
	/**
	 * Obtiene el listado de Doctors. 
	 * @return lista de Doctors
	 * @throws DoctorLogicException cuando no existe la lista en memoria  
	 */    
    public List<DoctorDTO> getDoctors() throws DoctorLogicException {
    	if (Doctors == null) {
    		logger.severe("Error interno: lista de Doctoras no existe.");
    		throw new DoctorLogicException("Error interno: lista de Doctoras no existe.");    		
    	}
    	
    	logger.info("retornando todas las Doctoras");
    	return Doctors;
    }

    /**
     * Obtiene una Doctora
     * @param id identificador de la Doctora
     * @return Doctora encontrada
     * @throws DoctorLogicException cuando la Doctora no existe
     */
    public DoctorDTO getDoctor(Long id) throws DoctorLogicException {
    	logger.info("recibiendo solicitud de Doctora con id " + id);
    	
    	// busca la Doctora con el id suministrado - en realidad la cedula
       /* for (DoctorDTO Doctor : Doctors) {
            if (Objects.equals(Doctor.getCedula(), id)){
            	logger.info("retornando Doctora " + Doctor);
                return Doctor;
            }
        }*/
        
        // si no encuentra la Doctor
        logger.severe("No existe Doctor con ese id");
        throw new DoctorLogicException("No existe Doctor con ese id");
    }

    /**
     * Agrega una Doctor a la lista.
     * @param newDoctor Doctor a adicionar
     * @throws DoctorLogicException cuando ya existe una Doctor con el id suministrado
     * @return Doctor agregada
     */
    public DoctorDTO createDoctor(DoctorDTO newDoctor) throws DoctorLogicException {
    	logger.info("recibiendo solicitud de agregar Doctor " + newDoctor);
    	
    	// la nueva Doctor tiene id ?
    	if ( newDoctor.getId() != null ) {
	    	// busca la Doctora con el id suministrado
	        for (DoctorDTO Doctor : Doctors) {
	        	// si existe una Doctora con ese id
	            if (Objects.equals(Doctor.getId(), newDoctor.getId())){
	            	logger.severe("Ya existe una Doctora con ese id");
	                throw new DoctorLogicException("Ya existe una Doctora con ese id");
	            }
	        }
	        
	    // la nueva Doctora no tiene id ? 
    	} else {

    		// genera un id para la Doctora
    		logger.info("Generando id paa la nueva Doctora");
    		long newId = 1;
	        for (DoctorDTO Doctor : Doctors) {
	            if (newId <= Doctor.getId()){
	                newId =  Doctor.getId() + 1;
	            }
	        }
	        newDoctor.setId(newId);
    	}
    	
        // agrega la Doctora
    	logger.info("agregando Doctora " + newDoctor);
        Doctors.add(newDoctor);
        return newDoctor;
    }

    /**
     * Actualiza los datos de una Doctora
     * @param id identificador de la Doctora a modificar
     * @param updateDoctor Doctora a modificar
     * @return datos de la Doctora modificada 
     * @throws DoctorLogicException cuando no existe una Doctora con el id suministrado
     */
    public DoctorDTO updateDoctor(Long id, DoctorDTO updatedDoctor) throws DoctorLogicException {
    	logger.info("recibiendo solictud de modificar Doctora " + updatedDoctor);
    	
    	// busca la Doctora con el id suministrado
        for (DoctorDTO Doctor : Doctors) {
            if (Objects.equals(Doctor.getId(), id)) {
            	
            	// modifica la Doctora
            	Doctor.setId(updatedDoctor.getId());
    			Doctor.setCedula(updatedDoctor.getCedula());
    			Doctor.setDoctor(updatedDoctor.getDoctor());
                
                // retorna la Doctora modificada
            	logger.info("Modificando Doctora " + Doctor);
                return Doctor;
            }
        }
        
        // no encontró la Doctora con ese id ?
        logger.severe("No existe una Doctora con ese id");
        throw new DoctorLogicException("No existe una Doctora con ese id");
    }

    /**
     * Elimina los datos de una Doctora
     * @param id identificador de la Doctora a eliminar
     * @throws DoctorLogicException cuando no existe una Doctora con el id suministrado
     */
    public void deleteDoctor(Long id) throws DoctorLogicException {
    	logger.info("recibiendo solictud de eliminar Doctora con id " + id);
    	
    	// busca la Doctora con el id suministrado
      /*  for (DoctorDTO Doctor : Doctors) {
            if (Objects.equals(Doctor.getCedula(), id)) {
            	
            	// elimina la Doctora
            	logger.info("eliminando Doctora " + Doctor);
                Doctors.remove(Doctor);
                return;
            }
        }*/

        // no encontró la Doctora con ese id ?
        logger.severe("No existe una Doctora con ese id");
        throw new DoctorLogicException("No existe una Doctora con ese id");
    }
}
