/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3.uml;

/**
 *
 * @author lauta
 */
public class Libro {
    private String titulo;
    private Editorial editorial;
    private Autor autor;

    public Libro(String titulo, Editorial editorial) {
        this.titulo = titulo;
        this.editorial = editorial;
        
    }
    
    public void setAutor (Autor autor) {
        this.autor = autor;
    }
    
    public void mostrarLibro() {
        System.out.println("El libro "+titulo +" , del autor " +autor.getNombre() + " ,de la editorial " +editorial.getNombre());
    }
}
