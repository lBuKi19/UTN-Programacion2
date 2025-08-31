/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.java;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    public Libro (String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        
    }
    public void mostrarInfo() {
        System.out.println("El titulo del libro es "+titulo);
        System.out.println("Escrito por "+autor);
        System.out.println("Anio de publicacion "+anioPublicacion);
    }
    //Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    
    //Setter
    public void setAnioPublicacion(int anioPublicacion) {
        
        if (anioPublicacion != 0 && anioPublicacion < 2026) {
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println("Anio ingresado invalido");
        }
        
    }
    
}
