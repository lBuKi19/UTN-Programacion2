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
public class Ejercicio5 {

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

        int suma = int1 + int2;
        int resta = int1 - int2;
        int multiplicacion = int1 * int2;
        float division = (float) int1 / int2;

        System.out.println("El resultado de la suma es " + suma);
        System.out.println("El resultado de la resta es " + resta);
        System.out.println("El resultado de la multiplicacion es " + multiplicacion);
        System.out.println("El resultado de la división es " + division);
    }
    
}
