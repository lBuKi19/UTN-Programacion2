/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14.uml;

/**
 *
 * @author lauta
 */
public class EditorVideo {

    public EditorVideo() {
    }
    
    
    public void exportar (String formato, Proyecto proyecto) {
        Render render1 = new Render(formato);
        render1.setProyecto(proyecto);
        System.out.println("Exportando el proyecto: "+proyecto.getNombre() +", con formato "+formato);
    }
}
