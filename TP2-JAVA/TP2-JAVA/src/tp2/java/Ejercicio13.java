/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2.java;

/**
 *
 * @author lauta
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    static double rPrecios (double[] precios, int contador) {
        
        if (contador == precios.length -1) {
            System.out.println("Precio: " +precios[contador]);
        } else {
            System.out.println("Precio " +precios[contador]);
            return rPrecios(precios, contador +1);
        }
        return 1;
    }
    
    public static void main(String[] args) {
        double[] precios = {250, 199.99, 32.75, 19.14};
        int contador = 0;
        rPrecios(precios, contador);
        precios[1] = 125.25;  
        System.out.println("Precios modificados:");
        rPrecios(precios, contador);
        
    }
    
}
