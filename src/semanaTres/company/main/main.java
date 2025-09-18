package semanaTres.company.main;

import semanaTres.company.hr.Employee;

public class Main {
    public static void Main(String[] args) {
        System.out.println("=== Employee Management System ===\n");

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        employee1.name = "John Smith";
        employee1.setRole("Software Developer");
        employee1.setSalary(75000.0);

        employee2.name = "Maria Garcia";
        employee2.setRole("Project Manager");
        employee2.setSalary(85000.0);

        System.out.println("Initial Employee Information:");
        System.out.println("Employee 1 - Name: " + employee1.name + 
                         ", Role: " + employee1.getRole() + 
                         ", Salary: $" + employee1.getSalary());
        
        System.out.println("Employee 2 - Name: " + employee2.name + 
                         ", Role: " + employee2.getRole() + 
                         ", Salary: $" + employee2.getSalary());
        
        System.out.println("\n" + "=".repeat(40));

        employee1.displayInfo();
        employee2.displayInfo();

        System.out.println("Testing salary validation:");
        employee1.setSalary(-1000); 
        employee1.setSalary(80000);  
        
        System.out.println("\n" + "=".repeat(40));
        
        System.out.println("Testing salary increase:");
        employee1.increaseSalary(5000);  
        employee2.increaseSalary(-2000); // Invalid increase
        employee2.increaseSalary(7500); 
        
        System.out.println("\nFinal Employee Information:");
        employee1.displayInfo();
        employee2.displayInfo();
    }
}