package entity;

import java.time.Duration;
import java.time.LocalDateTime;

public class Rent {
    private String carModel;
    private LocalDateTime pickUp;
    private LocalDateTime restore;
    private Double pricePerHour;
    private Double dailyRate;


    public Rent(){

    }

    public Rent(String carModel, LocalDateTime pickUp, LocalDateTime restore, Double pricePerHour, Double dailyRate){
        this.carModel = carModel;
        this.pickUp = pickUp;
        this. restore = restore;
        this.pricePerHour = pricePerHour;
        this.dailyRate = dailyRate;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public LocalDateTime getPickUp() {
        return pickUp;
    }

    public void setPickUp(LocalDateTime pickUp) {
        this.pickUp = pickUp;
    }

    public LocalDateTime getRestore() {
        return restore;
    }

    public void setRestore(LocalDateTime restore) {
        this.restore = restore;
    }

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(Double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public double basicPayment(){
        Duration duration = Duration.between(pickUp, restore);
        double minutes = duration.toMinutes(); 
        if(duration.toHours() <= 12){
           return Math.ceil(minutes / 60) * pricePerHour;
        }else{
            return Math.ceil(minutes/ 1440.0) * dailyRate;
        }
    }

    public double tax(){
        if(basicPayment() > 100){
            return (basicPayment() *0.15);
        }else{
            return (basicPayment() *0.20);
        }
    }

    public double total(){
        return basicPayment() + tax();
    }

    public String invois(){
        return String.format("INVOICE: %nBasic payment: R$%.2f%nTax: R$%.2f%nTotal paymant: R$%.2f", basicPayment(), tax(), total());
    }
}
