package PracticasClases.Actividad6;
import PracticasClases.Actividad6.utils.Inventory;
import PracticasClases.Actividad6.utils.Product;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Add sample products
        inventory.addProduct(new Product("P001", "Laptop", 999.99));
        inventory.addProduct(new Product("P002", "Mouse", 29.99));
        inventory.addProduct(new Product("P003", "Keyboard", 59.99));

        // Show all products
        System.out.println("All Products:");
        inventory.showProducts();

        // Search for specific products with error handling
        try {
            Product foundProduct = inventory.searchProduct("P002");
            if (foundProduct != null) {
                System.out.println("\nFound product: " + foundProduct.toString());
            } else {
                throw new RuntimeException("Product not found");
            }
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Try searching for non-existent product
        try {
            Product foundProduct = inventory.searchProduct("P999");
            if (foundProduct != null) {
                System.out.println("\nFound product: " + foundProduct.toString());
            } else {
                throw new RuntimeException("Product not found");
            }
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}