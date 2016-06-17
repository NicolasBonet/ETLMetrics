package co.edu.uniandes.proyectoautomatizacion.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import co.edu.uniandes.proyectoautomatizacion.R;

public class ContactFragment1 extends Fragment {

    public static final String TAG = ContactFragment1.class.getSimpleName();
    private ContactoClickListener listener;

    public ContactFragment1() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        listener = (ContactoClickListener) activity;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.contactfragment1, container, false);

        ImageView facebookContacto = (ImageView) v.findViewById(R.id.facebookContacto);
        ImageView twitterContacto = (ImageView) v.findViewById(R.id.twitterContacto);
        ImageView instagramContacto = (ImageView) v.findViewById(R.id.instagramContacto);
        ImageView youtubeContacto = (ImageView) v.findViewById(R.id.youtubeContacto);
        ImageView pinterestContacto = (ImageView) v.findViewById(R.id.pinterestContacto);


        instagramContacto.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse(getActivity().getString(R.string.instagram_url))));
            }
        });

        pinterestContacto.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse(getActivity().getString(R.string.pinterest_url))));
            }
        });

        twitterContacto.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse(getActivity().getString(R.string.twitter_app)));
                    startActivity(intent);

                }catch (Exception e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse(getActivity().getString(R.string.twitter_url))));
                }
            }
        });

        facebookContacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent facebookIntent = getOpenFacebookIntent(getActivity());
                startActivity(facebookIntent);
            }
        });

        youtubeContacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(getActivity().getString(R.string.google_plus_url)));
                startActivity(intent);
            }
        });

        return v;
    }

    public Intent getOpenFacebookIntent(Context context) {

        return new Intent(Intent.ACTION_VIEW,
                Uri.parse(getActivity().getString(R.string.facebook_url))); //catches and opens a url to the desired page
    }

    public interface ContactoClickListener {

        /**
         * Called when the view is clicked.
         *
         */
        public void onIrTiendaContactoClick();

    }


}