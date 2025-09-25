/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8.uml;

/**
 *
 * @author lauta
 */
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmadigital;
    private Usuario usuario;

    public Documento(String titulo, String contenido, int codigoHash, String fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmadigital = new FirmaDigital(codigoHash, fecha, usuario);
    }
    
   
    public void mostrarDocumento() {
        System.out.println("Documento "+titulo +", con firma digital "+firmadigital.getCodigoHash());
    }
}
