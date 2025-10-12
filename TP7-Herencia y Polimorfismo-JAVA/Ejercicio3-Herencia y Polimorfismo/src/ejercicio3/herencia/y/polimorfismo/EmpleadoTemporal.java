/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3.herencia.y.polimorfismo;

/**
 *
 * @author lauta
 */
public class EmpleadoTemporal extends Empleado {
    private int aniosAntiguedad;
    

    public EmpleadoTemporal(String nombre,double sueldo, int aniosAntiguedad) {
        super(nombre, sueldo);
        this.aniosAntiguedad = aniosAntiguedad;
    }
    
    @Override
    public double calcularSueldo() {
        return  (aniosAntiguedad/10 +1) * sueldo;
    }
    
}
