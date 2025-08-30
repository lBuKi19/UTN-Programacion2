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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa el precio: ");
        double precio = input.nextDouble();
        Scanner input2 = new Scanner (System.in);
        System.out.print("Ingresa la categoria A, B o C: ");
        char categoria = input2.next().charAt(0);
        categoria = Character.toLowerCase(categoria);
        
        int[] descuentos = {10, 15, 20};
        double precioFinal;
        
        switch (categoria) {
            case 'a' -> {
                precioFinal = precio - (precio * descuentos[0] / 100);
                System.out.println("Descuento aplicado: " +descuentos[0] + "%");
                System.out.println("Precio final: " + precioFinal);
            }
            case 'b' -> {
                precioFinal = precio - (precio * descuentos[1] / 100);
                System.out.println("Descuento aplicado: " +descuentos[1] + "%");
                System.out.println("Precio final: " + precioFinal);
            }
            case 'c' -> {
                precioFinal = precio - (precio * descuentos[2] / 100);
                System.out.println("Descuento aplicado: " +descuentos[2] + "%");
                System.out.println("Precio final: " + precioFinal);
            }
            default -> System.out.println("Categoría incorrecta");
        }
    
    }
}
