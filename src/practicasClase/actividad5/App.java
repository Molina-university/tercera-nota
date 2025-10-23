package practicasClase.actividad5;
import practicasClase.actividad5.utils.Student;

public class App {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 2.5);
        Student student2 = new Student("Bob", 2.0);

        System.out.println("Student 1: " + student1.name + ", Grade: " + student1.grade);
        System.out.println("Student 2: " + student2.name + ", Grade: " + student2.grade);

    }
}