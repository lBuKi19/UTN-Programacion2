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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, positivos, negativos, ceros;
        positivos = 0;
        negativos = 0;
        ceros = 0;
        
        for (int i=0; i<10; i++) {
            Scanner input = new Scanner(System.in);
            System.out.print("Ingresa el numero: ");
            num = input.nextInt();
            
            if (num > 0) {
                positivos ++;   
            } else if (num < 0) {
                negativos ++;
            } else {
                ceros ++;
            }
        }
        System.out.println("Resultados:");
        System.out.println("Postivos:  " +positivos); 
        System.out.println("Negativos: " +negativos);
        System.out.println("Ceros: " +ceros);
    }
    
}
