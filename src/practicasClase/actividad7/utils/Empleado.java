package practicasClase.actividad7.utils;

public class Empleado {
    protected String nombre;
    protected double salarioBase;
    protected Direccion direccion;

    public Empleado(String nombre, double salarioBase, Direccion direccion) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.direccion = direccion;

    }

    public double calcularPago() {
        return salarioBase;
    }

    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre + "Direccion: " + direccion + " | salario base: $" + salarioBase);
    }

}