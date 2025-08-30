/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2.java;

import java.util.Scanner;

/**
 *
 * @author lauta
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        int edad = input.nextInt();
        
        String[] edades = {"Niño", "Adolescente", "Adulto", "Adulto mayor"};
        if (edad < 12) {
            System.out.println("Eres un " +edades[0]);
            } else if (edad < 18) {
                System.out.println("Eres un " +edades[1]);
            } else if (edad < 60) {
                System.out.println("Eres un " +edades[2]);
            } else {
                System.out.println("Eres un " +edades[3]);
            }
    }
    
}
