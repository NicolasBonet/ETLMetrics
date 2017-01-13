package co.edu.uniandes.proyectoautomatizacion.widget;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import co.edu.uniandes.proyectoautomatizacion.ApplicationClass;
import co.edu.uniandes.proyectoautomatizacion.R;
import co.edu.uniandes.proyectoautomatizacion.database.CategoriaDb;
import co.edu.uniandes.proyectoautomatizacion.database.DatabaseHelper;
import co.edu.uniandes.proyectoautomatizacion.database.ImagenSliderItemDb;
import co.edu.uniandes.proyectoautomatizacion.database.ProductoDb;

/**
 * Created by juandavid on 4/10/15.
 */
public class CatalogoDetallesFragment extends Fragment{

    public static final String TAG = CatalogoDetallesFragment.class.getSimpleName();
    public static final String CATEGORIAS = "categorias";
    public static final String IMAGENES_SLIDE_HOME = "slidingImages";

    private ApplicationClass appClass;
    private DatabaseHelper dh;
    private CategoriaDb catalogo;
    private CatalogoDetallesClickListener listener;
    private List<ImagenSliderItemDb> imgsdb;

    public final static String USUARIO_PREFERENCES = "UsuarioPref";
    private SharedPreferences usuarioPref;
    private SharedPreferences.Editor usuarioEdit;

    public CatalogoDetallesFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.i(TAG, "Attached CatalogoDetallesFragment");
        appClass = (ApplicationClass) getActivity().getApplication();
        dh = appClass.getDbh();

        catalogo = dh.findCategoriaByNombre(((CategoriaDb) getArguments().getSerializable(CATEGORIAS)).getNombre()).get(0);
        listener = (CatalogoDetallesClickListener) activity;

        System.out.println(catalogo.getNombre() + dh.findProductosByCategoria(catalogo.getId()).size());
        //imgsSlider = (ImagenesSlider) getArguments().getSerializable(IMAGENES_SLIDE_HOME);

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

        DisplayMetrics displaymetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int scrHeight = displaymetrics.heightPixels;
        int scrWidth = displaymetrics.widthPixels;

        Log.i(TAG, "CatalogoDetallesFragment Started!");

        //slidingImagesList = Arrays.asList(pictures);

        v = inflater.inflate(R.layout.fragment_catalogo_detalles, container, false);
        final ViewPager pager = (ViewPager) v.findViewById(R.id.catalogoDetallesViewPager);

        Display mDisplay = getActivity().getWindowManager().getDefaultDisplay();
        int width  = mDisplay.getWidth();
        int height = mDisplay.getHeight();

        ViewGroup.LayoutParams params = pager.getLayoutParams();
        // Changes the height and width to the specified *pixels*
        params.height = (int)((width * 1.42) + (height*0.25));
        params.width = width;
        pager.setLayoutParams(params);

        pager.setAdapter(new MyPagerAdapter(getChildFragmentManager()));

        return v;
    }

    private class MyPagerAdapter extends FragmentStatePagerAdapter implements ProductoSliderFragment.OnSliderProductosClickListener {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {

            //return CuponDetalladoFragment.newInstance(mPaseDeta.get(pos));
            return ProductoSliderFragment.newInstance(dh.findProductosByCategoria(catalogo.getId()).get(pos), this);

        }

        @Override
        public int getCount() {
            return dh.findProductosByCategoria(catalogo.getId()).size();
        }

        @Override
        public void onProductoClickListener(ProductoDb img) {
            System.out.println("click producto imagen slider ");
            listener.onImagenSlideCatalogoDetallesClick(img);
        }

        @Override
        public void onComprarProductoClickListener(ProductoDb p) {
            listener.onComprarProductoClick(p);
        }
    }

    public interface CatalogoDetallesClickListener {

        /**
         * Called when the view is clicked.
         *
         */
        public void onImagenSlideCatalogoDetallesClick(ProductoDb img);
        public void onComprarProductoClick(ProductoDb p);
    }



}