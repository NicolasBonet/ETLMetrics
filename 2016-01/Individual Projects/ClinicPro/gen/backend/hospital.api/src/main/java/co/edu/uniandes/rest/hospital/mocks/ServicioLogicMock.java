package co.edu.uniandes.rest.hospital.mocks;

/**
 * Mock del recurso Servicio (Mock del servicio REST)
 * @author Diego F.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;


import co.edu.uniandes.rest.hospital.dtos.ServicioDTO;
import co.edu.uniandes.rest.hospital.exceptions.ServicioLogicException;

/**
 * Mock del recurso Servicio (Mock del servicio REST)
 */
@Named
@ApplicationScoped
public class ServicioLogicMock {
	
	// objeto para presentar logs de las operaciones
	private final static Logger logger = Logger.getLogger(ServicioLogicMock.class.getName());
	
	// listado de Servicioas
    private static ArrayList<ServicioDTO> Servicios;

    /**
     * Constructor. Crea los datos de ejemplo.
     */
    public ServicioLogicMock() {

    	if (Servicios == null) {
            Servicios = new ArrayList<>();
        }
        
    	// indica que se muestren todos los mensajes
    	logger.setLevel(Level.INFO);
    	
    	// muestra información 
    	logger.info("Inicializa la lista de Servicioas");
    	logger.info("Servicioas" + Servicios );
    }    
    
	/**
	 * Obtiene el listado de Servicios. 
	 * @return lista de Servicios
	 * @throws ServicioLogicException cuando no existe la lista en memoria  
	 */    
    public List<ServicioDTO> getServicios() throws ServicioLogicException {
    	if (Servicios == null) {
    		logger.severe("Error interno: lista de Servicioas no existe.");
    		throw new ServicioLogicException("Error interno: lista de Servicioas no existe.");    		
    	}
    	
    	logger.info("retornando todas las Servicioas");
    	return Servicios;
    }

    /**
     * Obtiene una Servicioa
     * @param id identificador de la Servicioa
     * @return Servicioa encontrada
     * @throws ServicioLogicException cuando la Servicioa no existe
     */
    public ServicioDTO getServicio(Long id) throws ServicioLogicException {
    	logger.info("recibiendo solicitud de Servicioa con id " + id);
    	
    	// busca la Servicioa con el id suministrado - en realidad la cedula
       /* for (ServicioDTO Servicio : Servicios) {
            if (Objects.equals(Servicio.getCedula(), id)){
            	logger.info("retornando Servicioa " + Servicio);
                return Servicio;
            }
        }*/
        
        // si no encuentra la Servicio
        logger.severe("No existe Servicio con ese id");
        throw new ServicioLogicException("No existe Servicio con ese id");
    }

    /**
     * Agrega una Servicio a la lista.
     * @param newServicio Servicio a adicionar
     * @throws ServicioLogicException cuando ya existe una Servicio con el id suministrado
     * @return Servicio agregada
     */
    public ServicioDTO createServicio(ServicioDTO newServicio) throws ServicioLogicException {
    	logger.info("recibiendo solicitud de agregar Servicio " + newServicio);
    	
    	// la nueva Servicio tiene id ?
    	if ( newServicio.getId() != null ) {
	    	// busca la Servicioa con el id suministrado
	        for (ServicioDTO Servicio : Servicios) {
	        	// si existe una Servicioa con ese id
	            if (Objects.equals(Servicio.getId(), newServicio.getId())){
	            	logger.severe("Ya existe una Servicioa con ese id");
	                throw new ServicioLogicException("Ya existe una Servicioa con ese id");
	            }
	        }
	        
	    // la nueva Servicioa no tiene id ? 
    	} else {

    		// genera un id para la Servicioa
    		logger.info("Generando id paa la nueva Servicioa");
    		long newId = 1;
	        for (ServicioDTO Servicio : Servicios) {
	            if (newId <= Servicio.getId()){
	                newId =  Servicio.getId() + 1;
	            }
	        }
	        newServicio.setId(newId);
    	}
    	
        // agrega la Servicioa
    	logger.info("agregando Servicioa " + newServicio);
        Servicios.add(newServicio);
        return newServicio;
    }

    /**
     * Actualiza los datos de una Servicioa
     * @param id identificador de la Servicioa a modificar
     * @param updateServicio Servicioa a modificar
     * @return datos de la Servicioa modificada 
     * @throws ServicioLogicException cuando no existe una Servicioa con el id suministrado
     */
    public ServicioDTO updateServicio(Long id, ServicioDTO updatedServicio) throws ServicioLogicException {
    	logger.info("recibiendo solictud de modificar Servicioa " + updatedServicio);
    	
    	// busca la Servicioa con el id suministrado
        for (ServicioDTO Servicio : Servicios) {
            if (Objects.equals(Servicio.getId(), id)) {
            	
            	// modifica la Servicioa
            	Servicio.setId(updatedServicio.getId());
    			Servicio.setCodigo(updatedServicio.getCodigo());
    			Servicio.setNombre(updatedServicio.getNombre());
    			Servicio.setPrecio(updatedServicio.getPrecio());
                
                // retorna la Servicioa modificada
            	logger.info("Modificando Servicioa " + Servicio);
                return Servicio;
            }
        }
        
        // no encontró la Servicioa con ese id ?
        logger.severe("No existe una Servicioa con ese id");
        throw new ServicioLogicException("No existe una Servicioa con ese id");
    }

    /**
     * Elimina los datos de una Servicioa
     * @param id identificador de la Servicioa a eliminar
     * @throws ServicioLogicException cuando no existe una Servicioa con el id suministrado
     */
    public void deleteServicio(Long id) throws ServicioLogicException {
    	logger.info("recibiendo solictud de eliminar Servicioa con id " + id);
    	
    	// busca la Servicioa con el id suministrado
      /*  for (ServicioDTO Servicio : Servicios) {
            if (Objects.equals(Servicio.getCedula(), id)) {
            	
            	// elimina la Servicioa
            	logger.info("eliminando Servicioa " + Servicio);
                Servicios.remove(Servicio);
                return;
            }
        }*/

        // no encontró la Servicioa con ese id ?
        logger.severe("No existe una Servicioa con ese id");
        throw new ServicioLogicException("No existe una Servicioa con ese id");
    }
}
