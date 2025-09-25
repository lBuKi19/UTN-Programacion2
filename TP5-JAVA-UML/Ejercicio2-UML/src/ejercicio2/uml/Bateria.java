/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.uml;

/**
 *
 * @author lauta
 */
public class Bateria {
    public String modelo;
    public int capacidad;

    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }
    
    
    
}
