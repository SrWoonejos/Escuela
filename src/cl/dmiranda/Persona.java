package cl.dmiranda;

public class Persona {
//atributos
	private String userId;  //rut
	private String passId;
	protected String nombreCompl;    // privado y se usa gett y sett
	private String rut; 
	protected String mail; 
	protected String direccion;
	
//constructor
	public Persona (String userId,String passId, String nombreCompl, String rut, String mail, String direccion) {
		this.userId= userId;
		this.passId= passId;
		this.nombreCompl= nombreCompl;
		this.rut=rut;
		this.mail=mail;
		this.direccion=direccion;		
	}
public Persona () {
}
//Encapsuladores get set
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassId() {
		return passId;
	}
	public void setPassId(String passId) {
		this.passId = passId;
	}
	public String getNombreCompl() {
		return nombreCompl;
	}
	public void setNombreCompl(String nombreCompl) {
		this.nombreCompl = nombreCompl;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	} 
//met propio clase
	public static void logIn () {  //static el metodo existe dentro de esta clase
	  }
	public static void singIn () {  //static el metodo existe dentro de esta clase
	  }
}
