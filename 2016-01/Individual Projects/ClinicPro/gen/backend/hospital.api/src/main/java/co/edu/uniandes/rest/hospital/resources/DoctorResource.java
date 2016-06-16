/*
 * DoctorResource.java
 * Clase que representa el recurso "/doctors"
 * Implementa varios métodos para manipular Doctors
 */
package co.edu.uniandes.rest.hospital.resources;

import co.edu.uniandes.hospital.api.IDoctorLogic;
import co.edu.uniandes.hospital.entities.DoctorEntity;
import co.edu.uniandes.rest.hospital.converters.DoctorConverter;
import co.edu.uniandes.rest.hospital.dtos.DoctorDTO;
import co.edu.uniandes.rest.hospital.exceptions.DoctorLogicException;
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
 * Clase que implementa el recurso REST correspondiente a "doctors".
 * 
 * Note que la aplicación (definida en RestConfig.java) define la ruta
 * "/api" y este recurso tiene la ruta "doctors". 
 * Al ejecutar la aplicación, el recurse será accesibe a través de la 
 * ruta "/api/Doctors" 
 * 
 * @author Diego F.
 */
@Path("doctors")
@Produces("application/json")
public class DoctorResource {

        @Inject
        IDoctorLogic doctorLogic;
	/**
	 * Obtiene el listado de Doctors. 
	 * @return lista de Doctoras
	 * @throws DoctorLogicException excepción retornada por la lógica  
	 */
       
    @GET
    public List<DoctorDTO> getDoctors() throws DoctorLogicException {
        return DoctorConverter.listEntity2DTO(doctorLogic.getDoctors());
    }
          
    /**
     * Obtiene una doctor
     * @param id identificador de la Doctor
     * @return doctor encontrada
     * @throws DoctorLogicException cuando la doctor no existe
     */
    @GET
    @Path("{cedula: \\d+}")
    public DoctorDTO getDoctorByPK(@PathParam("cedula") long cedula) throws DoctorLogicException {
        return DoctorConverter.fullEntity2DTO(doctorLogic.getDoctorByPK(cedula));
    }

    /**
     * Agrega una doctor
     * @param doctor Doctor a agregar
     * @return datos de la doctor a agregar
     * @throws DoctorLogicException cuando ya existe una doctor con el id suministrado
     */
    
    @POST
    public DoctorDTO createDoctor(DoctorDTO dto) {     
        DoctorEntity entity = DoctorConverter.fullDTO2Entity(dto);
        return DoctorConverter.fullEntity2DTO(doctorLogic.createDoctor(entity));
    }
    /**
     * Actualiza los datos de una doctor
     * @param id identificador de la doctor a modificar
     * @param doctor doctor a modificar
     * @return datos de la doctor modificada 
     * @throws DoctorLogicException cuando no existe una doctor con el id suministrado
     */
    @PUT
    @Path("{id: \\d+}")
    public DoctorDTO updateDoctor(@PathParam("id") Long id, DoctorDTO doctor) throws DoctorLogicException {
        DoctorEntity entity = DoctorConverter.fullDTO2Entity(doctor);
        entity.setId(id);
        DoctorEntity oldEntity = doctorLogic.getDoctor(id);
        //entity.setBooks(oldEntity.getBooks());
        return DoctorConverter.fullEntity2DTO(doctorLogic.updateDoctor(entity));
    }

    /**
     * Elimina los datos de una doctor
     * @param id identificador de la doctor a eliminar
     * @throws DoctorLogicException cuando no existe una doctor con el id suministrado
     */
    @DELETE
    @Path("{id: \\d+}")
    public void deleteDoctor(@PathParam("id") Long id) throws DoctorLogicException {
    	doctorLogic.deleteDoctor(id);
    }

}
