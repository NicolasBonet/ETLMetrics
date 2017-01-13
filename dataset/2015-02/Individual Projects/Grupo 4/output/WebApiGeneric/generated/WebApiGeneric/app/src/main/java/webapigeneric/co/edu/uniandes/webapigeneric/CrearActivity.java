package webapigeneric.co.edu.uniandes.webapigeneric;

import android.os.StrictMode;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;
import webapigeneric.co.edu.uniandes.Utils.ConnectionTask;
import webapigeneric.co.edu.uniandes.Utils.GetSpinnerValuesTask;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by LuisSebastian on 10/25/15.
 */
public class CrearActivity extends Activity {

private EditText mNombre;
private EditText mApellido;
private RadioGroup mRadioGroupSexo;			
private RadioButton mRadioButtonSexo;			
private Spinner mCiudad;
private EditText mCorreo;
private EditText mUsuario;
private EditText mContrasenia;
private EditText mAcercaDeMi;
private EditText mRazon;
	
private CheckBox mRecibirCorreo;		
    private Button btnSave;
    private Button btnCancel;
    private JSONObject jsonObject = new JSONObject();
    private JSONObject jsonObject1 = new JSONObject();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();//q
        StrictMode.setThreadPolicy(policy);//q
		

/** Text views **/
mNombre = (EditText) findViewById(R.id.nombre);
/** Text views **/
mApellido = (EditText) findViewById(R.id.apellido);
 /** Radio buttons **/
mRadioGroupSexo = (RadioGroup) findViewById(R.id.sexoradioGroup);
/** Spinner - dropdown **/
    mCiudad = (Spinner) findViewById(R.id.spinnerciudad);

    //This list must be filled with the info received by the respective service.
	 GetSpinnerValuesTask mSpinnerTask = new GetSpinnerValuesTask(this, "http://192.168.0.6:51792/api/Ciudades/ObtenerTodos");		
   
    try {
        ArrayList<String> ciudades = mSpinnerTask.execute().get();
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, ciudades);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mCiudad.setAdapter(dataAdapter);
    } catch (InterruptedException e) {
        e.printStackTrace();
    } catch (ExecutionException e) {
        e.printStackTrace();
    }
/** Text views **/
mCorreo = (EditText) findViewById(R.id.correo);
/** Text views **/
mUsuario = (EditText) findViewById(R.id.usuario);
/** Text views **/
mContrasenia = (EditText) findViewById(R.id.contrasenia);
/** Text views **/
mAcercaDeMi = (EditText) findViewById(R.id.acercademi);
/** Text views **/
mRazon = (EditText) findViewById(R.id.razon);
/** Check button **/
mRecibirCorreo = (CheckBox) findViewById(R.id.recibircorreo);				

        /** Button **/
        btnSave = (Button) findViewById(R.id.btnSave);
        btnSave.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //TODO send form to server (httpPost/httpPut)
              try {
/** Text views **/
//Get value
String Nombre = mNombre.getText().toString();
jsonObject.accumulate("Nombre", Nombre);
/** Text views **/
//Get value
String Apellido = mApellido.getText().toString();
jsonObject.accumulate("Apellido", Apellido);
 /** Radio buttons **/
//Get value
int selectedId = mRadioGroupSexo.getCheckedRadioButtonId();
mRadioButtonSexo = (RadioButton) findViewById(selectedId);
String Sexo = mRadioButtonSexo.getText().toString();
jsonObject.accumulate("Sexo", Sexo);
/** Spinner - dropdown **/
   

        //Get value
        String spinnerValue = String.valueOf(mCiudad.getSelectedItem());
        int id = mCiudad.getSelectedItemPosition();
        jsonObject1.accumulate("Id",(id+1));
        jsonObject1.accumulate("Nombre",spinnerValue);
        jsonObject.accumulate("Ciudad", jsonObject1);
   
/** Text views **/
//Get value
String Correo = mCorreo.getText().toString();
jsonObject.accumulate("Correo", Correo);
/** Text views **/
//Get value
String Usuario = mUsuario.getText().toString();
jsonObject.accumulate("Usuario", Usuario);
/** Text views **/
//Get value
String Contrasenia = mContrasenia.getText().toString();
jsonObject.accumulate("Contrasenia", Contrasenia);
/** Text views **/
//Get value
String AcercaDeMi = mAcercaDeMi.getText().toString();
jsonObject.accumulate("AcercaDeMi", AcercaDeMi);
/** Text views **/
//Get value
String Razon = mRazon.getText().toString();
jsonObject.accumulate("Razon", Razon);
/** Check button **/
//Get value
boolean isChecked = mRecibirCorreo.isChecked();
jsonObject.accumulate("RecibirCorreo", isChecked);					
               
	 ConnectionTask connectionTask = new ConnectionTask("http://192.168.0.6:51792/api/Estudiantes/Crear",jsonObject.toString(),getApplicationContext());			
            connectionTask.execute();
            } catch (JSONException e) {
            e.printStackTrace();
        }        
            }
        });
        btnCancel = (Button) findViewById(R.id.btnCancel);
        btnCancel.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO cancel action
                finish();

            }
        });

        

    }


}
