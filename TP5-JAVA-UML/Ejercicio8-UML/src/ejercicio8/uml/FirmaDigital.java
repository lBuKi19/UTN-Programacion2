/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8.uml;

/**
 *
 * @author lauta
 */
public class FirmaDigital {
    private int codigoHash;
    private String fecha;
    private Usuario usuario;

    public FirmaDigital(int codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public int getCodigoHash() {
        return codigoHash;
    }
    
    
}
