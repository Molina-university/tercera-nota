package Ejercicios.EjerciciosUnidad1.Tema1;
import Ejercicios.EjerciciosUnidad1.Tema1.Utils.Producto;

public class TiendaOnline {
    public static void main(String[] args) {
        System.out.println("🏪 SISTEMA DE GESTIÓN DE TIENDA ONLINE");
        System.out.println("=====================================\n");
        
        Producto producto1 = new Producto("Laptop Dell XPS 15", 1299.99, 15);
        Producto producto2 = new Producto("Mouse Inalámbrico Logitech", 29.99, 5);
        
        System.out.println("📋 INVENTARIO INICIAL:");
        producto1.mostrarProducto();
        producto2.mostrarProducto();
        
        System.out.println("\n🛒 OPERACIÓN 1: Venta de laptops");
        System.out.println("─────────────────────────────────────");
        producto1.vender(3);
        
        System.out.println("\n🛒 OPERACIÓN 2: Intento de venta sin stock");
        System.out.println("─────────────────────────────────────");
        producto2.vender(10);
        
        System.out.println("\n📥 OPERACIÓN 3: Reabastecimiento");
        System.out.println("─────────────────────────────────────");
        producto2.reabastecer(20);
        
        System.out.println("\n🛒 OPERACIÓN 4: Nueva venta tras reabastecer");
        System.out.println("─────────────────────────────────────");
        producto2.vender(10);
        
        System.out.println("\n📥 OPERACIÓN 5: Reabastecimiento de laptops");
        System.out.println("─────────────────────────────────────");
        producto1.reabastecer(10);
        
        System.out.println("\n📊 INVENTARIO FINAL:");
        producto1.mostrarProducto();
        producto2.mostrarProducto();
        
        System.out.println("🧪 PRUEBAS DE VALIDACIÓN:");
        System.out.println("─────────────────────────────────────");
        producto1.vender(-5);  // Cantidad negativa
        producto1.setPrecio(-100);  // Precio negativo
    }
}