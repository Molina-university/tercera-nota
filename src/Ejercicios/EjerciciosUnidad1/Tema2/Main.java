package Ejercicios.EjerciciosUnidad1.Tema2;
import Ejercicios.EjerciciosUnidad1.Tema2.Utils.Employee;

public class Main {
    public static void main(String[] args) {
        System.out.println("🏢 SISTEMA DE RECURSOS HUMANOS");
        System.out.println("=====================================\n");
        
        Employee emp1 = new Employee("Ana García", 3500.00, "Desarrolladora Senior");
        Employee emp2 = new Employee("Carlos Ruiz", 4200.00, "Gerente de Proyectos");
        
        System.out.println("📋 INFORMACIÓN DE EMPLEADOS:");
        emp1.showInfo();
        emp2.showInfo();
        
        System.out.println("\n💰 AUMENTOS SALARIALES:");
        System.out.println("─────────────────────────────────────");
        emp1.increaseSalary(500.00);
        emp2.increaseSalary(800.00);
        
        System.out.println("\n🧪 VALIDACIONES:");
        System.out.println("─────────────────────────────────────");
        emp1.increaseSalary(-100);
        emp1.setSalary(-500);
        
        System.out.println("\n📊 INFORMACIÓN ACTUALIZADA:");
        emp1.showInfo();
        emp2.showInfo();
        
        System.out.println("\n🔍 ACCESO MEDIANTE GETTERS:");
        System.out.println("─────────────────────────────────────");
        System.out.println("Nombre: " + emp1.name);
        System.out.println("Cargo:  " + emp1.getRole());
        System.out.println("Salario: $" + String.format("%.2f", emp1.getSalary()));
    }
}