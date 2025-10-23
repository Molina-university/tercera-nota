package ejercicios.unidad1.tema3;
import ejercicios.unidad1.tema3.utils.Product;

class InventorySystem {
    public static void main(String[] args) {
        System.out.println("🏭 SIStema DE INVENTARIO");
        System.out.println("=====================================\n");
        
        System.out.println("📝 CREACIÓN DE PRODUCTOS CON DIFERENTES CONSTRUCTORES:");
        System.out.println("─────────────────────────────────────");
        
        Product product1 = new Product();
        System.out.println("✓ Producto 1: Constructor vacío");
        
        Product product2 = new Product("Teclado Mecánico", 89.99);
        System.out.println("✓ Producto 2: Constructor con nombre y precio");
        
        Product product3 = new Product("Monitor LG 27\"", 299.99, 15);
        System.out.println("✓ Producto 3: Constructor completo");
        
        System.out.println("\n📋 INFORMACIÓN INICIAL DE PRODUCTOS:");
        product1.showProduct();
        product2.showProduct();
        product3.showProduct();
        
        System.out.println("\n\n🔄 PRUEBAS DE SOBRECARGA DE MÉTODOS:");
        System.out.println("─────────────────────────────────────");
        
        System.out.println("\n1️⃣ Actualizar solo nombre:");
        product1.update("Mouse Gamer");
        product1.showProduct();
        
        System.out.println("\n2️⃣ Actualizar solo precio:");
        product1.update(45.50);
        product1.showProduct();
        
        System.out.println("\n3️⃣ Actualizar nombre y precio:");
        product2.update("Teclado Mecánico RGB", 129.99);
        product2.showProduct();
        
        System.out.println("\n4️⃣ Actualizar todo:");
        product3.update("Monitor LG 27\" 4K", 399.99, 20);
        product3.showProduct();
        
        System.out.println("\n\n🧪 VALIDACIONES:");
        System.out.println("─────────────────────────────────────");
        product1.update(-50.00);
        
        System.out.println("\n\n📊 INVENTARIO FINAL:");
        System.out.println("═════════════════════════════════════");
        System.out.println("Total de productos: 3");
        System.out.println();
        
        System.out.println("Producto 1: " + product1.getName() + 
                         " | $" + String.format("%.2f", product1.getPrice()) + 
                         " | Stock: " + product1.getQuantity());
        
        System.out.println("Producto 2: " + product2.getName() + 
                         " | $" + String.format("%.2f", product2.getPrice()) + 
                         " | Stock: " + product2.getQuantity());
        
        System.out.println("Producto 3: " + product3.getName() + 
                         " | $" + String.format("%.2f", product3.getPrice()) + 
                         " | Stock: " + product3.getQuantity());
    }
}