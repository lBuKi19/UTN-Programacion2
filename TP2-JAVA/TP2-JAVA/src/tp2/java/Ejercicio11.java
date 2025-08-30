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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static double descGlobal = 0.10;
    
    static double calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * descGlobal;
        return descuentoAplicado;
    } 
    
    public static void main(String[] args) {
        double precio;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        precio = input.nextDouble();
        
        double descuento = calcularDescuentoEspecial(precio);
        double precio_final = precio - descuento;
        System.out.println("El descuento especial aplicado es: " +descuento);    
        System.out.println("El precio final con descuento es: " +precio_final);
    }
    
}
