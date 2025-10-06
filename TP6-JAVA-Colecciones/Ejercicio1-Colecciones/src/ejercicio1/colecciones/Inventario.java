/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author lauta
 */
public class Inventario {
    private ArrayList<Producto> productos = new ArrayList<>();
    CategoriaProducto categoria;
    
    public void agregarProducto(Producto p) {
        productos.add(p);
        System.out.println("Producto agregado correctamente");
    }
    
    public void listarProductos() {
        for(Producto producto : productos) {
            System.out.println(producto);
        }
    }
    
    public void buscarProductoPorId(String id) {
        for (Producto producto : productos) {
            if (producto.getId().equals(id)) {
                producto.mostrarInfo();
            }
        }
    }
    
    public void eliminarProducto(String id) {
        boolean borrado = false;
        for (Producto producto : productos) {
            if (producto.getId().equals(id)) {
                productos.remove(producto);
                borrado = true;
                System.out.println("Producto eliminado correctamente: "+producto.getNombre());
                break;
            }          
        }
        if(borrado == false) {
                
            System.out.println("No se encontro producto con el ID ingresado");
        }
    }
    
    public void actualizarStock(String id, int nuevaCantidad) {
        for (Producto producto : productos) {
            if (producto.getId().equals(id)) {
                producto.setCantidad(nuevaCantidad);
                System.out.println("Stock actualizado correctamente");
            }
        }    
    }
    
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> prodXcategoria = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getCategoria() == categoria) {
                prodXcategoria.add(producto);
            }
        }
        return prodXcategoria;
    }
    
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto producto : productos) {
            total += producto.getCantidad();
        }
        return total;        
    }
    
    public void obtenerProductoConMayorStock() {
        int mayor = -1;
        String nombre = "";
        for (Producto producto : productos) {
            
            int stock = producto.getCantidad();
            if (stock > mayor) {
                mayor = stock;
                nombre = producto.getNombre();       
            }   
        }
        System.out.println("El producto con mayor stock es "+nombre +", con "+mayor +" unidades");    
    }
    
    public void  filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> prodXprecio = new ArrayList<>();
        for (Producto producto : productos) {
            double precio = producto.getPrecio();
            if (precio >= min && precio <= max ) {
                prodXprecio.add(producto);
            }
        }
        if (prodXprecio.isEmpty()) {
            System.out.println("No se encontraron productos en ese rango de precio");                 
        } else {
            System.out.println("Productos entre "+min +" - "+max);
            System.out.println(prodXprecio);
        }
    }
    
    public void mostrarCategoriasDisponibles() {
        CategoriaProducto [] categorias = CategoriaProducto.values();
        for (CategoriaProducto categoria1 : categorias) {
            System.out.println(categoria1);
        }
    }
 }
