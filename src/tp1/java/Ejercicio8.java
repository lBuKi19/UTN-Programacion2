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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int int1;
        System.out.println("Ingresa un numero entero");
        int1 = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        int int2;
        System.out.println("Ingresa otro numero entero");
        int2 = input2.nextInt();
        
        System.out.println("Division usando integers: " + (int1/int2));
        
        System.out.println("Division usando double casting: " + ((double)int1/int2));
    }
    
}
