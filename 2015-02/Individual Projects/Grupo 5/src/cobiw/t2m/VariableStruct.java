package cobiw.t2m;

import java.util.ArrayList;

import cobiw.Copy;
import cobiw.TipoVariable;
import cobiw.Variable;
import cobiw.CobiwFactory;

public class VariableStruct {
	private static String SPACE = " +";
	private int level;
	private String nombre;
	private String tipo;
	private int longitud;
	private int precision;
	private boolean occurs = false;
	private boolean llave = false;
	private String value;
	private ArrayList<VariableStruct> hijos = new ArrayList<VariableStruct>();
	private VariableStruct parent = null;
	
	/**
	 * Construye una estructura a partir de la linea cobol.
	 * @param var variable para evaluacion de padre.
	 * @param linea
	 */
	public VariableStruct(VariableStruct var, String linea){
		String toProcess = linea.trim();
		String[] sps = toProcess.split(SPACE);
		level = Integer.parseInt(sps[0]);
		nombre = sps[1];
		if (sps.length > 2){
			processComplemento(sps);
		}		
		if (var.level < this.level){
			this.setParent(var);
			var.getHijos().add(this);
		}
	}
	
	/**
	 * Construye una variable a partir de la linea cobol
	 * @param linea
	 */
	public VariableStruct(String linea){
		String toProcess = linea.trim();
		String[] sps = toProcess.split(SPACE);
		level = Integer.parseInt(sps[0]);
		nombre = sps[1];
		if (sps.length > 2){
			processComplemento(sps);
		}
	}
	
	/**
	 * Obtiene el ultimo hermano en un nivel especifico.
	 * @param level
	 * @return
	 */
	public VariableStruct getLastSibling(int level){
		if (this.getLevel() == level){
			return this;
		}
		else{
			if (hijos.size() > 0){
				for (int i = hijos.size(); i > 0; --i){
					return this.getHijos().get(i - 1).getLastSibling(level);
				}
			}
		}
		return null;
	}
	
	/**
	 * Retorna recursivamente el tostring de la estructura.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < level; i++){
			sb.append(" ");
		}
		sb.append(level + " " + nombre + " tipo " + tipo + " longitud "  + longitud + " precision "  + precision  + " value " + value  + "\n");
		for (int i = 0; i < this.hijos.size(); i++){
			sb.append(hijos.get(i).toString());
		}
		return sb.toString();
	}
	
	/**
	 * Vuelca la estructura java en un elemento del metamodelo.
	 * @param factory
	 * @return
	 */
	public Variable vaciarStruct(CobiwFactory factory){

		Variable v = factory.createVariable();
		v.setEsLlave(this.isLlave());
		v.setEsOccurs(this.isOccurs());
		v.setLongitud(this.getLongitud());
		v.setNombre(this.getNombre());
		v.setPrecision(this.getPrecision());
		if (this.getTipo() != null){
			if (this.getTipo().equalsIgnoreCase(UtilTipo.CADENA)){
				v.setTipo(TipoVariable.CARACTER);
			}
			else if (this.getTipo().equalsIgnoreCase(UtilTipo.NUMERO)){
				v.setTipo(TipoVariable.NUMERICA);
			}
			else{
				v.setTipo(TipoVariable.PADRE);
			}
		}

		v.setValor(this.getValue());	
		for (int i = 0; i < this.hijos.size(); i++){
			v.getConformada().add( hijos.get(i).vaciarStruct(factory));
		}
		return v;

	}
	
	
	/**
	 * Procesa el complemento de una linea cobol.
	 * @param sp
	 */
	public void processComplemento(String[] sp){
		
		String tipo = sp[2];
		if (tipo.contains("PIC")){
			procesaPic(sp[3]);
		}
		if (tipo.contains("OCCURS")){
			this.occurs = true;
			this.value = sp[3];
		}
		if(tipo.contains("VALUE")){
			this.value = sp[3];
		}
		if (tipo.contains("REDEFINES")){
			this.tipo = "REDEFINES";
		}
	}	
	
	/**
	 * Procesa la clausula pic de una linea cobol.
	 * @param pic
	 */
	private void procesaPic(String pic){
		this.tipo = UtilTipo.getTipo(pic);
		if (tipo.equalsIgnoreCase(UtilTipo.CADENA)){
			this.longitud = UtilTipo.getLongFromString(pic, 'X');
			this.precision = 0;
		}
		if (tipo.equalsIgnoreCase(UtilTipo.NUMERO)){
			this.longitud = UtilTipo.getLongitudNumero(pic);
			this.precision = UtilTipo.getPrecision(pic);
		}		
	}
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public int getPrecision() {
		return precision;
	}

	public void setPrecision(int precision) {
		this.precision = precision;
	}

	public boolean isOccurs() {
		return occurs;
	}

	public void setOccurs(boolean occurs) {
		this.occurs = occurs;
	}

	public boolean isLlave() {
		return llave;
	}

	public void setLlave(boolean llave) {
		this.llave = llave;
	}

	public ArrayList<VariableStruct> getHijos() {
		return hijos;
	}

	public void setHijos(ArrayList<VariableStruct> hijos) {
		this.hijos = hijos;
	}
	public VariableStruct getParent() {
		return parent;
	}

	public void setParent(VariableStruct parent) {
		this.parent = parent;
	}

	public String getValue() {
		return value;
	}
   
	public void setValue(String value) {
		this.value = value;
	}
	
}
