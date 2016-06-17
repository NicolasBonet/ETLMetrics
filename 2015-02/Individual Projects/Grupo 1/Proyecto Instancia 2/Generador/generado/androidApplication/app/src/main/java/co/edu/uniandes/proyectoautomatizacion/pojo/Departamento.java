package co.edu.uniandes.proyectoautomatizacion.pojo;

import java.util.List;

/**
 * Created by juandavid on 5/7/15.
 */
public class Departamento {

    private String nombreDepartamento;
    private List<Ciudad> ciudades;

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(List<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }
}
