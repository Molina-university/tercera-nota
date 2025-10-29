package ejercicios.tarea.models;

public class Carro extends Vehiculo {
    private int numeroPuertas;
    private boolean[] puertasAbiertas;

    public Carro(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
        this.puertasAbiertas = new boolean[numeroPuertas];
        
        // Inicializar todas las puertas como cerradas
        for (int i = 0; i < numeroPuertas; i++) {
            this.puertasAbiertas[i] = false;
        }
    }

    public void abrirPuerta(int numeroPuerta) {
        if (numeroPuerta >= 1 && numeroPuerta <= numeroPuertas) {
            puertasAbiertas[numeroPuerta - 1] = true;
            System.out.println("Se abrió la puerta " + numeroPuerta);
        } else {
            System.out.println("Número de puerta inválido");
        }
    }

    public void cerrarPuerta(int numeroPuerta) {
        if (numeroPuerta >= 1 && numeroPuerta <= numeroPuertas) {
            puertasAbiertas[numeroPuerta - 1] = false;
            System.out.println("Se cerró la puerta " + numeroPuerta);
        } else {
            System.out.println("Número de puerta inválido");
        }
    }
}