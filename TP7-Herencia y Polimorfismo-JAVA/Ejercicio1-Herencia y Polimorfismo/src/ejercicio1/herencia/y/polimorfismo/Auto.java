/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.herencia.y.polimorfismo;

/**
 *
 * @author lauta
 */
public class Auto extends Vehiculo {
    private int cantidadPuertas;
    
    public Auto(String marca, String modelo, int cantidadPuertas) {
 	super(marca, modelo); 
 	this.cantidadPuertas = cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }
    
    @Override
    public void mostrarInfo() {
        System.out.println("Marca: "+marca + ", Modelo: "+modelo + ", cantidad de puertas: "+cantidadPuertas);
    }
}

