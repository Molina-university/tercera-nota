package Ejercicios.EjerciciosUnidad2.Tema5.utils;

import java.util.ArrayList;
import java.util.HashMap;

public class Inventory {
    
    private ArrayList<Product> products;      // List for storing all products
    private HashMap<String, Product> catalog;  // Map for fast search by code
    
    // Constructor
    public Inventory() {
        products = new ArrayList<>();
        catalog = new HashMap<>();
    }
    
    // Method to add product to both ArrayList and HashMap
    public void addProduct(Product p) {
        // Add to ArrayList
        products.add(p);
        
        // Add to HashMap with code as key
        catalog.put(p.getCode(), p);
        
        System.out.println("  ✓ Product added: " + p.getCode() + " - " + p.getName());
    }
    
    // Method to show all products using for-each loop
    public void showProducts() {
        System.out.println("\n╔════════════════════════════════════════════════════════════╗");
        System.out.println("║              INVENTORY - ALL PRODUCTS                      ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝");
        
        if (products.isEmpty()) {
            System.out.println("  No products in inventory.");
            return;
        }
        
        System.out.println("  Total products: " + products.size());
        System.out.println("  " + "─".repeat(56));
        
        // Using for-each loop to iterate through ArrayList
        for (Product product : products) {
            product.showInfo();
        }
        
        System.out.println("  " + "─".repeat(56));
    }
    
    // Method to search product by code using HashMap
    public Product searchProduct(String code) {
        System.out.println("\n🔍 Searching for product with code: " + code);
        
        // BONUS: Using try-catch to handle non-existent codes
        try {
            // Check if code exists in the catalog
            if (!catalog.containsKey(code)) {
                throw new ProductNotFoundException("Product with code '" + code + "' not found in inventory.");
            }
            
            // Retrieve product from HashMap (O(1) complexity - very fast!)
            Product product = catalog.get(code);
            System.out.println("  ✓ Product found!");
            return product;
            
        } catch (ProductNotFoundException e) {
            System.out.println("  ✗ " + e.getMessage());
            return null;
        }
    }
    
    // Additional method to remove product from inventory
    public void removeProduct(String code) {
        try {
            if (!catalog.containsKey(code)) {
                throw new ProductNotFoundException("Cannot remove: Product with code '" + code + "' not found.");
            }
            
            Product product = catalog.get(code);
            
            // Remove from both ArrayList and HashMap
            products.remove(product);
            catalog.remove(code);
            
            System.out.println("  ✓ Product removed: " + code);
            
        } catch (ProductNotFoundException e) {
            System.out.println("  ✗ " + e.getMessage());
        }
    }
    
    // Method to get inventory statistics
    public void showStatistics() {
        System.out.println("\n╔════════════════════════════════════════════════════════════╗");
        System.out.println("║              INVENTORY STATISTICS                          ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝");
        
        if (products.isEmpty()) {
            System.out.println("  No products in inventory.");
            return;
        }
        
        double totalValue = 0.0;
        double maxPrice = Double.MIN_VALUE;
        double minPrice = Double.MAX_VALUE;
        Product mostExpensive = null;
        Product cheapest = null;
        
        for (Product p : products) {
            totalValue += p.getPrice();
            
            if (p.getPrice() > maxPrice) {
                maxPrice = p.getPrice();
                mostExpensive = p;
            }
            
            if (p.getPrice() < minPrice) {
                minPrice = p.getPrice();
                cheapest = p;
            }
        }
        
        double averagePrice = totalValue / products.size();
        
        System.out.println("  Total Products: " + products.size());
        System.out.printf("  Total Inventory Value: $%.2f\n", totalValue);
        System.out.printf("  Average Price: $%.2f\n", averagePrice);
        System.out.println("\n  Most Expensive: " + (mostExpensive != null ? mostExpensive.toString() : "N/A"));
        System.out.println("  Cheapest: " + (cheapest != null ? cheapest.toString() : "N/A"));
    }
    
    // Get total number of products
    public int getTotalProducts() {
        return products.size();
    }
}

// Custom exception class for product not found scenarios
class ProductNotFoundException extends Exception {
    public ProductNotFoundException(String message) {
        super(message);
    }
}