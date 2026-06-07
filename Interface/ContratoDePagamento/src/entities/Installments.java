package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installments {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

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

    @Override
    public String toString() {
        return date.format(formatter) + " - " + String.format("%.2f", amount);
    }
}
