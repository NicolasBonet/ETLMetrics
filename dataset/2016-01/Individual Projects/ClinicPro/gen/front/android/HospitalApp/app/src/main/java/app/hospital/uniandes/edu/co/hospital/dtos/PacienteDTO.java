package app.hospital.uniandes.edu.co.hospital.dtos;

/**
 * Created by diego on 17/04/2016.
 */
 
//variables generadas por GENERADOR
public class PacienteDTO {

    private Long id;

	private Long  documento;						        	
	private String nombres;
	private String apellidos;
	private String direccion;
 
 
//metodos generados por GENERADOR
 
public Long getDocumento() {
        return documento;
}

public void setDocumento(Long documento) {
        this.documento = documento;
}
						        	
public String getNombres() {
        return nombres;
}

public void setNombres(String nombres) {
        this.nombres = nombres;
}
public String getApellidos() {
        return apellidos;
}

public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
}
public String getDireccion() {
        return direccion;
}

public void setDireccion(String direccion) {
        this.direccion = direccion;
}
public Long getId() {
        return id;
}

public void setId(Long id) {
        this.id = id;
}

}