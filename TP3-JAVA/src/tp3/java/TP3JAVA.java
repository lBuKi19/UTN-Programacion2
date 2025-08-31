/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3.java;

/**
 *
 * @author lauta
 */
public class TP3JAVA {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Lautaro", "Buchek", "b", 9.50);
        estudiante1.mostrarInfo();
        estudiante1.subirCalificacion (0.50);
        estudiante1.bajarCalificacion(2.00);
        estudiante1.mostrarInfo();
        
        System.out.println("");
        
        Mascota mascota1 = new Mascota ("Mia", "Bishon Frize", 5);
        mascota1.mostrarInfo();
        mascota1.cumplirAnios();
        mascota1.mostrarInfo();
        
        
        System.out.println("");
        
        Libro libro1 = new Libro ("Juego de Tronos", "George RR Martin", 2014);
        libro1.setAnioPublicacion(2027);
        libro1.setAnioPublicacion(2013);
        libro1.mostrarInfo();
        
        System.out.println("");
        
        Gallina gallina1 = new Gallina (1, 4, 30);
        Gallina gallina2 = new Gallina (2, 6, 60);
        gallina1.envejecer();
        gallina2.envejecer();
        gallina1.ponerHuevo();
        gallina2.ponerHuevo();
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        System.out.println("");
        
        NaveEspacial nave1 = new NaveEspacial ("Halcon Milenario", 50);
        nave1.avanzar(501);
        nave1.recargarCombustible(50);
        nave1.avanzar(501);
        nave1.mostrarEstado(); 
    }
    
}
