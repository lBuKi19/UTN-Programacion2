/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10.uml;

/**
 *
 * @author lauta
 */
public class CuentaBancaria {
    private int cbu;
    private double saldo;
    private ClaveSeguridad claveseguridad;
    private Titular titular;

    public CuentaBancaria(int cbu, double saldo, int codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveseguridad = new ClaveSeguridad (codigo, ultimaModificacion);
    }
    
    public void setTitular (Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuentaBancaria() != this) {
            titular.setCuentaBancaria(this);
        }
    }
    
    public Titular getTitular() {
        return titular;
    }
    
    public void mostrarCuenta() {
        System.out.println("Cuenta "+cbu +", con saldo de "+saldo +", perteneciente a "+titular.getNombre());
    }
}
