/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9.uml;

/**
 *
 * @author lauta
 */
public class Ejercicio9UML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Lautaro", "OSDE");
        Profesional prof1 = new Profesional("Carlos", "Nutricionista");
        CitaMedica cita1 = new CitaMedica("20/09/25", "15:30");
        cita1.setPaciente(paciente1);
        cita1.setProfesional(prof1);
        cita1.mostrarCita();
    }
    
}
