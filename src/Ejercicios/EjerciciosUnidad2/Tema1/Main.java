package Ejercicios.EjerciciosUnidad2.Tema1;
import Ejercicios.EjerciciosUnidad2.Tema1.utils.Package;

public class Main {
    
    public static void changeWeight(Package p, double newWeight) {
        p.setWeight(newWeight);
        System.out.println("\n[Inside changeWeight method]");
        p.showPackage();
    }
    
    public static void main(String[] args) {
        System.out.println("=== PACKAGE DELIVERY SYSTEM - TESTING OBJECT REFERENCES ===\n");
        
        Package p1 = new Package("TRK-12345", 5.5);
        System.out.println("1. Created package p1:");
        p1.showPackage();
        
        Package p2 = p1;
        System.out.println("\n2. Created reference p2 = p1");
        System.out.println("   p2 now points to the same object as p1");
        
        System.out.println("\n3. Changing weight to 8.3 kg using p2...");
        p2.setWeight(8.3);
        
        System.out.println("\n4. Displaying both references:");
        System.out.print("   p1: ");
        p1.showPackage();
        System.out.print("   p2: ");
        p2.showPackage();
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("EXPLANATION:");
        System.out.println("=".repeat(60));
        System.out.println("Both p1 and p2 show the SAME data because:");
        System.out.println("• p1 and p2 are REFERENCES (like pointers) to the same object");
        System.out.println("• When we write 'Package p2 = p1', we DON'T create a new Package");
        System.out.println("• Instead, p2 becomes another reference to the SAME object in memory");
        System.out.println("• Any change through p2 affects the object that p1 also references");
        System.out.println("• Think of it as two remote controls (p1, p2) for the same TV");
        System.out.println("=".repeat(60));
        
        System.out.println("\n=== BONUS: TESTING METHOD PARAMETER PASSING ===\n");
        
        Package p3 = new Package("TRK-67890", 3.2);
        System.out.println("Created package p3:");
        p3.showPackage();
        
        System.out.println("\nCalling changeWeight(p3, 10.5)...");
        changeWeight(p3, 10.5);
        
        System.out.println("\n[Back in main method]");
        System.out.print("p3 after method call: ");
        p3.showPackage();
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("BONUS EXPLANATION:");
        System.out.println("=".repeat(60));
        System.out.println("The original reference p3 WAS affected because:");
        System.out.println("• Java passes objects by 'reference value' (copy of the reference)");
        System.out.println("• The method receives a COPY of the reference, but it points to");
        System.out.println("  the SAME object in memory");
        System.out.println("• Changes to the object's attributes ARE visible outside the method");
        System.out.println("• However, reassigning the parameter inside the method would NOT");
        System.out.println("  affect the original reference (only the copy would change)");
        System.out.println("=".repeat(60));
    }
}