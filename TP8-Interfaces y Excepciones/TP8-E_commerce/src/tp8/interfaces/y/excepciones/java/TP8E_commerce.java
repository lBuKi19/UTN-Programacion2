/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp8.interfaces.y.excepciones.java;

/**
 *
 * @author lauta
 */
public class TP8E_commerce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Lautaro", "lautab@gmail.com");

     
        Producto p1 = new Producto("Remera manga corta", 25000.0);
        Producto p2 = new Producto("Jean negro", 60000.0);

        
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);

        
        double total = pedido.calcularTotal();
        System.out.println("Total: " + total);

       
        TarjetaCredito tarjeta = new TarjetaCredito("3304-2030-9904-1273");
        boolean pagoExitoso = tarjeta.procesarPago(total);

        
        if (pagoExitoso) {
            pedido.cambiarEstado("ENVIADO");
        }

        //con paypal
        Paypal paypal = new Paypal("cliente@paypal.com");
        paypal.procesarPago(total);
    }
    
    
}
