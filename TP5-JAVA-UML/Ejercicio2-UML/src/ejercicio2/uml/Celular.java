/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.uml;

/**
 *
 * @author lauta
 */
public class Celular {
    public String marca;
    public String modelo;
    private Bateria bateria;
    private Usuario usuario;

    public Celular(String marca, String modelo, Bateria bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }
    
    public void setUsuario (Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
    }
    
    public void mostrarCelu() {
        System.out.println("El celular modelo: "+modelo +", con una bateria "+bateria.getModelo() +" ,pertenece a " +usuario.getNombre());
    }
    public Usuario getUsuario() {
        return usuario;
    }
}
