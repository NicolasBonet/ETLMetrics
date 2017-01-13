package co.edu.uniandes.proyectoautomatizacion.widget;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import co.edu.uniandes.proyectoautomatizacion.R;

public class WebFragment extends Fragment {

    public static final String TAG = WebFragment.class.getSimpleName();
    public static final String URL_ARG = "url";
    private String url;

    public WebFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.i(TAG, "Attached webFragment");
        url = (String) getArguments().getSerializable(URL_ARG);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_web, container, false);
        WebView web = (WebView) v.findViewById(R.id.web_view);

        web.getSettings().setJavaScriptEnabled(true); // enable javascript


        web.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                System.out.println("Error webview");
            }
        });

        web.loadUrl(url);
        web.requestFocus();

        return v;
    }


}