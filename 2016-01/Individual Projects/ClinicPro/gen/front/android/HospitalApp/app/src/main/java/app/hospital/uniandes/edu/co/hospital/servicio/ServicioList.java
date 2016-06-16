package app.hospital.uniandes.edu.co.hospital.servicio;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import app.hospital.uniandes.edu.co.hospital.R;
import app.hospital.uniandes.edu.co.hospital.servicio.ServicioEdit;

import app.hospital.uniandes.edu.co.hospital.dtos.ServicioDTO;

import app.hospital.uniandes.edu.co.hospital.rest.ConsumeRestPaciente;
import app.hospital.uniandes.edu.co.hospital.rest.ConsumeRestServicio;
import app.hospital.uniandes.edu.co.hospital.rest.ConsumeRestDoctor;



public class ServicioList extends AppCompatActivity {

   public static ArrayList< ServicioDTO> fullServicios = new ArrayList<ServicioDTO>();
	
	
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicio_list);

        int[] servicioPic = new int[]{
                R.drawable.user
        };

        final ListView listview = (ListView) findViewById(R.id.listViewServicios);

        final ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();

        for (int i = 0; i < fullServicios.size(); i++) {
            HashMap<String, String> hm = new HashMap<String, String>();

//Hash map generado basado en las propiedades de las clases

	hm.put("id", fullServicios.get(i).getId().toString());
hm.put("codigo", fullServicios.get(i).getCodigo().toString());
hm.put("nombre", fullServicios.get(i).getNombre().toString());
hm.put("precio", fullServicios.get(i).getPrecio().toString());
hm.put("servicioPic", Integer.toString(servicioPic[0]));


            list.add(hm);
        }

        // Keys used in Hashmap
                
        String[] from = {"servicioPic","codigo","nombre","precio","id"};

        // Ids of views in lvpacientes_layout
        
        
        
        int[] to = {R.id.servicioPic,R.id.codigo,R.id.nombre,R.id.precio};
        
        
        final SimpleAdapter adapter = new SimpleAdapter(getBaseContext(), list, R.layout.lvservicios_layout, from, to);

        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, final View view,
                                    final int position, long id) {
                // final String item = (String) parent.getItemAtPosition(position);
                final HashMap<String, String> item = (HashMap<String, String>) parent.getItemAtPosition(position);

                AlertDialog.Builder builder1 = new AlertDialog.Builder(ServicioList.this);
                builder1.setMessage("¿Que desea hacer?");
                builder1.setCancelable(true);
                builder1.setPositiveButton(
                        "Eliminar",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                                view.animate().setDuration(2000).alpha(0)
                                        .withEndAction(new Runnable() {
                                            @Override
                                            public void run() {
                                                Long cc = Long.parseLong(item.get("id"));
                                                list.remove(item);
                                                adapter.notifyDataSetChanged();
                                                view.setAlpha(1);
                                                String urlServicio = String.format("http://157.253.204.6:8080/hospital.api/api/servicios/" + cc, 0);
                                                String servicioDelete = "servicioDelete";
                                                new ConsumeRestServicio().execute(urlServicio, servicioDelete);
                                                autoLoadRest();
                                            }
                                        });
                            }
                        });

                builder1.setNegativeButton(
                        "Editar",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {

                                //Ir a la activity para editar

                                Intent intent2 = new Intent(view.getContext(), ServicioList.class);
                                startActivity(intent2);
                                finish();
                                
                                
                               

                                Intent intent = new Intent(view.getContext(), ServicioEdit.class);
                                //Variables para el intent generadas
                                intent.putExtra("id", item.get("id"));
intent.putExtra("codigo", item.get("codigo"));
intent.putExtra("nombre", item.get("nombre"));
intent.putExtra("precio", item.get("precio"));

                                startActivity(intent);

                                dialog.cancel();
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();
            }
        });
    }

    private class StableArrayAdapter extends ArrayAdapter<String> {

        HashMap<String, Integer> mIdMap = new HashMap<String, Integer>();

        public StableArrayAdapter(Context context, int textViewResourceId,
                                  List<String> objects) {
            super(context, textViewResourceId, objects);
            for (int i = 0; i < objects.size(); ++i) {
                mIdMap.put(objects.get(i), i);
            }
        }

        @Override
        public long getItemId(int position) {
            String item = getItem(position);
            return mIdMap.get(item);
        }

        @Override
        public boolean hasStableIds() {
            return true;
        }

    }

    public void autoLoadRest() {
        String urlServicio = String.format("http://157.253.204.6:8080/hospital.api/api/servicios/", 0);
        String servicio = "servicios";
        new ConsumeRestServicio().execute(urlServicio, servicio);
    }
}
