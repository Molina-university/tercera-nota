package Ejercicios.EjerciciosUnidad3.Tema2.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataLoader {
    
    public String loadFile(String filename) throws IOException, EmptyFileException {
        System.out.println("\n╔════════════════════════════════════════════════════════╗");
        System.out.println("║              LOADING FILE                              ║");
        System.out.println("╚════════════════════════════════════════════════════════╝");
        System.out.println("  Filename: " + filename);
        
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        StringBuilder content = new StringBuilder();
        
        try {
            fileReader = new FileReader(filename);
            bufferedReader = new BufferedReader(fileReader);
            
            System.out.println("  Status: ✓ File opened successfully");
            
            String line;
            int lineCount = 0;
            
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line).append("\n");
                lineCount++;
            }
            
            if (lineCount == 0) {
                throw new EmptyFileException("File '" + filename + "' is empty! No data to process.");
            }
            
            System.out.println("  Lines read: " + lineCount);
            System.out.println("  ✓ File loaded successfully!");
            
            return content.toString();
            
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }
                System.out.println("  ► Resources closed.");
            } catch (IOException e) {
                System.out.println("  ⚠️  Warning: Error closing file resources");
            }
        }
    }
    
    public int[] loadNumbersFromFile(String filename) throws IOException, EmptyFileException, InvalidDataFormatException {
        String content = loadFile(filename);
        String[] lines = content.trim().split("\n");
        int[] numbers = new int[lines.length];
        
        try {
            for (int i = 0; i < lines.length; i++) {
                numbers[i] = Integer.parseInt(lines[i].trim());
            }
            return numbers;
        } catch (NumberFormatException e) {
            throw new InvalidDataFormatException("File contains invalid number format!");
        }
    }
}