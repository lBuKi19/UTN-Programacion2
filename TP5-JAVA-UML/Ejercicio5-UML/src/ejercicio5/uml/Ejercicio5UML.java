/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5.uml;

/**
 *
 * @author lauta
 */
public class Ejercicio5UML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Propietario prop1 = new Propietario("Lautaro", 4023062);
        Computadora compu1 = new Computadora("HP", 1, "ZH1", "chip jk5");
        compu1.setPropietario(prop1);
        compu1.mostarPC();
    }
    
}
