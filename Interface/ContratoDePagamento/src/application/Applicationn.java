package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Contract;
import service.ContractService;
import service.OnlinePaymentService;
import service.Paypal;

public class Applicationn {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Contract contract = null;

        try{
            System.out.println("Informe os dados do contrato: ");
            System.out.print("Número: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Data (dd/mm/yyyy): ");
            LocalDate date = LocalDate.parse(scanner.nextLine(), formatter);
            System.out.print("Valor do contrato: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Informe o número de parcelas: ");
            int mounth = scanner.nextInt();
            scanner.nextLine();

            contract = new Contract(id, date, amount);
            ContractService cs = new ContractService(new Paypal()); 
            cs.processContract(contract, mounth);
            
            
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
       


    }
        
    
}
