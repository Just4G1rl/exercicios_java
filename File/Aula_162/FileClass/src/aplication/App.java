package aplication;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {

        String[] lines = new String[] {"Hola", "Oi", "Hello","Bonjour", "Ciao"};
        String path = "C:\\Users\\Barbara\\OneDrive\\Área de Trabalho\\Barbara\\out.txt";
        try (BufferedWriter bWriter = new BufferedWriter(new FileWriter(path))){
            for(String line : lines) {
                bWriter.write(line);
                bWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }   
}
