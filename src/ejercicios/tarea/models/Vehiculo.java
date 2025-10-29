package ejercicios.tarea.models;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int velocidadActual;
    private boolean encendido;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = 0;
        this.encendido = false;
    }

    public void acelerar() {
        if (this.encendido) {
            this.velocidadActual += 10;
            System.out.println("Velocidad aumentada a " + velocidadActual);
        } else {
            System.out.println("El vehículo está apagado");
        }
    }

    public void frenar() {
        if (velocidadActual > 0) {
            velocidadActual -= 5;
            System.out.println("Velocidad reducida a " + velocidadActual);
        } else {
            System.out.println("El vehículo ya está detenido");
        }
    }

    // Getters y setters
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    
    public int getVelocidadActual() { return velocidadActual; }
    public void setVelocidadActual(int velocidadActual) { 
        this.velocidadActual = Math.max(0, velocidadActual); 
    }
    
    public boolean isEncendido() { return encendido; }
    public void setEncendido(boolean encendido) { this.encendido = encendido; }
}
