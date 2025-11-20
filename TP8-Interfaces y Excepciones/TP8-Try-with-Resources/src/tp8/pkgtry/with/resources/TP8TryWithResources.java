/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp8.pkgtry.with.resources;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author lauta
 */
public class TP8TryWithResources {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        try (BufferedReader br = new BufferedReader(new FileReader("archivo.txt"))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println("Error al leer el archivo txt: " + e.getMessage());
        }
        
    }
}
    
    

