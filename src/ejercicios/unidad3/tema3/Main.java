package ejercicios.unidad3.tema3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import ejercicios.unidad3.tema3.utils.Book;
import ejercicios.unidad3.tema3.utils.BookFileHandler;

public class Main {
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║       BOOKSTORE FILE MANAGEMENT SYSTEM v1.0              ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
        
        BookFileHandler fileHandler = new BookFileHandler("bookstore.txt");
        
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
        
        System.out.println("\n\n[ STEP 2: SAVING BOOKS TO FILE ]");
        System.out.println("─".repeat(60));
        fileHandler.saveBooks(books);
        
        System.out.println("\n\n[ STEP 3: READING BOOKS FROM FILE ]");
        System.out.println("─".repeat(60));
        fileHandler.displayBooks();
        
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
        
        books.addAll(moreBooks);
        fileHandler.saveBooks(books);
        
        System.out.println("\n\n[ TEST 5: READING UPDATED CATALOG ]");
        System.out.println("─".repeat(60));
        fileHandler.displayBooks();
        
        System.out.println("\n\n[ TEST 6: READING NON-EXISTENT FILE ]");
        System.out.println("─".repeat(60));
        BookFileHandler nonExistentHandler = new BookFileHandler("nonexistent.txt");
        nonExistentHandler.readBooks();
        
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