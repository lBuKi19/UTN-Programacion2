/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.java;

public class Mascota {
    String nombre;
    String especie;
    int edad;
    
    public Mascota (String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        
    }
    
    public void mostrarInfo() {
        System.out.println("El nombre de la mascota es "+nombre);
        System.out.println("Pertenece a la especie "+especie);
        System.out.println("Tiene "+edad  +" anios de edad");
    }
    
    public void cumplirAnios () {
        edad += 1;
    }
}
