/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.java;

public class Gallina {
    int idGallina;
    int edad;
    int huevosPuestos;
    
    public Gallina (int idGallina, int edad, int huevosPuestos) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
        
    }
    public void mostrarEstado() {
        System.out.println("El ID de gallina es "+idGallina);
        System.out.println("Tiene "+edad +" de edad");
        System.out.println("Puso "+huevosPuestos +" huevos");
    }
    
    public void ponerHuevo () {
        huevosPuestos += 1;
    }
    
    public void envejecer () {
        edad += 1;
    }
}
