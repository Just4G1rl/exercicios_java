package service;

import java.util.ArrayList;
import java.util.List;

public class PrintService {
    private List<Integer> valueList = new ArrayList<>();

    public PrintService(){

    }
    
    public void addValue(int value){
        valueList.add(value);
    }

    public int fist(){
        if(valueList.isEmpty()){
            throw new IllegalStateException("LIst is empty.");
        }
        return valueList.getFirst();
    }

    public void print(){
        System.out.print("[");
        if(!valueList.isEmpty()){
            System.out.print(valueList.getFirst());
        }
        for(int i = 1; i < valueList.size(); i++){
            System.out.print(" ," + valueList.get(i));
        }
         System.out.println("]");
    }    
}
