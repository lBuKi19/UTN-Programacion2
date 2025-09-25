/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5.uml;

/**
 *
 * @author lauta
 */
public class Computadora {
    private String marca;
    private int numeroSerie;
    private Propietario propietario;
    private PlacaMadre placamadre;

    public Computadora(String marca, int numeroSerie, String modelo, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placamadre = new PlacaMadre(modelo, chipset);
    }
    
    public void setPropietario (Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }
    
    public Propietario getPropietario() {
        return propietario;
    }
    
    public void mostarPC() {
        System.out.println("La pc "+marca +", con placa modelo "+placamadre.getModelo() +", pertenece a "+propietario.getNombre());
    }
}
