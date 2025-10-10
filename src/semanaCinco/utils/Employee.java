package semanaCinco.utils;

public class Employee {
    public String role;

    public void ShowResponsibilities() {
        switch (role) {
            case "manager":
                System.out.println("Manager: maneja a la gente.");
                break;
            
            case "developer":
                System.out.println("Developer: escribe codigo.");
                break;
            
            case "designer":
                System.out.println("Designer: diseña ui/ux.");
                break;

            default:
                System.out.println("No conocido.");
                break;
        }
    }

}