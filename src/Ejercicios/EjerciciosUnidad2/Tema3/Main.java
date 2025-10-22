package Ejercicios.EjerciciosUnidad2.Tema3;

import Ejercicios.EjerciciosUnidad2.Tema3.utils.Category;
import Ejercicios.EjerciciosUnidad2.Tema3.utils.Customer;
import Ejercicios.EjerciciosUnidad2.Tema3.utils.Order;
import Ejercicios.EjerciciosUnidad2.Tema3.utils.Product;

public class Main {
    public static void main(String[] args) {
        System.out.println("=".repeat(70));
        System.out.println("         ONLINE SHOP SYSTEM - UML IMPLEMENTATION TEST");
        System.out.println("=".repeat(70));
        
        // Create Categories
        System.out.println("\n1. CREATING CATEGORIES");
        System.out.println("-".repeat(70));
        Category electronics = new Category("Electronics", "Electronic devices and gadgets");
        Category books = new Category("Books", "Physical and digital books");
        
        // Create Products
        System.out.println("\n2. CREATING PRODUCTS");
        System.out.println("-".repeat(70));
        Product laptop = new Product("Gaming Laptop", 1299.99);
        Product mouse = new Product("Wireless Mouse", 29.99);
        Product keyboard = new Product("Mechanical Keyboard", 89.99);
        Product javaBook = new Product("Java Programming Guide", 45.50);
        Product designBook = new Product("UML Design Patterns", 38.75);
        
        System.out.println("  ✓ 5 products created");
        
        // Add Products to Categories (AGGREGATION)
        System.out.println("\n3. ADDING PRODUCTS TO CATEGORIES (Aggregation)");
        System.out.println("-".repeat(70));
        electronics.addProduct(laptop);
        electronics.addProduct(mouse);
        electronics.addProduct(keyboard);
        books.addProduct(javaBook);
        books.addProduct(designBook);
        
        // Display Categories
        System.out.println("\n4. CATEGORY INFORMATION");
        System.out.println("-".repeat(70));
        System.out.println(electronics.getInfo());
        System.out.println(books.getInfo());
        
        // Create Customer
        System.out.println("\n5. CREATING CUSTOMER");
        System.out.println("-".repeat(70));
        Customer customer1 = new Customer("John Doe", "john.doe@email.com");
        System.out.println("  ✓ Customer 'John Doe' created");
        
        // Create First Order (COMPOSITION)
        System.out.println("\n6. CREATING FIRST ORDER (Composition)");
        System.out.println("-".repeat(70));
        Order order1 = new Order("2025-10-22");
        order1.addProduct(laptop);
        order1.addProduct(mouse);
        
        // Customer places order (ASSOCIATION)
        System.out.println("\n7. CUSTOMER PLACES ORDER (Association)");
        System.out.println("-".repeat(70));
        customer1.placeOrder(order1);
        
        // Display Order
        System.out.println("\n8. ORDER DETAILS");
        System.out.println("-".repeat(70));
        System.out.println(order1.getInfo());
        
        // Create Second Order
        System.out.println("\n\n9. CREATING SECOND ORDER");
        System.out.println("-".repeat(70));
        Order order2 = new Order("2025-10-23");
        order2.addProduct(javaBook);
        order2.addProduct(designBook);
        order2.addProduct(keyboard);
        customer1.placeOrder(order2);
        
        // Display Customer Information
        System.out.println("\n10. CUSTOMER SUMMARY");
        System.out.println("-".repeat(70));
        System.out.println(customer1.getInfo());
        
        // Explain Relationships
        System.out.println("\n\n" + "=".repeat(70));
        System.out.println("                    RELATIONSHIP EXPLANATIONS");
        System.out.println("=".repeat(70));
        
        System.out.println("\n📦 AGGREGATION (Category ◇—→ Product):");
        System.out.println("  • Category HAS Products, but Products can exist independently");
        System.out.println("  • If Category is deleted, Products still exist");
        System.out.println("  • Weak \"has-a\" relationship (hollow diamond)");
        
        System.out.println("\n🔗 ASSOCIATION (Customer —→ Order):");
        System.out.println("  • Customer MAKES Orders");
        System.out.println("  • Independent lifecycle - both can exist separately");
        System.out.println("  • Simple connection between objects (line with arrow)");
        
        System.out.println("\n🧩 COMPOSITION (Order ◆—→ Product):");
        System.out.println("  • Order IS COMPOSED OF Products");
        System.out.println("  • Strong ownership - Order manages its Products");
        System.out.println("  • If Order is deleted, its Product references are lost");
        System.out.println("  • Strong \"part-of\" relationship (filled diamond)");
        
        System.out.println("\n" + "=".repeat(70));
    }
}