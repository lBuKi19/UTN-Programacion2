/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3.herencia.y.polimorfismo;

import java.util.ArrayList;



/**
 *
 * @author lauta
 */
public class Ejercicio3HerenciaYPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado1 = new EmpleadoPlanta("Lautaro", 50000.0, 5);
        Empleado empleado2 = new EmpleadoTemporal("Martin", 50000.0, 2);
        
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(empleado2);
        empleados.add(empleado1);
        
        for (Empleado empleado : empleados) {
            if (empleado instanceof Empleado) {
                System.out.println("Sueldo de "+empleado.nombre +": "+empleado.calcularSueldo());
            } else {
                System.out.println("La persona no es un empleado");
            }
        }
                
    }
    
}
