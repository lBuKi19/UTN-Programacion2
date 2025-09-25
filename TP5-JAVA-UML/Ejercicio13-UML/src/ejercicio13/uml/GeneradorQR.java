/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13.uml;

/**
 *
 * @author lauta
 */
public class GeneradorQR {
    
    public void generar(String valor, Usuario usuario) {
        CodigoQR codigo = new CodigoQR(valor);
        codigo.setUsuario(usuario);
        System.out.println("El valor del nuevo codigo creado es "+codigo.getValor());
        System.out.println("El usuario asociado al codigo creado es: "+usuario.getNombre());
    }
}
