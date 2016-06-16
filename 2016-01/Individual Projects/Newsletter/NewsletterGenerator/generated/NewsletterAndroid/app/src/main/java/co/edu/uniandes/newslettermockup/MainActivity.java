package co.edu.uniandes.newslettermockup;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import java.util.HashMap;
/**
* MainActivity Generado para NewsletterAndroid
*/
public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

	/**
	* HashMap que almacena las acciones de la aplicacion.
	* Una accion es un redireccion a un link que puede tener cualquier contenido web.
	* Cada registro del hashmap lo compone un id de vista que lo lanza(key), y el link para ejecutar la accion(value).
	*/
	private HashMap <Integer, String> actionLinksViews;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		actionLinksViews = new HashMap<Integer, String>();
		
		//Por cada vista con link se crea un registro en un hashmap de actions
		actionLinksViews.put(R.id.button_2, "http://65089.track.dattanet.com/track/click?u=704195&p=36353038393a3134393a3130353a303a31313a30&s=7c8aa3040763f64cd8af563827350c71&m=15753");
		actionLinksViews.put(R.id.imageView_4, "http://65089.track.dattanet.com/track/click?u=704195&p=36353038393a3134393a3130353a303a31313a30&s=7c8aa3040763f64cd8af563827350c71&m=15753");
		actionLinksViews.put(R.id.imageView_2, "http://65089.track.dattanet.com/track/click?u=704528&p=36353038393a3134393a3130353a303a333a30&s=7c8aa3040763f64cd8af563827350c71&m=15753");
		actionLinksViews.put(R.id.imageView_3, "http://65089.track.dattanet.com/track/click?u=704194&p=36353038393a3134393a3130353a303a393a30&s=7c8aa3040763f64cd8af563827350c71&m=15753");
		actionLinksViews.put(R.id.button_1, "http://65089.track.dattanet.com/track/click?u=704194&p=36353038393a3134393a3130353a303a393a30&s=7c8aa3040763f64cd8af563827350c71&m=15753");
		actionLinksViews.put(R.id.video_linearLayout_7, "http://65089.track.dattanet.com/track/click?u=704195&p=36353038393a3134393a3130353a303a31313a30&s=7c8aa3040763f64cd8af563827350c71&m=15753");
		actionLinksViews.put(R.id.video_linearLayout_5, "http://65089.track.dattanet.com/track/click?u=704194&p=36353038393a3134393a3130353a303a393a30&s=7c8aa3040763f64cd8af563827350c71&m=15753");
	}
	
	
	@Override
	public void onClick(View v) {
	
		Log.i("onClick", "Click en vista= " + v.getId());
		
		//El id de cada vista nos dice cual es su link almacenado en el HashMap de actions
		String link = actionLinksViews.get(v.getId());
		
		if (link!=null)
		{
			openBrowser(link);
		}
		else
		{
			Toast.makeText(this,"Element without Url", Toast.LENGTH_SHORT);
		}
		
		
	}
	
	private static final String HTTPS = "https://";
	private static final String HTTP = "http://";
	
	/**
	* Open a browser chooser giving a url (with or without http:// prefix)
	* The chooser is smart, and identify type of url (For example: Web page, youtube video, and google+)
	* @param url
	*/
	public void openBrowser(String url) {
	
		if (!url.startsWith(HTTP) && !url.startsWith(HTTPS)) {
			url = HTTP + url;
		}
		
		Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
		this.startActivity(Intent.createChooser(intent, "Choose browser"));
		
	}
	
}
