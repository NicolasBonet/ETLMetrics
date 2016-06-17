package webapigeneric.co.edu.uniandes.Utils;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;


/**
 * Created by LuisSebastian on 10/17/15.
 */
public class GetSpinnerValuesTask extends AsyncTask<Void,Void,ArrayList<String>> {


    private Context context;
    private String url;



    public GetSpinnerValuesTask(Context context,String url) {

        this.context = context;
        this.url = url;
    }

    @Override
    protected ArrayList<String> doInBackground(Void... params) {
        ArrayList<String> response = new ArrayList();

        try {
            HttpGet httpGet = new HttpGet(url);
            HttpClient client = new DefaultHttpClient();
            HttpParams httpParams = client.getParams();
            HttpConnectionParams.setConnectionTimeout(httpParams, 3000);
            HttpConnectionParams.setSoTimeout(httpParams, 3000);
            httpGet.setHeader("Accept", "application/json");
            httpGet.setHeader("Content-type", "application/json");
            httpGet.setHeader("Accept-Encoding", "gzip");
            DefaultHttpClient httpClient = new DefaultHttpClient();
            HttpResponse httpResponse = httpClient.execute(httpGet);
            String json = EntityUtils.toString(httpResponse.getEntity());

            try {
                JSONArray temp1 = new JSONArray(json);
                for (int i=0;i<temp1.length();i++){
                    response.add(temp1.getJSONObject(i).getString("Nombre"));
                    Log.i("temp1","temp1: "+temp1.getJSONObject(i).getString("Nombre"));
                }
            } catch (JSONException e) {
                Log.i("error","error: "+e.toString());
                e.printStackTrace();
            }


            //  response = new GsonBuilder().create().fromJson(json, (Type) test);
            return response;

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return response;

    }


    @Override
    protected void onPostExecute(final ArrayList<String> response) {
        Log.i("postExecute","postExecute: "+response.toString());
    }




}
