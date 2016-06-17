package co.edu.uniandes.proyectoautomatizacion.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by juandavid on 5/8/15.
 */
public class ImagenesSlider implements Serializable{

    private List<ImagenSliderItem> imagenes;

    public List<ImagenSliderItem> getImagenes() {
        return imagenes;
    }

    public void setImagenes(List<ImagenSliderItem> imagenes) {
        this.imagenes = imagenes;
    }
}
