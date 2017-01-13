package webapigeneric.co.edu.uniandes.Utils;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

/**
 * Created by LuisSebastian on 11/21/15.
 */
public class ConnectionTask extends AsyncTask<String, Void, String> {

    private String url;
    private String json;
    private Context context;

    public ConnectionTask(String url, String json, Context context) {
        this.url = url;
        this.json = json;
        this.context = context;
    }

    @Override
    protected String doInBackground(String... urls) {

        return Services.httpPOST(url, json);
    }
    // onPostExecute displays the results of the AsyncTask.
    @Override
    protected void onPostExecute(String result) {
        Toast.makeText(context, "El formulario se diligencio correctamente!", Toast.LENGTH_LONG).show();
    }
}