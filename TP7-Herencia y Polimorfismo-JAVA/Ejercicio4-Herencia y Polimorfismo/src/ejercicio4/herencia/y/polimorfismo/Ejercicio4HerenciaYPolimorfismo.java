/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4.herencia.y.polimorfismo;

import java.util.ArrayList;

/**
 *
 * @author lauta
 */
public class Ejercicio4HerenciaYPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal gato1 = new Gato("gato");
        Animal perro1 = new Perro("perro");
        Animal vaca1 = new Vaca ("vaca");
        
        ArrayList<Animal> Animales = new ArrayList<>();
        Animales.add(perro1);
        Animales.add(gato1);
        Animales.add(vaca1);
        
        for (Animal animal : Animales) {
            System.out.println(""+animal.nombre +":");
            animal.hacerSonido();
        }
        
    }
    
}
