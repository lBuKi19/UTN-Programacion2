/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14.uml;

/**
 *
 * @author lauta
 */
public class Ejercicio14UML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EditorVideo editor = new EditorVideo();
        Proyecto peli = new Proyecto("El padrino", 175);
        editor.exportar("1920x1080", peli);
    }
    
}
