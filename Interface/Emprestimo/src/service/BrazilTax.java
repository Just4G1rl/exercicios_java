package service;

public class BrazilTax {
    private double interestRate;

    public BrazilTax(){

    }
    public BrazilTax(double interestRate){
        this.interestRate = interestRate;
    }
    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public double tax (Double amount, int month){
        return amount * Math.pow((1 + interestRate),month);
    }
}
