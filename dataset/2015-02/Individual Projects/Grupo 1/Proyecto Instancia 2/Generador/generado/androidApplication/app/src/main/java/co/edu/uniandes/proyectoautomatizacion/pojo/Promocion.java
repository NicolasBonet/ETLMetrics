package co.edu.uniandes.proyectoautomatizacion.pojo;

import java.io.Serializable;

/**
 * Created by bquest on 11/02/15.
 */
public class Promocion implements Serializable {

    private int idCupon;
    private String nombre;
    private String condiciones;
    private int imageResource;
    private String urlImagen;
    private String descripcion;

    public int getIdCupon() {
        return idCupon;
    }

    public void setIdCupon(int idCupon) {
        this.idCupon = idCupon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(String condiciones) {
        this.condiciones = condiciones;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    @Override
    public String toString() {
        return "Promocion{" +
                "idCupon=" + idCupon +
                ", nombre='" + nombre + '\'' +
                ", condiciones='" + condiciones + '\'' +
                ", imageResource=" + imageResource +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}