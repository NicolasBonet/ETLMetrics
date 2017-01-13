package co.edu.uniandes.proyectoautomatizacion.widget;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.etsy.android.grid.StaggeredGridView;

import java.util.ArrayList;
import java.util.List;

import co.edu.uniandes.proyectoautomatizacion.ApplicationClass;
import co.edu.uniandes.proyectoautomatizacion.R;
import co.edu.uniandes.proyectoautomatizacion.adapter.CatalogoListAdapter;
import co.edu.uniandes.proyectoautomatizacion.database.CategoriaDb;
import co.edu.uniandes.proyectoautomatizacion.database.DatabaseHelper;
import co.edu.uniandes.proyectoautomatizacion.database.ProductoDb;
import co.edu.uniandes.proyectoautomatizacion.database.PromocionDb;
import co.edu.uniandes.proyectoautomatizacion.pojo.Catalogo;
import co.edu.uniandes.proyectoautomatizacion.staggeredgrid.PromoFragment1Adapter;
import co.edu.uniandes.proyectoautomatizacion.staggeredgrid.SampleData;

/**
 * Created by juandavid on 4/10/15.
 */
public class PromoFragment1 extends Fragment implements AbsListView.OnScrollListener, AbsListView.OnItemClickListener, AdapterView.OnItemLongClickListener{

    public static final String TAG = PromoFragment1.class.getSimpleName();
    private ApplicationClass appClass;
    private DatabaseHelper dh;

    private StaggeredGridView mGridView;
    private PromoFragment1Adapter mAdapter;
    private ArrayList<String> mData;
    public static final String PROMOS_ARG = "promos";
    private List<PromocionDb> promocionesDb;
    private PromoListClickListener listener;

    public PromoFragment1() {
        // Required empty public constructor
    }

    public static PromoFragment1 newInstance() {

        PromoFragment1 f = new PromoFragment1();

        return f;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.i(TAG, "Attached PromoFragment");
        listener = (PromoListClickListener) activity;
        appClass = (ApplicationClass) getActivity().getApplication();
        dh = appClass.getDbh();
        promocionesDb = dh.findPromosByCliente("TODOS");
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

        Log.i(TAG, "PromoFragment Started!");

        v = inflater.inflate(R.layout.promofragment1, container, false);

        mGridView = (StaggeredGridView) v.findViewById(R.id.grid_view);

        LayoutInflater layoutInflater = getLayoutInflater(new Bundle());

        mAdapter = new PromoFragment1Adapter(getActivity(), R.id.txt_line1);

        mData = new ArrayList<>();
        for (PromocionDb pdb : promocionesDb) {
            mData.add(pdb.getImagen());
        }

        for (PromocionDb data : promocionesDb) {
            mAdapter.add(data);
        }

        mGridView.setAdapter(mAdapter);
        mGridView.setOnScrollListener(this);
        mGridView.setOnItemClickListener(this);
        mGridView.setOnItemLongClickListener(this);

        return v;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
        return false;
    }

    @Override
    public void onScrollStateChanged(AbsListView absListView, int i) {

    }

    @Override
    public void onScroll(AbsListView absListView, int i, int i1, int i2) {

    }


    public interface PromoListClickListener {

        /**
         * Called when the view is clicked.
         *
         */
        public void onPromoListClick(PromocionDb prom);

    }

}