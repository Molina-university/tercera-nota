package Ejercicios.EjerciciosUnidad1.Tema1.Utils;

public class Producto {

    private String nombre;
    private double precio;
    private int cantidad;
    
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("⚠️ El precio no puede ser negativo");
        }
    }
    
    public int getCantidad() {
        return cantidad;
    }
    
    public void vender(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("❌ La cantidad a vender debe ser mayor a 0");
            return;
        }
        
        if (this.cantidad >= cantidad) {
            this.cantidad -= cantidad;
            double total = cantidad * this.precio;
            System.out.println("✅ Venta exitosa de " + cantidad + " unidad(es) de " + nombre);
            System.out.println("   Total de la venta: $" + String.format("%.2f", total));
            System.out.println("   Stock restante: " + this.cantidad + " unidades");
        } else {
            System.out.println("❌ Stock insuficiente para vender " + cantidad + " unidades de " + nombre);
            System.out.println("   Stock disponible: " + this.cantidad + " unidades");
            System.out.println("   Faltan: " + (cantidad - this.cantidad) + " unidades");
        }
    }
    
    public void reabastecer(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("⚠️ La cantidad a reabastecer debe ser mayor a 0");
            return;
        }
        
        this.cantidad += cantidad;
        System.out.println("📦 Reabastecimiento exitoso de " + nombre);
        System.out.println("   Se agregaron " + cantidad + " unidades");
        System.out.println("   Nuevo stock: " + this.cantidad + " unidades");
    }
    
    public void mostrarProducto() {
        System.out.println("\n═══════════════════════════════════════");
        System.out.println("📦 INFORMACIÓN DEL PRODUCTO");
        System.out.println("═══════════════════════════════════════");
        System.out.println("Nombre:   " + nombre);
        System.out.println("Precio:   $" + String.format("%.2f", precio));
        System.out.println("Stock:    " + cantidad + " unidades");
        
        if (cantidad == 0) {
            System.out.println("Estado:   🔴 AGOTADO");
        } else if (cantidad < 10) {
            System.out.println("Estado:   🟡 STOCK BAJO");
        } else {
            System.out.println("Estado:   🟢 DISPONIBLE");
        }
        System.out.println("═══════════════════════════════════════\n");
    }
}