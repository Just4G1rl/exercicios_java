package entities;

import java.time.LocalDate;

public class Contract {
    private int id;
    private LocalDate date;
    private double totalValue;
    
    public Contract (){

    }
    public Contract(int id, LocalDate date, double totalValue){
        this.id = id;
        this.date = date;
        this.totalValue = totalValue;
    }

    public LocalDate getDate() {
        return date;
    }
    public int getId() {
        return id;
    }
    public double getTotalValue() {
        return totalValue;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }
}
