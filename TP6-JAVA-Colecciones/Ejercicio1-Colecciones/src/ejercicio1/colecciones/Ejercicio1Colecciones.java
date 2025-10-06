/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1.colecciones;

/**
 *
 * @author lauta
 */
public class Ejercicio1Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto producto1 = new Producto("k1zP", "Auriculares", 25000.0, 50, CategoriaProducto.ELECTRONICA);
        Producto producto2 = new Producto("y5zT", "Mouse", 30000.0, 15, CategoriaProducto.ELECTRONICA);
        Producto producto3 = new Producto("j7gE", "Remera", 20000.0, 25, CategoriaProducto.ROPA);
        Producto producto4 = new Producto("z4jM", "Arroz", 2500.0, 30, CategoriaProducto.ALIMENTOS);
        Producto producto5 = new Producto("i8jO", "Mesa", 75000.0, 20, CategoriaProducto.HOGAR);
        
        Inventario inventario1 = new Inventario();
        inventario1.agregarProducto(producto5);
        inventario1.agregarProducto(producto4);
        inventario1.agregarProducto(producto3);
        inventario1.agregarProducto(producto2);
        inventario1.agregarProducto(producto1);
        
        inventario1.listarProductos();
        inventario1.buscarProductoPorId("k1zP");
        inventario1.eliminarProducto("k1zP");
        inventario1.actualizarStock("j7gE", 30);
        System.out.println(inventario1.filtrarPorCategoria(CategoriaProducto.ROPA));
        System.out.println("El total de stock es "+inventario1.obtenerTotalStock());
        inventario1.obtenerProductoConMayorStock();
        inventario1.filtrarProductosPorPrecio(1000.0, 3000.0);
        inventario1.mostrarCategoriasDisponibles();
        
    }
    
}
