package services;

public class BrazilTaxService {

      public double tax(Double amaunt){
        if(amaunt > 100){
            return (amaunt * 0.15);
        }else{
            return (amaunt * 0.20);
        }
    }
}
