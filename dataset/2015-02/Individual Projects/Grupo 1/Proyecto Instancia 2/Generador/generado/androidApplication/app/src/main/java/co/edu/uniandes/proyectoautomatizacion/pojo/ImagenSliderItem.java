package co.edu.uniandes.proyectoautomatizacion.pojo;

import java.io.Serializable;

/**
 * Created by juandavid on 5/8/15.
 */
public class ImagenSliderItem implements Serializable {

    private String imagen;
    private String url;
    private String tipo;

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
