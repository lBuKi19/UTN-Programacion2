/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13.uml;

/**
 *
 * @author lauta
 */
public class CodigoQR {
    private String valor;
    private Usuario usuario;

    public CodigoQR(String valor) {
        this.valor = valor;
    }
     public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public String getValor() {
        return valor;
    }
    
    
}
