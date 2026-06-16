package entities;

public class Retangle implements Shape{
    private Double base;
    private Double height;
    
    public Retangle() {
    }

    public Retangle(Double base, Double height) {
        this.base = base;
        this.height = height;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return base * height;
    }
    

}
