import java.util.Scanner;

import service.BrazilTaxService;
import service.TaxService;
import service.USATaxService;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //Informar o valor da taixa entre 1.00 e 0.00.
        TaxService tax = new USATaxService(0.01);

        System.out.print("Amount:");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Months:");
        int month = scanner.nextInt();
        System.out.printf("Paymant after %d months: ", month);
        System.out.println(String.format("%.2f", tax.tax(amount, month)));
        scanner.close();

    }
}
