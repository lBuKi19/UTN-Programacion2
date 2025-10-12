/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.herencia.y.polimorfismo;

/**
 *
 * @author lauta
 */
public class Circulo extends Figura {

    private double radio; 
    
    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    
    }

    @Override
    public double calcularArea() {
        return 2*radio*3.14;
    }
    
}
