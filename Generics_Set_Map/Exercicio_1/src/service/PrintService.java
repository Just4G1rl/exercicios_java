package service;

import java.util.ArrayList;
import java.util.List;

//Quando usamos NomeDaClasse<T> estamos sinalizando que qualquer tipo de
//Objeto pode ser usado  
public class PrintService<T> {
    private List<T> valueList = new ArrayList<>();

    public PrintService(){

    }
    
    public void addValue(T value){
        valueList.add(value);
    }

    public T fist(){
        if(valueList.isEmpty()){
            throw new IllegalStateException("List is empty.");
        }
        return valueList.getFirst();
    }

    public void print(){
        System.out.print("[");
        if(!valueList.isEmpty()){
            System.out.print(valueList.getFirst());
        }
        for(int i = 1; i < valueList.size(); i++){
            System.out.print(", " + valueList.get(i));
        }
         System.out.println("]");
    }    
}
