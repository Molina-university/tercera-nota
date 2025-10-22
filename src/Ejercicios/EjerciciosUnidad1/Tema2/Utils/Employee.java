package Ejercicios.EjerciciosUnidad1.Tema2.Utils;

public class Employee {
    public String name;
    private double salary;
    protected String role;
    
    public Employee(String name, double salary, String role) {
        this.name = name;
        this.role = role;
        setSalary(salary);
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("❌ Error: El salario debe ser mayor a 0");
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
            System.out.println("✅ Aumento aplicado a " + name);
            System.out.println("   Nuevo salario: $" + String.format("%.2f", salary));
        } else {
            System.out.println("❌ El aumento debe ser mayor a 0");
        }
    }
    
    public void showInfo() {
        System.out.println("\n═══════════════════════════════════════");
        System.out.println("👤 " + name);
        System.out.println("───────────────────────────────────────");
        System.out.println("Cargo:    " + role);
        System.out.println("Salario:  $" + String.format("%.2f", salary));
        System.out.println("═══════════════════════════════════════");
    }
}