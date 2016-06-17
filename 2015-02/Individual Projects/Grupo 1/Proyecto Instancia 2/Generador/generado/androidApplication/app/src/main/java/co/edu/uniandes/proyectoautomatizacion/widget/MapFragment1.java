package co.edu.uniandes.proyectoautomatizacion.widget;

/**
 * Created by juandavid on 3/2/15.
 */

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.BounceInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.squareup.picasso.Picasso;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import co.edu.uniandes.proyectoautomatizacion.ApplicationClass;
import co.edu.uniandes.proyectoautomatizacion.R;
import co.edu.uniandes.proyectoautomatizacion.database.DatabaseHelper;
import co.edu.uniandes.proyectoautomatizacion.database.UbicacionDb;

public class MapFragment1 extends Fragment implements GoogleMap.OnMarkerClickListener {

    public static final String TAG = MapFragment1.class.getSimpleName();

    public static final String LOCATIONS_ARG = "ubicaciones";

    //private List<Ubicacion> mUbicaciones;
    private List<UbicacionDb> ubicacionesDb;
    private Map<Marker, UbicacionDb> mMarkers;

    private OnMapMarkerClickedListener mListener;

    private GoogleMap mGoogleMap;
    Location ubicacionActual;

    private ApplicationClass appClass;
    private DatabaseHelper dh;
    private static View v;

    public MapFragment1() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        mListener = (OnMapMarkerClickedListener) activity;

        //mUbicaciones = (List<Ubicacion>) getArguments().getSerializable(LOCATIONS_ARG);

