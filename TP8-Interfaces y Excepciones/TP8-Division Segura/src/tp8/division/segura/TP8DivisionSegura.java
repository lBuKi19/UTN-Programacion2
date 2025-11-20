/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp8.division.segura;

import java.util.Scanner;

/**
 *
 * @author lauta
 */
public class TP8DivisionSegura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese un numero (dividendo): ");
            int a = sc.nextInt();

            System.out.print("Ingrese otro numero (divisor): ");
            int b = sc.nextInt();

            int resultado = a / b;
            System.out.println("Resultado de division: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir por cero.");
        }

        System.out.println("Programa finalizo correctamente.");
    }
    
    
}
