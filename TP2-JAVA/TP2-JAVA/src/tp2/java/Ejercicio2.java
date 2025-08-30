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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[3];
        for (int i=0;i<3;i++) {
            System.out.print("Ingresa un número: ");
            nums[i] = input.nextInt();
        }
        int mayor = nums[0];
        for (int j=0;j<3;j++) {
            if (nums[j] > mayor) {
                mayor = nums[j];
            
            }                   
        }
        System.out.println("El mayor es " +mayor);
    }
    
}
