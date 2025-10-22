package Ejercicios.EjerciciosUnidad2.Tema3.utils;

import java.util.ArrayList;
import java.util.List;

public class Category {
   private String name;
    private String description;
    private List<Product> products;
    
    public Category(String name, String description) {
        this.name = name;
        this.description = description;
        this.products = new ArrayList<>();
    }
    
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("  ✓ Product '" + product.getName() + "' added to category '" + name + "'");
    }
    
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append(String.format("Category: %s\nDescription: %s\nProducts (%d):\n", 
                                   name, description, products.size()));
        for (Product p : products) {
            info.append("  - ").append(p.getInfo()).append("\n");
        }
        return info.toString();
    }
    
    public List<Product> getProducts() {
        return products;
    }
}