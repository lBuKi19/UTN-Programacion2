/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6.uml;

/**
 *
 * @author lauta
 */
public class Reserva {
    private String fecha;
    private String hora;
    private Mesa mesa;
    private Cliente cliente;

    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }
    
    public void setCliente (Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void mostrarReserva() {
        System.out.println("Reserva a nombre de "+cliente.getNombre() +", para "+mesa.getCapacidad()+ " personas, a las "+hora);
    }
}
