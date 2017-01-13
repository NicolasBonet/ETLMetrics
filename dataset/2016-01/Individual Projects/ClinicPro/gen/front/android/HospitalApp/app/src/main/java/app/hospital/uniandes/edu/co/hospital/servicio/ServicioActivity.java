package app.hospital.uniandes.edu.co.hospital.servicio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Objects;

import app.hospital.uniandes.edu.co.hospital.R;
import app.hospital.uniandes.edu.co.hospital.dtos.ServicioDTO;



public class ServicioActivity extends AppCompatActivity {

	
	
    
    public static EditText editTextCodigo;
public static EditText editTextNombre;
public static EditText editTextPrecio;



    public static ArrayAdapter<String> adapterServicios;
    public static ArrayList<String> nombresServicios = new ArrayList<String>();
    public static ArrayList<ServicioDTO> fullServicios = new ArrayList<ServicioDTO>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicio);
        
            editTextCodigo = (EditText) findViewById(R.id.editTextCodigo);
editTextNombre = (EditText) findViewById(R.id.editTextNombre);
editTextPrecio = (EditText) findViewById(R.id.editTextPrecio);

       
    }
}
