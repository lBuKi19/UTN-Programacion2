/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.java;

public class NaveEspacial {
    String nombre;
    double combustible;
    
    public NaveEspacial (String nombre, double combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }
    
    public void mostrarEstado() {
        System.out.println("El nombre de la nave es "+nombre);
        System.out.println("Cuenta con "+combustible +" litros de combustible");
    }
    
    public void despegar() {
        System.out.println("La nave esta despegando");
    }
    
    public void avanzar (double distancia) {
        double gasto = distancia / 10;
        if (combustible >= gasto) {
            combustible -= gasto;
            System.out.println("La nave esta avanzando");
        } else {
            System.out.println("No hay suficiente combustible para recorrer la distancia ingresada");
            System.out.println("Por favor cargar combustible");
        }
        
    }
    
    public void recargarCombustible (double cantidad) {
        double capacidad = 100.0;
        if (combustible + cantidad <= capacidad) {
            combustible += cantidad;
            System.out.println("Se ha cargado combustible correctamente");
        } else {
            System.out.println("La cantidad de combustible ingresada supera la capacidad del tanque");
        }
        
    }
    
}
