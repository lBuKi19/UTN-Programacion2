/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7.uml;

/**
 *
 * @author lauta
 */
public class Ejercicio7UML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conductor conductor1 = new Conductor("Lautaro" , 1234);
        Motor motor1 = new Motor("Aspirado", 5210);
        Vehiculo vehiculo1 = new Vehiculo("AB079JM", "Honda civic", motor1);
        vehiculo1.setConductor(conductor1);
        vehiculo1.mostrarVehiculo();
    }
    
}
