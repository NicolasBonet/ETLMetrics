package co.edu.uniandes.proyectoautomatizacion.pojo;

import java.io.Serializable;

/**
 * Created by bquest on 11/02/15.
 */
public class Producto implements Serializable {

    private String nombre;
    private String descripcion;
    private int imageResource;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", imageResource=" + imageResource +
                '}';
    }
}