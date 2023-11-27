package modelo;

import java.util.ArrayList;

public class Curso {
	private String nombreCurso;
	private ArrayList<Estudiante> estudiantes;

	//Constructor
	public Curso(String nombreCurso){
		this.nombreCurso = nombreCurso;
		this.estudiantes = new ArrayList<Estudiante>();
	}

	public ArrayList<Estudiante> getEstudiantes() {
		throw new UnsupportedOperationException();
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		throw new UnsupportedOperationException();
	}

	public String getNombreCurso() {
		return this.nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	//Método existeEstudiante validando con el rut si existe o no. Usando el metodo existeEstudiante
	public boolean existeEstudianteCarrera(String rut){
		for(Estudiante e: estudiantes){
			if(e.getRut().equals(rut)){
				return true;
			}
		}
		return false;
	}

//Método agregar estudiante a curso, validando con el rut si existe o no. Usando el metodo existeEstudiante
public void agregarEstudianteCurso(Estudiante estudiante){
	if(!existeEstudianteCarrera(estudiante.getRut())){
		estudiantes.add(estudiante);
	}
}

//Metodo que busca un estudiante por rut
public Estudiante buscarEstudiante(String rut){
	if(existeEstudianteCarrera(rut)){
		for(Estudiante e: estudiantes){
			if(e.getRut().equals(rut)){
				return e;
			}
		}
	}
	return null;
}
//Método eliminar estudiante de curso, validando con el rut si existe o no. Usando el metodo existeEstudiante
public void eliminarEstudiante(String rut){
	if(existeEstudianteCarrera(rut)){
		for(Estudiante e: estudiantes){
			if(e.getRut().equals(rut)){
				estudiantes.remove(e);
				break;
			}
		}
	}
}


//Método que muestra los estudiantes del curso
public void mostrarEstudiantesCurso() {
	for (Estudiante e : estudiantes) {
		System.out.println(e.toString());
	}

}


}