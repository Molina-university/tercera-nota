package Ejercicios.EjerciciosUnidad2.Tema5;

import Ejercicios.EjerciciosUnidad2.Tema5.utils.Inventory;
import Ejercicios.EjerciciosUnidad2.Tema5.utils.Product;

public class Main {
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════════════════════╗");
        System.out.println("║       TECH STORE INVENTORY MANAGEMENT SYSTEM v1.0            ║");
        System.out.println("╚══════════════════════════════════════════════════════════════╝");
        
        Inventory inventory = new Inventory();
        
        System.out.println("\n[ STEP 1: ADDING PRODUCTS TO INVENTORY ]");
        System.out.println("─".repeat(64));
        
        inventory.addProduct(new Product("LT001", "Dell XPS 15 Laptop", 1299.99));
        inventory.addProduct(new Product("MS002", "Logitech MX Master 3 Mouse", 99.99));
        inventory.addProduct(new Product("KB003", "Corsair K95 RGB Keyboard", 199.99));
        inventory.addProduct(new Product("MN004", "LG 27-inch 4K Monitor", 449.99));
        inventory.addProduct(new Product("HD005", "Sony WH-1000XM5 Headphones", 399.99));
        inventory.addProduct(new Product("WC006", "Logitech C920 Webcam", 79.99));
        inventory.addProduct(new Product("PR007", "HP LaserJet Pro Printer", 249.99));
        
        System.out.println("\n[ STEP 2: DISPLAYING ALL PRODUCTS ]");
        System.out.println("─".repeat(64));
        inventory.showProducts();
        
        System.out.println("\n\n[ STEP 3: SEARCHING FOR PRODUCTS (EXISTING) ]");
        System.out.println("─".repeat(64));
        
        Product found1 = inventory.searchProduct("LT001");
        if (found1 != null) {
            System.out.println("  Product Details: " + found1);
        }
        
        System.out.println();
        
        Product found2 = inventory.searchProduct("MS002");
        if (found2 != null) {
            System.out.println("  Product Details: " + found2);
        }
        
        System.out.println();
        
        Product found3 = inventory.searchProduct("MN004");
        if (found3 != null) {
            System.out.println("  Product Details: " + found3);
        }
        
        System.out.println("\n\n[ STEP 4: SEARCHING FOR NON-EXISTENT PRODUCTS (ERROR HANDLING) ]");
        System.out.println("─".repeat(64));
        
        inventory.searchProduct("XX999");
        System.out.println();
        
        inventory.searchProduct("INVALID");
        System.out.println();
        
        inventory.searchProduct("");
        
        System.out.println("\n\n[ STEP 5: INVENTORY STATISTICS ]");
        System.out.println("─".repeat(64));
        inventory.showStatistics();
        
        System.out.println("\n\n[ STEP 6: REMOVING A PRODUCT ]");
        System.out.println("─".repeat(64));
        System.out.println("\nRemoving webcam (WC006)...");
        inventory.removeProduct("WC006");
        
        System.out.println("\nTrying to search for removed product...");
        inventory.searchProduct("WC006");
        
        System.out.println("\n\n[ STEP 7: UPDATED INVENTORY ]");
        System.out.println("─".repeat(64));
        inventory.showProducts();

        System.out.println("\n╔══════════════════════════════════════════════════════════════╗");
        System.out.println("║          Thank you for using our inventory system!           ║");
        System.out.println("╚══════════════════════════════════════════════════════════════╝");
    }
}