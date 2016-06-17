package gy;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.swing.JFileChooser;



public class Counter {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		      Archivo a= new Archivo();
   	          HashMap<String,Integer> webApp=new HashMap<String,Integer>();
			  JFileChooser chooser = new JFileChooser();
			  String index="";
			  int contador;
			  FileWriter graph = null;
		        PrintWriter pw = null;
			    chooser.setCurrentDirectory(new java.io.File("."));
			    chooser.setDialogTitle("Seleccione carpeta contenedora");
			    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			    chooser.setAcceptAllFileFilterUsed(false);
              
			    if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			     
			      File dir = new File(chooser.getSelectedFile().toString());
			      System.out.println(dir.getName().toString());
			     
			    	  File[] ficheros=dir.listFiles();
			    	 
			    	  for (int x=0;x<ficheros.length;x++){
			    		  if(ficheros[x].getName().equals("index")){index=ficheros[x].getPath();}
			             contador=0;
			                	
			                	
			                 File[] archivos=ficheros[x].listFiles();
			    			  
			    			 
			    			  for (int y=0;y<archivos.length;y++){
			    				  contador=contador+a.SetArchivo(archivos[y]);
			    				    
			                	 
			                }
			    			  webApp.put(ficheros[x].getName(),contador ); 
			    	  }
			    
			       
			    } else {
			      System.out.println("No Selection ");
			     
			      
			    }
			  
			   
			 System.out.println(index+"/graph.html");
			  
		  try
		        {
				  graph=new FileWriter(index+"/graph.html");
		            pw = new PrintWriter(graph);

	int generado=webApp.get("catalogo").intValue()+webApp.get("promocion").intValue()+webApp.get("contacto").intValue()+webApp.get("mapa").intValue();
	int catalogo= webApp.get("catalogo").intValue();
	int promocion=webApp.get("promocion").intValue();
	int contacto=webApp.get("contacto").intValue();
	int mapa=webApp.get("mapa").intValue();  
	long p=catalogo/generado;
	System.out.println(p);
		                pw.println("<html><head></head><body>"
		                		+ "<h1>Lineas Generadas por folder</h1><hr><table><tr><td>Promocion</td><td>Catalogo</td><td>Contacto</td>"
		                		+ "<td>Mapa</td><td>Total</td></tr><tr><td>"+promocion+"</td><td>"+catalogo+"</td>"
		                				+ "<td>"+contacto+"</td><td>"+mapa+"</td><td>"+generado+"</td></tr></table>"
		                		+ "</body></html>");
		        } catch (Exception e) {
		            e.printStackTrace();
		        } finally {
		           try {
		          
		           if (null != graph)
		              graph.close();
		           } catch (Exception e2) {
		              e2.printStackTrace();
		           }
		        }
		  
		 

			     try {

			            File objetofile = new File (index+"/graph.html");
			            Desktop.getDesktop().open(objetofile);

			     }catch (IOException ex) {

			            System.out.println(ex);

			     }

			    
		  
		  
	}

}
