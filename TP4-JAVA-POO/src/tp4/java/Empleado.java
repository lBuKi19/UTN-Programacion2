/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4.java;
import java.util.UUID;

public class Empleado {
    int id;
    String nombre;
    String puesto;
    double salario;
    static int totalEmpleados = 0;
    
    public Empleado (int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados ++; 
    }
    
    public Empleado (String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
        UUID uuid = UUID.randomUUID();
        this.id = uuid.hashCode();
        this.salario = 500000;
        totalEmpleados ++;
    }
    
    public void actualizarSalario (double porcentaje) {
        salario += (salario * porcentaje) / 100;  
    }
    
    public void actualizarSalario (int cantidad) {
        salario += cantidad;   
    }
    
    @Override
    public String toString() {
        return "Empleado [ID = " +id + ", Nombre = " +nombre + ", Puesto = " +puesto + ", Salario = " +salario +"]";
    }
    
    public static int mostrarTotalEmpleados () {
        return totalEmpleados;
    } 
}
