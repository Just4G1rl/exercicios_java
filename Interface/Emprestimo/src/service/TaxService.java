package service;

import java.security.InvalidParameterException;

public interface TaxService {
    public double getInterestRate();
    
     default double tax (Double amount, int month){
        if(month < 1){
              throw new InvalidParameterException("Mounths must be greater than zero!");
        }
        return amount * Math.pow((1 + getInterestRate()),month);
    }
} 
   