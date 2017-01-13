/*
 * PacienteResource.java
 * Clase que representa el recurso "/pacientes"
 * Implementa varios métodos para manipular Pacientes
 */
package co.edu.uniandes.rest.hospital.resources;

import co.edu.uniandes.hospital.api.IPacienteLogic;
import co.edu.uniandes.hospital.entities.PacienteEntity;
import co.edu.uniandes.rest.hospital.converters.PacienteConverter;
import co.edu.uniandes.rest.hospital.dtos.PacienteDTO;
import co.edu.uniandes.rest.hospital.exceptions.PacienteLogicException;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * Clase que implementa el recurso REST correspondiente a "pacientes".
 * 
 * Note que la aplicación (definida en RestConfig.java) define la ruta
 * "/api" y este recurso tiene la ruta "pacientes". 
 * Al ejecutar la aplicación, el recurse será accesibe a través de la 
 * ruta "/api/Pacientes" 
 * 
 * @author Diego F.
 */
@Path("pacientes")
@Produces("application/json")
public class PacienteResource {

        @Inject
        IPacienteLogic pacienteLogic;
	/**
	 * Obtiene el listado de Pacientes. 
	 * @return lista de Pacienteas
	 * @throws PacienteLogicException excepción retornada por la lógica  
	 */
       
    @GET
    public List<PacienteDTO> getPacientes() throws PacienteLogicException {
        return PacienteConverter.listEntity2DTO(pacienteLogic.getPacientes());
    }
          
    /**
     * Obtiene una paciente
     * @param id identificador de la Paciente
     * @return paciente encontrada
     * @throws PacienteLogicException cuando la paciente no existe
     */
    @GET
    @Path("{documento: \\d+}")
    public PacienteDTO getPacienteByPK(@PathParam("documento") long documento) throws PacienteLogicException {
        return PacienteConverter.fullEntity2DTO(pacienteLogic.getPacienteByPK(documento));
    }

    /**
     * Agrega una paciente
     * @param paciente Paciente a agregar
     * @return datos de la paciente a agregar
     * @throws PacienteLogicException cuando ya existe una paciente con el id suministrado
     */
    
    @POST
    public PacienteDTO createPaciente(PacienteDTO dto) {     
        PacienteEntity entity = PacienteConverter.fullDTO2Entity(dto);
        return PacienteConverter.fullEntity2DTO(pacienteLogic.createPaciente(entity));
    }
    /**
     * Actualiza los datos de una paciente
     * @param id identificador de la paciente a modificar
     * @param paciente paciente a modificar
     * @return datos de la paciente modificada 
     * @throws PacienteLogicException cuando no existe una paciente con el id suministrado
     */
    @PUT
    @Path("{id: \\d+}")
    public PacienteDTO updatePaciente(@PathParam("id") Long id, PacienteDTO paciente) throws PacienteLogicException {
        PacienteEntity entity = PacienteConverter.fullDTO2Entity(paciente);
        entity.setId(id);
        PacienteEntity oldEntity = pacienteLogic.getPaciente(id);
        //entity.setBooks(oldEntity.getBooks());
        return PacienteConverter.fullEntity2DTO(pacienteLogic.updatePaciente(entity));
    }

    /**
     * Elimina los datos de una paciente
     * @param id identificador de la paciente a eliminar
     * @throws PacienteLogicException cuando no existe una paciente con el id suministrado
     */
    @DELETE
    @Path("{id: \\d+}")
    public void deletePaciente(@PathParam("id") Long id) throws PacienteLogicException {
    	pacienteLogic.deletePaciente(id);
    }

}
