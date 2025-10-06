/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2.colecciones;

/**
 *
 * @author lauta
 */
public class Ejercicio2Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Autor autor1 = new Autor("k1zP", "George RR Martin", "Estadounidense");
        Autor autor2 = new Autor("y5zT", "J.k Rowling", "Britanica");
        Autor autor3 = new Autor("j7gE", "Arthur Conan Doyle", "Britanico");
        
        Biblioteca biblioteca1 = new Biblioteca("Biblioteca Nacional");
       
        biblioteca1.agregarLibro("z4jM", "Juego de Tronos", 2014, autor1);
        biblioteca1.agregarLibro("i8jO", "Harry Potter", 2009, autor2);
        biblioteca1.agregarLibro("n3xL", "Harry Potter II", 2014, autor2);
        biblioteca1.agregarLibro("f0pM", "Juego de Tronos II", 2014, autor1);
        biblioteca1.agregarLibro("a1cV", "Sherlock Holmes", 1887, autor3);
        
        System.out.println("");
        biblioteca1.listarLibros();
        biblioteca1.buscarLibroPorIsbn("a1cV");
        biblioteca1.eliminarLibro("f0pM");
        biblioteca1.obtenerCantidadLibros();
        biblioteca1.filtrarLibrosPorAnio(2014);
        System.out.println("");
        biblioteca1.mostrarAutoresDisponibles();
        
    }
    
}
