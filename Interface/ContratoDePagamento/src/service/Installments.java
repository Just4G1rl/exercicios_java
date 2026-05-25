package service;

import java.time.LocalDate;

import entities.Contract;

public class Installments {

    private Integer quantInstallments;
    private OnlinePaymentService paymantService;

    public Installments (int quantInstallments, OnlinePaymentService paymantService){
        this.quantInstallments = quantInstallments;
        this.paymantService = paymantService;
    }

    public double generateInstallments (Contract contract){
        
    }
    


    

}
