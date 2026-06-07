import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import entities.Worker;

public class App {

    public static void  main(String[] args) {
        String path = "C:\\Users\\Barbara\\OneDrive\\Área de Trabalho\\Barbara\\Estudos\\Java\\Interface\\OrdenadorDeArquivos\\resources\\input.csv";
        List<Worker> workerList = new ArrayList<>();

        try(BufferedReader buffer = new BufferedReader(new FileReader(path))){
            //Lendo o arquivo e marmazenando os nomes em uma lista
            String line = buffer.readLine();
            while (line != null) {
                String[] dados = line.split(",");
                workerList.add(new Worker(dados[0], Double.parseDouble(dados[1])));
                line = buffer.readLine();
            }
        }catch(IOException e){
            System.out.println(e.getStackTrace());
        }

        //Realizando a comparação entre os nomes atravez de espressão lambda
        Collections.sort(workerList);

        for(Worker worker : workerList){
            System.out.println(worker.toString());
        }
        System.out.println();
    }
}