        appClass = (ApplicationClass) getActivity().getApplication();
        dh = appClass.getDbh();
        ubicacionesDb = dh.findAllUbicaciones();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        if (v != null) {
            ViewGroup parent = (ViewGroup) v.getParent();
            if (parent != null)
                parent.removeView(v);
        }
        try {
            v = inflater.inflate(R.layout.mapfragment1, container, false);
            //mMarkers = new HashMap<>(mUbicaciones.size());
            mMarkers = new HashMap<>(ubicacionesDb.size());
            setUpMapIfNeeded();
        } catch (InflateException e) {
        /* map is already there, just return view as it is */
        }
        return v;

    }

    @Override
    public void onResume() {
        super.onResume();

        setUpMapIfNeeded();
    }

    private void setUpMapIfNeeded() {
        // Do a null check to confirm that we have not already instantiated the map.
        if (mGoogleMap == null) {
            // Try to obtain the map from the SupportMapFragment.
            mGoogleMap = ((SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map))
                    .getMap();
            // Check if we were successful in obtaining the map.
            if (mGoogleMap != null) {
                setUpMap();
            }
        }
    }

    private void setUpMap() {
        // Hide the zoom controls as the button panel will cover it.
        mGoogleMap.getUiSettings().setZoomControlsEnabled(false);

        // Add lots of markers to the map.
        addMarkersToMap();

        // Set listeners for marker events.  See the bottom of this class for their behavior.
        mGoogleMap.setOnMarkerClickListener(this);

        // Pan to see all markers in view.
        // Cannot zoom to bounds until the map has a size.
        final View mapView = getChildFragmentManager().findFragmentById(R.id.map).getView();
        if (mapView.getViewTreeObserver().isAlive()) {
            mapView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                @SuppressWarnings("deprecation") // We use the new method when supported
                @SuppressLint("NewApi") // We check which build version we are using.
                @Override
                public void onGlobalLayout() {
                    LatLngBounds bounds = null;

                    for (UbicacionDb ubic : ubicacionesDb) {
                        bounds = new LatLngBounds.Builder()
                                .include(new LatLng(ubic.getLatitud(), ubic.getLongitud())).build();
                    }
                }
            });
        }

        mGoogleMap.setInfoWindowAdapter(new MyInfoWindowAdapter());

        mGoogleMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(Marker marker) {

                if (marker.getTitle().equalsIgnoreCase("Ir a tienda mas cercana")) {
                    System.out.println("Ir a mas cercana!");

                    Location locationA = new Location("Ubicacion actual");
                    locationA.setLatitude(marker.getPosition().latitude);
                    locationA.setLongitude(marker.getPosition().longitude);
                    float distancia = 0;
                    UbicacionDb ubicMasCercana = null;

                    for (UbicacionDb item : ubicacionesDb) {

                        Location locationB = new Location(item.getNombre());
                        locationB.setLatitude(item.getLatitud());
                        locationB.setLongitude(item.getLongitud());

                        if (distancia == 0) {
                            distancia = locationA.distanceTo(locationB);
                            ubicMasCercana = item;
                        } else {
                            if (locationA.distanceTo(locationB) < distancia) {
                                distancia = locationA.distanceTo(locationB);
                                ubicMasCercana = item;
                            }
                        }
                    }

                    if (ubicMasCercana != null) {

                        String url = "http://maps.google.com/maps?saddr=" + marker.getPosition().latitude + "," + marker.getPosition().longitude
                                + "&daddr=" + ubicMasCercana.getLatitud() + "," + ubicMasCercana.getLongitud();
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(url));
                        intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                        startActivity(intent);
                    }

                } else {
                    System.out.println("OnInfoWindowClick " + marker.getPosition().latitude + " " + marker.getPosition().longitude + " " + mMarkers.get(marker).getLatitud() + " " + mMarkers.get(marker).getLongitud());

                    mListener.omMapMarkerClick(mMarkers.get(marker), ubicacionActual);

                }
            }
        });


    }

    private void addMarkersToMap() {

        for (UbicacionDb item : ubicacionesDb) {
            MarkerOptions m = new MarkerOptions()
                    .title(item.getNombre())
                    .draggable(false)
                    .infoWindowAnchor(0.5f, 0.5f)
                    .position(new LatLng(item.getLatitud(), item.getLongitud()));

            Log.i(TAG, "Anadiendo marcador [" + item.getLatitud() + "," + item.getLongitud() + "]");

            Marker mk = mGoogleMap.addMarker(m);
            mMarkers.put(mk, item);
        }

        currentLocation();
    }

    private void currentLocation() {
        mGoogleMap.setMyLocationEnabled(true);
        // Get the location manager

        LocationManager locationManager = (LocationManager) getActivity().getApplicationContext().getSystemService(Context
                .LOCATION_SERVICE);
        Criteria criteria = new Criteria();
        criteria.setAccuracy(Criteria.ACCURACY_COARSE);   //default
        criteria.setCostAllowed(false);

        // get the best provider depending on the criteria
        String provider = locationManager.getBestProvider(criteria, false);

        // the last known location of this provider
        Location myLocation = locationManager.getLastKnownLocation(provider);


        if (myLocation != null) {
            ubicacionActual = myLocation;
            mGoogleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(
                    new LatLng(myLocation.getLatitude(), myLocation
                            .getLongitude()), 12));
            MarkerOptions m = new MarkerOptions()
                    .title("Ir a tienda mas cercana")
                    .draggable(false)
                    .infoWindowAnchor(0.5f, 0.5f)
                    .position(new LatLng(myLocation.getLatitude(), myLocation.getLongitude()));

            mGoogleMap.addMarker(m);

        } else {
            mGoogleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(
                    new LatLng(4.64254, -74.07192), 12));
        }

    }

    @Override
    public boolean onMarkerClick(final Marker marker) {

        // This causes the marker at Perth to bounce into position when it is clicked.
        final Handler handler = new Handler();
        final long start = SystemClock.uptimeMillis();
        final long duration = 1500;

        final Interpolator interpolator = new BounceInterpolator();

        handler.post(new Runnable() {
            @Override
            public void run() {
                long elapsed = SystemClock.uptimeMillis() - start;
                float t = Math.max(1 - interpolator
                        .getInterpolation((float) elapsed / duration), 0);
                marker.setAnchor(0.5f, 1.0f + 2 * t);

                if (t > 0.0) {
                    // Post again 16ms later.
                    handler.postDelayed(this, 16);
                }
            }
        });

        // We return false to indicate that we have not consumed the event and that we wish
        // for the default behavior to occur (which is for the camera to move such that the
        // marker is centered and for the marker's info window to open, if it has one).
        return false;
    }

    public interface OnMapMarkerClickedListener {
        void omMapMarkerClick(UbicacionDb seleccionada, Location ubicacioActual);
    }

    class MyInfoWindowAdapter implements GoogleMap.InfoWindowAdapter {

        private final View myContentsView;

        MyInfoWindowAdapter() {
            myContentsView = getActivity().getLayoutInflater().inflate(R.layout.custom_infowindow_map, null);
        }

        @Override
        public View getInfoContents(Marker marker) {

            TextView tvTitle = ((TextView) myContentsView.findViewById(R.id.infoWindowMapTitle));
            tvTitle.setText(marker.getTitle());

            return myContentsView;
        }

        @Override
        public View getInfoWindow(Marker marker) {
            // TODO Auto-generated method stub
            return null;
        }

    }

}