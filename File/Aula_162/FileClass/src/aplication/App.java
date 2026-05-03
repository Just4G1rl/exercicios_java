package aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        String path = "C:\\Users\\Barbara\\OneDrive\\Área de Trabalho\\Barbara\\temp.txt";
        try (BufferedReader buffer = new BufferedReader(new FileReader(path))){
            String line = buffer.readLine();
            while (line != null) {
                System.out.println(line);
                line = buffer.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }   
}
