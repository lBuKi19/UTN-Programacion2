/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8.interfaces.y.excepciones.java;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lauta
 */
public class Pedido implements Pagable {
    
    
    private List<Producto> productos = new ArrayList<>();
    private Cliente cliente;
    private String estado;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pedido(Cliente cliente, String estado) {
        this.cliente = cliente;
        this.estado = estado;
    }

    public void agregarProducto(Producto p){
        productos.add(p);
    }

    @Override
    public double calcularTotal(){
        double total = 0;
        for (Producto p: productos){
            total += p.calcularTotal();
        }
        return total;
    }

    public void cambiarEstado(String nuevoEstado){
        cliente.notificarCambioEstado(nuevoEstado); 
    }

    
}
