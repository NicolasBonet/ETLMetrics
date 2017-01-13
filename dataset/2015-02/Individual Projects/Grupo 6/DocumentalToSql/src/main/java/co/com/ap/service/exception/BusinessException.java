/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package co.com.ap.service.exception;

/**
 *
 * @author Ubaldo
 */
public class BusinessException extends RuntimeException{


	private static final long serialVersionUID = 8651949497748825971L;

	public BusinessException(String mensaje, Exception e){
		super(mensaje, e);
	}

}
