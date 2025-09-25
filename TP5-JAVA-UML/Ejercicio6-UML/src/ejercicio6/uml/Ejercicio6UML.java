/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6.uml;

/**
 *
 * @author lauta
 */
public class Ejercicio6UML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mesa mesa1 = new Mesa(1, 4);
        Cliente cliente1 = new Cliente("Lautaro", 11895290);
        Reserva res1 = new Reserva("21/09/25", "21:00", mesa1);
        res1.setCliente(cliente1);
        res1.mostrarReserva();
    }
    
}
