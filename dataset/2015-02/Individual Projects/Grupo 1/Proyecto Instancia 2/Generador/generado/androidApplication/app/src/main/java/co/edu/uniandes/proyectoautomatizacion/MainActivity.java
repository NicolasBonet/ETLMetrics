package co.edu.uniandes.proyectoautomatizacion;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.location.Location;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import co.edu.uniandes.proyectoautomatizacion.widget.PromoFragment1;
import co.edu.uniandes.proyectoautomatizacion.widget.MapFragment1;
import co.edu.uniandes.proyectoautomatizacion.widget.ContactFragment1;
import co.edu.uniandes.proyectoautomatizacion.widget.CatalogFragment1;
import co.edu.uniandes.proyectoautomatizacion.widget.PromoFragment2;
import co.edu.uniandes.proyectoautomatizacion.adapter.PromoListAdapter;
import co.edu.uniandes.proyectoautomatizacion.database.PromocionDb;
import co.edu.uniandes.proyectoautomatizacion.widget.PromoDetallesFragment;
import co.edu.uniandes.proyectoautomatizacion.widget.UbicacionFragment;
import co.edu.uniandes.proyectoautomatizacion.database.UbicacionDb;
import co.edu.uniandes.proyectoautomatizacion.database.CategoriaDb;
import co.edu.uniandes.proyectoautomatizacion.database.ProductoDb;
import co.edu.uniandes.proyectoautomatizacion.widget.CatalogoDetallesFragment;
import co.edu.uniandes.proyectoautomatizacion.widget.WebFragment;


public class MainActivity extends FragmentActivity implements  
 CatalogoDetallesFragment.CatalogoDetallesClickListener, PromoListAdapter.PromoViewHolder.PromoClickListener, PromoDetallesFragment.DetallePromoClickListener, 
PromoFragment1.PromoListClickListener, MapFragment1.OnMapMarkerClickedListener, ContactFragment1.ContactoClickListener, CatalogFragment1.CategoriaClickListener, PromoFragment2.PromoListClickListener {

    private static String TAG = MainActivity.class.getSimpleName();
    private FragmentTabHost mTabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity);

        mTabHost = (FragmentTabHost)findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);

		mTabHost.addTab(mTabHost.newTabSpec("promofragment1").setIndicator(getTabIndicator(mTabHost.getContext(), "Promos", R.drawable.menu3)),
                PromoFragment1.class, null);
                
		mTabHost.addTab(mTabHost.newTabSpec("mapfragment1").setIndicator(getTabIndicator(mTabHost.getContext(), "Mapa", R.drawable.menu5)),
                MapFragment1.class, null);
                
		mTabHost.addTab(mTabHost.newTabSpec("contactfragment1").setIndicator(getTabIndicator(mTabHost.getContext(), "Contacto", R.drawable.menu6)),
                ContactFragment1.class, null);
                
		mTabHost.addTab(mTabHost.newTabSpec("catalogfragment1").setIndicator(getTabIndicator(mTabHost.getContext(), "Catalogo", R.drawable.menu2)),
                CatalogFragment1.class, null);
                
		mTabHost.addTab(mTabHost.newTabSpec("promofragment2").setIndicator(getTabIndicator(mTabHost.getContext(), "Promos", R.drawable.menu3)),
                PromoFragment2.class, null);
                

    }

    private View getTabIndicator(Context context, String title, int icon) {
        View view = LayoutInflater.from(context).inflate(R.layout.tab_layout, null);
        ImageView iv = (ImageView) view.findViewById(R.id.imageView);
        iv.setImageResource(icon);
        TextView tv = (TextView) view.findViewById(R.id.textView);
        tv.setText(title);
        return view;
    }
    
    @Override
    public void onCategoriaClick(CategoriaDb cat) {

        Bundle args = new Bundle();
        args.putSerializable(CatalogoDetallesFragment.CATEGORIAS, cat);

        CatalogoDetallesFragment f = new CatalogoDetallesFragment();
        f.setArguments(args);

        getSupportFragmentManager().beginTransaction()
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .add(R.id.catalogoFrameLayout, f)
                .addToBackStack(null)
                .commit();
    }
    
    @Override
    public void onComprarProductoClick(ProductoDb p) {
        Bundle args = new Bundle();
        args.putSerializable(WebFragment.URL_ARG, p.getUrl());

        WebFragment webFragment = new WebFragment();
        webFragment.setArguments(args);

        getSupportFragmentManager().beginTransaction()
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .add(R.id.catalogoDetallesFrame, webFragment)
                .addToBackStack(null)
                .commit();
    }
    
    @Override
    public void onImagenSlideCatalogoDetallesClick(ProductoDb img) {

    }
    
    @Override
    public void onPromoClick(View v, int position, boolean isLongClick) {

    }

    @Override
    public void onPromoListClick(PromocionDb prom) {

    }
    
    @Override
    public void onIrTiendaDetallePromoClick(String url) {

    }

    @Override
    public void omMapMarkerClick(UbicacionDb seleccionada, Location ubicacionActual) {

        double[] latLongActuales = new double[2];

        if(ubicacionActual != null) {
            latLongActuales[0] = ubicacionActual.getLatitude();
            latLongActuales[1] = ubicacionActual.getLongitude();
        }


        Bundle args = new Bundle();
        args.putSerializable(UbicacionFragment.UBICACION_ARG, seleccionada);
        args.putDoubleArray(UbicacionFragment.UBICACION_ACTUAL_ARG, latLongActuales);

        UbicacionFragment f = new UbicacionFragment();
        f.setArguments(args);

        getSupportFragmentManager().beginTransaction()
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .add(R.id.mapFrame, f)
                .addToBackStack(null)
                .commit();

    }

    
    @Override
    public void onIrTiendaContactoClick() {
        Bundle args = new Bundle();
        args.putSerializable(WebFragment.URL_ARG, getString(R.string.url_pagina));

        WebFragment webFragment = new WebFragment();
        webFragment.setArguments(args);

        getSupportFragmentManager().beginTransaction()
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .add(R.id.contactoFrame, webFragment)
                .addToBackStack(null)
                .commit();
    }

   
    @Override
    public void onBackPressed() {

        System.out.println("back pressed main!");
        FragmentManager fm = getSupportFragmentManager();

        System.out.println("BackStack count: " + fm.getBackStackEntryCount());

        if (fm.getBackStackEntryCount() > 0) {
            super.onBackPressed();
        } else {
            new AlertDialog.Builder(this)
                    .setTitle("Confirmacion")
                    .setMessage("Deseas salir de la app?")
                    .setNegativeButton("No", null)
                    .setPositiveButton("Si", new DialogInterface.OnClickListener() {

                        public void onClick(DialogInterface arg0, int arg1) {
                            System.exit(0);
                        }
                    }).create().show();
        }

    }

}
