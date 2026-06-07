package service;

public class Paypal implements OnlinePaymentService {
    
    public double paymantTax (double amount){
        return amount * 0.02;
    }
    public double simpleInterest (double amount,int month ){
        return amount * 0.01 * month;
    }
}
