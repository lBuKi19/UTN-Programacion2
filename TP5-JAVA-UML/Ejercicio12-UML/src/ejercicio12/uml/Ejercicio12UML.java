/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12.uml;

/**
 *
 * @author lauta
 */
public class Ejercicio12UML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora calculo = new Calculadora();
        Contribuyente contribuyente1 = new Contribuyente("Lautaro", 1840230621);
        Impuesto impuesto1 = new Impuesto(0.1);
        impuesto1.setContribuyente(contribuyente1);
        System.out.println("Para el contribuyente "+contribuyente1.getNombre());
        calculo.calcular(impuesto1);
    }
    
}
