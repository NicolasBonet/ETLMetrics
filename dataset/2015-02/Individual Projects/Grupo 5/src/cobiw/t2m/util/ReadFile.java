package cobiw.t2m.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Properties;




public class ReadFile {
	
	public static String PROP_AUTOR="autor"; 
	public static String PROP_TEMA="tema";
	public static String PROP_OBJETIVO="objetivo";
	public static String PROP_NROREQ="nroreq";
	public static String PROP_PROGRAMID="programid";

	public static String PROP_RUTACOPYS ="rutacopys";
	public static String PROP_COPY="copy";

	public static String PROP_LLAVE_COPY1="llaveCopy1";
	public static String PROP_LLAVE_COPY2="llaveCopy2";

	public static String PROP_SALIDACOPY1="salidacopy1";
	public static String PROP_SALIDACOPY2="salidacopy2";
	
	public static String PROP_NOMBREARCHIVOSALIDA="nombreArchivoSalida";
	
	public static String PROP_TIPOPROGRAMA="tipoprograma";
	
	public static String[] readFile(String nombre){

		ArrayList<String> list = new ArrayList<String>();
		try {
			BufferedReader in = new BufferedReader(new FileReader(nombre));
			String s, s2 = new String();

			while((s = in.readLine())!= null){
				list.add(s);
			}
			in.close();			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] ls = new String[list.size()];
		ls = list.toArray(ls);
		return ls;

	}
	
	public static Properties readConfigFile(String nombre){
		FileReader reader;
		Properties p = null;
		try {
			reader = new FileReader("config/"+nombre);
			p = new Properties();
			p.load(reader);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
		
	}

}
