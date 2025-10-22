package Ejercicios.EjerciciosUnidad2.Tema3.utils;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String email;
    private List<Order> orders;
    
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.orders = new ArrayList<>();
    }
    
    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println("  ✓ Order placed successfully!");
    }
    
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append(String.format("Customer: %s\nEmail: %s\nTotal Orders: %d\n", 
                                   name, email, orders.size()));
        double totalSpent = 0.0;
        for (Order order : orders) {
            totalSpent += order.getTotal();
        }
        info.append(String.format("Total Spent: $%.2f", totalSpent));
        return info.toString();
    }
    
    public List<Order> getOrders() {
        return orders;
    }
    
    public String getName() {
        return name;
    }
}