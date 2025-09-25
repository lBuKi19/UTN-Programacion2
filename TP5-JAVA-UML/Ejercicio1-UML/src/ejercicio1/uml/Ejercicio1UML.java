/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1.uml;

/**
 *
 * @author lauta
 */
public class Ejercicio1UML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Titular lautaro = new Titular("Lautaro", 4023062);
        Pasaporte pasaporte = new Pasaporte(1, "20/09/25", "imagen1", "4x4");
        pasaporte.setTitular(lautaro);
        pasaporte.mostrarFoto();
    }
    
}
