package Ejercicios.EjerciciosUnidad2.Tema3.utils;

public class Product {
    private String name;
    private double price;
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public String getInfo() {
        return String.format("Product: %s | Price: $%.2f", name, price);
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
}