package PracticasClases.Actividad5.utils;

import java.util.List;
import java.util.Arrays;

public class Product {
    // Clase interna Productos
    public static class Productos {
        public String nombre;
        public Integer precio;
        
        public Productos(String nombre, Integer precio) {
            this.nombre = nombre;
            this.precio = precio;
        }
    }
    
    private List<Productos> productos;
    
    public Product() {
        productos = Arrays.asList(
            new Productos("Arroz", 85),
            new Productos("Carne", 92),
            new Productos("Cerdo", 88),
            new Productos("Pollo", 70),
            new Productos("Pescado", 120)
        );
    }
    
    public void showProductos() {
        productos.forEach(producto -> {
            System.out.println("Producto: " + producto.nombre + ", Precio: " + producto.precio);
        });
    }
    
    public static void main(String[] args) {
        Product Producto1 = new Product();
        Producto1.showProductos();
    }
}