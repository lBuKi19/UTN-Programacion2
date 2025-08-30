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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
   static double calcularPrecioFinal(double impuesto, double descuento, double PrecioBase) {
        impuesto = impuesto * 100 / PrecioBase;
        descuento = descuento * 100 / PrecioBase;
        double PrecioFinal = PrecioBase + impuesto - descuento;
        return PrecioFinal;
    } 
    public static void main(String[] args) {
        double impuesto, descuento, preciobase;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el precio base del producto:");
        preciobase = input.nextDouble();
        System.out.println("Ingrese el impuesto en porcentaje:");
        impuesto = input.nextDouble();
        System.out.println("Ingrese el descuento en porcentaje:");
        descuento = input.nextDouble();
        
        double precio_final = calcularPrecioFinal(impuesto, descuento, preciobase);
        System.out.println("El precio final del producto es: " +precio_final);
    }
    
}
