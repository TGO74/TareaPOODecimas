# README

# Sistema de Gestión de Cursos y Estudiantes

Este programa de gestión de cursos y estudiantes permite al usuario realizar diversas acciones relacionadas con la administración de un curso, incluyendo la gestión de estudiantes y la persistencia de datos.

#### Funcionalidades del Menú:

1. **Agregar Estudiante:**
    - Solicita nombre, email y rut del estudiante.
    - Realiza validación de rut, nombre y email no vacío.
    - Agrega el estudiante al curso y actualiza el archivo de datos.

2. **Buscar Estudiante:**
    - Solicita el rut del estudiante a buscar.
    - Muestra la información del estudiante si se encuentra.

3. **Mostrar Estudiantes:**
    - Muestra la lista completa de estudiantes en el curso.

4. **Eliminar Estudiante:**
    - Solicita el rut del estudiante a eliminar.
    - Elimina el estudiante del curso y actualiza el archivo de datos.

#### Gestor de Datos:

- El gestor de datos se encuentra en el package `dato` y se encarga de cargar los estudiantes al iniciar el programa y de almacenarlos cada vez que se realiza una modificación.
- Se implementa una validación mediante el rut para evitar ingresar estudiantes duplicados en el curso.

#### Estructura del Proyecto:

- **Packages:**
    - `modelo`: Contiene las clases relacionadas con el modelo de datos (Curso, Estudiante, GestorDatos).
    - `dato`: Contiene la clase GestorDatos encargada de la persistencia de datos.
    - `main`: Contiene la función principal y el menú interactivo.

---



## Clase Curso:

### Atributos:

- `nombreCurso: String`
- `listaEstudiantes: ArrayList<Estudiante>`
- `gestorDatos: GestorDatos`

### Métodos:

- `Curso(nombreCurso)`: Constructor
- `getNombreCurso()`
- `getListaEstudiantes()`
- `setNombreCurso()`
- `setListaEstudiantes()`
- `agregarEstudiante(estudiante: Estudiante): void`
- `buscarEstudiante(rut: String): Estudiante`
- `mostrarEstudiantes(): List<Estudiante>`
- `eliminarEstudiante(rut: String): void`

## Clase Estudiante:

### Atributos:

- `nombre: String`
- `email: String`
- `rut: String`

### Métodos:

- `Estudiante(nombre, email, rut)`: Constructor
- `getNombre()`
- `getEmail()`
- `getRut()`
- `setNombre()`
- `setEmail()`
- `setRut()`

## Clase GestorDatos:

### Atributos:

- `nombreArchivo: String`
- `listaEstudiantes: List<Estudiante>`

### Métodos:

- `GestorDatos(nombreArchivo)`: Constructor
- `cargarDatos(): void`
- `almacenarDatos(): void`

## Menú de la Aplicación:

- `main()`: Función principal que contiene el menú interactivo.

---



Este análisis proporciona una estructura clara y detallada del sistema, incluyendo las clases, atributos y métodos necesarios para cumplir con los requisitos del programa. Además, se destaca la implementación de un gestor de datos para manejar la carga y persistencia de información.