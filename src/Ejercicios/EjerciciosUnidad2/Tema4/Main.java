package Ejercicios.EjerciciosUnidad2.Tema4;

import Ejercicios.EjerciciosUnidad2.Tema4.utils.Car;
import Ejercicios.EjerciciosUnidad2.Tema4.utils.CarRental;

public class Main {
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║         CAR RENTAL MANAGEMENT SYSTEM v1.0                ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
        
        // Create CarRental system
        CarRental rental = new CarRental();
        
        // Step 1: Add cars to the system
        System.out.println("\n[ STEP 1: ADDING CARS TO FLEET ]");
        System.out.println("─".repeat(60));
        rental.addCar(new Car("Toyota Corolla 2024", 45.00, true));
        rental.addCar(new Car("Honda Civic 2024", 50.00, true));
        rental.addCar(new Car("Ford Mustang GT", 120.00, true));
        rental.addCar(new Car("Tesla Model 3", 95.00, false)); // Already rented
        rental.addCar(new Car("BMW X5 2024", 150.00, true));
        rental.addCar(new Car("Mercedes-Benz C-Class", 130.00, true));
        rental.addCar(new Car("Chevrolet Malibu", 48.00, false)); // Already rented
        
        // Step 2: Show all cars
        System.out.println("\n[ STEP 2: DISPLAYING ALL CARS ]");
        System.out.println("─".repeat(60));
        rental.showAllCars();
        
        // Step 3: Show only available cars
        System.out.println("\n[ STEP 3: DISPLAYING AVAILABLE CARS ]");
        System.out.println("─".repeat(60));
        rental.showAvailableCars();
        
        // Step 4: Simulate a rental - Search and rent
        System.out.println("\n\n[ STEP 4: SIMULATING CAR RENTAL ]");
        System.out.println("─".repeat(60));
        
        // First rental
        Car foundCar = rental.searchCar("Honda Civic 2024");
        if (foundCar != null) {
            rental.calculateTotal(foundCar, 5);
        }
        
        // Second rental
        System.out.println("\n" + "─".repeat(60));
        Car mustang = rental.searchCar("Ford Mustang GT");
        if (mustang != null) {
            rental.calculateTotal(mustang, 3);
        }
        
        // Step 5: Try to rent an already rented car
        System.out.println("\n\n[ STEP 5: ATTEMPTING TO RENT UNAVAILABLE CAR ]");
        System.out.println("─".repeat(60));
        Car tesla = rental.searchCar("Tesla Model 3");
        if (tesla != null) {
            rental.calculateTotal(tesla, 7);
        }
        
        // Step 6: Show updated available cars
        System.out.println("\n\n[ STEP 6: UPDATED AVAILABLE CARS ]");
        System.out.println("─".repeat(60));
        rental.showAvailableCars();
        
        // BONUS: Search for non-existent car
        System.out.println("\n\n[ BONUS: SEARCHING FOR NON-EXISTENT CAR ]");
        System.out.println("─".repeat(60));
        Car notFound = rental.searchCar("Lamborghini Aventador");
        if (notFound == null) {
            System.out.println("  Suggestion: Please check available models.");
        }
        
        // Final Statistics
        System.out.println("\n\n╔══════════════════════════════════════════════════════════╗");
        System.out.println("║                   SYSTEM STATISTICS                      ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
        System.out.println("  Total cars in fleet: " + rental.getTotalCars());
        System.out.println("  Available cars: " + rental.countAvailableCars());
        System.out.println("  Rented cars: " + (rental.getTotalCars() - rental.countAvailableCars()));
        
        System.out.println("\n╔══════════════════════════════════════════════════════════╗");
        System.out.println("║            Thank you for using our system!               ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
    }
}