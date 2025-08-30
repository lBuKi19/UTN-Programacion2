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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    } 
    
    public static void main(String[] args) {
        int stock, cantidadVendida, cantidadRecibida;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el stock actual del producto: ");
        stock = input.nextInt();
        System.out.print("Ingrese la cantidad vendida: ");
        cantidadVendida = input.nextInt();
        System.out.print("Ingrese la cantidad recibida: ");
        cantidadRecibida = input.nextInt();
        
        int stock_nuevo = actualizarStock(stock, cantidadVendida, cantidadRecibida);
        System.out.println("El nuevo stock del producto es: " +stock_nuevo);
    }
        
    
}
