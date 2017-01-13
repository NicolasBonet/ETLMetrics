package co.edu.uniandes.proyectoautomatizacion.widget;

/**
 * Created by juandavid on 4/21/15.
 */

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import co.edu.uniandes.proyectoautomatizacion.ApplicationClass;
import co.edu.uniandes.proyectoautomatizacion.R;
import co.edu.uniandes.proyectoautomatizacion.database.DatabaseHelper;
import co.edu.uniandes.proyectoautomatizacion.database.ProductoUbicDb;
import co.edu.uniandes.proyectoautomatizacion.database.UbicacionDb;


public class UbicacionFragment extends Fragment {

    public static final String TAG = UbicacionFragment.class.getSimpleName();

    public static final String UBICACION_ARG = "ubicacion";
    public static final String UBICACION_ACTUAL_ARG = "ubicacionActual";
    private ApplicationClass appClass;
    private DatabaseHelper dh;

    private UbicacionDb mUbicacion;
    private double[] mUbicacionActual;

    public UbicacionFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        mUbicacion = (UbicacionDb) getArguments().getSerializable(UBICACION_ARG);
        mUbicacionActual = getArguments().getDoubleArray(UBICACION_ACTUAL_ARG);

        appClass = (ApplicationClass) getActivity().getApplication();
        dh = appClass.getDbh();
    }

    @Override
    public void onStop(){
        super.onStop();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v;

        Log.i(TAG, "Ubicacion Fragment Started!");

        v = inflater.inflate(R.layout.fragment_ubicacion, container, false);

        ImageView imView = (ImageView) v.findViewById(R.id.fotoDetalleLugar);
        //if (mUbicacion.getImageResource() != 0) {
        //    imView.setImageResource(mUbicacion.getImageResource());
        //} else {
        //    imView.setImageResource(R.drawable.ubicacion_placeholder);
        //}

        Picasso.with(getActivity()).load(mUbicacion.getImagen()).placeholder(R.drawable.placeholder).error(R.drawable.placeholder).fit().into(imView);


        TextView uName = (TextView) v.findViewById(R.id.ubicacion_name);
        uName.setText(mUbicacion.getNombre());

        TextView uDir = (TextView) v.findViewById(R.id.ubicacion_direccion);
        uDir.setText(mUbicacion.getDireccion());

        TextView uTel = (TextView) v.findViewById(R.id.ubicacion_productos);
        String prods = "";
        for(ProductoUbicDb p : dh.findProductosByUbicacion(mUbicacion.getId())){
            prods = prods + "• " + p.getNombre() + "\n";
        }
        uTel.setText(prods);

        TextView uDesc = (TextView) v.findViewById(R.id.ubicacion_descripcion);
        uDesc.setText(mUbicacion.getHorario());

        Button irATienda = (Button) v.findViewById(R.id.irATiendaButton);

        irATienda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("click ir a tienda " + mUbicacionActual[0] + " " + mUbicacionActual[1]);
                if(mUbicacionActual != null && mUbicacionActual.length == 2 && mUbicacionActual[0] != 0 && mUbicacionActual[1] != 0) {
                    System.out.println("Entro ir a tienda");
                    String url = "http://maps.google.com/maps?saddr=" + mUbicacionActual[0] + "," + mUbicacionActual[1]
                            + "&daddr=" + mUbicacion.getLatitud() + "," + mUbicacion.getLongitud();
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                    startActivity(intent);
                }
            }
        });

        return v;
    }



}