package modelo;

public class Estudiante {
	private String nombreEstudiante;
	private String rut;
	private String email;

	// Constructor
	public Estudiante(String nombreEstudiante, String rut, String email) {
		this.nombreEstudiante = nombreEstudiante;
		this.rut = rut;
		this.email = email;
	}

	public String getNombreEstudiante() {
		return this.nombreEstudiante;
	}

	public void setNombreEstudiante(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	//Metodo toString para mostrar los datos del estudiante
	public String toString(){
		return "Nombre: " + nombreEstudiante + "\nRut: " + rut + "\nEmail: " + email;
	}
}