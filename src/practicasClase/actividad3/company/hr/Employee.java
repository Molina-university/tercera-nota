package practicasClase.actividad3.company.hr;

public class Employee {
    public String name;
    private double salary;
    protected String role;

    public Employee() {
        this.name = "";
        this.salary = 0.0;
        this.role = "";
    }

    public Employee(String name, double salary, String role) {
        this.name = name;
        setSalary(salary); 
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Error: Salary must be greater than 0. Current salary unchanged.");
        }
    }

    public String getRole() {
        return role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }

    public void increaseSalary(double amount) {
        if (amount > 0) {
            this.salary += amount;
            System.out.println("Salary increased by $" + amount + ". New salary: $" + this.salary);
        } else {
            System.out.println("Error: Amount must be positive. Salary unchanged.");
        }
    }

    public void displayInfo() {
        System.out.println("Employee Information:");
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Salary: $" + salary);
        System.out.println("------------------------");
    }
}