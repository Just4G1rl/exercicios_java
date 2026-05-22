package services;

import java.time.Duration;

import entities.CarRental;
import entities.Invoice;

public class RentalService {
    private Double pricePerHour;
    private Double pricePerDay;
    private TaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService){
       this.pricePerHour = pricePerHour;
       this.pricePerDay = pricePerDay;
       this.taxService = taxService; 
    }
    
    public void processInvoice(CarRental carRental){
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hour = minutes / 60; 
        double basicPayment = 0.00;
        if(hour <= 12.0){   
            basicPayment = (Math.ceil(hour) * pricePerHour);
        }else{
            basicPayment = Math.ceil(hour/ 24) * pricePerDay;
        } 

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment,tax));
    }
}
