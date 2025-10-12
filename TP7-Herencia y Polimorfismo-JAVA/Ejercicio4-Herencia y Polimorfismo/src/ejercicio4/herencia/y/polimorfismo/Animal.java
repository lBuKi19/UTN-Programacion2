/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4.herencia.y.polimorfismo;

/**
 *
 * @author lauta
 */
public class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }
    
    public void hacerSonido() {
        System.out.println("Sonido de animal");
    }
    
    public void describirAnimal() {
        System.out.println("Descripcion del animal");
    }
    
}
