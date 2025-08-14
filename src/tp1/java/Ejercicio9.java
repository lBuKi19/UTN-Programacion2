/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1.java;

import java.util.Scanner;

/**
 *
 * @author lauta
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");  
        String nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre);
        
        /*
        El error se encontraba en la línea 6 con la utilización de scanner.nextInt();
        Debido a que nosotros queremos almacenar el input del usuario en una variable de tipo string llamada nombre, debemos utilizar scanner.nextLine(); 
        */
    }
    
}
