package com.company;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Dataprocessor<T extends Purchase> {
    private List<T> list;
    private int listSize;
    public Dataprocessor(int listSize) throws MyExeption {
        this.listSize = listSize;
        if (listSize < 0 ){
            throw new MyExeption("введите коректное значение длины листа");
        }
    }
    public List<T> searchList(List<T> purchase){
        return purchase.stream()
                .filter(item -> (item.getPrice() > 15 && item.getPrice() < 25))
                .collect(Collectors.toList());
    }
    public  List<T> sortList(List<T> purchase){
        return  purchase.stream()
                .sorted(Comparator.comparingDouble(Purchase::getPrice))
                .limit(listSize)
                .collect(Collectors.toList());
    }


}
