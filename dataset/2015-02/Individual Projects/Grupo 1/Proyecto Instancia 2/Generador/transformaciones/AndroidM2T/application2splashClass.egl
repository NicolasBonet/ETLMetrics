package co.edu.uniandes.proyectoautomatizacion;

/**
 * Created by juandavid on 4/20/15.
 */

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import cz.msebera.android.httpclient.HttpEntity;
import cz.msebera.android.httpclient.HttpResponse;
import cz.msebera.android.httpclient.client.HttpClient;
import cz.msebera.android.httpclient.client.methods.HttpGet;
import cz.msebera.android.httpclient.impl.client.DefaultHttpClient;
import cz.msebera.android.httpclient.util.EntityUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;

import co.edu.uniandes.proyectoautomatizacion.database.CategoriaDb;
import co.edu.uniandes.proyectoautomatizacion.database.DatabaseHelper;
import co.edu.uniandes.proyectoautomatizacion.database.ProductoDb;
import co.edu.uniandes.proyectoautomatizacion.pojo.CategoriaJsonList;
import co.edu.uniandes.proyectoautomatizacion.pojo.ImagenesSlider;
import co.edu.uniandes.proyectoautomatizacion.pojo.PromosJsonList;
import co.edu.uniandes.proyectoautomatizacion.pojo.UbicacionJsonItem;
import co.edu.uniandes.proyectoautomatizacion.pojo.UbicacionJsonList;
import co.edu.uniandes.proyectoautomatizacion.util.Utilidades;


public class SplashActivity extends Activity {

