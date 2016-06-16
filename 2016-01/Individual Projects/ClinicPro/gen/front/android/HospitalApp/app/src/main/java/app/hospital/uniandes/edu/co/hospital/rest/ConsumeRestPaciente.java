package app.hospital.uniandes.edu.co.hospital.rest;

import android.os.AsyncTask;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


import app.hospital.uniandes.edu.co.hospital.paciente.PacienteList;
import app.hospital.uniandes.edu.co.hospital.paciente.PacienteActivity;
import app.hospital.uniandes.edu.co.hospital.dtos.PacienteDTO;
import app.hospital.uniandes.edu.co.hospital.http.HttpRequest;


/**
 * Created by Diego on 17/04/2016.
 */
  
public class ConsumeRestPaciente extends AsyncTask<String, Long, String> {
						        	



    public int bandera = 0;
    public int code = 0;

    protected String doInBackground(String... urls) {
        try {

            if (urls[1].equals("paciente")) {
                bandera = 1;
                code = HttpRequest.get(urls[0]).accept("application/json").code();
                return HttpRequest.get(urls[0]).accept("application/json").body();
            } else if (urls[1].equals("pacientes")) {
                bandera = 2;
                code = HttpRequest.get(urls[0]).accept("application/json").code();
                return HttpRequest.get(urls[0]).accept("application/json").body();
            } else if (urls[1].equals("pacienteDelete")) {
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
                
                new PacienteActivity().editTextDocumento.setText("");
new PacienteActivity().editTextNombres.setText("");
new PacienteActivity().editTextApellidos.setText("");
new PacienteActivity().editTextDireccion.setText("");

                
            } else if (code == 200) {
                PacienteDTO paciente = getPaciente(response);
                //Envio los datos del objeto
                if (paciente != null) {
                
                new PacienteActivity().editTextDocumento.setText(paciente.getDocumento().toString());
new PacienteActivity().editTextNombres.setText(paciente.getNombres());
new PacienteActivity().editTextApellidos.setText(paciente.getApellidos());
new PacienteActivity().editTextDireccion.setText(paciente.getDireccion());

                
                }
            }
        } 
       
        else if (bandera == 2) {
            if (code == 500) {
                System.out.println("Error en el servidor");
            } else if (code == 200) {
                clearAll();
                List<PacienteDTO> pacientes = getPacientes(response);
                int i = 0;
                if (pacientes != null) {

                    for (PacienteDTO paciente : pacientes) {
						 
					    
		           		new PacienteActivity().fullPacientes.add(paciente);
						new PacienteList().fullPacientes.add(paciente);
                       i++;
                    }
                }
            }
        } else if (bandera == 3) {
            if (code == 204) {
                clearAll();
                System.out.println("Paciente borrado...");
                System.out.println(response);
            } else {
                System.out.println("Error borrando el Paciente...");
            }
        }
    }

    private PacienteDTO getPaciente(String json) {
        Gson gson = new Gson();
        Type type = new TypeToken<PacienteDTO>() {
        }.getType();
        return gson.fromJson(json, type);
    }

    private List<PacienteDTO> getPacientes(String json) {
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<PacienteDTO>>() {
        }.getType();
        return gson.fromJson(json, type);
    }


// Permite hacer la limpieza de cada uno de los arrays que son cargados en los listviews
public void clearAll() {
		
        new PacienteActivity().fullPacientes.clear();
        new PacienteList().fullPacientes.clear();
 }

}

