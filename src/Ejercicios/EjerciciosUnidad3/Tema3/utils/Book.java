package Ejercicios.EjerciciosUnidad3.Tema3.utils;

public class Book {
    private String title;
    private String author;
    private double price;
    
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String toFileFormat() {
        return title + "|" + author + "|" + price;
    }
    
    public static Book fromFileFormat(String line) {
        String[] parts = line.split("\\|");
        if (parts.length != 3) {
            throw new IllegalArgumentException("Invalid book format in file");
        }
        String title = parts[0];
        String author = parts[1];
        double price = Double.parseDouble(parts[2]);
        return new Book(title, author, price);
    }
    
    public void display() {
        System.out.printf("  📖 %-40s | by %-25s | $%.2f\n", title, author, price);
    }
    
    @Override
    public String toString() {
        return String.format("\"%s\" by %s ($%.2f)", title, author, price);
    }
}