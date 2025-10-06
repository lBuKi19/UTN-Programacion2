/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3.colecciones;

/**
 *
 * @author lauta
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setProfesor (Profesor profesor) {
        this.profesor = profesor;
        if (profesor != null && !(profesor.getCursos()).contains(this)) {
            profesor.agregarCurso(this);
        }                   
    }

    public Profesor getProfesor() {
        return profesor;
    }
    
    
    
    public void mostrarInfo() {
        
        System.out.println("Curso " + "codigo=" + codigo + ", nombre=" + nombre + ", profesor=" + profesor + '}');
        
    }

    @Override
    public String toString() {
        if (this.getProfesor() != null) {
            return "Curso{" + "codigo=" + codigo + ", nombre=" + nombre + ", profesor=" + profesor.getNombre() + '}';
        } else {
            return "Curso{" + "codigo=" + codigo + ", nombre=" + nombre + ", profesor= null"+ '}';
        }
        
    }
    
    

    
    
    
    
    
}
