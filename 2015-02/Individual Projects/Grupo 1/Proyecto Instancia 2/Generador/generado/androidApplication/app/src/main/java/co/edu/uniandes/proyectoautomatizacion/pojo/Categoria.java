package co.edu.uniandes.proyectoautomatizacion.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by bquest on 11/02/15.
 */
public class Categoria implements Serializable {

    private List<Producto> productos;
    private String nombre;
    private String url;
    private int imagen;
    private  String imagenUrl;

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "productos=" + productos +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}