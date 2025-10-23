package ejercicios.unidad3.tema1.utils;

public class SafeCalculator {
    public double divide(int a, int b) throws InvalidInputException {
        System.out.println("\n╔════════════════════════════════════════════════════════╗");
        System.out.println("║              PERFORMING DIVISION                       ║");
        System.out.println("╚════════════════════════════════════════════════════════╝");
        System.out.printf("  Operation: %d ÷ %d\n", a, b);
        
        double result = 0.0;
        
        try {
            if (a < 0 || b < 0) {
                throw new InvalidInputException(
                    "ERROR: Negative numbers are not allowed! (a=" + a + ", b=" + b + ")"
                );
            }
            
            result = (double) a / b;
            
            System.out.println("  Status: ✓ Success");
            System.out.printf("  Result: %.2f\n", result);
            
        } catch (ArithmeticException e) {
            System.out.println("  Status: ✗ Error");
            System.out.println("  ⚠️  ArithmeticException: Division by zero is not allowed!");
            System.out.println("  Message: " + e.getMessage());
            result = Double.NaN; 

        } catch (InvalidInputException e) {
            System.out.println("  Status: ✗ Error");
            System.out.println("  ⚠️  " + e.getMessage());
            throw e; 
            
        } finally {
            System.out.println("  " + "─".repeat(52));
            System.out.println("  ► End of operation.");
            System.out.println("╚════════════════════════════════════════════════════════╝");
        }
        
        return result;
    }
    
    public void performMultipleOperations(int a, int b) {
        System.out.println("\n╔════════════════════════════════════════════════════════╗");
        System.out.println("║         PERFORMING MULTIPLE OPERATIONS                 ║");
        System.out.println("╚════════════════════════════════════════════════════════╝");
        System.out.printf("  Numbers: a=%d, b=%d\n", a, b);
        
        try {
            if (a < 0 || b < 0) {
                throw new InvalidInputException("Negative numbers detected!");
            }
            
            System.out.println("\n  Results:");
            System.out.printf("    Addition: %d + %d = %d\n", a, b, a + b);
            System.out.printf("    Subtraction: %d - %d = %d\n", a, b, a - b);
            System.out.printf("    Multiplication: %d × %d = %d\n", a, b, a * b);
            
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