/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3.java;

public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    double calificacion;
    
    public Estudiante (String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }
    public void mostrarInfo() {
        System.out.println("El nombre del estudiante es "+nombre +" " +apellido);
        System.out.println("Pertenece al curso "+curso);
        System.out.println("La calificacion es de "+calificacion);
    }
    //Metodos

    public void subirCalificacion (double puntos) {
        calificacion += puntos;
    }
    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
    }
}
