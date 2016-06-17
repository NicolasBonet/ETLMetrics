package co.edu.uniandes.proyectoautomatizacion.pojo;

import java.util.List;

/**
 * Created by juandavid on 7/7/15.
 */
public class CategoriaJsonItem {

    private long id;
    private String nombre;
    private String logo;
    private List<ProductoJson> productos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<ProductoJson> getProductos() {
        return productos;
    }

    public void setProductos(List<ProductoJson> productos) {
        this.productos = productos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
