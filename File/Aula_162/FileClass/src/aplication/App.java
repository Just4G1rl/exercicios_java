package aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        String path = "C:\\Users\\Barbara\\OneDrive\\Área de Trabalho\\Barbara\\temp.txt";
        FileReader file = null;
        BufferedReader buffer = null;

        try {
            file = new FileReader(path);
            buffer = new BufferedReader(file);

            String line = buffer.readLine();
            while (line != null) {
                System.out.println(line);
                line = buffer.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (buffer != null) {
                    buffer.close();
                }
                if (file != null) {
                    file.close();
                }
            } catch (IOException e) {
                System.out.println("Error ao fechar o arquivo: " + e.getMessage());
            }
        }  
    }   
}
