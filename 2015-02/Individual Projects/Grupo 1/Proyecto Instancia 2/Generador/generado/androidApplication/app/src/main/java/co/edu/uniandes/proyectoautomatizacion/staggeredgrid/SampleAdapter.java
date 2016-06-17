package co.edu.uniandes.proyectoautomatizacion.staggeredgrid;

import java.util.ArrayList;
import java.util.Random;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.etsy.android.grid.util.DynamicHeightImageView;
import com.etsy.android.grid.util.DynamicHeightTextView;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import co.edu.uniandes.proyectoautomatizacion.R;
import co.edu.uniandes.proyectoautomatizacion.database.ProductoDb;

/***
 * ADAPTER
 */

public class SampleAdapter extends ArrayAdapter<ProductoDb> {

    private static final String TAG = "SampleAdapter";

    static class ViewHolder {
        DynamicHeightImageView txtLineOne;
        ProgressBar loading;
        Button btnGo;
    }

    private final LayoutInflater mLayoutInflater;
    private final Random mRandom;
    private final ArrayList<Integer> mBackgroundColors;

    private static final SparseArray<Double> sPositionHeightRatios = new SparseArray<Double>();

    public SampleAdapter(final Context context, final int textViewResourceId) {
        super(context, textViewResourceId);
        mLayoutInflater = LayoutInflater.from(context);
        mRandom = new Random();
        mBackgroundColors = new ArrayList<Integer>();
        //mBackgroundColors.add(R.color.orange);
        //mBackgroundColors.add(R.color.green);
        //mBackgroundColors.add(R.color.blue);
        //mBackgroundColors.add(R.color.yellow);
        mBackgroundColors.add(R.color.white);
    }

    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {

        final ViewHolder vh;
        if (convertView == null) {
            convertView = mLayoutInflater.inflate(R.layout.list_item_sample, parent, false);
            vh = new ViewHolder();
            vh.txtLineOne = (DynamicHeightImageView) convertView.findViewById(R.id.txt_line1);
            vh.loading = (ProgressBar) convertView.findViewById(R.id.progressBarLoadingCatalogo);
            vh.btnGo = (Button) convertView.findViewById(R.id.btn_go);

            convertView.setTag(vh);
        }
        else {
            vh = (ViewHolder) convertView.getTag();
        }

        double positionHeight = getPositionRatio(position);
        int backgroundIndex = position >= mBackgroundColors.size() ?
                position % mBackgroundColors.size() : position;

        convertView.setBackgroundResource(mBackgroundColors.get(backgroundIndex));

        //vh.txtLineOne.setHeightRatio(positionHeight);
        //vh.txtLineOne.setImageURI("");//setText(getItem(position) + position);

        //Picasso.with(getContext()).load(getItem(position).getImagen1()).placeholder(R.drawable.progress_animation).into(vh.txtLineOne);

        Picasso.with(getContext())
                .load(getItem(position).getImagen1())
                .into(vh.txtLineOne, new Callback() {
                    @Override
                    public void onSuccess() {
                        vh.loading.setVisibility(View.GONE);
                    }

                    @Override
                    public void onError() {
                        // TODO Auto-generated method stub

                    }
                });
        vh.txtLineOne.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View v) {
                //Toast.makeText(getContext(), "Touch en imagen # " + position, Toast.LENGTH_SHORT).show();
                final Dialog dialog = new Dialog(getContext());
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.custom_dialog_detalle_producto);

                ImageView detaProdImageView = (ImageView) dialog.findViewById(R.id.detalle_prod_dialog_image_view);
                ImageView shareProductoImageView = (ImageView) dialog.findViewById(R.id.shareProductoImageView);
                ImageView irATiendaProductoImageView = (ImageView) dialog.findViewById(R.id.verEnTiendaProductoImageView);

                irATiendaProductoImageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        final Dialog dialog = new Dialog(getContext());
                        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                        dialog.setContentView(R.layout.custom_dialog_webview);

                        TextView titulo = (TextView) dialog.findViewById(R.id.titlePopUpTextView);
                        titulo.setText("Detalle de Producto");

                        WebView mWebView;
                        mWebView = (WebView) dialog.findViewById(R.id.web_view_dialog);

                        WebSettings webSettings = mWebView.getSettings();
                        webSettings.setJavaScriptEnabled(true);

                        mWebView.loadUrl(getItem(position).getUrl());

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

                shareProductoImageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(android.content.Intent.ACTION_SEND);
                        intent.setType("text/plain");
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);

                        // Add data to the intent, the receiving app will decide what to do with it.
                        intent.putExtra(Intent.EXTRA_SUBJECT, getItem(position).getNombre());
                        intent.putExtra(Intent.EXTRA_TEXT, getItem(position).getUrl());

                        getContext().startActivity(Intent.createChooser(intent, "Compartir en:"));
                    }
                });

                Picasso.with(getContext()).load(getItem(position).getImagen1()).into(detaProdImageView);

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

        return convertView;
    }

    private double getPositionRatio(final int position) {
        double ratio = sPositionHeightRatios.get(position, 0.0);
        // if not yet done generate and stash the columns height
        // in our real world scenario this will be determined by
        // some match based on the known height and width of the image
        // and maybe a helpful way to get the column height!
        if (ratio == 0) {
            ratio = getRandomHeightRatio();
            sPositionHeightRatios.append(position, ratio);
            Log.d(TAG, "getPositionRatio:" + position + " ratio:" + ratio);
        }
        return ratio;
    }

    private double getRandomHeightRatio() {
        return (mRandom.nextDouble() / 2.0) + 1.0; // height will be 1.0 - 1.5 the width
    }
}