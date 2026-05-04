package aplication;

import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = scn.nextLine();
        
        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        boolean success = new File(strPath + "\\Teste").mkdir();
        if (success) {
            System.out.println("Directory created successfully!");
        } else {
            System.out.println("Failed to create directory.");
        }
    }   
}
