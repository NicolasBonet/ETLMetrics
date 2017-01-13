package html.ext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileReader{

	public static void main (String[] arg)throws Exception{
		java.io.File f=new java.io.File("C:\\Users\\template\\Desktop\\myfile.txt");
		java.io.FileReader fr=new java.io.FileReader(f);
		java.io.BufferedReader bf=new java.io.BufferedReader(fr);
		String cadena="    public InterfazExposicionCanina( String archivoPerros ) {{ ";
		Pattern pattern=Pattern.compile("\\{");
		Matcher m=pattern.matcher(cadena);
		while(m.find()){
			System.out.println(m.group());
		}
		
	}
}
