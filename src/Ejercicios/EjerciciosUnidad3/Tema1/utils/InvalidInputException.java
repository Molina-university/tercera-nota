package Ejercicios.EjerciciosUnidad3.Tema1.utils;

// Custom exception for invalid input (negative numbers)
public class InvalidInputException extends Exception {
    public InvalidInputException() {
        super();
    }

    public InvalidInputException(String message) {
        super(message);
    }

    public InvalidInputException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidInputException(Throwable cause) {
        super(cause);
    }
}