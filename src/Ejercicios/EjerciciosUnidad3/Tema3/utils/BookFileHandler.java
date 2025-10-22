package Ejercicios.EjerciciosUnidad3.Tema3.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BookFileHandler {
    private String filename;
    
    // Constructor
    public BookFileHandler(String filename) {
        this.filename = filename;
    }
    
    // Method to save books to file using BufferedWriter
    public void saveBooks(List<Book> books) {
        System.out.println("\n╔════════════════════════════════════════════════════════╗");
        System.out.println("║              SAVING BOOKS TO FILE                      ║");
        System.out.println("╚════════════════════════════════════════════════════════╝");
        System.out.println("  Filename: " + filename);
        System.out.println("  Books to save: " + books.size());
        
        // BONUS: Using try-with-resources (automatically closes resources)
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            
            System.out.println("\n  Writing books:");
            
            // Write each book to file
            for (Book book : books) {
                writer.write(book.toFileFormat());
                writer.newLine(); // Add new line after each book
                System.out.println("  ✓ " + book.toString());
            }
            
            System.out.println("\n  ✓ All books saved successfully!");
            
        } catch (IOException e) {
            System.out.println("\n  ✗ FILE ERROR: Could not save books!");
            System.out.println("     Message: " + e.getMessage());
            System.out.println("     Cause: Problem writing to the file");
            
        } finally {
            // BONUS: Always executes
            System.out.println("  " + "─".repeat(52));
            System.out.println("  ► Save operation finished.");
        }
    }
    
    // Method to read books from file using BufferedReader
    public List<Book> readBooks() {
        System.out.println("\n╔════════════════════════════════════════════════════════╗");
        System.out.println("║              READING BOOKS FROM FILE                   ║");
        System.out.println("╚════════════════════════════════════════════════════════╝");
        System.out.println("  Filename: " + filename);
        
        List<Book> books = new ArrayList<>();
        
        // BONUS: Using try-with-resources
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            
            String line;
            int lineNumber = 0;
            
            System.out.println("\n  Reading books:");
            System.out.println("  " + "─".repeat(52));
            
            // Read file line by line
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                
                try {
                    Book book = Book.fromFileFormat(line);
                    books.add(book);
                    book.display();
                    
                } catch (IllegalArgumentException e) {
                    System.out.println("  ⚠️  Warning: Invalid format on line " + lineNumber);
                }
            }
            
            System.out.println("  " + "─".repeat(52));
            System.out.printf("  ✓ Successfully read %d books!\n", books.size());
            
        } catch (FileNotFoundException e) {
            System.out.println("\n  ✗ FILE ERROR: File not found!");
            System.out.println("     Message: " + e.getMessage());
            System.out.println("     Suggestion: Make sure to save books first");
            
        } catch (IOException e) {
            System.out.println("\n  ✗ FILE ERROR: Problem reading the file!");
            System.out.println("     Message: " + e.getMessage());
            
        } finally {
            // BONUS: Always executes
            System.out.println("  " + "─".repeat(52));
            System.out.println("  ► Read operation finished.");
        }
        
        return books;
    }
    
    // Additional method to display all books with formatting
    public void displayBooks() {
        List<Book> books = readBooks();
        
        if (!books.isEmpty()) {
            System.out.println("\n╔════════════════════════════════════════════════════════╗");
            System.out.println("║              BOOKSTORE CATALOG                         ║");
            System.out.println("╚════════════════════════════════════════════════════════╝");
            
            double totalValue = 0.0;
            
            for (int i = 0; i < books.size(); i++) {
                System.out.printf("  [%d] ", i + 1);
                books.get(i).display();
                totalValue += books.get(i).getPrice();
            }
            
            System.out.println("  " + "─".repeat(52));
            System.out.printf("  Total books: %d | Total value: $%.2f\n", books.size(), totalValue);
        }
    }
    
    // Method to check if file exists
    public boolean fileExists() {
        File file = new File(filename);
        return file.exists();
    }
    
    // Method to delete the file
    public void deleteFile() {
        try {
            File file = new File(filename);
            if (file.delete()) {
                System.out.println("  ✓ File deleted: " + filename);
            } else {
                System.out.println("  ⚠️  File not found or couldn't be deleted");
            }
        } catch (Exception e) {
            System.out.println("  ✗ Error deleting file: " + e.getMessage());
        }
    }
}