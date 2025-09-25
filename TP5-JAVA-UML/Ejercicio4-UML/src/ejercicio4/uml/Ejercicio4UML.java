/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4.uml;

/**
 *
 * @author lauta
 */
public class Ejercicio4UML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banco banco1 = new Banco("Galicia" , 180290);
        Cliente cliente1 = new Cliente("Lautaro" , 4023062);
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito(1, "20/10/2028", banco1);
        tarjeta1.setCliente(cliente1);
        tarjeta1.mostrarTarjeta();
    }
    
}
