package gy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class Archivo {

private static long numLt;


public Integer SetArchivo(File archivo) throws IOException{
	
	 FileReader fr = new FileReader(archivo);
		BufferedReader bf = new BufferedReader(fr);
	 int lNumeroLineas = 0;
		
		String sCadena;
		while ((sCadena = bf.readLine())!=null) {
		  lNumeroLineas++;
		}
		
		return lNumeroLineas;
		
		
		
		
}
}
