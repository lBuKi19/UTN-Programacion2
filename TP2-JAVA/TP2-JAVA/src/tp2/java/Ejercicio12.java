/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2.java;

/**
 *
 * @author lauta
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] precios = {250, 199.99, 32.75, 19.14};
        
        for (int i=0;i<2;i++) {
            for (double precio : precios) {
                System.out.println("Precio: " +precio);
            }
            if (i == 0) {
                precios[1] = 125.25;  
                System.out.println("Precios modificados:");
            }
        }  
    }
    
}
