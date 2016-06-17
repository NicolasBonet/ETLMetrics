package cobiw.t2m;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

import org.eclipse.emf.ecore.EDataType.Internal.ConversionDelegate.Factory;

import cobiw.CobiwFactory;
import cobiw.Copy;
import cobiw.Variable;
import cobiw.t2m.util.ReadFile;

public class CobiwModelLoader {
	
	private static String COMMENT ="*";

	public static String SEPARATOR = "/";
	
	public static CobiwFactory factory;
	
	/**
	 * Constructor
	 * @param factory
	 */
	public CobiwModelLoader(CobiwFactory factory){
		this.factory = factory;
	}
	
	
	/**
	 * Carga un copy a partir de un archivo especificado en el url de entrada
	 * @param url
	 * @return
	 */
	public Copy loadCopy(String url){
		
		String[] lineas = ReadFile.readFile(url);
		String nombre = url.substring(url.lastIndexOf(SEPARATOR) + 1);
		return loadCopyFromLineas(lineas, nombre);
	}
	
	/**
	 * Carga un copy a partir de las lineas de archivo.
	 * @param lineas
	 * @param nombre
	 * @return
	 */
	public Copy loadCopyFromLineas(String[] lineas, String nombre){
		
		Copy copy = factory.createCopy();
		copy.setNombreArchivo(nombre);
		copy.setEsEntrada(true);
		VariableStruct parent = null;
		VariableStruct current = null;
		VariableStruct nueva = null;
		VariableStruct hno;
		ArrayList<VariableStruct> roots = new ArrayList<VariableStruct>();
		
		for (int i = 0; i < lineas.length; i++) {
			if (lineas[i].trim().startsWith(COMMENT) || lineas[i].trim().length() == 0){
				continue;
			}
			if (parent == null){
				parent = new VariableStruct(lineas[i]);
				current = parent;
				roots.add(parent);
				//System.out.println("Padre primero " + parent.getNombre());
				continue;
			}
			else{
				nueva = new VariableStruct( current, lineas[i]);
				//System.out.println("la variable nueva " + nueva.getNombre() + " padre " + nueva.getParent());
				if (nueva.getParent() == null){
					hno = parent.getLastSibling(nueva.getLevel());
					//System.out.println("hermano encontrado " + hno.getNombre());
					if (hno != null && hno.getParent() != null){ // Si el hermano tiene padre, se lo adiciono
						//System.out.println("adicionandolo al papa del hermano " + hno.getParent().getNombre());
						hno.getParent().getHijos().add(nueva);
						nueva.setParent(hno.getParent());
					}
					else{ // Si el hermano no tiene padre lo agrego a roots.
						//System.out.println("adicionandolo a roots ");
						roots.add(nueva);
						parent = nueva;
					}
				}
				current = nueva;
				//System.out.println("current " + current.getNombre());
			}

		}
		
		for (int i = 0;i < roots.size(); i++){
			//System.out.println("grabando roots " + roots.get(i).toString());
			Variable v = roots.get(i).vaciarStruct(factory);
			copy.getCompuesto().add(v);
		}
		return copy;
	}	
		
	/**
	 * Carga el metamodelo a partir de un commarea.
	 * @param programa
	 * @return
	 */
	public Copy[] loadCommArea(String programa){
		String[] lineas = ReadFile.readFile(programa);
		String[] comarea = aProcesar(lineas, "DFHCOMMAREA", "PROCEDURE DIVISION");
		String[] entrada = aProcesar(comarea, "ENTRADA", "SALIDA");
		String[] salida = aProcesar(comarea, "SALIDA","PROCEDURE DIVISION" );
		Copy[] cops = new Copy[2];
		cops[0] = loadCopyFromLineas(entrada, "Entrada");
		cops[0].setEsEntrada(true);
		cops[1] = loadCopyFromLineas(salida, "Salida");
		cops[1].setEsEntrada(false);
		return cops;

	}
	
	/**
	 * Separa las lineas a procesar de un archivo cobol
	 * @param lineas
	 * @param start
	 * @param fin
	 * @return
	 */
	public static String[] aProcesar(String[] lineas, String start, String fin){
		ArrayList<String> toProcess = new ArrayList<String>();
		boolean cargar = false;
		for (int i = 0; i < lineas.length; i++) {

			if (lineas[i].contains(start) ){
				cargar = true;
			}
			if (lineas[i].contains(fin)){
				cargar = false;
			}			
			if (cargar){
				toProcess.add(lineas[i]);
			}

		}
		String[] salida = new String[toProcess.size()];
		salida = toProcess.toArray(salida);
		return salida;
	}
	
}
