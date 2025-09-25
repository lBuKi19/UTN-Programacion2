/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.uml;

/**
 *
 * @author lauta
 */
public class Pasaporte {
    private int numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;
    
    public Pasaporte (int numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato);
        
    }
    
    public void mostrarFoto() {
        System.out.println("Esta es la imagen del pasaporte " +numero +" : " +foto.getImagen() +" correspondiente a " +titular.getNombre());
    }
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }
    
    public Titular getTitular() {
        return titular;
    }
}
