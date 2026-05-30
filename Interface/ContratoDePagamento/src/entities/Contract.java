package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private int id;
    private LocalDate date;
    private double totalValue;

    private List<Installments> installments;

    public Contract (){

    }
    public Contract(int id, LocalDate date, double totalValue){
        this.id = id;
        this.date = date;
        this.totalValue = totalValue;
        this.installments = new ArrayList<>();
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
    public List<Installments> getInstallments() {
        return installments;
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
    public void addInstallments(Installments installment){
        this.installments.add(installment);
    }
    public void removeInstallments(Installments installment){
        this.installments.remove(installment);  
    }
}
