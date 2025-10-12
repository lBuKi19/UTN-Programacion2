/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2.herencia.y.polimorfismo;

import java.util.ArrayList;

/**
 *
 * @author lauta
 */
public class Ejercicio2HerenciaYPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figura circulo1 = new Circulo("circulo1", 2.0);
        Figura rectangulo1 = new Rectangulo("rectangulo1", 3.0, 4.0);
        
        ArrayList<Figura> Figuras = new ArrayList<>();
        Figuras.add(circulo1);
        Figuras.add(rectangulo1);
        
        for (Figura figura : Figuras) {
            System.out.println("El area del: "+figura.nombre +", es: "+figura.calcularArea());
        }
        
    }
    
}
