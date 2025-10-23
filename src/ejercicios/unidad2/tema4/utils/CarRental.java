package ejercicios.unidad2.tema4.utils;

import java.util.ArrayList;

public class CarRental {
    private ArrayList<Car> cars;
    
    public CarRental() {
        cars = new ArrayList<>();
    }
    
    public void addCar(Car c) {
        cars.add(c);
        System.out.println("  ✓ Car added: " + c.getModel());
    }
    
    public void showAvailableCars() {
        System.out.println("\n╔════════════════════════════════════════════════════════╗");
        System.out.println("║              AVAILABLE CARS FOR RENT                   ║");
        System.out.println("╚════════════════════════════════════════════════════════╝");
        
        int count = 0;
        
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
    
    public void showAllCars() {
        System.out.println("\n╔════════════════════════════════════════════════════════╗");
        System.out.println("║                   ALL CARS IN FLEET                    ║");
        System.out.println("╚════════════════════════════════════════════════════════╝");
        
        if (cars.isEmpty()) {
            System.out.println("  No cars in the system.");
            return;
        }
        
        for (int i = 0; i < cars.size(); i++) {
            cars.get(i).showInfo();
        }
        
        System.out.println("\nTotal cars in fleet: " + cars.size());
    }
    
    public void calculateTotal(Car c, int days) {
        System.out.println("\n╔════════════════════════════════════════════════════════╗");
        System.out.println("║              RENTAL CALCULATION                        ║");
        System.out.println("╚════════════════════════════════════════════════════════╝");
        
        System.out.println("  Car Model: " + c.getModel());
        System.out.println("  Days: " + days);
        System.out.println("  Price per Day: $" + c.getPricePerDay());
        
        if (c.isAvailable()) {
            double total = c.getPricePerDay() * days;
            System.out.println("  Status: Available ✓");
            System.out.println("  " + "─".repeat(50));
            System.out.printf("  TOTAL COST: $%.2f\n", total);
            
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
        
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            if (car.getModel().equalsIgnoreCase(model)) {
                System.out.println("  ✓ Car found!");
                return car;
            }
        }
        
        System.out.println("  ✗ Car not found.");
        return null;
    }
    
    public int getTotalCars() {
        return cars.size();
    }
    
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