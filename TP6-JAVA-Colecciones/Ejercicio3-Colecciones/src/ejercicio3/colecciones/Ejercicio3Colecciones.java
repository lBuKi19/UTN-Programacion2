/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3.colecciones;

/**
 *
 * @author lauta
 */
public class Ejercicio3Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Universidad universidad = new Universidad("UTN");
        
        Profesor profesor1 = new Profesor("i8jO", "Mario", "Biologia");
        Profesor profesor2 = new Profesor("j7gE", "Laura", "Matematica");
        Profesor profesor3 = new Profesor("n3xL", "Alejandra", "Fisica");
        
        Curso curso1 = new Curso("k1zP", "Curso1");
        Curso curso2 = new Curso("y5zT", "Curso2");
        Curso curso3 = new Curso("a1cV", "Curso3");
        Curso curso4 = new Curso("f0pM", "Curso4");
        Curso curso5 = new Curso("z4jM", "Curso5");
        
        universidad.agregarCurso(curso5);
        universidad.agregarCurso(curso4);
        universidad.agregarCurso(curso3);
        universidad.agregarCurso(curso2);
        universidad.agregarCurso(curso1);
        
        universidad.agregarProfesor(profesor3);
        universidad.agregarProfesor(profesor2);
        universidad.agregarProfesor(profesor1);
        
        universidad.asignarProfesorACurso("k1zP", "i8jO");
        universidad.asignarProfesorACurso("f0pM", "i8jO");
        universidad.asignarProfesorACurso("y5zT", "j7gE");
        universidad.asignarProfesorACurso("a1cV", "n3xL");
        universidad.asignarProfesorACurso("z4jM", "n3xL");
        universidad.listarCursos();
        universidad.listarProfesores();
        universidad.asignarProfesorACurso("a1cV", "j7gE");
        universidad.buscarCursoPorCodigo("a1cV");
        universidad.buscarProfesorPorId("j7gE");
        universidad.eliminarCurso("f0pM");
        universidad.eliminarProfesor("n3xL");
        universidad.listarProfesores();
        universidad.listarCursos();
    }
    
}
