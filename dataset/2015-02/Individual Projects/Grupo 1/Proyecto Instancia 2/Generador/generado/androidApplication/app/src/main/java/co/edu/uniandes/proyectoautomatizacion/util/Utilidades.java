package co.edu.uniandes.proyectoautomatizacion.util;

/**
 * Created by juandavid on 4/20/15.
 */

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by juandavid on 5/7/15.
 */
public class Utilidades {

    public static boolean isConnected(Context con) {

        ConnectivityManager cm = (ConnectivityManager) con.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);

        //Tiene WiFi
        if (info != null && info.isConnected()) {
            System.out.println("WIFI");
            return true;
        } else {
            info = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

            //Tiene datos
            if (info != null && info.isConnected()) {
                System.out.println("MOVIL");
                return true;
            }
        }

        return false;
    }


    public static boolean isEmailValid(String email) {
        boolean isValid = false;

        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        CharSequence inputStr = email;

        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
        if (matcher.matches()) {
            isValid = true;
        }
        return isValid;
    }
}
