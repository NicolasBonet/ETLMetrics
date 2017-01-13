package cobiw.t2m;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import cobiw.CobiwFactory;
import cobiw.CobiwPackage;
import cobiw.Copy;
import cobiw.Join;
import cobiw.Programa;
import cobiw.TipoPrograma;
import cobiw.Variable;
import cobiw.t2m.util.ReadFile;


/*
 * Clase encargada de construir el modelo de cobiw a partir de las porciones de codigo
 * cobol o archivos de definicion de estructuras de datos.
 */
public class CobiwModelBuilder {
	private static String  XMI_SUFFIX = "xmi";
	private static Properties prop;
	
	public static void main(String[] args){
		//Creando el elemento principal
		CobiwPackage.eINSTANCE.eClass();
		CobiwFactory factory = CobiwFactory.eINSTANCE;
		
		prop = ReadFile.readConfigFile(args[0]);
		
		Programa p = factory.createPrograma();
		cargarAtributosPrograma(p);
		CobiwModelLoader loader = new CobiwModelLoader(factory);
		
		if (p.getTipo() == TipoPrograma.JOIN ||
			p.getTipo() == TipoPrograma.LINEA_BALANCE){
			String[] copys = cargarCopysConf();
			Copy[] cargados = new Copy[copys.length];
			for (int i = 0; i < copys.length; i++) {
				cargados[i] = loader.loadCopy(copys[i]);
				p.getContiene().add(cargados[i]);
			}
			String[] llaves1 = cargarLista(ReadFile.PROP_LLAVE_COPY1);
			marcarLlave(cargados[0], llaves1);
			String[] llaves2  = cargarLista(ReadFile.PROP_LLAVE_COPY2);
			marcarLlave(cargados[1], llaves2);
			
			String[] salidaCopy1 = cargarLista(ReadFile.PROP_SALIDACOPY1);
			marcarSalida(cargados[0],salidaCopy1);
			String[] salidaCopy2 = cargarLista(ReadFile.PROP_SALIDACOPY2);
			marcarSalida(cargados[1],salidaCopy2);
			
			String archSalida = prop.getProperty(ReadFile.PROP_NOMBREARCHIVOSALIDA);
			cargarJoins(factory,p,cargados[0],cargados[1], llaves1, llaves2, archSalida);
		}
		else{
			String ruta = prop.getProperty(ReadFile.PROP_RUTACOPYS);
			Copy[] cops = loader.loadCommArea(ruta + "/" + p.getProgramaId());
			marcarSalida(cops[0],false);
			marcarSalida(cops[1],true);
			p.getContiene().add(cops[0]);
			p.getContiene().add(cops[1]);
		}
		try {
			grabarModelo(p,"models/ProgramaCobiw");
			System.out.println("Modelo generado exitosamente 'models/ProgramaCobiw.xmi'");
		} catch (IOException e) {
			System.out.println("Error grabando el modelo");
			e.printStackTrace();
		}
	}
	
	
	/**
	 * Carga los copys a leer desde la ruta especificada.
	 * @return
	 */
	public static String[] cargarCopysConf(){
		String[] copys = prop.getProperty(ReadFile.PROP_COPY).split(",");
		String ruta = prop.getProperty(ReadFile.PROP_RUTACOPYS);
		for (int i = 0; i < copys.length; i++){
			copys[i] = ruta + CobiwModelLoader.SEPARATOR + copys[i];
		}
		return copys;
	}
	
	/**
	 * Carga los objetos join al modelo en construccion
	 * @param CobiwFactory f factoria generada a partir del metamodelo
	 * @param program objeto del metodamodelo de tipo programa.
	 * @param copy1 Copy de entrada 1.
	 * @param copy2 Copy de entrada 2
	 * @param llaves1 LLaves del copy 1
	 * @param llaves2 LLaves del copy 2
	 * @param nombre Nombre del join a construir.
	 */
	public static void cargarJoins(CobiwFactory f, Programa program, Copy copy1, Copy copy2, String[] llaves1, String[] llaves2, String nombre){

		Join j;
		for (int i = 0; i < llaves1.length; i++) {
			j = f.createJoin();
			j.setReferenciaOrigen(getCampoPorNombre(copy1, llaves1[i]));
			j.setReferenciaDestino(getCampoPorNombre(copy2, llaves2[i]));
			j.setNomArchivoSalida(nombre);
			program.getJoins().add(j);
		}
	}
	

	/**
	 * Carga los atributos de un programa a partir del archivo de configuracion
	 * @param p Programa del metamodelo.
	 */
	public static void cargarAtributosPrograma(Programa p){
		p.setNombre(prop.getProperty(ReadFile.PROP_PROGRAMID));
		p.setTeam(prop.getProperty(ReadFile.PROP_TEMA));
		p.setAutor(prop.getProperty(ReadFile.PROP_AUTOR));
		p.setNumeroRequerimiento(prop.getProperty(ReadFile.PROP_NROREQ));
		p.setObjetivo(prop.getProperty(ReadFile.PROP_OBJETIVO));
		p.setProgramaId(prop.getProperty(ReadFile.PROP_PROGRAMID));
		String tipo = prop.getProperty(ReadFile.PROP_TIPOPROGRAMA);
		if (tipo.equalsIgnoreCase("join")){
			p.setTipo(TipoPrograma.JOIN);
		}
		if (tipo.equalsIgnoreCase("lineaconsulta")){
			p.setTipo(TipoPrograma.LINEA);
		}
		if (tipo.equalsIgnoreCase("lineabalance")){
			p.setTipo(TipoPrograma.LINEA_BALANCE);
		}		
		if (tipo.equalsIgnoreCase("lineaconsulta")){
			p.setTipo(TipoPrograma.LINEA_CONSULTA);
		}			
	}
	
