package Ejercicios.EjerciciosUnidad3.Tema1.utils;

public class SafeCalculator {
    // Method to divide two numbers with exception handling
    public double divide(int a, int b) throws InvalidInputException {
        System.out.println("\n╔════════════════════════════════════════════════════════╗");
        System.out.println("║              PERFORMING DIVISION                       ║");
        System.out.println("╚════════════════════════════════════════════════════════╝");
        System.out.printf("  Operation: %d ÷ %d\n", a, b);
        
        double result = 0.0;
        
        try {
            // Check for negative numbers (custom exception)
            if (a < 0 || b < 0) {
                throw new InvalidInputException(
                    "ERROR: Negative numbers are not allowed! (a=" + a + ", b=" + b + ")"
                );
            }
            
            // Perform division (may throw ArithmeticException)
            result = (double) a / b;
            
            System.out.println("  Status: ✓ Success");
            System.out.printf("  Result: %.2f\n", result);
            
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("  Status: ✗ Error");
            System.out.println("  ⚠️  ArithmeticException: Division by zero is not allowed!");
            System.out.println("  Message: " + e.getMessage());
            result = Double.NaN; // Not a Number
            
        } catch (InvalidInputException e) {
            // Handle negative numbers
            System.out.println("  Status: ✗ Error");
            System.out.println("  ⚠️  " + e.getMessage());
            throw e; // Re-throw to be handled by caller
            
        } finally {
            // BONUS: This block ALWAYS executes
            System.out.println("  " + "─".repeat(52));
            System.out.println("  ► End of operation.");
            System.out.println("╚════════════════════════════════════════════════════════╝");
        }
        
        return result;
    }
    
    // Additional method with multiple operations
    public void performMultipleOperations(int a, int b) {
        System.out.println("\n╔════════════════════════════════════════════════════════╗");
        System.out.println("║         PERFORMING MULTIPLE OPERATIONS                 ║");
        System.out.println("╚════════════════════════════════════════════════════════╝");
        System.out.printf("  Numbers: a=%d, b=%d\n", a, b);
        
        try {
            // Validate inputs
            if (a < 0 || b < 0) {
                throw new InvalidInputException("Negative numbers detected!");
            }
            
            // Perform various operations
            System.out.println("\n  Results:");
            System.out.printf("    Addition: %d + %d = %d\n", a, b, a + b);
            System.out.printf("    Subtraction: %d - %d = %d\n", a, b, a - b);
            System.out.printf("    Multiplication: %d × %d = %d\n", a, b, a * b);
            
            // Division (may throw exception)
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            System.out.printf("    Division: %d ÷ %d = %.2f\n", a, b, (double) a / b);
            
            System.out.println("\n  ✓ All operations completed successfully!");
            
        } catch (ArithmeticException e) {
            System.out.println("\n  ✗ ArithmeticException: " + e.getMessage());
            
        } catch (InvalidInputException e) {
            System.out.println("\n  ✗ InvalidInputException: " + e.getMessage());
            
        } finally {
            System.out.println("  " + "─".repeat(52));
            System.out.println("  ► End of operation.");
        }
    }
}