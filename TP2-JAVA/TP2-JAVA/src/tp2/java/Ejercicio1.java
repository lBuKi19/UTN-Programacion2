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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Ingresa un año: ");
        num = input.nextInt();
        
        if ((num % 4 == 0 && num % 100 != 0) || (num % 400 == 0))   {
            System.out.println("El año " +num +" es bisiesto");
        } else {
            System.out.println("El año " +num +" no es bisiesto");
        }
    }
    
}
