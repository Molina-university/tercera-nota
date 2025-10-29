package ejercicios.tarea;
import ejercicios.tarea.models.Carro;
import ejercicios.tarea.models.Moto;


public class App {
    public static void main(String[] args) {
        // Crear un carro
        Carro miCarro = new Carro("Toyota", "Corolla", 4);
        
        // Demostrar funcionalidades del carro
        miCarro.acelerar();
        miCarro.abrirPuerta(1);
        miCarro.frenar();

        // Crear una moto
        Moto miMoto = new Moto("Honda", "CBR500R");
        
        // Demostrar funcionalidades de la moto
        miMoto.acelerar();  // Aumentará la velocidad
        miMoto.acelerar();  // Otra vez para llegar a 20
        miMoto.acelerar();  // Una más para llegar a 30
        miMoto.hacerWheelie();  // Ahora puede hacer wheelie
        miMoto.detenerWheelie();
        miMoto.frenar();
    }
}