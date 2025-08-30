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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double nota = -1;
        
        while (nota < 0 || nota > 10) {
            Scanner input = new Scanner(System.in);
            System.out.print("Ingresa una nota entre 0 y 10: ");
            nota = input.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota invalida.");
            }
        }
        System.out.println("Nota guardada correctamente");
    }
    
}
