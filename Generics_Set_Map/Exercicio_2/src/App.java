import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;
import service.CalculationService;

public class App {
    public static void main(String[] args) {
        List<Product> listProduct = new ArrayList<>();
        String path = "C:\\Users\\Barbara\\OneDrive\\Área de Trabalho\\Barbara\\Estudos\\Java\\Generics_Set_Map\\Exercicio_2\\resource\\input.txt";

        try(BufferedReader bReader = new BufferedReader(new FileReader(path))){
            String line = bReader.readLine();
            while (line != null) {
                String[] data = line.split(",");
                listProduct.add(new Product(data[0], Double.parseDouble(data[1])));
                line = bReader.readLine();   
            }
        }catch(IOException e){
            System.out.println("Erro: "+e.getStackTrace());
        }

        Product x = CalculationService.max(listProduct);
        System.out.println("Most Expensive: ");
        System.out.println(x.toString());
    }
}
