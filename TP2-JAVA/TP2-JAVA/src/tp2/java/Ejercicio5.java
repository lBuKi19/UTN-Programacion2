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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 1;
        int suma = 0;
        
        while (num != 0) {
            Scanner input = new Scanner(System.in);
            System.out.print("Ingresa un numero (0 para terminar): ");
            num = input.nextInt();
            
            if (num % 2 == 0) {
                suma += num;
            }
        }
        System.out.println("La suma de los numeros pares ingresados es: " +suma);
        
    }
    
}
