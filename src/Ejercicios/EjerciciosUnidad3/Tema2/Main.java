package Ejercicios.EjerciciosUnidad3.Tema2;

import java.io.FileNotFoundException;
import java.io.IOException;

import Ejercicios.EjerciciosUnidad3.Tema2.utils.DataLoader;
import Ejercicios.EjerciciosUnidad3.Tema2.utils.EmptyFileException;
import Ejercicios.EjerciciosUnidad3.Tema2.utils.AverageCalculator;

public class Main {
    
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
        
        System.out.println("\n[ PREPARING TEST FILES ]");
        System.out.println("─".repeat(60));
        createTestFile("data.txt", "10\n20\n30\n40\n50");
        createTestFile("empty.txt", "");
        
        System.out.println("\n\n[ TEST 1: LOAD EXISTING FILE AND CALCULATE AVERAGE ]");
        System.out.println("─".repeat(60));
        
        try {
            String content = loader.loadFile("data.txt");
            System.out.println("\n  File Content Preview:");
            System.out.println("  " + content.trim().replace("\n", ", "));
            
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
        
        System.out.println("\n\n[ TEST 5: COMPLETE WORKFLOW - LOAD & CALCULATE ]");
        System.out.println("─".repeat(60));

        System.out.println("\n╔══════════════════════════════════════════════════════════╗");
        System.out.println("║      All tests completed! Check finally blocks above.    ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
    }
}