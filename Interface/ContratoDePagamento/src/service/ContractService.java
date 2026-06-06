package service;

import java.time.LocalDate;

import entities.Contract;
import entities.Installments;

public class ContractService {
    private OnlinePaymentService paymentService;

    public ContractService (OnlinePaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract, int month){
        double amount = contract.getTotalValue() / month;
        for(int i = 1; i <= month; i++){
            double fees = paymentService.simpleInterest(amount, i);
            double tax = paymentService.paymantTax(amount + fees);
            Double value = amount + fees + tax;
            LocalDate date = contract.getDate().plusMonths(i);
            contract.addInstallments(new Installments(value, date));
        }
    }

    
}
