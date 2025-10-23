package ejercicios.unidad2.tema5.utils;

public class Product {
    private String code;
    private String name;
    private double price;
    
    public Product(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }
    
    public String getCode() {
        return code;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void showInfo() {
        System.out.printf("  [%s] %-30s | $%.2f\n", code, name, price);
    }
    
    @Override
    public String toString() {
        return String.format("[%s] %s - $%.2f", code, name, price);
    }
}