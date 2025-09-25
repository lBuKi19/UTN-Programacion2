/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.uml;

/**
 *
 * @author lauta
 */
public class Titular {
    private String nombre;
    private int dni;
    private Pasaporte pasaporte;
    
    public Titular (String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setPasaporte (Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        if (pasaporte != null && pasaporte.getTitular() != this) {
            pasaporte.setTitular(this);
        }
    }
    
    public Pasaporte getPasaporte() {
        return pasaporte;
    }
}
