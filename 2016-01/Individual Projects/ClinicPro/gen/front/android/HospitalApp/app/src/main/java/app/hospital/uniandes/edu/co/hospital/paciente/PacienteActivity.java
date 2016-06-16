package app.hospital.uniandes.edu.co.hospital.paciente;

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
import app.hospital.uniandes.edu.co.hospital.dtos.PacienteDTO;



public class PacienteActivity extends AppCompatActivity {

	
	
	
    
    public static EditText editTextDocumento;
public static EditText editTextNombres;
public static EditText editTextApellidos;
public static EditText editTextDireccion;



    public static ArrayAdapter<String> adapterPacientes;
    public static ArrayList<String> nombresPacientes = new ArrayList<String>();
    public static ArrayList<PacienteDTO> fullPacientes = new ArrayList<PacienteDTO>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paciente);
        
            editTextDocumento = (EditText) findViewById(R.id.editTextDocumento);
editTextNombres = (EditText) findViewById(R.id.editTextNombres);
editTextApellidos = (EditText) findViewById(R.id.editTextApellidos);
editTextDireccion = (EditText) findViewById(R.id.editTextDireccion);

       
    }
}
