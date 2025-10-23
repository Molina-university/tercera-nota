package Ejercicios.EjerciciosUnidad2.Tema4.utils;

public class Car {
    private String model;
    private double pricePerDay;
    private boolean available;
    
    public Car(String model, double pricePerDay, boolean available) {
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.available = available;
    }
    
    public String getModel() {
        return model;
    }
    
    public double getPricePerDay() {
        return pricePerDay;
    }
    
    public boolean isAvailable() {
        return available;
    }
    
    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    public void showInfo() {
        String status = available ? "✓ Available" : "✗ Rented";
        System.out.printf("  %-25s | $%-8.2f/day | %s\n", model, pricePerDay, status);
    }
}