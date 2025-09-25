/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8.uml;

/**
 *
 * @author lauta
 */
public class Ejercicio8UML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Lautaro", "lauta@gmail.com");
        Documento doc1 = new Documento("JAVA-UML", "contenido...", 9103, "20/09/2025", user1);
        doc1.mostrarDocumento();
        System.out.println("Del usuario "+user1.getNombre());
    }
    
}
