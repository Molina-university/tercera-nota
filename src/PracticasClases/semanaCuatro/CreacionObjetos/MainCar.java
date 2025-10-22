package PracticasClases.semanaCuatro.CreacionObjetos;

public class MainCar {
    public static void main(String[] args) {
        Car carro1 = new Car("totoya", 12);
        
        System.out.println("El año del carro es "+ carro1.year + ", y la marca del carro es: " + carro1.brand);

    }
}
