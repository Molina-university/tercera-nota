package Ejercicios.EjerciciosUnidad2.Tema5;

import Ejercicios.EjerciciosUnidad2.Tema5.utils.Inventory;
import Ejercicios.EjerciciosUnidad2.Tema5.utils.Product;

public class Main {
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════════════════════╗");
        System.out.println("║       TECH STORE INVENTORY MANAGEMENT SYSTEM v1.0            ║");
        System.out.println("╚══════════════════════════════════════════════════════════════╝");
        
        // Create inventory system
        Inventory inventory = new Inventory();
        
        // Step 1: Add products to inventory
        System.out.println("\n[ STEP 1: ADDING PRODUCTS TO INVENTORY ]");
        System.out.println("─".repeat(64));
        
        inventory.addProduct(new Product("LT001", "Dell XPS 15 Laptop", 1299.99));
        inventory.addProduct(new Product("MS002", "Logitech MX Master 3 Mouse", 99.99));
        inventory.addProduct(new Product("KB003", "Corsair K95 RGB Keyboard", 199.99));
        inventory.addProduct(new Product("MN004", "LG 27-inch 4K Monitor", 449.99));
        inventory.addProduct(new Product("HD005", "Sony WH-1000XM5 Headphones", 399.99));
        inventory.addProduct(new Product("WC006", "Logitech C920 Webcam", 79.99));
        inventory.addProduct(new Product("PR007", "HP LaserJet Pro Printer", 249.99));
        
        // Step 2: Show all products
        System.out.println("\n[ STEP 2: DISPLAYING ALL PRODUCTS ]");
        System.out.println("─".repeat(64));
        inventory.showProducts();
        
        // Step 3: Search for existing products
        System.out.println("\n\n[ STEP 3: SEARCHING FOR PRODUCTS (EXISTING) ]");
        System.out.println("─".repeat(64));
        
        // Search 1: Find laptop
        Product found1 = inventory.searchProduct("LT001");
        if (found1 != null) {
            System.out.println("  Product Details: " + found1);
        }
        
        System.out.println();
        
        // Search 2: Find mouse
        Product found2 = inventory.searchProduct("MS002");
        if (found2 != null) {
            System.out.println("  Product Details: " + found2);
        }
        
        System.out.println();
        
        // Search 3: Find monitor
        Product found3 = inventory.searchProduct("MN004");
        if (found3 != null) {
            System.out.println("  Product Details: " + found3);
        }
        
        // BONUS: Step 4: Try to search for non-existent product (error handling)
        System.out.println("\n\n[ STEP 4: SEARCHING FOR NON-EXISTENT PRODUCTS (ERROR HANDLING) ]");
        System.out.println("─".repeat(64));
        
        inventory.searchProduct("XX999");
        System.out.println();
        
        inventory.searchProduct("INVALID");
        System.out.println();
        
        inventory.searchProduct("");
        
        // Step 5: Show inventory statistics
        System.out.println("\n\n[ STEP 5: INVENTORY STATISTICS ]");
        System.out.println("─".repeat(64));
        inventory.showStatistics();
        
        // Step 6: Remove a product and search again
        System.out.println("\n\n[ STEP 6: REMOVING A PRODUCT ]");
        System.out.println("─".repeat(64));
        System.out.println("\nRemoving webcam (WC006)...");
        inventory.removeProduct("WC006");
        
        System.out.println("\nTrying to search for removed product...");
        inventory.searchProduct("WC006");
        
        // Show updated inventory
        System.out.println("\n\n[ STEP 7: UPDATED INVENTORY ]");
        System.out.println("─".repeat(64));
        inventory.showProducts();
        
        // Final explanation
        System.out.println("\n\n╔══════════════════════════════════════════════════════════════╗");
        System.out.println("║              DATA STRUCTURES EXPLANATION                     ║");
        System.out.println("╚══════════════════════════════════════════════════════════════╝");
        
        System.out.println("\n📋 ArrayList<Product> (products):");
        System.out.println("  • Maintains insertion order");
        System.out.println("  • Used for iterating through all products");
        System.out.println("  • Good for displaying complete inventory");
        System.out.println("  • Search complexity: O(n) - needs to check each element");
        
        System.out.println("\n🗺️  HashMap<String, Product> (catalog):");
        System.out.println("  • Key-value pairs: code → Product");
        System.out.println("  • Extremely fast search by code: O(1) average complexity");
        System.out.println("  • Perfect for looking up specific products");
        System.out.println("  • No guaranteed order");
        
        System.out.println("\n💡 Why use BOTH?");
        System.out.println("  • ArrayList: Best for showing ALL products in order");
        System.out.println("  • HashMap: Best for FAST search by code");
        System.out.println("  • Combining both gives us the best of both worlds!");
        
        System.out.println("\n✨ try-catch Block:");
        System.out.println("  • Handles ProductNotFoundException gracefully");
        System.out.println("  • Prevents program crashes when code doesn't exist");
        System.out.println("  • Provides user-friendly error messages");
        
        System.out.println("\n╔══════════════════════════════════════════════════════════════╗");
        System.out.println("║          Thank you for using our inventory system!           ║");
        System.out.println("╚══════════════════════════════════════════════════════════════╝");
    }
}