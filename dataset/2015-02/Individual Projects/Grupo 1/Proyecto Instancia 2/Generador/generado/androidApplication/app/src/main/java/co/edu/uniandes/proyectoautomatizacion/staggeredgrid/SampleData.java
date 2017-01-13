package co.edu.uniandes.proyectoautomatizacion.staggeredgrid;

/**
 * Created by Juan David on 23/09/2015.
 */
import java.util.ArrayList;
import java.util.List;

public class SampleData {

    public static final int SAMPLE_DATA_ITEM_COUNT = 7;

    public static ArrayList<String> generateSampleData() {
        final ArrayList<String> data = new ArrayList<String>(SAMPLE_DATA_ITEM_COUNT);

        for (int i = 0; i < SAMPLE_DATA_ITEM_COUNT; i++) {
            //data.add("SAMPLE #");
        }

        data.add("http://passqlub.com/restapp/cavas/home/Home-03.jpg");
        data.add("http://image.rakuten.co.jp/sakamoto-w/cabinet/longines/03059272/img60193242.jpg");
        data.add("http://passqlub.com/restapp/cavas/home/Home-04.jpg");
        data.add("http://passqlub.com/restapp/pepe/home/home-locos-hogar.jpg");
        data.add("http://passqlub.com/restapp/pepe/home/home-locos-juguetes.jpg");
        data.add("http://passqlub.com/restapp/pepe/home/home-revolcon.jpg");
        data.add("http://passqlub.com/restapp/pepe/home/banner-cliente-especial-app.png");

        return data;
    }

}