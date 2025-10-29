package ejercicios.tarea.models;

public class Moto extends Vehiculo {
    private boolean estaHaciendoWheelie;

    public Moto(String marca, String modelo) {
        super(marca, modelo);
        this.estaHaciendoWheelie = false;
    }

    public void hacerWheelie() {
        if (getVelocidadActual() >= 30) {
            estaHaciendoWheelie = true;
            System.out.println("¡La moto está haciendo wheelie!");
        } else {
            System.out.println("La velocidad debe ser mayor o igual a 30 km/h para hacer wheelie");
        }
    }

    public void detenerWheelie() {
        estaHaciendoWheelie = false;
        System.out.println("El wheelie se detuvo");
    }
}