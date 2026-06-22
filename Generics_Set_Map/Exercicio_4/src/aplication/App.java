package aplication;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import service.LogAccess;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<LogAccess> access = new HashSet<>();

        System.out.println("Enter file full path:");
        String path = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String[] line = br.readLine().split(" ");
    
            while (line != null) {
            access.add(new LogAccess(line[0],Instant.parse(line[1]))); 
            line = br.readLine().split(" ");   
            }
        } catch (FileNotFoundException e) {
            System.out.println("Erro: Aquivo inexixtente!");
        } catch(IOException e){
            System.out.println("Erro: "+ e.getStackTrace());
        }
        System.out.println("Total users: ");
        System.out.println(access.size());

        scanner.close();
    }
}
