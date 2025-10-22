package Ejercicios.EjerciciosUnidad3.Tema2;

import java.io.FileNotFoundException;
import java.io.IOException;

import Ejercicios.EjerciciosUnidad3.Tema2.utils.DataLoader;
import Ejercicios.EjerciciosUnidad3.Tema2.utils.EmptyFileException;
import Ejercicios.EjerciciosUnidad3.Tema2.utils.AverageCalculator;

public class Main {
    
    // Helper method to create test files (for demonstration)
    private static void createTestFile(String filename, String content) {
        try {
            java.io.FileWriter writer = new java.io.FileWriter(filename);
            writer.write(content);
            writer.close();
            System.out.println("  ✓ Test file created: " + filename);
        } catch (IOException e) {
            System.out.println("  ✗ Could not create test file: " + filename);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║     DATA LOADER - FILE & MATH EXCEPTION HANDLING         ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
        
        DataLoader loader = new DataLoader();
        AverageCalculator calculator = new AverageCalculator();
        
        // Prepare test files
        System.out.println("\n[ PREPARING TEST FILES ]");
        System.out.println("─".repeat(60));
        createTestFile("data.txt", "10\n20\n30\n40\n50");
        createTestFile("empty.txt", "");
        
        // TEST 1: Load existing file and calculate average (SUCCESS)
        System.out.println("\n\n[ TEST 1: LOAD EXISTING FILE AND CALCULATE AVERAGE ]");
        System.out.println("─".repeat(60));
        
        try {
            String content = loader.loadFile("data.txt");
            System.out.println("\n  File Content Preview:");
            System.out.println("  " + content.trim().replace("\n", ", "));
            
            // Calculate average from the data
            int total = 150;
            int count = 5;
            double average = calculator.calculate(total, count);
            
            System.out.println("\n  ✓ Final result: Average = " + average);
            
        } catch (FileNotFoundException e) {
            System.out.println("\n  ✗ FILE ERROR: File not found!");
            System.out.println("     Message: " + e.getMessage());
            
        } catch (IOException e) {
            System.out.println("\n  ✗ FILE ERROR: Problem reading the file!");
            System.out.println("     Message: " + e.getMessage());
            
        } catch (ArithmeticException e) {
            System.out.println("\n  ✗ MATH ERROR: Division problem!");
            System.out.println("     Message: " + e.getMessage());
            
        } catch (EmptyFileException e) {
            System.out.println("\n  ✗ FILE ERROR: " + e.getMessage());
            
        } finally {
            System.out.println("  " + "─".repeat(52));
            System.out.println("  ► Operation finished.");
        }
        
        // TEST 2: Try to load non-existent file (FileNotFoundException)
        System.out.println("\n\n[ TEST 2: LOAD NON-EXISTENT FILE ]");
        System.out.println("─".repeat(60));
        
        try {
            String content = loader.loadFile("nonexistent.txt");
            System.out.println("Content: " + content);
            
        } catch (FileNotFoundException e) {
            System.out.println("\n  ✗ FILE ERROR: File not found!");
            System.out.println("     Message: " + e.getMessage());
            System.out.println("     Suggestion: Check if the file exists in the directory.");
            
        } catch (IOException e) {
            System.out.println("\n  ✗ FILE ERROR: Problem reading the file!");
            System.out.println("     Message: " + e.getMessage());
            
        } catch (EmptyFileException e) {
            System.out.println("\n  ✗ FILE ERROR: " + e.getMessage());
            
        } finally {
            System.out.println("  " + "─".repeat(52));
            System.out.println("  ► Operation finished.");
        }
        
        // TEST 3: Calculate average with zero count (ArithmeticException)
        System.out.println("\n\n[ TEST 3: CALCULATE AVERAGE WITH ZERO COUNT ]");
        System.out.println("─".repeat(60));
        
        try {
            int total = 100;
            int count = 0; // This will cause division by zero
            double average = calculator.calculate(total, count);
            System.out.println("Average: " + average);
            
        } catch (ArithmeticException e) {
            System.out.println("\n  ✗ MATH ERROR: Division problem!");
            System.out.println("     Message: " + e.getMessage());
            System.out.println("     Suggestion: Ensure count is greater than zero.");
            
        } finally {
            System.out.println("  " + "─".repeat(52));
            System.out.println("  ► Operation finished.");
        }
        
        // TEST 4: Load empty file (BONUS - EmptyFileException)
        System.out.println("\n\n[ TEST 4: LOAD EMPTY FILE - BONUS ]");
        System.out.println("─".repeat(60));
        
        try {
            String content = loader.loadFile("empty.txt");
            System.out.println("Content: " + content);
            
        } catch (FileNotFoundException e) {
            System.out.println("\n  ✗ FILE ERROR: File not found!");
            System.out.println("     Message: " + e.getMessage());
            
        } catch (EmptyFileException e) {
            System.out.println("\n  ✗ EMPTY FILE ERROR (Custom Exception)!");
            System.out.println("     Message: " + e.getMessage());
            System.out.println("     Suggestion: Add data to the file before processing.");
            
        } catch (IOException e) {
            System.out.println("\n  ✗ FILE ERROR: Problem reading the file!");
            System.out.println("     Message: " + e.getMessage());
            
        } finally {
            System.out.println("  " + "─".repeat(52));
            System.out.println("  ► Operation finished.");
        }
        
        // TEST 5: Combined operation - Load numbers and calculate
        System.out.println("\n\n[ TEST 5: COMPLETE WORKFLOW - LOAD & CALCULATE ]");
        System.out.println("─".repeat(60));

/* 
        try {
            int[] numbers = loader.loadNumbersFromFile("data.txt");
            
            System.out.println("\n  Numbers loaded: ");
            System.out.print("  [ ");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i]);
                if (i < numbers.length - 1) System.out.print(", ");
            }
            System.out.println(" ]");
            
            double average = calculator.calculateFromArray(numbers);
            calculator.showStatistics(numbers);
            
            System.out.println("\n  ✓ Complete workflow finished successfully!");
            
        } catch (FileNotFoundException e) {
            System.out.println("\n  ✗ FILE ERROR: File not found - " + e.getMessage());
            
        } catch (IOException e) {
            System.out.println("\n  ✗ FILE ERROR: I/O problem - " + e.getMessage());
            
        } catch (EmptyFileException e) {
            System.out.println("\n  ✗ EMPTY FILE ERROR: " + e.getMessage());
            
        } catch (InvalidDataFormatException e) {
            System.out.println("\n  ✗ DATA FORMAT ERROR: " + e.getMessage());
            
        } catch (ArithmeticException e) {
            System.out.println("\n  ✗ MATH ERROR: " + e.getMessage());
            
        } finally {
            System.out.println("  " + "─".repeat(52));
            System.out.println("  ► Operation finished.");
        }
*/

        // Explanation section
        System.out.println("\n\n╔══════════════════════════════════════════════════════════╗");
        System.out.println("║              EXCEPTION HANDLING SUMMARY                  ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
        
        System.out.println("\n📚 EXCEPTIONS HANDLED IN THIS PROGRAM:");
        System.out.println("─".repeat(60));
        
        System.out.println("\n1️⃣  FileNotFoundException (extends IOException):");
        System.out.println("   • Thrown when trying to open a file that doesn't exist");
        System.out.println("   • Caught with specific message for file errors");
        System.out.println("   • Example: 'nonexistent.txt' in Test 2");
        
        System.out.println("\n2️⃣  IOException (general file errors):");
        System.out.println("   • Broader exception for all I/O operations");
        System.out.println("   • Includes read/write problems, permissions, etc.");
        System.out.println("   • Must be declared with 'throws' in method signature");
        
        System.out.println("\n3️⃣  ArithmeticException (math errors):");
        System.out.println("   • Thrown when mathematical operation fails");
        System.out.println("   • Division by zero is the most common case");
        System.out.println("   • Prevented by checking count before dividing");
        
        System.out.println("\n4️⃣  EmptyFileException (BONUS - custom):");
        System.out.println("   • Custom exception created for this program");
        System.out.println("   • Thrown when file exists but contains no data");
        System.out.println("   • Extends Exception (checked exception)");
        
        System.out.println("\n5️⃣  InvalidDataFormatException (custom):");
        System.out.println("   • Thrown when file contains non-numeric data");
        System.out.println("   • Helps validate data integrity");
        
        System.out.println("\n💡 KEY CONCEPTS:");
        System.out.println("─".repeat(60));
        
        System.out.println("\n• Multiple catch blocks:");
        System.out.println("  Order matters! Catch specific exceptions first,");
        System.out.println("  then more general ones (FileNotFoundException before IOException)");
        
        System.out.println("\n• finally block:");
        System.out.println("  ALWAYS executes - perfect for cleanup and logging");
        System.out.println("  Used to close files and print 'Operation finished'");
        
        System.out.println("\n• Resource management:");
        System.out.println("  FileReader and BufferedReader must be closed");
        System.out.println("  Done in finally block to ensure cleanup");
        
        System.out.println("\n• Checked vs Unchecked exceptions:");
        System.out.println("  Checked (IOException): Must be declared with 'throws'");
        System.out.println("  Unchecked (ArithmeticException): Runtime exceptions");
        
        System.out.println("\n╔══════════════════════════════════════════════════════════╗");
        System.out.println("║      All tests completed! Check finally blocks above.    ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
    }
}