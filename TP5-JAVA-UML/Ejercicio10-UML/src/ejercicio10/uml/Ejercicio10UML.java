/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10.uml;

/**
 *
 * @author lauta
 */
public class Ejercicio10UML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Titular tit1 = new Titular("Lautaro", 4023062);
        CuentaBancaria cuenta1 = new CuentaBancaria(123, 150000.00, 314, "21/09/25");
        cuenta1.setTitular(tit1);
        cuenta1.mostrarCuenta();
    }
    
}
