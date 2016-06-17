package co.edu.uniandes.proyectoautomatizacion.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by bquest on 13/02/15.
 */
public class Catalogo implements Serializable {

    private int imageResource;
    private List<Categoria> categorias;

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }


    @Override
    public String toString() {
        return "Catalogo{" +
                "imageResource=" + imageResource +
                ", categorias=" + categorias +
                '}';
    }
}