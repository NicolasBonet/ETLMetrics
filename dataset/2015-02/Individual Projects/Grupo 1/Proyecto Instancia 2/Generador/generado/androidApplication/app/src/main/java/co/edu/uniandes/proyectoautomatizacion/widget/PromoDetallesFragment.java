package co.edu.uniandes.proyectoautomatizacion.widget;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.ResultReceiver;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import co.edu.uniandes.proyectoautomatizacion.R;
import co.edu.uniandes.proyectoautomatizacion.database.PromocionDb;

/**
 * Created by juandavid on 4/27/15.
 */
public class PromoDetallesFragment extends Fragment {

    public static final String TAG = PromoDetallesFragment.class.getSimpleName();
    public static final String PROMO_ARG = "promo";
    private PromocionDb promoSeleccionada;
    private File storagePath;
    private ProgressDialog pd;
    private DetallePromoClickListener listener;

    public static PromoDetallesFragment newInstance() {

        PromoDetallesFragment f = new PromoDetallesFragment();

        return f;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.i(TAG, "Attached PromoDetallesFragment");
        promoSeleccionada = (PromocionDb) getArguments().getSerializable(PROMO_ARG);
        listener = (DetallePromoClickListener) activity;

        Map<String, String> flurryParams = new HashMap<String, String>();
        flurryParams.put("Nombre", promoSeleccionada.getNombre());
    }

    @Override
    public void onStop(){
        super.onStop();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v;

        Log.i(TAG, "Promo Detalles Fragment Started!");

        v = inflater.inflate(R.layout.fragment_promo_detalles, container, false);

        TextView nombrePromo = (TextView) v.findViewById(R.id.nombrePromoDetallesTextView);
        TextView descripcionPromo = (TextView) v.findViewById(R.id.descripcionPromoDetallesTextView);
        TextView terminosPromo = (TextView) v.findViewById(R.id.terminosPromoDetallesTextView);
        ImageView imgPromo = (ImageView) v.findViewById(R.id.promoDetalleImageView);

        nombrePromo.setText(promoSeleccionada.getNombre());
        descripcionPromo.setText(promoSeleccionada.getDescripcion());
        terminosPromo.setText(promoSeleccionada.getTerminos());

        Picasso.with(getActivity()).load(promoSeleccionada.getImagen()).placeholder(R.drawable.placeholder).error(R.drawable.placeholder).fit().into(imgPromo);

        TextView agregarPaseTextView = (TextView) v.findViewById(R.id.agregarCuponDetallePromoTextView);


        ImageView agregarPase = (ImageView) v.findViewById(R.id.agregarCuponDetallePromoImageView);


        ImageView irTiendaDetallePromo = (ImageView) v.findViewById(R.id.irATiendaDetallePromoImageView);
        irTiendaDetallePromo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onIrTiendaDetallePromoClick(promoSeleccionada.getDetalleUrl());
            }
        });

        return v;
    }

    /* Interface for handling clicks - both normal and long ones. */
    public interface DetallePromoClickListener {

        /**
         * Called when the view is clicked.
         *
         */
        public void onIrTiendaDetallePromoClick(String url);

    }


}
