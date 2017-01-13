package app.hospital.uniandes.edu.co.hospital.servicio;

import android.app.Activity;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


import app.hospital.uniandes.edu.co.hospital.R;
import app.hospital.uniandes.edu.co.hospital.dtos.ServicioDTO;

import app.hospital.uniandes.edu.co.hospital.rest.ConsumeRestPaciente;
import app.hospital.uniandes.edu.co.hospital.rest.ConsumeRestServicio;
import app.hospital.uniandes.edu.co.hospital.rest.ConsumeRestDoctor;



public class ServicioCreate extends AppCompatActivity {
	private EditText editTextCodigo;
	String codigo;
	private EditText editTextNombre;
	String nombre;
	private EditText editTextPrecio;
	Long precio = 0L;

    private Button btnCrearServicio;
    private ServicioDTO servicioNew = new ServicioDTO();
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicio_create);

editTextCodigo = (EditText) findViewById(R.id.editTextCodigo);
editTextNombre = (EditText) findViewById(R.id.editTextNombre);
editTextPrecio = (EditText) findViewById(R.id.editTextPrecio);


        btnCrearServicio = (Button) findViewById(R.id.btnGuardarServicio);

        btnCrearServicio.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (!validate()) {
                    Toast.makeText(getBaseContext(), "Por favor complete todos los campos!", Toast.LENGTH_LONG).show();
                } else {
                
codigo = editTextCodigo.getText().toString();
nombre = editTextNombre.getText().toString();
precio = Long.parseLong(editTextPrecio.getText().toString());


                    // call AsynTask to perform network operation on separate thread
                    
                    new HttpAsyncTask().execute("http://157.253.204.6:8080/hospital.api/api/servicios/");
                    
                }
            }
        });
    }

    public static String POST(String url, ServicioDTO servicio) {
        InputStream inputStream = null;
        String result = "";
        try {

            // 1. create HttpClient
            HttpClient httpclient = new DefaultHttpClient();

            // 2. make POST request to the given URL
            HttpPost httpPost = new HttpPost(url);

            String json = "";

            // 3. build jsonObject
            JSONObject jsonObject = new JSONObject();
            
            jsonObject.accumulate("codigo", servicio.getCodigo());
jsonObject.accumulate("nombre", servicio.getNombre());
jsonObject.accumulate("precio", servicio.getPrecio());


            // 4. convert JSONObject to JSON to String
            json = jsonObject.toString();

            // 5. set json to StringEntity
            StringEntity se = new StringEntity(json);

            // 6. set httpPost Entity
            httpPost.setEntity(se);

            // 7. Set some headers to inform server about the type of the content
            httpPost.setHeader("Accept", "application/json");
            httpPost.setHeader("Content-type", "application/json");

            // 8. Execute POST request to the given URL
            HttpResponse httpResponse = httpclient.execute(httpPost);

            // 9. receive response as inputStream
            inputStream = httpResponse.getEntity().getContent();

            // 10. convert inputstream to string
            if (inputStream != null)
                result = convertInputStreamToString(inputStream);
            else
                result = "No trabajó correctamente!";

        } catch (Exception e) {
            Log.d("InputStream", e.getLocalizedMessage());
        }

        // 11. return result
        return result;
    }

    private class HttpAsyncTask extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... urls) {

            servicioNew.setCodigo(codigo);
servicioNew.setNombre(nombre);
servicioNew.setPrecio(precio);


            return POST(urls[0], servicioNew);
        }

        // onPostExecute displays the results of the AsyncTask.
        @Override
        protected void onPostExecute(String result) {
            
            editTextCodigo.setText("");
editTextNombre.setText("");
editTextPrecio.setText("");

            
            Toast.makeText(getBaseContext(), "Datos enviados!", Toast.LENGTH_LONG).show();
            autoLoadRest();
        }
    }

    private boolean validate() {
    
    if(editTextCodigo.getText().toString().trim().equals(""))
 return false;
 else if(editTextNombre.getText().toString().trim().equals(""))
 return false;
 else if(editTextPrecio.getText().toString().trim().equals(""))
 return false;
  else 
 return true;
    
    }

    private static String convertInputStreamToString(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line = "";
        String result = "";
        while ((line = bufferedReader.readLine()) != null)
            result += line;
        inputStream.close();
        return result;

    }

    public void autoLoadRest() {
    
        String urlPaciente = String.format("http://157.253.204.6:8080/hospital.api/api/pacientes/",0);
        String paciente="pacientes";
        new ConsumeRestPaciente().execute(urlPaciente,paciente);
        String urlServicio = String.format("http://157.253.204.6:8080/hospital.api/api/servicios/",0);
        String servicio="servicios";
        new ConsumeRestServicio().execute(urlServicio,servicio);
        String urlDoctor = String.format("http://157.253.204.6:8080/hospital.api/api/doctors/",0);
        String doctor="doctors";
        new ConsumeRestDoctor().execute(urlDoctor,doctor);
    }
}
