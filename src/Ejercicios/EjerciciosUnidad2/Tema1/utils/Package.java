package Ejercicios.EjerciciosUnidad2.Tema1.utils;

public class Package {
    private String trackingCode;
    private double weight;
    
    // Constructor
    public Package(String trackingCode, double weight) {
        this.trackingCode = trackingCode;
        this.weight = weight;
    }
    
    // Getter and setter for weight
    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    // Method to display package information
    public void showPackage() {
        System.out.println("Tracking Code: " + trackingCode + " | Weight: " + weight + " kg");
    }
}