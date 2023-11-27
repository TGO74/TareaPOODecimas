package vista;

import modelo.Curso;
import modelo.Estudiante;
import java.util.Scanner;


public class MenuPrincipal {
    private Curso curso;

    public static void main(String[] args) {
        // Crear una instancia de la clase Curso (debes tener esta clase definida en el package modelo)
        Curso curso = new Curso("Curso Prueba");
        MenuPrincipal menu = new MenuPrincipal(curso);
        menu.mostrarMenu();
    }

    public MenuPrincipal(Curso curso) {
        this.curso = curso;
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("==== Menú Principal ====");
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Buscar Estudiante");
            System.out.println("3. Mostrar Estudiantes");
            System.out.println("4. Eliminar Estudiante");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarEstudiante();
                    break;
                case 2:
                    buscarEstudiante();
                    break;
                case 3:
                    mostrarEstudiantes();
                    break;
                case 4:
                    eliminarEstudiante();
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }

        } while (opcion != 0);
    }

    private void agregarEstudiante() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el email del estudiante: ");
        String email = scanner.nextLine();
        System.out.print("Ingrese el rut del estudiante: ");
        String rut = scanner.nextLine();

        // Llamar al método correspondiente en la clase Curso para agregar estudiante.
        curso.agregarEstudianteCurso(new Estudiante(nombre, email, rut));
        System.out.println("Estudiante agregado exitosamente.");
    }

    private void buscarEstudiante() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el rut del estudiante a buscar: ");
        String rut = scanner.nextLine();

        // Llamar al método correspondiente en la clase Curso para buscar estudiante.
        Estudiante estudianteEncontrado = curso.buscarEstudiante(rut);

        if (estudianteEncontrado != null) {
            System.out.println("Estudiante encontrado:");
            System.out.println("Nombre: " + estudianteEncontrado.getNombreEstudiante());
            System.out.println("Email: " + estudianteEncontrado.getEmail());
            System.out.println("Rut: " + estudianteEncontrado.getRut());
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }

    private void mostrarEstudiantes() {
        // Llamar al método correspondiente en la clase Curso para mostrar estudiantes.
        curso.mostrarEstudiantesCurso();

    }

    private void eliminarEstudiante() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el rut del estudiante a eliminar: ");
        String rut = scanner.nextLine();

        // Llamar al método correspondiente en la clase Curso para eliminar estudiante.
        curso.eliminarEstudiante(rut);
        System.out.println("Estudiante eliminado exitosamente.");
    }


}
