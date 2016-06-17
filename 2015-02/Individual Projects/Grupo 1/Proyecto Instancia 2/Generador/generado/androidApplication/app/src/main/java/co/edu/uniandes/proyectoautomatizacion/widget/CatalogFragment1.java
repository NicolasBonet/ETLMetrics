package co.edu.uniandes.proyectoautomatizacion.widget;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
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
import co.edu.uniandes.proyectoautomatizacion.pojo.Catalogo;
import co.edu.uniandes.proyectoautomatizacion.staggeredgrid.CatalogFragment1Adapter;
import co.edu.uniandes.proyectoautomatizacion.staggeredgrid.SampleData;


public class CatalogFragment1 extends Fragment implements AbsListView.OnScrollListener, AbsListView.OnItemClickListener, AdapterView.OnItemLongClickListener{

    public static final String TAG = CatalogFragment1.class.getSimpleName();
    public static final String CATALOGO_ARG = "catalogo";
    private CategoriaClickListener listener;
    private ApplicationClass appClass;
    private DatabaseHelper dh;

    private StaggeredGridView mGridView;
    private CatalogFragment1Adapter mAdapter;
    private ArrayList<String> mData;

    public CatalogFragment1() {
        // Required empty public constructor
    }

    public static CatalogFragment1 newInstance() {

        CatalogFragment1 f = new CatalogFragment1();

        return f;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.i(TAG, "Attached CatalogoFragment");
        listener = (CategoriaClickListener) activity;
        appClass = (ApplicationClass) getActivity().getApplication();
        dh = appClass.getDbh();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v;

        Log.i(TAG, "Catalogo Fragment Started!");

        v = inflater.inflate(R.layout.catalogfragment1, container, false);

        List<ProductoDb> prods = new ArrayList<>();
        prods = dh.findAllProductos();

        System.out.println("tamano prods: " + prods);

        mGridView = (StaggeredGridView) v.findViewById(R.id.grid_view);

        LayoutInflater layoutInflater = getLayoutInflater(new Bundle());

        mAdapter = new CatalogFragment1Adapter(getActivity(), R.id.txt_line1);

            mData = new ArrayList<>();
                for (ProductoDb pdb : prods) {
                    mData.add(pdb.getImagen1());
                }

        for (ProductoDb data : prods) {
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

    /* Interface for handling clicks - both normal and long ones. */
    public interface CategoriaClickListener {

        /**
         * Called when the view is clicked.
         *
         */
        public void onCategoriaClick(CategoriaDb cat);

    }

}