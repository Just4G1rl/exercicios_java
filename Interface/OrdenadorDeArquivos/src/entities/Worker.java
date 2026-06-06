package entities;

public class Worker {
    private String name;
    private Double salary;

    public Worker (){

    }
    public Worker(String name, Double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " - R$" + String.format("%.2f",salary);
    }
}
