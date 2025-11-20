/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp8.lectura.de.archivo;
import java.io.File;                     
import java.io.FileNotFoundException;   
import java.util.Scanner;

/**
 *
 * @author lauta
 */
public class TP8LecturaDeArchivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try {
            
            File archivo = new File("texto.txt"); 

            // Crea un Scanner que leerá el contenido del archivo línea por línea
            Scanner lector = new Scanner(archivo);

            System.out.println("Contenido del archivo:");

            // Mientras haya líneas para leer, las imprime por consola
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                System.out.println(linea);
            }

            // Cierra el lector para liberar el recurso
            lector.close();

        } catch (FileNotFoundException e) {
            // Se ejecuta si el archivo no existe o no puede abrirse
            System.out.println("Error: el archivo txt no fue encontrado.");
        }

        // Este mensaje se muestra siempre, haya o no excepción
        System.out.println("Programa finalizado.");
    }
}
    

