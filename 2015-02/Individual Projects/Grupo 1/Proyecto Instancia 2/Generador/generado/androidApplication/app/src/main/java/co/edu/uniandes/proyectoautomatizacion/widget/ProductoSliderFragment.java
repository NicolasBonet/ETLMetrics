package co.edu.uniandes.proyectoautomatizacion.widget;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import co.edu.uniandes.proyectoautomatizacion.R;
import co.edu.uniandes.proyectoautomatizacion.database.ProductoDb;

/**
 * Created by juandavid on 7/8/15.
 */
public class ProductoSliderFragment extends Fragment {

    public static final String TAG = ProductoSliderFragment.class.getSimpleName();
    ProductoDb productoSlider;
    String url;
    static int alturaBotones;
    private OnSliderProductosClickListener mListener;


    public ProductoSliderFragment() {
        // Required empty public constructor
    }

    public static ProductoSliderFragment newInstance() {

        ProductoSliderFragment f = new ProductoSliderFragment();

        return f;
    }

    public static ProductoSliderFragment newInstance(ProductoDb img, OnSliderProductosClickListener imagenListener) {

        ProductoSliderFragment f = new ProductoSliderFragment();
        f.productoSlider = img;
        f.mListener = imagenListener;

        return f;
    }

    public static ProductoSliderFragment newInstance(ProductoDb img) {

        ProductoSliderFragment f = new ProductoSliderFragment();
        f.productoSlider = img;

        return f;
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.i(TAG, "Attached ProductoSliderFragment");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v;

        DisplayMetrics displaymetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int height = displaymetrics.heightPixels;
        int width = displaymetrics.widthPixels;

        v = inflater.inflate(R.layout.fragment_slider_productos,container,false);
        ImageView imageView = (ImageView)v.findViewById(R.id.imageButton);
        RelativeLayout rl = (RelativeLayout)v.findViewById(R.id.relativeLayoutComprarFicha);
        final Button fichaTecnicaButton = (Button)v.findViewById(R.id.fichaTecnicaButton);

        LinearLayout.LayoutParams rlp = (LinearLayout.LayoutParams) rl.getLayoutParams();
        //rlp.width = width;
        //rlp.height = (int)(height*(0.2));
        //rl.setLayoutParams(rlp);

        LinearLayout.LayoutParams parms = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        parms.width = width;
        parms.height = (int)(width * 1.42);//1.42
        imageView.setLayoutParams(parms);

        //Picasso.with(getActivity()).invalidate(url);

        if(productoSlider != null) {
            Picasso.with(getActivity()).load(productoSlider.getImagen1())
                    .placeholder(R.drawable.placeholder).error(R.drawable.placeholder).into(imageView);
        }
        //Picasso.with(getActivity()).load("http://passqlub.com/restapp/abril/fotoshome/home_1.jpg").placeholder(R.drawable.ic_launcher).error(R.drawable.ic_drawer).into(imageView);
        //"http://passqlub.com/restapp/abril/fotoshome/home_1.jpg";

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onProductoClickListener(productoSlider);
            }
        });

        Button comprarProducto = (Button) v.findViewById(R.id.comprarProductoButton);
        comprarProducto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(productoSlider.getUrl() != null && !productoSlider.equals("")){
                    mListener.onComprarProductoClickListener(productoSlider);
                }
            }
        });

        fichaTecnicaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Dialog dialog = new Dialog(getActivity());
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.custom_dialog_producto_detalles);

                TextView titulo = (TextView) dialog.findViewById(R.id.titlePopUpTextView);
                titulo.setText("Ficha Técnica");

                WebView mWebView;
                mWebView = (WebView) dialog.findViewById(R.id.web_view_dialog);

                String html = "<html><body><img src=\"" + productoSlider.getImagen2() + "\" width=\"100%\"\"/></body></html>";
                mWebView.loadData(html, "text/html", null);

                //mWebView.loadUrl(productoSlider.getImagen2());

                ImageView close = (ImageView) dialog.findViewById(R.id.closePopUpImageView);
                close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();

            }
        });

        return v;
    }

    public interface OnSliderProductosClickListener {
        void onProductoClickListener(ProductoDb img);
        void onComprarProductoClickListener(ProductoDb p);
    }

}