    /** Duration of wait **/
    private final int SPLASH_DISPLAY_LENGTH = 1400;
    final static String PREFERENCE_LOCATIONS = "ListaLocations";
    private ApplicationClass appClass;
    private DatabaseHelper dh;
    private ImagenesSlider imagenesHome;
    private UbicacionJsonList listUbicaciones;
    private CategoriaJsonList listCatalogo;
    private PromosJsonList listPromos;
    SharedPreferences prefsLoc;
    SharedPreferences.Editor edLoc;
    private SharedPreferences usuarioPref;
    private SharedPreferences.Editor usuarioEdit;
    private SharedPreferences categoriaDinamicaPref;
    private SharedPreferences.Editor categoriaDinamicaEdit;
    public final static String USUARIO_PREFERENCES = "UsuarioPref";
    public final static String CATEGORIA_DINAMICA_PREFERENCES = "categoriaDinamicaPref";
    private ProgressBar spinner;
    private TextView cargaDatos;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.splash_screen);

        appClass = (ApplicationClass) getApplication();
        dh = appClass.getDbh();

        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/

        prefsLoc = getSharedPreferences(PREFERENCE_LOCATIONS, Context.MODE_PRIVATE);
        edLoc = prefsLoc.edit();

        usuarioPref = getSharedPreferences(USUARIO_PREFERENCES, Context.MODE_PRIVATE);
        usuarioEdit = usuarioPref.edit();

        categoriaDinamicaPref = getSharedPreferences(CATEGORIA_DINAMICA_PREFERENCES, Context.MODE_PRIVATE);
        categoriaDinamicaEdit = categoriaDinamicaPref.edit();

        cargaDatos = (TextView) findViewById(R.id.cargaDatosSplashTextView);
        spinner = (ProgressBar)  findViewById(R.id.progressBarSplashScreen);
        spinner.setVisibility(View.VISIBLE);

        if(Utilidades.isConnected(this)) {

            new ConsultaUbicaciones().execute();
            new ConsultaImagenesSliderHome().execute();
            new ConsultaCatalogo().execute();
            new ConsultaPromociones("TODOS",getString(R.string.url_promos)).execute();

        } else {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                    Intent mainIntent = new Intent(SplashActivity.this, MainActivity.class);
                    SplashActivity.this.startActivity(mainIntent);
                    SplashActivity.this.finish();
                }
            }, SPLASH_DISPLAY_LENGTH);
        }

    }

    private class ConsultaImagenesSliderHome extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute(){

            cargaDatos.setText("Cargando imagenes");

        }

        @Override
        protected Void doInBackground(Void... params) {

            if (Utilidades.isConnected(SplashActivity.this)) {
                try {

                    Gson gson = new Gson();

                    Type listType = new TypeToken<ImagenesSlider>() {
                    }.getType();

                    InputStream json = getJson();

                    if (json != null) {

                        Reader reader = new InputStreamReader(json);

                        imagenesHome = gson.fromJson(reader, listType); //Si el 200

                        if(imagenesHome != null) {
                            dh.deleteImagenesSliderByPantalla("home");
                            dh.insertImagenesSlider(imagenesHome, "home");
                            System.out.println("*******Insertadas imagenes del slide de Home!!!");
                        }

                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("NO HAY CONEXION");
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);

            new Handler().postDelayed(new Runnable(){
                @Override
                public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                    Intent mainIntent = new Intent(SplashActivity.this,MainActivity.class);
                    SplashActivity.this.startActivity(mainIntent);
                    SplashActivity.this.finish();
                }
            }, 1);
        }

        private InputStream getJson() throws IOException {

            HttpClient client = new DefaultHttpClient();

            HttpGet httpGet = new HttpGet(getString(R.string.url_imagenes_home));
            HttpResponse resp = client.execute(httpGet);

            System.out.println(resp.getStatusLine().getStatusCode());

            if (resp.getStatusLine().getStatusCode() != 200) {
                String res = EntityUtils.toString(resp.getEntity());

                System.out.println(resp.getStatusLine().getStatusCode() + " res=" + res);
                return null;
            }


            HttpEntity ent = resp.getEntity();
            return ent.getContent();
        }
    }




    private class ConsultaUbicaciones extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... params) {

            if (Utilidades.isConnected(SplashActivity.this)) {
                try {

                    Gson gson = new Gson();

                    Type listType = new TypeToken<UbicacionJsonList>() {
                    }.getType();

                    InputStream json = getJson();

                    if (json != null) {

                        Reader reader = new InputStreamReader(json);

                        listUbicaciones = gson.fromJson(reader, listType); //Si el 200

                        if(listUbicaciones != null) {
                            dh.deleteProductosUbic();
                            dh.deleteUbicaciones();
                            dh.insertUbicaciones(listUbicaciones);
                            System.out.println("*******Insertadas las Ubicaciones en la bd!!!");

                            edLoc.clear();
                            edLoc.commit();

                            for(UbicacionJsonItem loc : listUbicaciones.getTiendas()){

                                String geo = loc.getLatitud().replace(",",".") + ";;" + loc.getLongitud().replace(",",".") + ";;" + loc.getNombre() + ";;" + loc.getDireccion() + ";;" + loc.getMensaje();
                                edLoc.putString(loc.getNombre(), geo);
                            }

                            edLoc.putString("Bquest", "4.699963;;-74.061970;;Bquest;;Calle 115 # 52 55;;Prueba Cavas!");
                            edLoc.commit();

                            System.out.println("*******Insertadas ubicaciones desde JSON!!!");
                        }

                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("NO HAY CONEXION");
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);

            cargaDatos.setText("Cargando Ubicaciones");

        }

        private InputStream getJson() throws IOException {

            HttpClient client = new DefaultHttpClient();

            HttpGet httpGet = new HttpGet(getString(R.string.url_ubicaciones));
            HttpResponse resp = client.execute(httpGet);

            System.out.println(resp.getStatusLine().getStatusCode());

            if (resp.getStatusLine().getStatusCode() != 200) {
                String res = EntityUtils.toString(resp.getEntity());

                System.out.println(resp.getStatusLine().getStatusCode() + " res=" + res);
                return null;
            }

            HttpEntity ent = resp.getEntity();
            return ent.getContent();
        }
    }

    private class ConsultaCatalogo extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... params) {

            if (Utilidades.isConnected(SplashActivity.this)) {
                try {

                    Gson gson = new Gson();

                    Type listType = new TypeToken<CategoriaJsonList>() {
                    }.getType();

                    InputStream json = getJson();

                    if (json != null) {

                        Reader reader = new InputStreamReader(json);

                        listCatalogo = gson.fromJson(reader, listType); //Si el 200

                        if(listCatalogo != null) {
                            dh.deleteProductos();
                            dh.deleteCategorias();
                            dh.insertCategorias(listCatalogo);
                            System.out.println("*******Insertado el catalogo JSON en la bd!!!");

                        }

                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("NO HAY CONEXION");
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);

            cargaDatos.setText("Cargando Catalogo");

            System.out.println("Categorias Insertadas: " + dh.findAllCategorias().size());
            System.out.println("Productos Insertados: " + dh.findAllProductos().size());
            for(CategoriaDb cd : dh.findAllCategorias()){
                System.out.println("Productos " + cd.getNombre());
                for(ProductoDb pd : dh.findProductosByCategoria(cd.getId())){
                    System.out.println(pd.getNombre());
                }
            }
            System.out.println("Todos los prod insertados: " + dh.findAllProductos().size());
            for(ProductoDb p :  dh.findAllProductos()){
                System.out.println(p.getNombre() + " Cat: " + p.getCategoriaDb().getNombre() + " CatId: " + p.getCategoriaDb().getId());
            }


        }

        private InputStream getJson() throws IOException {

            HttpClient client = new DefaultHttpClient();

            HttpGet httpGet = new HttpGet(getString(R.string.url_catalogo));
            HttpResponse resp = client.execute(httpGet);

            System.out.println(resp.getStatusLine().getStatusCode());

            if (resp.getStatusLine().getStatusCode() != 200) {
                String res = EntityUtils.toString(resp.getEntity());

                System.out.println(resp.getStatusLine().getStatusCode() + " res=" + res);
                return null;
            }

            HttpEntity ent = resp.getEntity();
            return ent.getContent();
        }
    }

    private class ConsultaPromociones extends AsyncTask<Void, Void, Void> {

        private String cliente;
        private String url;

        public ConsultaPromociones(String cliente, String url){
            this.cliente = cliente;
            this.url = url;
        }

        @Override
        protected Void doInBackground(Void... params) {

            if (Utilidades.isConnected(SplashActivity.this)) {
                try {

                    Gson gson = new Gson();

                    Type listType = new TypeToken<PromosJsonList>() {
                    }.getType();

                    InputStream json = getJson();

                    if (json != null) {

                        Reader reader = new InputStreamReader(json);

                        listPromos = gson.fromJson(reader, listType); //Si el 200

                        if(listPromos != null) {
                            dh.deletePromos(cliente);
                            dh.insertPromos(listPromos,cliente);
                            System.out.println("*******Insertadas las Promos cliente: " + cliente);
                        }


                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("NO HAY CONEXION");
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);

            cargaDatos.setText("Cargando Promociones");

        }

        private InputStream getJson() throws IOException {

            HttpClient client = new DefaultHttpClient();

            HttpGet httpGet = new HttpGet(url);
            HttpResponse resp = client.execute(httpGet);

            System.out.println(resp.getStatusLine().getStatusCode());

            if (resp.getStatusLine().getStatusCode() != 200) {
                String res = EntityUtils.toString(resp.getEntity());

                System.out.println(resp.getStatusLine().getStatusCode() + " res=" + res);
                return null;
            }

            HttpEntity ent = resp.getEntity();
            return ent.getContent();
        }
    }


}