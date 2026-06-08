package service;

public class BrazilTaxService implements TaxService{
    private double interestRate;

    public BrazilTaxService(){

    }
    public BrazilTaxService(double interestRate){
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
