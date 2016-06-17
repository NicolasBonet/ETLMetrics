package webapigeneric.co.edu.uniandes.Utils;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by Taidy on 21/11/2015.
 */
public class Conexiones {
public static  String conexionGetController(String url, int parametro){
    String json = null;//q
    try {
    HttpGet httpGet = new HttpGet(url+"?id="+parametro);
    HttpClient client = new DefaultHttpClient();//q
    HttpParams httpParams = client.getParams();//q
    HttpConnectionParams.setConnectionTimeout(httpParams, 3000);//q
    HttpConnectionParams.setSoTimeout(httpParams, 3000);//q
    httpGet.setHeader("Accept", "application/json");//q
    httpGet.setHeader("Content-type", "application/json");//q
    httpGet.setHeader("Accept-Encoding", "gzip");//q
    DefaultHttpClient httpClient = new DefaultHttpClient();//q
    HttpResponse httpResponse = httpClient.execute(httpGet);//q
    json = EntityUtils.toString(httpResponse.getEntity());
    } catch (Exception e) {
        e.printStackTrace();
    }
    return  json;
}

    public static HttpResponse conexionPutController(String url,String object){
        HttpResponse resp = null;//q
        try {
        HttpPut put = new HttpPut(url);
        put.setEntity(new StringEntity(object));//q

        put.addHeader("Content-Type", "application/json");
        put.addHeader("Accept", "application/json");
        HttpClient httpclient = new DefaultHttpClient();//q

            resp = httpclient.execute(put);//q
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resp;
    }

}
