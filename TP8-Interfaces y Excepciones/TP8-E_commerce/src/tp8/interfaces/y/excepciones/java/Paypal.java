/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8.interfaces.y.excepciones.java;

/**
 *
 * @author lauta
 */
public class Paypal implements Pago{
     private String email;

    public Paypal(String email) {
        this.email = email;
    }

    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Procesando con PayPal: " + email);
        System.out.println("Monto: " + monto);
        return true;
    }
    
}
