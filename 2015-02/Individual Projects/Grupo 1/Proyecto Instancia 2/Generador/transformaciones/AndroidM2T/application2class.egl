package co.edu.uniandes.proyectoautomatizacion;

/**
 * Created by juandavid on 6/24/15.
 */

import android.app.Application;

import co.edu.uniandes.proyectoautomatizacion.database.DatabaseHelper;

public class ApplicationClass extends Application {

    private DatabaseHelper dbh;

    private final String TAG = ApplicationClass.class.getSimpleName();


    @Override
    public void onCreate() {
        super.onCreate();
        dbh = new DatabaseHelper(this);
    }

    public DatabaseHelper getDbh() {
        return dbh;
    }

}