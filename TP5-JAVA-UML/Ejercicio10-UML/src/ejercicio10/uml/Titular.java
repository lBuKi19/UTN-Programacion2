/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10.uml;

/**
 *
 * @author lauta
 */
public class Titular {
    private String nombre;
    private int dni;
    private CuentaBancaria cuentabancaria;

    public Titular(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    
    public void setCuentaBancaria (CuentaBancaria cuentabancaria) {
        this.cuentabancaria = cuentabancaria;
        if (cuentabancaria != null && cuentabancaria.getTitular() != this) {
            cuentabancaria.setTitular(this);
        }
    }
    
    public CuentaBancaria getCuentaBancaria() {
        return cuentabancaria;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
