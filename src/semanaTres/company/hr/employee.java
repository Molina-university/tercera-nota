package semanaTres.company.hr;

public class employee {
    
    public String name;
    private double salary;
    protected String role;


    public employee (String name, double salary, String role){

        this.name = name;
        this.salary = salary;
        this.role = role;
    }   

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public double getsalary() {
        return salary;
    }

    public void setsalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("\"Your salary must be greater than 0.\" ");
        }
    }
    
}   