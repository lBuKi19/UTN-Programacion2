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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    static double calcularCostoEnvio(double peso, String zona) {
        int precio_zona = 0;
        if (zona.equalsIgnoreCase("nacional")) {
            precio_zona = 5;
        } else if (zona.equalsIgnoreCase("internacional")) {
            precio_zona = 10;
        }
        double costo = peso * precio_zona;
        return costo;  
    } 
    static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        double costoFinal = costoEnvio + precioProducto;
        return costoFinal;
    } 
    public static void main(String[] args) {
        double precio, peso;
        String zona;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto:");
        precio = input.nextDouble();
        System.out.println("Ingrese el peso del paquete en kg:");
        peso = input.nextDouble();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Ingrese la zona de envio (nacional/internacional):");
        zona = input2.nextLine();
        
        double envio = calcularCostoEnvio(peso, zona);
        double precio_final = calcularTotalCompra(precio, envio);
        System.out.println("El costo de envio es: " +envio);
        System.out.println("El precio total a pagar es: " +precio_final);
    }
    
}
