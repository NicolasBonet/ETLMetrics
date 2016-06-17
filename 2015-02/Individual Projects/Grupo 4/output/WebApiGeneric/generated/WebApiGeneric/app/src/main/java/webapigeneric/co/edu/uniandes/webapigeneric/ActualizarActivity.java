package webapigeneric.co.edu.uniandes.webapigeneric;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;
import org.apache.http.HttpResponse;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import webapigeneric.co.edu.uniandes.Utils.Conexiones;
import webapigeneric.co.edu.uniandes.Utils.GetSpinnerValuesTask;
import java.util.concurrent.ExecutionException;

public class ActualizarActivity extends Activity {//q
    //generado desde aqui
    
private EditText mNombre;
private EditText mApellido;
private RadioGroup mRadioGroupSexo;
private RadioButton mRadioButtonSexo;				
					private RadioButton mRadioButtonMujer;					
					private RadioButton mRadioButtonHombre;					
private Spinner mCiudad;
private EditText mCorreo;
private EditText mUsuario;
private EditText mContrasenia;
private EditText mAcercaDeMi;
private EditText mRazon;
	
private CheckBox mRecibirCorreo;		
    //generado hasta aqui
    
    
    private Button btnSave;//q
    private Button btnCancel;//q
    JSONObject object2 = new JSONObject();//q ciudad
    JSONObject objectExistente = new JSONObject();//q estdiante existente
    JSONObject object1 = new JSONObject();//q estudiante
    @Override//q
    protected void onCreate(Bundle savedInstanceState) {//q
        super.onCreate(savedInstanceState);//q
        final int idBuscar = getIntent().getExtras().getInt("idBuscar");//q
        setContentView(R.layout.activity_actualizar);//q
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();//q
        StrictMode.setThreadPolicy(policy);//q
    
       
/** Text views **/
mNombre = (EditText) findViewById(R.id.nombre);
/** Text views **/
mApellido = (EditText) findViewById(R.id.apellido);
 /** Radio buttons **/
mRadioGroupSexo = (RadioGroup) findViewById(R.id.sexoradioGroup);
mRadioButtonMujer =(RadioButton)findViewById(R.id.mujer);					
mRadioButtonHombre =(RadioButton)findViewById(R.id.hombre);					
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
         mCiudad.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override//q
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {//q
                    try {//q
                        object2.put("Id",position+1);
                        object2.put("Nombre", mCiudad.getSelectedItem().toString());
                    } catch (JSONException e) {//q
                        e.printStackTrace();//q
                    }//q
            }//q
            @Override//q
                public void onNothingSelected(AdapterView<?> parent) {//q
                }//q
            });//q
        
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
    
        btnSave = (Button) findViewById(R.id.btnSave);//q
        btnCancel = (Button) findViewById(R.id.btnCancel);//q
        try {//q
								

		//poraui voy

		String json = Conexiones.conexionGetController("http://192.168.0.6:51792/api/Estudiantes/ObtenerPorId", idBuscar);
            if(json.equals("null")){//q
                Toast.makeText(this,"Objeto no encontrado",Toast.LENGTH_SHORT).show();//q
                finish();//q
            }//q
            else{//q
                objectExistente= new JSONObject(json);//q
                
                
mNombre.setText(objectExistente.getString("Nombre")) ;
mApellido.setText(objectExistente.getString("Apellido")) ;

         /*if(objectExistente.getInt("Sexo")==0){
                    mRadioButtonMujer.setChecked(true);
                }else{
                    mRadioButtonHombre.setChecked(true);
                }
                */			
mCorreo.setText(objectExistente.getString("Correo")) ;
mUsuario.setText(objectExistente.getString("Usuario")) ;
mContrasenia.setText(objectExistente.getString("Contrasenia")) ;
mAcercaDeMi.setText(objectExistente.getString("AcercaDeMi")) ;
mRazon.setText(objectExistente.getString("Razon")) ;
					  if(objectExistente.getString("RecibirCorreo").equals("true")){
					mRecibirCorreo.setChecked(true);		
					}
       
                btnSave.setOnClickListener(new View.OnClickListener() {//q
                    @Override//q
                    public void onClick(View v) {//q
                        try {//q
                  
                          
                            
                            //de aqui
                                
			object1.put("Id",idBuscar);
					   object1.put("Nombre", mNombre.getText().toString());
					   object1.put("Apellido", mApellido.getText().toString());
					int selectedId = mRadioGroupSexo.getCheckedRadioButtonId();
mRadioButtonSexo = (RadioButton) findViewById(selectedId);
String Sexo = mRadioButtonSexo.getText().toString();
					
					object1.put("Sexo", Sexo);
					object1.put("Ciudad", object2);
					   object1.put("Correo", mCorreo.getText().toString());
					   object1.put("Usuario", mUsuario.getText().toString());
					   object1.put("Contrasenia", mContrasenia.getText().toString());
					   object1.put("AcercaDeMi", mAcercaDeMi.getText().toString());
					   object1.put("Razon", mRazon.getText().toString());
	
					   object1.put("RecibirCorreo", mRecibirCorreo.isChecked());
	          		   String object2String=object1.toString();
	          		   			   HttpResponse resp = null;//q	
	          		   			    resp = Conexiones.conexionPutController("http://192.168.0.6:51792/api/Estudiantes/Actualizar",object2String);
                  
                            if(resp.getStatusLine().getStatusCode()==200){//q
                                Toast.makeText(getApplicationContext(),"OK",Toast.LENGTH_SHORT).show();//q
                                finish();//Q
                            }else{//q
                                Toast.makeText(getApplicationContext(),"ERROR "+resp.getStatusLine().getStatusCode()+" : "+resp.getStatusLine().getReasonPhrase(),Toast.LENGTH_SHORT).show();//q
                            }//q
   
                            //hasta aqui
            
                         
                  
                           
                        } catch (Exception e) {//q
                            e.printStackTrace();//q
                        }//q
                    }//q
                });//q
            }//q
            } catch (Exception e) {//q
            e.printStackTrace();//q
        }//q
        btnCancel.setOnClickListener(new View.OnClickListener() {//q
        @Override//q
            public void onClick(View v) {//q
                finish();//q
            }//q
        });//q
    }//q
}//q
