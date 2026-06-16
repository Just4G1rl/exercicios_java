package aplication;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Retangle;
import entities.Shape;

public class App {
    public static void main(String[] args) {
        List<Shape> listShape = new ArrayList<>();

        listShape.add(new Circle(2.0));
        listShape.add(new Retangle(4.0, 2.69));
        System.out.println(totalArea(listShape));

        List<Circle> listCircles = new ArrayList<>();
        
        listCircles.add(new Circle(5.0));
        listCircles.add(new Circle(8.58));
        System.out.println(totalArea(listCircles));

    }
    // ? extends Shape significa que o metodo coringa reconhecerá qualquer subclasse do objeto herdado
    public static double totalArea(List<? extends Shape> list){
        double sum = 0;
        for(Shape s: list){
            sum += s.area(); 
        }
        return sum;
    }
}
