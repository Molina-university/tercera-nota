package Ejercicios.EjerciciosUnidad3.Tema1;

import Ejercicios.EjerciciosUnidad3.Tema1.utils.SafeCalculator;
import Ejercicios.EjerciciosUnidad3.Tema1.utils.InvalidInputException;

public class Main {
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║       SAFE CALCULATOR - EXCEPTION HANDLING DEMO          ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
        
        SafeCalculator calculator = new SafeCalculator();
        
        // TEST 1: Normal division (SUCCESS)
        System.out.println("\n[ TEST 1: NORMAL DIVISION ]");
        System.out.println("─".repeat(60));
        try {
            double result1 = calculator.divide(20, 4);
            System.out.println("✓ Returned value: " + result1);
        } catch (InvalidInputException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }
        
        // TEST 2: Division by zero (ArithmeticException)
        System.out.println("\n\n[ TEST 2: DIVISION BY ZERO ]");
        System.out.println("─".repeat(60));
        try {
            double result2 = calculator.divide(15, 0);
            System.out.println("✓ Returned value: " + result2);
        } catch (InvalidInputException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }
        
        // TEST 3: Negative dividend (InvalidInputException)
        System.out.println("\n\n[ TEST 3: NEGATIVE DIVIDEND ]");
        System.out.println("─".repeat(60));
        try {
            double result3 = calculator.divide(-10, 5);
            System.out.println("✓ Returned value: " + result3);
        } catch (InvalidInputException e) {
            System.out.println("\n⚠️  Exception caught in main method!");
            System.out.println("   " + e.getMessage());
        }
        
        // TEST 4: Negative divisor (InvalidInputException)
        System.out.println("\n\n[ TEST 4: NEGATIVE DIVISOR ]");
        System.out.println("─".repeat(60));
        try {
            double result4 = calculator.divide(10, -5);
            System.out.println("✓ Returned value: " + result4);
        } catch (InvalidInputException e) {
            System.out.println("\n⚠️  Exception caught in main method!");
            System.out.println("   " + e.getMessage());
        }
        
        // TEST 5: Both negative (InvalidInputException)
        System.out.println("\n\n[ TEST 5: BOTH NUMBERS NEGATIVE ]");
        System.out.println("─".repeat(60));
        try {
            double result5 = calculator.divide(-8, -2);
            System.out.println("✓ Returned value: " + result5);
        } catch (InvalidInputException e) {
            System.out.println("\n⚠️  Exception caught in main method!");
            System.out.println("   " + e.getMessage());
        }
        
        // TEST 6: Large numbers (SUCCESS)
        System.out.println("\n\n[ TEST 6: LARGE NUMBERS ]");
        System.out.println("─".repeat(60));
        try {
            double result6 = calculator.divide(1000, 25);
            System.out.println("✓ Returned value: " + result6);
        } catch (InvalidInputException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }
        
        // TEST 7: Multiple operations with valid numbers
        System.out.println("\n\n[ TEST 7: MULTIPLE OPERATIONS - VALID ]");
        System.out.println("─".repeat(60));
        calculator.performMultipleOperations(50, 10);
        
        // TEST 8: Multiple operations with division by zero
        System.out.println("\n\n[ TEST 8: MULTIPLE OPERATIONS - DIVISION BY ZERO ]");
        System.out.println("─".repeat(60));
        calculator.performMultipleOperations(30, 0);
        
        // TEST 9: Multiple operations with negative numbers
        System.out.println("\n\n[ TEST 9: MULTIPLE OPERATIONS - NEGATIVE NUMBERS ]");
        System.out.println("─".repeat(60));
        calculator.performMultipleOperations(-15, 3);
        
        // Final explanation section
        System.out.println("\n\n╔══════════════════════════════════════════════════════════╗");
        System.out.println("║           EXCEPTION HANDLING EXPLANATION                 ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
        
        System.out.println("\n📚 KEY CONCEPTS:");
        System.out.println("─".repeat(60));
        
        System.out.println("\n1️⃣  try-catch Block:");
        System.out.println("   • 'try': Contains code that might throw an exception");
        System.out.println("   • 'catch': Handles the exception if it occurs");
        System.out.println("   • Prevents program crashes and provides graceful handling");
        
        System.out.println("\n2️⃣  ArithmeticException:");
        System.out.println("   • Built-in Java exception");
        System.out.println("   • Thrown automatically when dividing by zero");
        System.out.println("   • Part of java.lang package (unchecked exception)");
        
        System.out.println("\n3️⃣  Custom Exception (InvalidInputException):");
        System.out.println("   • Extends Exception class");
        System.out.println("   • Created for specific business rules");
        System.out.println("   • In this case: validates that numbers are non-negative");
        System.out.println("   • Checked exception (must be declared with 'throws')");
        
        System.out.println("\n4️⃣  finally Block:");
        System.out.println("   • ALWAYS executes, regardless of exceptions");
        System.out.println("   • Runs even if exception is thrown or caught");
        System.out.println("   • Perfect for cleanup operations and logging");
        System.out.println("   • In our example: prints 'End of operation' every time");
        
        System.out.println("\n5️⃣  Exception Hierarchy:");
        System.out.println("   • Throwable (top)");
        System.out.println("     ├─ Error (system errors, don't catch)");
        System.out.println("     └─ Exception");
        System.out.println("         ├─ RuntimeException (unchecked)");
        System.out.println("         │   └─ ArithmeticException");
        System.out.println("         └─ Other Exceptions (checked)");
        System.out.println("             └─ InvalidInputException (our custom)");
        
        System.out.println("\n6️⃣  Best Practices:");
        System.out.println("   ✓ Catch specific exceptions first (InvalidInputException)");
        System.out.println("   ✓ Then catch more general ones (Exception)");
        System.out.println("   ✓ Always use finally for cleanup");
        System.out.println("   ✓ Provide meaningful error messages");
        System.out.println("   ✓ Don't catch exceptions you can't handle");
        
        System.out.println("\n╔══════════════════════════════════════════════════════════╗");
        System.out.println("║    All tests completed! Check the finally blocks above.  ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
    }
}