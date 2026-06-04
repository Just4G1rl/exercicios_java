import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void  main(String[] args) {
        String path = "C:\\Users\\Barbara\\OneDrive\\Área de Trabalho\\Barbara\\Estudos\\Java\\Interface\\OrdenadorDeArquivos\\resources\\input.txt";
        List<String> nameList = new ArrayList<>();

        try(BufferedReader buffer = new BufferedReader(new FileReader(path))){
            String line = buffer.readLine();
            while (line != null) {
                nameList.add(line);
                line = buffer.readLine();
            }
        }catch(IOException e){
            System.out.println(e.getStackTrace());
        }

        for(String name : nameList){
            System.out.println(name);
        }
        System.out.println();
    }
}
