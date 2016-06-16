package co.edu.uniandes.rest.hospital.converters;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import co.edu.uniandes.rest.hospital.exceptions.PacienteLogicException;

/**
 * Convertidor de Excepciones PacienteLogicException a mensajes REST.
 */
@Provider
public class PacienteLogicExceptionMapper implements ExceptionMapper<PacienteLogicException> {

	/**
	 * Generador de una respuesta a partir de una excepción
	 * @param ex excecpión a convertir a una respuesta REST
	 */
	@Override
	public Response toResponse(PacienteLogicException ex) {
		// retorna una respuesta
		return Response
				.status(Response.Status.NOT_FOUND)	// estado HTTP 404
				.entity(ex.getMessage())                // mensaje adicional
				.type("text/plain")
				.build();
	}
	
}
