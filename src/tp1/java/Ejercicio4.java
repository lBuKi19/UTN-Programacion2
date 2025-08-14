/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1.java;

import java.util.Scanner;

/**
 *
 * @author lauta
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        System.out.println("Ingresa tu nombre");
        nombre = input.nextLine();

        Scanner input2 = new Scanner(System.in);
        String edad;
        System.out.println("Ingresa tu edad");
        edad = input2.nextLine();

        System.out.println("Tu nombre es " + nombre);
        System.out.println("Tu edad es " + edad);
    }
    
}
