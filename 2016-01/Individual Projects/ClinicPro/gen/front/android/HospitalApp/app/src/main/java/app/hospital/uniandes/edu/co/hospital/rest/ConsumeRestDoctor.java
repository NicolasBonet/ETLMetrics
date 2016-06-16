package app.hospital.uniandes.edu.co.hospital.rest;

import android.os.AsyncTask;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


import app.hospital.uniandes.edu.co.hospital.doctor.DoctorList;
import app.hospital.uniandes.edu.co.hospital.doctor.DoctorActivity;
import app.hospital.uniandes.edu.co.hospital.dtos.DoctorDTO;
import app.hospital.uniandes.edu.co.hospital.http.HttpRequest;


/**
 * Created by Diego on 17/04/2016.
 */
  
public class ConsumeRestDoctor extends AsyncTask<String, Long, String> {
						        	

    public int bandera = 0;
    public int code = 0;

    protected String doInBackground(String... urls) {
        try {

            if (urls[1].equals("doctor")) {
                bandera = 1;
                code = HttpRequest.get(urls[0]).accept("application/json").code();
                return HttpRequest.get(urls[0]).accept("application/json").body();
            } else if (urls[1].equals("doctors")) {
                bandera = 2;
                code = HttpRequest.get(urls[0]).accept("application/json").code();
                return HttpRequest.get(urls[0]).accept("application/json").body();
            } else if (urls[1].equals("doctorDelete")) {
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
                
                new DoctorActivity().editTextCedula.setText("");
new DoctorActivity().editTextDoctor.setText("");

                
            } else if (code == 200) {
                DoctorDTO doctor = getDoctor(response);
                //Envio los datos del objeto
                if (doctor != null) {
                
                new DoctorActivity().editTextCedula.setText(doctor.getCedula().toString());
new DoctorActivity().editTextDoctor.setText(doctor.getDoctor());

                
                }
            }
        } 
       
        else if (bandera == 2) {
            if (code == 500) {
                System.out.println("Error en el servidor");
            } else if (code == 200) {
                clearAll();
                List<DoctorDTO> doctors = getDoctors(response);
                int i = 0;
                if (doctors != null) {

                    for (DoctorDTO doctor : doctors) {
						 
					    
		           		new DoctorActivity().fullDoctors.add(doctor);
						new DoctorList().fullDoctors.add(doctor);
                       i++;
                    }
                }
            }
        } else if (bandera == 3) {
            if (code == 204) {
                clearAll();
                System.out.println("Doctor borrado...");
                System.out.println(response);
            } else {
                System.out.println("Error borrando el Doctor...");
            }
        }
    }

    private DoctorDTO getDoctor(String json) {
        Gson gson = new Gson();
        Type type = new TypeToken<DoctorDTO>() {
        }.getType();
        return gson.fromJson(json, type);
    }

    private List<DoctorDTO> getDoctors(String json) {
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<DoctorDTO>>() {
        }.getType();
        return gson.fromJson(json, type);
    }


// Permite hacer la limpieza de cada uno de los arrays que son cargados en los listviews
public void clearAll() {
		
        new DoctorActivity().fullDoctors.clear();
        new DoctorList().fullDoctors.clear();
 }

}

