/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3.uml;

/**
 *
 * @author lauta
 */
public class Ejercicio3UML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Editorial edit1 = new Editorial("Planeta", "Calle falsa");
        Autor autor1 = new Autor("George RR Martin", "Estadounidense");
        Libro libro1 = new Libro("Juego de Tronos", edit1);
        libro1.setAutor(autor1);
        libro1.mostrarLibro();
    }
    
}
