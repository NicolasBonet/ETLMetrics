package co.edu.uniandes.rest.hospital.converters;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import co.edu.uniandes.rest.hospital.exceptions.DoctorLogicException;

/**
 * Convertidor de Excepciones DoctorLogicException a mensajes REST.
 */
@Provider
public class DoctorLogicExceptionMapper implements ExceptionMapper<DoctorLogicException> {

	/**
	 * Generador de una respuesta a partir de una excepción
	 * @param ex excecpión a convertir a una respuesta REST
	 */
	@Override
	public Response toResponse(DoctorLogicException ex) {
		// retorna una respuesta
		return Response
				.status(Response.Status.NOT_FOUND)	// estado HTTP 404
				.entity(ex.getMessage())                // mensaje adicional
				.type("text/plain")
				.build();
	}
	
}
