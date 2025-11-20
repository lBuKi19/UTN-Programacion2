/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8.interfaces.y.excepciones.java;

/**
 *
 * @author lauta
 */
public class Cliente implements Notificable {
    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public void notificarCambioEstado(String nuevoEstado) {
        System.out.println(nombre + ", su pedido cambio de estado a: " + nuevoEstado);
    }
    
}
