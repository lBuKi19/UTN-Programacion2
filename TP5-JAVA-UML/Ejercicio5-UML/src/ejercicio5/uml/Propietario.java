/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5.uml;

/**
 *
 * @author lauta
 */
public class Propietario {
    private String nombre;
    private int dni;
    private Computadora computadora;
   

    public Propietario(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;   
    }
    
    public void setComputadora (Computadora computadora) {
        this.computadora = computadora;
        if (computadora != null && computadora.getPropietario() != this) {
            computadora.setPropietario(this);
        }
    }
    
    public Computadora getComputadora() {
        return computadora;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
}
