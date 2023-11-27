package dato;

import modelo.Curso;
import modelo.Estudiante;

import java.io.*;

public class GestorDatos{

	public static void leerArchivoCurso(Curso curso, String direccionArchivo) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(direccionArchivo))) {
			String textoArchivo;
			while ((textoArchivo = br.readLine()) != null) {
				String[] data = textoArchivo.split(",");
				curso.agregarEstudianteCurso(new Estudiante(data[0], data[1], data[2]));
			}
		} catch (IOException e) {
			throw new IOException("Error al leer el archivo del curso", e);
		}
	}


	//metodo cargar datos
	public static void cargarDatos(Curso curso, String direccionArchivo) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(direccionArchivo))) {
			String textoArchivo;
			while ((textoArchivo = br.readLine()) != null) {
				String[] data = textoArchivo.split(",");
				curso.agregarEstudianteCurso(new Estudiante(data[0], data[1], data[2]));
			}
		} catch (IOException e) {
			throw new IOException("Error al leer el archivo del curso", e);
		}
	}

	//metodo guardar datos
	public static boolean guardarDatos(Curso curso, String direccionArchivo) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(direccionArchivo, true))) {
			// Si el documento no es nuevo y tiene datos registrados, añadir una nueva línea
			if (new File(direccionArchivo).exists()) {
				bw.newLine();
			}
			bw.write(curso.toString());
			return true;
		} catch (IOException e) {
			System.out.println("Error al ingresar estudiante, favor contactar con administrador");
			return false;
		}
	}


}
