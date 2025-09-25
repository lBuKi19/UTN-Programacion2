/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4.uml;

/**
 *
 * @author lauta
 */
public class Cliente {
    private String nombre;
    private int dni;
    private TarjetaDeCredito tarjetadecredito;

    public Cliente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public void setTarjetaDeCredito (TarjetaDeCredito tarjetadecredito) {
        this.tarjetadecredito = tarjetadecredito;
        if (tarjetadecredito != null && tarjetadecredito.getCliente() != this) {
            tarjetadecredito.setCliente(this);
        }
    }
    
    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjetadecredito;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
