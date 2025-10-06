/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author lauta
 */
public class Biblioteca {
    private String nombre;
    private List<Libro> libros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
        System.out.println("Libro agregado correctamente");
    }
    
    public void eliminarLibro(String isbn) {
        boolean borrado = false;
        for (Libro libro : libros) {
            if(libro.getIsbn().equals(isbn)) {
                libros.remove(libro);
                borrado = true;
                System.out.println("Libro eliminado correctamente: "+libro.getTitulo());
            }
        }
        if (borrado == false) {      
            System.out.println("No se encontro libro en la biblioteca");
        }
    }
    
    public void buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if(libro.getIsbn().equals(isbn)) {
                libro.mostrarInfo();
            }
        }
    }
    
    public void obtenerCantidadLibros() {
        int count = 0;
        
        for (Libro libro : libros) {
            count += 1;
        }
        System.out.println("Cantidad de libros totales: "+count);
    }

    public String getNombre() {
        return nombre;
    }
    
    public void filtrarLibrosPorAnio(int anio) {
        boolean encontrados = false;
        System.out.println("Buscando Libros del: "+anio);
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion()== anio) {
                encontrados = true;
                System.out.println(libro);
            }
        }
        if (encontrados == false) {
            System.out.println("No se encontraron libros");
        }
        
    }

    public void listarLibros() {
        for(Libro libro : libros) {
            System.out.println(libro);
        }
    }
    
    public void mostrarAutoresDisponibles() {
        ArrayList <Autor> autoresDisponibles = new ArrayList<>();
        for(Libro libro : libros) {
            Autor autor = libro.getAutor();
            if (!autoresDisponibles.contains(autor)) {
                autoresDisponibles.add(autor);
                System.out.println(autor);
            }
        }
    }
}
