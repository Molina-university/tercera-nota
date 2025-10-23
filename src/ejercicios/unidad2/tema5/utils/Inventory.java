package ejercicios.unidad2.tema5.utils;

import java.util.ArrayList;
import java.util.HashMap;

public class Inventory {
    
    private ArrayList<Product> products;      
    private HashMap<String, Product> catalog;  
    
    public Inventory() {
        products = new ArrayList<>();
        catalog = new HashMap<>();
    }
    
    public void addProduct(Product p) {
        products.add(p);
        
        catalog.put(p.getCode(), p);
        
        System.out.println("  ✓ Product added: " + p.getCode() + " - " + p.getName());
    }
    
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
        
        for (Product product : products) {
            product.showInfo();
        }
        
        System.out.println("  " + "─".repeat(56));
    }
    
    public Product searchProduct(String code) {
        System.out.println("\n🔍 Searching for product with code: " + code);
        
        try {
            if (!catalog.containsKey(code)) {
                throw new ProductNotFoundException("Product with code '" + code + "' not found in inventory.");
            }
            
            Product product = catalog.get(code);
            System.out.println("  ✓ Product found!");
            return product;
            
        } catch (ProductNotFoundException e) {
            System.out.println("  ✗ " + e.getMessage());
            return null;
        }
    }
    
    public void removeProduct(String code) {
        try {
            if (!catalog.containsKey(code)) {
                throw new ProductNotFoundException("Cannot remove: Product with code '" + code + "' not found.");
            }
            
            Product product = catalog.get(code);
            
            products.remove(product);
            catalog.remove(code);
            
            System.out.println("  ✓ Product removed: " + code);
            
        } catch (ProductNotFoundException e) {
            System.out.println("  ✗ " + e.getMessage());
        }
    }
    
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
    
    public int getTotalProducts() {
        return products.size();
    }
}

class ProductNotFoundException extends Exception {
    public ProductNotFoundException(String message) {
        super(message);
    }
}