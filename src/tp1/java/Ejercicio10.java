/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1.java;

/**
 *
 * @author lauta
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 5; 
        int b = 2; 
        int resultado = a / b; 
        System.out.println("Resultado: " + resultado);
        
        /*
        Al ejecutar este código, el valor que se muestra es 2. 
        Esto se debe a que nosotros realizamos la operación de división pero asignando 
        su valor a la variable “resultado” de tipo “int”. Como consecuencia, 
        estamos truncando el resultado de la división 5 / 2 = 2.5, 
        únicamente a su parte entera, lo que arroja el número 2 al ejecutar el programa.
        */
    }
    
}
