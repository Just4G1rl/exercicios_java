import java.util.Scanner;

import service.PrintService;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintService ps = new PrintService();
        
        System.out.print("How many values? ");
        int quant = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < quant; i++){
            ps.addValue(scanner.nextInt());
        }
        ps.print();
        System.out.print("First: " + ps.fist());

        scanner.close();

    }
}
