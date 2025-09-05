/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4.java;

/**
 *
 * @author lauta
 */
public class TP4JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado (1, "Lautaro", "Desarrollador", 350000.0);
        Empleado empleado2 = new Empleado ("Matias", "Tester");
        
        System.out.println(empleado1);
        System.out.println(empleado2);
        
        empleado1.actualizarSalario(12.5);
        empleado2.actualizarSalario(50000);
        
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println("El total de empleados creados es " +Empleado.mostrarTotalEmpleados());
    }   
}
