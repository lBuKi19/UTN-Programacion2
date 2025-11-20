/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp8.conversion.segura;

import java.util.Scanner;

/**
 *
 * @author lauta
 */
public class TP8ConversionSegura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        String texto = sc.nextLine();

        try {
            int numero = Integer.parseInt(texto);
            System.out.println("El número ingresado es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: '" + texto + "' el numero ingresado no es válido.");
        }

        System.out.println("Programa finalizo correctamente.");
    }
    
    
}
