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
import co.edu.uniandes.proyectoautomatizacion.database.PromocionDb;

/***
 * ADAPTER
 */

public class PromoFragment2Adapter extends ArrayAdapter<PromocionDb> {

    private static final String TAG = "PromoFragment2Adapter";

    static class ViewHolder {
        DynamicHeightImageView txtLineOne;
        ProgressBar loading;
        Button btnGo;
        TextView descripcionPromo;
    }

    private final LayoutInflater mLayoutInflater;
    private final Random mRandom;
    private final ArrayList<Integer> mBackgroundColors;

    private static final SparseArray<Double> sPositionHeightRatios = new SparseArray<Double>();

    public PromoFragment2Adapter(final Context context, final int textViewResourceId) {
        super(context, textViewResourceId);
        mLayoutInflater = LayoutInflater.from(context);
        mRandom = new Random();
        mBackgroundColors = new ArrayList<Integer>();
        mBackgroundColors.add(R.color.white);
    }

    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {

        final ViewHolder vh;
        if (convertView == null) {
            convertView = mLayoutInflater.inflate(R.layout.promofragment2adapter, parent, false);
            vh = new ViewHolder();
            vh.txtLineOne = (DynamicHeightImageView) convertView.findViewById(R.id.txt_line1);
            vh.loading = (ProgressBar) convertView.findViewById(R.id.progressBarLoadingCatalogo);
            vh.btnGo = (Button) convertView.findViewById(R.id.btn_go);
            vh.descripcionPromo = (TextView) convertView.findViewById(R.id.descripcionPromoTextView);

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
                .load(getItem(position).getImagen())
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

        vh.descripcionPromo.setText(getItem(position).getDescripcion());
         
       
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