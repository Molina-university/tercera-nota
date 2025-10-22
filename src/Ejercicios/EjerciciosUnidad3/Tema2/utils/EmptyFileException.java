package Ejercicios.EjerciciosUnidad3.Tema2.utils;

// BONUS: Custom exception for empty files
public class EmptyFileException extends Exception {
    public EmptyFileException(String message) {
        super(message);
    }
}