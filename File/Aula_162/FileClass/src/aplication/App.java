package aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        String path = "\"C:\\\\Users\\\\Barbara\\\\OneDrive\\\\Área de Trabalho\\\\Barbara\\\\temp.txt\"";
        FileReader fr = null;
        BufferedReader br = null;
        
        //Verificando se é possível abrir o arquivo
        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);
            
            String line = br.readLine();

            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        //Antes de fechar os arquivo, deve verificar se estão abertos para não gerrar nenhum erro.
        finally{
            try{
                if(fr != null){
                    fr.close();
                }
                if(br != null){
                    br.close();
                }
            }catch(IOException e){
                System.out.println(e.getStackTrace());
            }
        }

    }   
