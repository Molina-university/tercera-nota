package Ejercicios.EjerciciosUnidad3.Tema3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import Ejercicios.EjerciciosUnidad3.Tema3.utils.Book;
import Ejercicios.EjerciciosUnidad3.Tema3.utils.BookFileHandler;

public class Main {
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║       BOOKSTORE FILE MANAGEMENT SYSTEM v1.0              ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
        
        // Create BookFileHandler instance
        BookFileHandler fileHandler = new BookFileHandler("bookstore.txt");
        
        // Step 1: Create a list of books
        System.out.println("\n[ STEP 1: CREATING BOOK LIST ]");
        System.out.println("─".repeat(60));
        
        List<Book> books = new ArrayList<>();
        books.add(new Book("Clean Code", "Robert C. Martin", 42.99));
        books.add(new Book("The Pragmatic Programmer", "Andrew Hunt & David Thomas", 45.50));
        books.add(new Book("Design Patterns", "Gang of Four", 54.95));
        
        System.out.println("  Books created:");
        for (Book book : books) {
            System.out.println("  ✓ " + book.toString());
        }
        
        // Step 2: Save books to file
        System.out.println("\n\n[ STEP 2: SAVING BOOKS TO FILE ]");
        System.out.println("─".repeat(60));
        fileHandler.saveBooks(books);
        
        // Step 3: Read and display books from file
        System.out.println("\n\n[ STEP 3: READING BOOKS FROM FILE ]");
        System.out.println("─".repeat(60));
        fileHandler.displayBooks();
        
        // Additional Test: Add more books
        System.out.println("\n\n[ TEST 4: ADDING MORE BOOKS ]");
        System.out.println("─".repeat(60));
        
        List<Book> moreBooks = new ArrayList<>();
        moreBooks.add(new Book("Effective Java", "Joshua Bloch", 48.99));
        moreBooks.add(new Book("Head First Java", "Kathy Sierra & Bert Bates", 39.99));
        moreBooks.add(new Book("Java: The Complete Reference", "Herbert Schildt", 52.00));
        
        System.out.println("  Adding more books:");
        for (Book book : moreBooks) {
            System.out.println("  + " + book.toString());
        }
        
        // Append new books to existing list
        books.addAll(moreBooks);
        fileHandler.saveBooks(books);
        
        // Read updated list
        System.out.println("\n\n[ TEST 5: READING UPDATED CATALOG ]");
        System.out.println("─".repeat(60));
        fileHandler.displayBooks();
        
        // Test: Try to read from non-existent file
        System.out.println("\n\n[ TEST 6: READING NON-EXISTENT FILE ]");
        System.out.println("─".repeat(60));
        BookFileHandler nonExistentHandler = new BookFileHandler("nonexistent.txt");
        nonExistentHandler.readBooks();
        
        // Test: Manual read and display with exception handling
        System.out.println("\n\n[ TEST 7: MANUAL EXCEPTION HANDLING EXAMPLE ]");
        System.out.println("─".repeat(60));
        
        try {
            System.out.println("\n  Attempting to read books manually...");
            List<Book> manualBooks = fileHandler.readBooks();
            
            System.out.println("\n  Books retrieved: " + manualBooks.size());
            
            if (manualBooks.isEmpty()) {
                System.out.println("  ⚠️  No books found in the file");
            } else {
                System.out.println("  ✓ Books loaded successfully!");
            }
            
        } catch (Exception e) {
            System.out.println("  ✗ Unexpected error: " + e.getMessage());
        } finally {
            System.out.println("  ► Manual operation finished.");
        }
        
        // Explanation section
        System.out.println("\n\n╔══════════════════════════════════════════════════════════╗");
        System.out.println("║              FILE I/O CONCEPTS EXPLAINED                 ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
        
        System.out.println("\n📝 BufferedWriter (for writing):");
        System.out.println("─".repeat(60));
        System.out.println("  • Writes text to files efficiently");
        System.out.println("  • Buffers data before writing (better performance)");
        System.out.println("  • Methods used:");
        System.out.println("    - write(String): Writes text to file");
        System.out.println("    - newLine(): Adds a new line");
        System.out.println("  • Must be closed after use (try-with-resources does this)");
        
        System.out.println("\n📖 BufferedReader (for reading):");
        System.out.println("─".repeat(60));
        System.out.println("  • Reads text from files efficiently");
        System.out.println("  • Reads line by line");
        System.out.println("  • Methods used:");
        System.out.println("    - readLine(): Reads one line at a time");
        System.out.println("    - Returns null when end of file is reached");
        System.out.println("  • Must be closed after use");
        
        System.out.println("\n🔄 try-with-resources (BONUS):");
        System.out.println("─".repeat(60));
        System.out.println("  • Syntax: try (Resource r = new Resource()) { }");
        System.out.println("  • Automatically closes resources when done");
        System.out.println("  • No need for explicit close() or finally for cleanup");
        System.out.println("  • Cleaner and safer than manual resource management");
        System.out.println("  • Still allows finally block for additional operations");
        
        System.out.println("\n⚠️  Exception Handling:");
        System.out.println("─".repeat(60));
        System.out.println("  • IOException: General file operation errors");
        System.out.println("  • FileNotFoundException: File doesn't exist (reading)");
        System.out.println("  • NumberFormatException: Invalid number format in file");
        System.out.println("  • IllegalArgumentException: Invalid data structure");
        
        System.out.println("\n💾 File Format:");
        System.out.println("─".repeat(60));
        System.out.println("  • Each book on one line");
        System.out.println("  • Format: title|author|price");
        System.out.println("  • Example: Clean Code|Robert C. Martin|42.99");
        System.out.println("  • Easy to parse with split() method");
        
        System.out.println("\n✨ Best Practices:");
        System.out.println("─".repeat(60));
        System.out.println("  ✓ Use try-with-resources for automatic cleanup");
        System.out.println("  ✓ Handle specific exceptions separately");
        System.out.println("  ✓ Provide user-friendly error messages");
        System.out.println("  ✓ Use finally for logging/notifications");
        System.out.println("  ✓ Validate data format when reading");
        System.out.println("  ✓ Use consistent file format");
        
        // Show file location
        System.out.println("\n\n╔══════════════════════════════════════════════════════════╗");
        System.out.println("║                  FILE INFORMATION                        ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
        
        File file = new File("bookstore.txt");
        if (file.exists()) {
            System.out.println("  File: " + file.getName());
            System.out.println("  Location: " + file.getAbsolutePath());
            System.out.println("  Size: " + file.length() + " bytes");
            System.out.println("  Readable: " + (file.canRead() ? "Yes" : "No"));
            System.out.println("  Writable: " + (file.canWrite() ? "Yes" : "No"));
        }
        
        System.out.println("\n╔══════════════════════════════════════════════════════════╗");
        System.out.println("║      All operations completed successfully! 📚           ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
    }
}