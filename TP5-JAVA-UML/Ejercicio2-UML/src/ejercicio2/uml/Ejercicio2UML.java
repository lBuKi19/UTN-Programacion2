/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2.uml;

/**
 *
 * @author lauta
 */
public class Ejercicio2UML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bateria bat1 = new Bateria("x1", 4500);
        Celular cel = new Celular("Samsung", "S25", bat1);
        Usuario user1 = new Usuario("Lautaro" , 4023062);
        user1.setCelular(cel);
        cel.mostrarCelu();
    }
    
}
