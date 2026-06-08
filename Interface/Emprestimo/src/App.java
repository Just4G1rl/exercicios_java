import java.util.Scanner;

import service.BrazilTax;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        BrazilTax tax = new BrazilTax(0.02);

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
