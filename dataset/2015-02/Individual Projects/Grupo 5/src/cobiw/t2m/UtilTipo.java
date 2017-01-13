package cobiw.t2m;

import java.util.StringTokenizer;

public class UtilTipo {
	public static String NUMERO = "numerica";
	public static String CADENA = "caracter";
	//private String[] tiposNum = {"9", "S", "V"};
	
	public static String getTipo(String cad){
		if (cad.startsWith("9") || cad.startsWith("S") || cad.startsWith("V")){
			return NUMERO;
		}
		else if (cad.startsWith("X")){
			return CADENA;
		}
		return null;
	}
	
	public static int getLongitudNumero(String cad){
		int index = cad.indexOf("V");
			
		if (index > 0){
			String longitud = cad.substring(0,index);
			return getLongFromString(longitud,'9' );
		}
		else{
			return getLongFromString(cad,'9' );
		}
	}
	
	public static int getLongFromString(String cad, char c){
		int longitud = 0;
		if (cad.indexOf("(") > 0){
			longitud = Integer.parseInt(  cad.substring( cad.indexOf("(") + 1, cad.indexOf(")") ) );
		}
		else{
			char[] cars = cad.toCharArray();
			int count = 0;
			for (int i = 0; i < cars.length; i++) {
				if (cars[i] == c) count++;
			}
			longitud = count;
		}
		return longitud;
	}
	
	public static int getPrecision(String cad){
		int index = cad.indexOf("V");
		
		if (index > 0){
			String longitud = cad.substring(index);
			return getLongFromString(longitud,'9' );
		}
		else{
			return 0;
		}
	}
	

}
