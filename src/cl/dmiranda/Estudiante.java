package cl.dmiranda;

public class Estudiante extends Persona {
 
private String curso;
 private int edad;
 private String apoderado;
 private Capilla capilla;
 
 public Estudiante(String userId, String curso, Capilla capilla, int edad, String apoderado) {
		this.curso=curso;	
		this.capilla=capilla;
		this.edad=edad;
		this.apoderado=apoderado;
		setCapilla(new Capilla ());
 }
   
	public Estudiante(Object userId) {
}

	//Encapsuladores get set
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad1(int edad) {
		this.edad = edad;
	}
	public String getApoderado() {
		return apoderado;
	}
	public void setApoderado(String apoderado) {
		this.apoderado = apoderado;
	}
	public Capilla getCapilla() {
		return capilla;
	}
	public void setCapilla(Capilla capilla) {
		this.capilla = capilla;
	}
	
	public static void tareasIn () {  //static el metodo existe dentro de esta clase
	  }
	public static void tareasOut () {  //static el metodo existe dentro de esta clase
	  }
	public String toString()  {
		return super.toString()+ "Estudiante";
		
	}
	
}
