/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3.colecciones;

import java.util.ArrayList;


/**
 *
 * @author lauta
 */
public class Profesor {
    String id;
    String nombre;
    String especialidad;
    private ArrayList<Curso> cursos = new ArrayList();

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }
    
    public void agregarCurso(Curso c) {
        
        if (c != null && !cursos.contains(c)){
            cursos.add(c);
        }
    }
    
    public void eliminarCurso(Curso c) {
        if(cursos.contains(c)) {
            cursos.remove(c);
        } else {
            System.out.println("No se encuentra el curso que desea eliminar");
        }
        
    }
    
    public void listarCursos() {
        for (Curso curso : cursos) {
            System.out.println(curso);
        }
    }
    
    public void mostrarInfo() {
        System.out.println("Nombre: "+nombre +", especialidad: "+especialidad +"\n"+cursos);
    }

   
    

    
    
}
