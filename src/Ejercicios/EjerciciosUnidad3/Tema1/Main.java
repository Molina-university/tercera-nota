package Ejercicios.EjerciciosUnidad3.Tema1;

import Ejercicios.EjerciciosUnidad3.Tema1.utils.SafeCalculator;
import Ejercicios.EjerciciosUnidad3.Tema1.utils.InvalidInputException;

public class Main {
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║       SAFE CALCULATOR - EXCEPTION HANDLING DEMO          ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
        
        SafeCalculator calculator = new SafeCalculator();
        
        System.out.println("\n[ TEST 1: NORMAL DIVISION ]");
        System.out.println("─".repeat(60));
        try {
            double result1 = calculator.divide(20, 4);
            System.out.println("✓ Returned value: " + result1);
        } catch (InvalidInputException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }
        
        System.out.println("\n\n[ TEST 2: DIVISION BY ZERO ]");
        System.out.println("─".repeat(60));
        try {
            double result2 = calculator.divide(15, 0);
            System.out.println("✓ Returned value: " + result2);
        } catch (InvalidInputException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }
        
        System.out.println("\n\n[ TEST 3: NEGATIVE DIVIDEND ]");
        System.out.println("─".repeat(60));
        try {
            double result3 = calculator.divide(-10, 5);
            System.out.println("✓ Returned value: " + result3);
        } catch (InvalidInputException e) {
            System.out.println("\n⚠️  Exception caught in main method!");
            System.out.println("   " + e.getMessage());
        }
        
        System.out.println("\n\n[ TEST 4: NEGATIVE DIVISOR ]");
        System.out.println("─".repeat(60));
        try {
            double result4 = calculator.divide(10, -5);
            System.out.println("✓ Returned value: " + result4);
        } catch (InvalidInputException e) {
            System.out.println("\n⚠️  Exception caught in main method!");
            System.out.println("   " + e.getMessage());
        }
        
        System.out.println("\n\n[ TEST 5: BOTH NUMBERS NEGATIVE ]");
        System.out.println("─".repeat(60));
        try {
            double result5 = calculator.divide(-8, -2);
            System.out.println("✓ Returned value: " + result5);
        } catch (InvalidInputException e) {
            System.out.println("\n⚠️  Exception caught in main method!");
            System.out.println("   " + e.getMessage());
        }
        
        System.out.println("\n\n[ TEST 6: LARGE NUMBERS ]");
        System.out.println("─".repeat(60));
        try {
            double result6 = calculator.divide(1000, 25);
            System.out.println("✓ Returned value: " + result6);
        } catch (InvalidInputException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }
        
        System.out.println("\n\n[ TEST 7: MULTIPLE OPERATIONS - VALID ]");
        System.out.println("─".repeat(60));
        calculator.performMultipleOperations(50, 10);
        
        System.out.println("\n\n[ TEST 8: MULTIPLE OPERATIONS - DIVISION BY ZERO ]");
        System.out.println("─".repeat(60));
        calculator.performMultipleOperations(30, 0);
        
        System.out.println("\n\n[ TEST 9: MULTIPLE OPERATIONS - NEGATIVE NUMBERS ]");
        System.out.println("─".repeat(60));
        calculator.performMultipleOperations(-15, 3);
        
        System.out.println("\n╔══════════════════════════════════════════════════════════╗");
        System.out.println("║    All tests completed! Check the finally blocks above.  ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
    }
}