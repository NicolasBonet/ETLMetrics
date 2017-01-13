package co.com.ap.model;

import java.util.List;

public class Puntajes {

 
	private String type;	
 
	private Double puntaje;	
 
	private Integer _id;	
	private Student student;	

	
	
	public Puntajes(){
	
	}
	
 
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type = type;
	}
 
	public Double getPuntaje(){
		return puntaje;
	}
	public void setPuntaje(Double puntaje){
		this.puntaje = puntaje;
	}
 
	public Integer get_id(){
		return _id;
	}
	public void set_id(Integer _id){
		this._id = _id;
	}
	public Student getStudent(){
		return student;
	}
	public void setStudent(Student student){
		this.student = student;
	}
	
	
	
	public String toSQLInsert(){
		String insert = "INSERT INTO "+this.getClass().getSimpleName()+" (";
		String columns = "";
		String values = "Values(";
		if(this.type!=null){
			if(columns.equals("")){
				columns = columns + "type";
				if(this.type.getClass().getSimpleName().equals("String")){
					values = values + "'"+type+"'";
				}else{
					values = values + type;
				}
			}else{
				columns = columns + ",type";
				if(this.type.getClass().getSimpleName().equals("String")){
					values = values + ",'"+type+"'";
				}else{
					values = values + ","+type;
				}
			}
						
		}	
		if(this.puntaje!=null){
			if(columns.equals("")){
				columns = columns + "puntaje";
				if(this.puntaje.getClass().getSimpleName().equals("String")){
					values = values + "'"+puntaje+"'";
				}else{
					values = values + puntaje;
				}
			}else{
				columns = columns + ",puntaje";
				if(this.puntaje.getClass().getSimpleName().equals("String")){
					values = values + ",'"+puntaje+"'";
				}else{
					values = values + ","+puntaje;
				}
			}
						
		}	
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
		if(this.student!=null){
			if(columns.equals("")){
				columns = columns + "student_id";
				if(this.student.get_id().getClass().getSimpleName().equals("String")){
					values = values + "'"+student.get_id()+"'";
				}else{
					values = values + student.get_id();
				}
			}else{
				columns = columns + ",student_id";
				if(this.student.get_id().getClass().getSimpleName().equals("String")){
					values = values + ",'"+student.get_id()+"'";
				}else{
					values = values + ","+student.get_id();
				}
			}
						
		}
		columns = columns+")";
		values = values +")";
		insert = insert+columns+values+";";
		return insert;
	}

}

