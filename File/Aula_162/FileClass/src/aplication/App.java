package aplication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class App {
    public static void main(String[] args) {
        List <Product> list = new ArrayList<>();
        String path = "C:\\Users\\Barbara\\OneDrive\\Área de Trabalho\\Barbara\\itens.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] product = line.split(",");
                String name = product[0];
                double price = Double.parseDouble(product[1]);
                int quantity = Integer.parseInt(product[2]);
                list.add(new Product(name, quantity, price));
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        path = "C:\\Users\\Barbara\\OneDrive\\Área de Trabalho\\Barbara\\out.csv";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            for(Product p : list){
                String text = String.format(Locale.US,"%s , %.2f", p.getNome(), p.totalValue());
                bw.write(text);
                bw.newLine();
            }
        } catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }   
}
