/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13.uml;

/**
 *
 * @author lauta
 */
public class Ejercicio13UML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeneradorQR generador = new GeneradorQR();
        Usuario user1 = new Usuario("Lautaro", "lauta@gmail.com");
        generador.generar("1hZl7K", user1);
    }
    
}
