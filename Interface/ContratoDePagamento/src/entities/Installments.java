package entities;

import java.time.LocalDate;

public class Installments {

    private Double amount;
    private LocalDate date;

    public Installments (){

    }
    public Installments (double amount, LocalDate date){
        this.amount = amount;
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }
    public Double getAmount() {
        return amount;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
