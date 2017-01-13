package co.edu.uniandes.proyectoautomatizacion.adapter;

/**
 * Created by juandavid on 4/10/15.
 */

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import co.edu.uniandes.proyectoautomatizacion.R;
import co.edu.uniandes.proyectoautomatizacion.database.CategoriaDb;

public class CatalogoListAdapter extends ArrayAdapter<CategoriaDb> {

    private final Activity context;
    private final List<CategoriaDb> itemname;


    public CatalogoListAdapter(Activity context, List<CategoriaDb> itemname) {
        super(context, R.layout.catalogo_list_custom_row, itemname);
        // TODO Auto-generated constructor stub

        this.context = context;
        this.itemname = itemname;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.catalogo_list_custom_row, null, true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.itemCatalogoTextView);
        ImageView logo = (ImageView) rowView.findViewById(R.id.itemCatalogoLogoImageView);

        LinearLayout lyt = (LinearLayout) rowView.findViewById(R.id.rowCatalogoLinearLayout);

        lyt.setBackgroundColor(context.getResources().getColor(R.color.cavas_beige));
        txtTitle.setTextColor(context.getResources().getColor(R.color.cavas_brown));

        Picasso.with(context).load(itemname.get(position).getLogo()).fit().into(logo);
        txtTitle.setText(itemname.get(position).getNombre());

        return rowView;

    }

    ;
}