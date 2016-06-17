package co.com.ap.model;

import java.util.List;

public class Student {

 
	private Integer _id;	
 
	private String nombre;	
	
	private List<Puntajes> puntajes;
	
	public Student(){
	
	}
	
 
	public Integer get_id(){
		return _id;
	}
	public void set_id(Integer _id){
		this._id = _id;
	}
 
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	
		
	public List<Puntajes> getPuntajes(){
		return this.puntajes;
	}
	public void setPuntajess(List<Puntajes> puntajes){
		this.puntajes = puntajes;
	}
	
	public String toSQLInsert(){
		String insert = "INSERT INTO "+this.getClass().getSimpleName()+" (";
		String columns = "";
		String values = "Values(";
		if(this._id!=null){
			if(columns.equals("")){
				columns = columns + "_id";
				if(this._id.getClass().getSimpleName().equals("String")){
					values = values + "'"+_id+"'";
				}else{
					values = values + _id;
				}
			}else{
				columns = columns + ",_id";
				if(this._id.getClass().getSimpleName().equals("String")){
					values = values + ",'"+_id+"'";
				}else{
					values = values + ","+_id;
				}
			}
						
		}	
		if(this.nombre!=null){
			if(columns.equals("")){
				columns = columns + "nombre";
				if(this.nombre.getClass().getSimpleName().equals("String")){
					values = values + "'"+nombre+"'";
				}else{
					values = values + nombre;
				}
			}else{
				columns = columns + ",nombre";
				if(this.nombre.getClass().getSimpleName().equals("String")){
					values = values + ",'"+nombre+"'";
				}else{
					values = values + ","+nombre;
				}
			}
						
		}	
		columns = columns+")";
		values = values +")";
		insert = insert+columns+values+";";
		if(puntajes!=null){
			for (Puntajes puntajes : puntajes) {
				puntajes.setStudent(this);
				insert = insert + puntajes.toSQLInsert();
			}
		}
		return insert;
	}

}

