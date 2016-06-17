package co.com.ap.model;

public class GenericJSon {
	private Puntajes puntajes;

	public Puntajes getPuntajes() {
		return puntajes;
	}

	public void setPuntajes(Puntajes puntajes) {
		this.puntajes = puntajes;
	}
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	public String getSQLInsert(){
		if(puntajes!=null){
			return puntajes.toSQLInsert();
		}
		if(student!=null){
			return student.toSQLInsert();
		}
		return null;
	}	
}
