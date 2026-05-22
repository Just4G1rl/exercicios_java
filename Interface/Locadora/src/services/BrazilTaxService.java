package services;

public class BrazilTaxService implements TaxService{

      public double tax (double amaunt){
        if(amaunt > 100){
            return (amaunt * 0.15);
        }else{
            return (amaunt * 0.20);
        }
    }
}
