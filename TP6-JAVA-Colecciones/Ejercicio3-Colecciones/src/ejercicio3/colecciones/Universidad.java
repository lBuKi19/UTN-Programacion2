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
public class Universidad {
    private String nombre;
    private ArrayList<Profesor> profesores = new ArrayList<>();
    private ArrayList<Curso> cursos = new ArrayList<>();

    public Universidad(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    public void agregarProfesor(Profesor p) {
        if (p != null && !profesores.contains(p)){
            profesores.add(p);
            System.out.println("Profesor agregado correctamente");
        }
    }
    
    public void agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)){
            cursos.add(c);
            System.out.println("Curso agregado correctamente");
        }           
    }
    
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        for (Profesor profesor : profesores) {
            if (profesor.getId().equals(idProfesor)) {
                for (Curso curso : cursos) {
                    if (curso.getCodigo().equals(codigoCurso)) {
                        curso.setProfesor(profesor);                              
                    }
                }
            }
        }    
    }
    
    public void listarProfesores() {
        for (Profesor profesor : profesores) {
            profesor.mostrarInfo();
        }
    }
    
    public void listarCursos() {
        for (Curso curso : cursos) {
            System.out.println(curso);
        }
    }

    public void buscarProfesorPorId(String id) {
        for (Profesor profesor : profesores) {
            if (profesor.getId().equals(id)) {
                profesor.mostrarInfo();
            }
        }                
    }
    
    public void buscarCursoPorCodigo(String codigo) {
        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigo)) {
                System.out.println(curso);
            }
        }
    }
    
    public void eliminarCurso(String codigo) {
        Curso cursoAeliminar = null;
        for (Curso curso : cursos) {
            if(curso.getCodigo().equals(codigo)) {
                cursoAeliminar = curso;
            }
        }
        if (cursoAeliminar != null) {
            (cursoAeliminar.getProfesor()).eliminarCurso(cursoAeliminar);
            cursos.remove(cursoAeliminar);
            System.out.println("El curso: "+cursoAeliminar.getNombre() +" se ha eliminado correctamente");
        } else {
            System.out.println("El codigo de curso ingresa es incorrecto");
        }
    }
    
    public void eliminarProfesor(String id) {
        if (id != null) {
            Profesor profeAeliminar = null;
            for (Curso curso : cursos) {
                if ((curso.getProfesor()).getId().equals(id)) {
                    profeAeliminar = curso.getProfesor();
                    curso.setProfesor(null);   
                }
            }
            if (profeAeliminar != null) {
                profesores.remove(profeAeliminar);
                System.out.println("Profesor eliminado correctamente: "+profeAeliminar.getNombre());
            } else {
                System.out.println("El ID de profesor ingresado es incorrecto");
            }       
        }
    }
}
