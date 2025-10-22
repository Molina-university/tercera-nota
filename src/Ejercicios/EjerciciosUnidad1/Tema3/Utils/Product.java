package Ejercicios.EjerciciosUnidad1.Tema3.Utils;

public class Product {
    private String name;
    private double price;
    private int quantity;
    
    // Constructor sin parámetros (valores por defecto)
    public Product() {
        this.name = "Producto sin nombre";
        this.price = 0.0;
        this.quantity = 0;
    }
    
    // Constructor con nombre y precio
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }
    
    // Constructor con nombre, precio y cantidad
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void showProduct() {
        System.out.println("\n═══════════════════════════════════════");
        System.out.println("📦 PRODUCTO");
        System.out.println("───────────────────────────────────────");
        System.out.println("Nombre:    " + name);
        System.out.println("Precio:    $" + String.format("%.2f", price));
        System.out.println("Cantidad:  " + quantity + " unidades");
        System.out.println("═══════════════════════════════════════");
    }
    
    // BONUS: Sobrecarga del método update
    public void update(String name) {
        this.name = name;
        System.out.println("✅ Nombre actualizado a: " + name);
    }
    
    public void update(double price) {
        if (price >= 0) {
            this.price = price;
            System.out.println("✅ Precio actualizado a: $" + String.format("%.2f", price));
        } else {
            System.out.println("❌ El precio no puede ser negativo");
        }
    }
    
    public void update(String name, double price) {
        this.name = name;
        if (price >= 0) {
            this.price = price;
            System.out.println("✅ Nombre y precio actualizados");
        } else {
            System.out.println("⚠️ Nombre actualizado, pero el precio no puede ser negativo");
        }
    }
    
    public void update(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        System.out.println("✅ Producto completamente actualizado");
    }
}