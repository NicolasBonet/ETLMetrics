package app.hospital.uniandes.edu.co.hospital.doctor;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import app.hospital.uniandes.edu.co.hospital.R;
import app.hospital.uniandes.edu.co.hospital.paciente.PacienteActivity;

import app.hospital.uniandes.edu.co.hospital.paciente.PacienteCreate;
import app.hospital.uniandes.edu.co.hospital.paciente.PacienteList;
import app.hospital.uniandes.edu.co.hospital.dtos.PacienteDTO;

import app.hospital.uniandes.edu.co.hospital.servicio.ServicioActivity;

import app.hospital.uniandes.edu.co.hospital.servicio.ServicioCreate;
import app.hospital.uniandes.edu.co.hospital.servicio.ServicioList;
import app.hospital.uniandes.edu.co.hospital.dtos.ServicioDTO;


import app.hospital.uniandes.edu.co.hospital.doctor.DoctorCreate;
import app.hospital.uniandes.edu.co.hospital.doctor.DoctorList;
import app.hospital.uniandes.edu.co.hospital.dtos.DoctorDTO;


import app.hospital.uniandes.edu.co.hospital.rest.ConsumeRestPaciente;
import app.hospital.uniandes.edu.co.hospital.rest.ConsumeRestServicio;
import app.hospital.uniandes.edu.co.hospital.rest.ConsumeRestDoctor;

public class DoctorActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
        
	
        

    private Button btnBuscarDoctor;
 public static ArrayList<String> nombresPacientes = new ArrayList<String>();
 public static ArrayList<PacienteDTO> fullPacientes = new ArrayList<PacienteDTO>();
 public static ArrayList<String> nombresServicios = new ArrayList<String>();
 public static ArrayList<ServicioDTO> fullServicios = new ArrayList<ServicioDTO>();
 public static ArrayList<String> nombresDoctors = new ArrayList<String>();
 public static ArrayList<DoctorDTO> fullDoctors = new ArrayList<DoctorDTO>();
  
  
  //Atributos generados  
   public static EditText editTextCedula;
public static EditText editTextDoctor;

  
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor);

        btnBuscarDoctor = (Button) findViewById(R.id.btnBuscarDoctor);
//Atributos generados
editTextCedula = (EditText) findViewById(R.id.editTextCedula);
editTextDoctor = (EditText) findViewById(R.id.editTextDoctor);


        autoLoadRest();

        btnBuscarDoctor.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
          
                    int numero = Integer.parseInt(editTextCedula.getText().toString());
                    //Consumiendo el servicio REST
                    //String url = String.format("http://10.0.2.2:8080/hospital.api/api/persons/" + numero, numero);
                    
                    String urlDoctor = String.format("http://157.253.204.6:8080/hospital.api/api/doctors/" + numero, numero);
                    String doctor = "doctor";
                    autoLoadRest();
                    new ConsumeRestDoctor().execute(urlDoctor, doctor);
               
            }
        });

        //Parte de interface del menú en la activity principal
        //Creacion del toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //DrawerLayout que se abre con el boton izquierdo superior
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        //Verificacion de las opciones del menú
        if (id == R.id.pacientesList) {
            autoLoadRest();
            Intent intent = new Intent(getApplicationContext(), PacienteList.class);
            startActivity(intent);
        } else if (id == R.id.pacientesCreate) {
            Intent intent = new Intent(getApplicationContext(), PacienteCreate.class);
            startActivity(intent);
        }
        //Verificacion de las opciones del menú
        if (id == R.id.serviciosList) {
            autoLoadRest();
            Intent intent = new Intent(getApplicationContext(), ServicioList.class);
            startActivity(intent);
        } else if (id == R.id.serviciosCreate) {
            Intent intent = new Intent(getApplicationContext(), ServicioCreate.class);
            startActivity(intent);
        }
        //Verificacion de las opciones del menú
        if (id == R.id.doctorsList) {
            autoLoadRest();
            Intent intent = new Intent(getApplicationContext(), DoctorList.class);
            startActivity(intent);
        } else if (id == R.id.doctorsCreate) {
            Intent intent = new Intent(getApplicationContext(), DoctorCreate.class);
            startActivity(intent);
        }
 		else if (id == R.id.credits) {
            Toast.makeText(getApplicationContext(), "Diego Ruiz\nAbimelec Cuesta",
                    Toast.LENGTH_LONG).show();
        }
        
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void autoLoadRest() {
        String urlPaciente = String.format("http://157.253.204.6:8080/hospital.api/api/pacientes/", 0);
        String paciente = "pacientes";
        new ConsumeRestPaciente().execute(urlPaciente, paciente);
    
 
        String urlServicio = String.format("http://157.253.204.6:8080/hospital.api/api/servicios/", 0);
        String servicio = "servicios";
        new ConsumeRestServicio().execute(urlServicio, servicio);
    
 
        String urlDoctor = String.format("http://157.253.204.6:8080/hospital.api/api/doctors/", 0);
        String doctor = "doctors";
        new ConsumeRestDoctor().execute(urlDoctor, doctor);
    
 
}
}
