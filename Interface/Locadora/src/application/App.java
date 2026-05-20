package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

import entities.CarRental;
import entities.Vehicle;
import services.BrazilTaxService;
import services.RentalService;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        CarRental rent = null;
        RentalService rentalService = null;

        try{
            System.out.println("Informe os dados para aluguel:");
            System.out.print("Modelo do carro: ");
            String model = scn.nextLine();
            System.out.print("Data de retirada (dd/MM/aaaa HH:mm): ");
            LocalDateTime start = LocalDateTime.parse(scn.nextLine(), fmt);
            System.out.print("Data de retorno (dd/MM/aaaa HH:mm): ");
            LocalDateTime finish = LocalDateTime.parse(scn.nextLine(), fmt);
            rent = new CarRental(start, finish, new Vehicle(model));
            System.out.print("Informe o valor por hora: ");
            Double pricePerHour = scn.nextDouble();
            scn.nextLine();
            System.out.print("Informe o valor por dia: ");
            Double pricePerDay = scn.nextDouble();
            scn.nextLine();
            rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
            rentalService.processInvoice(rent);

        }catch(InputMismatchException e){
            System.out.println("Erro:" + e.getMessage());
        }

        System.out.println("Fatura:");
        System.out.println("Pagameto básico: R$" + rent.getInvoice().getBasicPayment());
        System.out.println("Imposto: R$" + rent.getInvoice().getTax());
        System.out.println("Pagamento total: R$" + rent.getInvoice().getTotalPaymant());

        scn.close();
    }

}
