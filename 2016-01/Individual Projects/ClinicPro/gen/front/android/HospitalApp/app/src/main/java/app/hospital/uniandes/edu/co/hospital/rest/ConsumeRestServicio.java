package app.hospital.uniandes.edu.co.hospital.rest;

import android.os.AsyncTask;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


import app.hospital.uniandes.edu.co.hospital.servicio.ServicioList;
import app.hospital.uniandes.edu.co.hospital.servicio.ServicioActivity;
import app.hospital.uniandes.edu.co.hospital.dtos.ServicioDTO;
import app.hospital.uniandes.edu.co.hospital.http.HttpRequest;


/**
 * Created by Diego on 17/04/2016.
 */
  
public class ConsumeRestServicio extends AsyncTask<String, Long, String> {


						        	
    public int bandera = 0;
    public int code = 0;

    protected String doInBackground(String... urls) {
        try {

            if (urls[1].equals("servicio")) {
                bandera = 1;
                code = HttpRequest.get(urls[0]).accept("application/json").code();
                return HttpRequest.get(urls[0]).accept("application/json").body();
            } else if (urls[1].equals("servicios")) {
                bandera = 2;
                code = HttpRequest.get(urls[0]).accept("application/json").code();
                return HttpRequest.get(urls[0]).accept("application/json").body();
            } else if (urls[1].equals("servicioDelete")) {
                bandera = 3;
                code = HttpRequest.delete(urls[0]).accept("application/json").code();
                HttpRequest.delete(urls[0]).accept("application/json");
                return null;
            } else {
                code = 0;
                bandera = 0;
                return null;
            }

        } catch (HttpRequest.HttpRequestException exception) {
            return null;
        }
    }

    protected void onPostExecute(String response) {

        if (bandera == 1) {
            if (code == 500) {
                System.out.println("Error en el servidor");
                
                new ServicioActivity().editTextCodigo.setText("");
new ServicioActivity().editTextNombre.setText("");
new ServicioActivity().editTextPrecio.setText("");

                
            } else if (code == 200) {
                ServicioDTO servicio = getServicio(response);
                //Envio los datos del objeto
                if (servicio != null) {
                
                new ServicioActivity().editTextCodigo.setText(servicio.getCodigo());
new ServicioActivity().editTextNombre.setText(servicio.getNombre());
new ServicioActivity().editTextPrecio.setText(servicio.getPrecio().toString());

                
                }
            }
        } 
       
        else if (bandera == 2) {
            if (code == 500) {
                System.out.println("Error en el servidor");
            } else if (code == 200) {
                clearAll();
                List<ServicioDTO> servicios = getServicios(response);
                int i = 0;
                if (servicios != null) {

                    for (ServicioDTO servicio : servicios) {
						 
					    
		           		new ServicioActivity().fullServicios.add(servicio);
						new ServicioList().fullServicios.add(servicio);
                       i++;
                    }
                }
            }
        } else if (bandera == 3) {
            if (code == 204) {
                clearAll();
                System.out.println("Servicio borrado...");
                System.out.println(response);
            } else {
                System.out.println("Error borrando el Servicio...");
            }
        }
    }

    private ServicioDTO getServicio(String json) {
        Gson gson = new Gson();
        Type type = new TypeToken<ServicioDTO>() {
        }.getType();
        return gson.fromJson(json, type);
    }

    private List<ServicioDTO> getServicios(String json) {
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<ServicioDTO>>() {
        }.getType();
        return gson.fromJson(json, type);
    }


// Permite hacer la limpieza de cada uno de los arrays que son cargados en los listviews
public void clearAll() {
		
        new ServicioActivity().fullServicios.clear();
        new ServicioList().fullServicios.clear();
 }

}

