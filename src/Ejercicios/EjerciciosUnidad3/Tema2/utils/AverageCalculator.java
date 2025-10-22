package Ejercicios.EjerciciosUnidad3.Tema2.utils;

public class AverageCalculator {
// AverageCalculator class to handle mathematical operations

    
    // Method to calculate average with zero division check
    public double calculate(int total, int count) throws ArithmeticException {
        System.out.println("\n╔════════════════════════════════════════════════════════╗");
        System.out.println("║           CALCULATING AVERAGE                          ║");
        System.out.println("╚════════════════════════════════════════════════════════╝");
        System.out.printf("  Total: %d\n", total);
        System.out.printf("  Count: %d\n", count);
        
        // Check for division by zero BEFORE attempting division
        if (count == 0) {
            System.out.println("  Status: ✗ Error");
            throw new ArithmeticException("Cannot calculate average: count is zero (division by zero)!");
        }
        
        double average = (double) total / count;
        System.out.println("  Status: ✓ Success");
        System.out.printf("  Average: %.2f\n", average);
        
        return average;
    }
    
    // Method to calculate average from array
    public double calculateFromArray(int[] numbers) throws ArithmeticException {
        if (numbers == null || numbers.length == 0) {
            throw new ArithmeticException("Cannot calculate average: no numbers provided!");
        }
        
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        
        return calculate(total, numbers.length);
    }
    
    // Method to find statistics
    public void showStatistics(int[] numbers) {
        System.out.println("\n╔════════════════════════════════════════════════════════╗");
        System.out.println("║              DATA STATISTICS                           ║");
        System.out.println("╚════════════════════════════════════════════════════════╝");
        
        if (numbers == null || numbers.length == 0) {
            System.out.println("  No data available.");
            return;
        }
        
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
        
        for (int num : numbers) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }
        
        double average = (double) sum / numbers.length;
        
        System.out.println("  Count: " + numbers.length);
        System.out.println("  Sum: " + sum);
        System.out.printf("  Average: %.2f\n", average);
        System.out.println("  Minimum: " + min);
        System.out.println("  Maximum: " + max);
    }
}
