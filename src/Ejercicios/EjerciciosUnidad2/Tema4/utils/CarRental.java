package Ejercicios.EjerciciosUnidad2.Tema4.utils;

import java.util.ArrayList;

public class CarRental {
    private ArrayList<Car> cars;
    
    // Constructor
    public CarRental() {
        cars = new ArrayList<>();
    }
    
    // Method to add a car to the fleet
    public void addCar(Car c) {
        cars.add(c);
        System.out.println("  ✓ Car added: " + c.getModel());
    }
    
    // Method to show only available cars using for-each loop
    public void showAvailableCars() {
        System.out.println("\n╔════════════════════════════════════════════════════════╗");
        System.out.println("║              AVAILABLE CARS FOR RENT                   ║");
        System.out.println("╚════════════════════════════════════════════════════════╝");
        
        int count = 0;
        
        // Using for-each loop
        for (Car car : cars) {
            if (car.isAvailable()) {
                car.showInfo();
                count++;
            }
        }
        
        if (count == 0) {
            System.out.println("  No cars available at the moment.");
        } else {
            System.out.println("\nTotal available cars: " + count);
        }
    }
    
    // Method to show all cars using traditional for loop
    public void showAllCars() {
        System.out.println("\n╔════════════════════════════════════════════════════════╗");
        System.out.println("║                   ALL CARS IN FLEET                    ║");
        System.out.println("╚════════════════════════════════════════════════════════╝");
        
        if (cars.isEmpty()) {
            System.out.println("  No cars in the system.");
            return;
        }
        
        // Using traditional for loop
        for (int i = 0; i < cars.size(); i++) {
            cars.get(i).showInfo();
        }
        
        System.out.println("\nTotal cars in fleet: " + cars.size());
    }
    
    // Method to calculate total rental price
    public void calculateTotal(Car c, int days) {
        System.out.println("\n╔════════════════════════════════════════════════════════╗");
        System.out.println("║              RENTAL CALCULATION                        ║");
        System.out.println("╚════════════════════════════════════════════════════════╝");
        
        System.out.println("  Car Model: " + c.getModel());
        System.out.println("  Days: " + days);
        System.out.println("  Price per Day: $" + c.getPricePerDay());
        
        // Check if car is available
        if (c.isAvailable()) {
            double total = c.getPricePerDay() * days;
            System.out.println("  Status: Available ✓");
            System.out.println("  " + "─".repeat(50));
            System.out.printf("  TOTAL COST: $%.2f\n", total);
            
            // Mark car as rented
            c.setAvailable(false);
            System.out.println("\n  ✓ Car successfully rented!");
            System.out.println("  The car is now marked as unavailable.");
        } else {
            System.out.println("  Status: Not Available ✗");
            System.out.println("\n  ✗ ERROR: This car is already rented.");
            System.out.println("  Please choose another vehicle.");
        }
    }

    public Car searchCar(String model) {
        System.out.println("\n🔍 Searching for car: " + model);
        
        // Using for loop to search
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            // Case-insensitive search
            if (car.getModel().equalsIgnoreCase(model)) {
                System.out.println("  ✓ Car found!");
                return car;
            }
        }
        
        // If not found
        System.out.println("  ✗ Car not found.");
        return null;
    }
    
    // Additional method to get total number of cars
    public int getTotalCars() {
        return cars.size();
    }
    
    // Method to count available cars
    public int countAvailableCars() {
        int count = 0;
        for (Car car : cars) {
            if (car.isAvailable()) {
                count++;
            }
        }
        return count;
    }
}