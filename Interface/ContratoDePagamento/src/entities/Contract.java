package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private int id;
    private LocalDate date;
    private double totalValue;

    private List<Installments> installments = new ArrayList<>();

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
    public List<Installments> getInstallments() {
        return installments;
    }

    public String getListInstallments() {
        StringBuilder sb = new StringBuilder();
        for(Installments i: installments){
            sb.append(i.toString()).append("\n");
        }
        return sb.toString();
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