	/**
	 * Marca todas las variables de un copy con setSalida en el valor enviado como parametro
	 * @param copy Copy a marcar
	 * @param b booleano usado para la marca.
	 */
	public static void marcarSalida(Copy copy, boolean b){
		EList<Variable> vars = copy.getCompuesto();
		for (int i = 0; i < vars.size(); i++){
			setSalida(vars.get(i), b);

		}		
	}
	
	/**
	 * Adiciona todas las variables de un copy a un programa. Crea la relacion Usa.
	 * @param p Programa
	 * @param copy  Copy
	 */
	public static void adicionarPrograma(Programa p, Copy copy){
		EList<Variable> vars = copy.getCompuesto();
		for (int i = 0; i < vars.size(); i++){
			p.getUsa().add(vars.get(i));
		}		
	}	

	/**
	 * marca la lista de campos(nombres) como salida.
	 * @param copy Copy en el que buscara los campos
	 * @param campos Lista de nombres de los campos a marcar
	 */
	public static void marcarSalida(Copy copy, String[] campos){
		Variable v = null;
		for (int i = 0; i < campos.length; i++) {
			v = getCampoPorNombre(copy, campos[i]);
			if (v != null){
				v.setEsSalida(true);
			}
		}
		
	}
	
	/**
	 * Marca la lista de campos(nombre) como llave.
	 * @param copy Copy en el que buscara los campos
	 * @param campos Lista de nombres de los campos a marcar
	 */
	public static void marcarLlave(Copy copy, String[] campos){
		Variable v = null;
		for (int i = 0; i < campos.length; i++) {
			v = getCampoPorNombre(copy, campos[i]);
			if (v != null){
				marcarLlaveRecursiva(v,true);
			}
		}
	}
	
	/**
	 * marca recursivamente los campos como llave, es decir el campo y sus hijos
	 * @param v Variable a marcar (y sus hijos)
	 * @param b valor de la marca.
	 */
	public static void marcarLlaveRecursiva(Variable v, boolean b){
		v.setEsLlave(b);
		EList<Variable> lista = v.getConformada();
		for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
			Variable variable = (Variable) iterator.next();
			marcarLlaveRecursiva(v, b);
		}
	}
	
	/**
	 * Utilitario para cargar una lista de una propiedad de configuracion
	 * @param propiedad
	 * @return
	 */
	public static String[] cargarLista(String propiedad){
		String[] copys = prop.getProperty(propiedad).split(",");
		return copys;
	}
	
	/**
	 * Graba el modelo generado
	 * @param programa
	 * @param url
	 * @throws IOException
	 */
	public static void grabarModelo(Programa programa, String url) throws IOException{
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("xmi", new XMIResourceFactoryImpl());
	    if ( !url.endsWith(XMI_SUFFIX)){
	    	url += "." + XMI_SUFFIX;
	    }
	    ResourceSet resSet = new ResourceSetImpl();
	    URI uri = URI.createURI(url);
	    Resource resource = resSet.createResource(uri);
	    resource.getContents().add(programa);
	    resource.save(Collections.EMPTY_MAP);
	}
	
	/**
	 * Obtiene un campo de un copy a partir del nombre.
	 * @param copy 
	 * @param nombre
	 * @return
	 */
	public static Variable getCampoPorNombre(Copy copy, String nombre){
		
		EList<Variable> vars = copy.getCompuesto();
		Variable v = null;
		for (int i = 0; i < vars.size(); i++){
			v = getByNombre(vars.get(i), nombre);
		}
		return v;
	}
	
	/**
	 * Funcion recursiva en la variable para obtener la concordante con el nombre.
	 * @param v
	 * @param nombre
	 * @return
	 */
	public static Variable getByNombre(Variable v, String nombre){
		Variable hijo = null;
		if (v.getNombre().equalsIgnoreCase(nombre)){
			return v;
		}
		EList<Variable> vars = v.getConformada();
		for (int i = 0; i < vars.size(); i++){
			hijo = getByNombre(vars.get(i), nombre);
			if (hijo != null) break;
		}
		return hijo;
	}
	
	/**
	 * Fija recursivamente el valor de salida en valor b.
	 * @param v
	 * @param b
	 */
	public static void setSalida(Variable v, boolean b){
		v.setEsSalida(b);
		EList<Variable> vars = v.getConformada();
		for (int i = 0; i < vars.size(); i++){
			setSalida(vars.get(i), b);
		}
		return;
	}
	


}
