/*
 * ServicioResource.java
 * Clase que representa el recurso "/servicios"
 * Implementa varios métodos para manipular Servicios
 */
package co.edu.uniandes.rest.hospital.resources;

import co.edu.uniandes.hospital.api.IServicioLogic;
import co.edu.uniandes.hospital.entities.ServicioEntity;
import co.edu.uniandes.rest.hospital.converters.ServicioConverter;
import co.edu.uniandes.rest.hospital.dtos.ServicioDTO;
import co.edu.uniandes.rest.hospital.exceptions.ServicioLogicException;
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
 * Clase que implementa el recurso REST correspondiente a "servicios".
 * 
 * Note que la aplicación (definida en RestConfig.java) define la ruta
 * "/api" y este recurso tiene la ruta "servicios". 
 * Al ejecutar la aplicación, el recurse será accesibe a través de la 
 * ruta "/api/Servicios" 
 * 
 * @author Diego F.
 */
@Path("servicios")
@Produces("application/json")
public class ServicioResource {

        @Inject
        IServicioLogic servicioLogic;
	/**
	 * Obtiene el listado de Servicios. 
	 * @return lista de Servicioas
	 * @throws ServicioLogicException excepción retornada por la lógica  
	 */
       
    @GET
    public List<ServicioDTO> getServicios() throws ServicioLogicException {
        return ServicioConverter.listEntity2DTO(servicioLogic.getServicios());
    }
          
    /**
     * Obtiene una servicio
     * @param id identificador de la Servicio
     * @return servicio encontrada
     * @throws ServicioLogicException cuando la servicio no existe
     */
    @GET
    @Path("{codigo: \\d+}")
    public ServicioDTO getServicioByPK(@PathParam("codigo") String codigo) throws ServicioLogicException {
        return ServicioConverter.fullEntity2DTO(servicioLogic.getServicioByPK(codigo));
    }

    /**
     * Agrega una servicio
     * @param servicio Servicio a agregar
     * @return datos de la servicio a agregar
     * @throws ServicioLogicException cuando ya existe una servicio con el id suministrado
     */
    
    @POST
    public ServicioDTO createServicio(ServicioDTO dto) {     
        ServicioEntity entity = ServicioConverter.fullDTO2Entity(dto);
        return ServicioConverter.fullEntity2DTO(servicioLogic.createServicio(entity));
    }
    /**
     * Actualiza los datos de una servicio
     * @param id identificador de la servicio a modificar
     * @param servicio servicio a modificar
     * @return datos de la servicio modificada 
     * @throws ServicioLogicException cuando no existe una servicio con el id suministrado
     */
    @PUT
    @Path("{id: \\d+}")
    public ServicioDTO updateServicio(@PathParam("id") Long id, ServicioDTO servicio) throws ServicioLogicException {
        ServicioEntity entity = ServicioConverter.fullDTO2Entity(servicio);
        entity.setId(id);
        ServicioEntity oldEntity = servicioLogic.getServicio(id);
        //entity.setBooks(oldEntity.getBooks());
        return ServicioConverter.fullEntity2DTO(servicioLogic.updateServicio(entity));
    }

    /**
     * Elimina los datos de una servicio
     * @param id identificador de la servicio a eliminar
     * @throws ServicioLogicException cuando no existe una servicio con el id suministrado
     */
    @DELETE
    @Path("{id: \\d+}")
    public void deleteServicio(@PathParam("id") Long id) throws ServicioLogicException {
    	servicioLogic.deleteServicio(id);
    }

}
