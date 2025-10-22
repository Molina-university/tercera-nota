package Ejercicios.EjerciciosUnidad2.Tema3.utils;

import java.util.ArrayList;
import java.util.List;  

public class Order {
    private String date;
    private double total;
    private List<Product> products;
    
    public Order(String date) {
        this.date = date;
        this.total = 0.0;
        this.products = new ArrayList<>();
    }
    
    public void addProduct(Product product) {
        products.add(product);
        calculateTotal();
        System.out.println("  ✓ Product '" + product.getName() + "' added to order");
    }
    
    public void calculateTotal() {
        total = 0.0;
        for (Product p : products) {
            total += p.getPrice();
        }
    }
    
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append(String.format("Order Date: %s\nProducts (%d):\n", date, products.size()));
        for (Product p : products) {
            info.append("  - ").append(p.getInfo()).append("\n");
        }
        info.append(String.format("Total: $%.2f", total));
        return info.toString();
    }
    
    public List<Product> getProducts() {
        return products;
    }
    
    public double getTotal() {
        return total;
    }
}