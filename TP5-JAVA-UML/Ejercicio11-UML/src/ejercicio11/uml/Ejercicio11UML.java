/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11.uml;

/**
 *
 * @author lauta
 */
public class Ejercicio11UML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion cancion1 = new Cancion("Billie Jean");
        Artista artista1 = new Artista("Michael Jackson", "pop");
        cancion1.setArtista(artista1);
        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion1);
        System.out.println("Del artista " +artista1.getNombre());
    }
    
}
