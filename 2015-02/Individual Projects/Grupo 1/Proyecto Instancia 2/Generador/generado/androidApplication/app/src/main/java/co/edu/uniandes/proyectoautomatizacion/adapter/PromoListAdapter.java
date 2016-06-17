package co.edu.uniandes.proyectoautomatizacion.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.List;

import co.edu.uniandes.proyectoautomatizacion.R;
import co.edu.uniandes.proyectoautomatizacion.database.PromocionDb;


/**
 * Created by juandavid on 4/20/15.
 */
public class PromoListAdapter extends RecyclerView.Adapter<PromoListAdapter.PromoViewHolder> {
    private List<PromocionDb> items;

    private Activity context;
    private int screenW;
    private int screenH;
    private PromoViewHolder.PromoClickListener listener;

    public static class PromoViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener{
        // Campos respectivos de un item
        public ImageView imagen;
        public ProgressBar loading;
        public TextView nombre;
        public TextView descripcion;
        private PromoClickListener promoClickListener;

        public PromoViewHolder(View v) {
            super(v);
            imagen = (ImageView) v.findViewById(R.id.imagenPromoImageView);
            loading = (ProgressBar) v.findViewById(R.id.progressBarLoadingPromo);

            //RelativeLayout.LayoutParams parms = (RelativeLayout.LayoutParams) imagen.getLayoutParams();
            //parms.height = (parms.width)*1;
            //imagen.setLayoutParams(parms);

            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);

            //nombre = (TextView) v.findViewById(R.id.nombreProductoTextView);
            //descripcion = (TextView) v.findViewById(R.id.descripcionProductoTextView);
        }

        /* Setter for listener. */
        public void setClickListener(PromoClickListener clickListener) {
            this.promoClickListener = clickListener;
        }

        @Override
        public void onClick(View v) {
            System.out.println("tocada promo en adapter");
            promoClickListener.onPromoClick(v, getPosition(), false);
        }

        @Override
        public boolean onLongClick(View v) {
            System.out.println("tocada promo en adapter");
            promoClickListener.onPromoClick(v, getPosition(), true);
            return true;
        }

        /* Interface for handling clicks - both normal and long ones. */
        public interface PromoClickListener {

            /**
             * Called when the view is clicked.
             *
             * @param v           view that is clicked
             * @param position    of the clicked item
             * @param isLongClick true if long click, false otherwise
             */
            public void onPromoClick(View v, int position, boolean isLongClick);

        }
    }

    public PromoListAdapter(List<PromocionDb> items, Activity con, PromoViewHolder.PromoClickListener listener) {
        this.items = items;
        this.context = con;
        this.listener = listener;
        Display mDisplay = context.getWindowManager().getDefaultDisplay();
        screenW  = mDisplay.getWidth();
        screenH = mDisplay.getHeight();
    }


    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public PromoViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.promo_cardview, viewGroup, false);
        return new PromoViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final PromoViewHolder viewHolder, int i) {
        //viewHolder.imagen.setImageResource(items.get(i).getImageResource());

        viewHolder.setClickListener(listener);
        //Picasso.with(context).load(items.get(i).getImagen()).placeholder(R.drawable.placeholder).error(R.drawable.placeholder).fit().into(viewHolder.imagen);

        Picasso.with(context)
                .load(items.get(i).getImagen())
                .placeholder(R.drawable.placeholder)
                .fit()
                .into(viewHolder.imagen, new Callback() {
                    @Override
                    public void onSuccess() {
                        viewHolder.loading.setVisibility(View.GONE);
                    }

                    @Override
                    public void onError() {
                        // TODO Auto-generated method stub

                    }
                });

        //viewHolder.nombre.setText(items.get(i).getNombre());
        //viewHolder.descripcion.setText(items.get(i).getDescripcion());
    }
}