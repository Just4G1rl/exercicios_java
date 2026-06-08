package service;

public class USATaxService implements TaxService{
    private double interestRate;

    public USATaxService(){

    }
    public USATaxService(double interestRate){
        this.interestRate = interestRate;
    }
    @Override
    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
