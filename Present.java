package com.company;

public class Present implements Out {



    private int id;
    private double number ;

    public int getId(){
        return id;
    }

    public double getNumber(){
        return number;
    }

    @Override
    public String out() {
        return ("Подарок: " + id + " Количество: " + number + "\n");
    }

    public Present(int id, double number){
        this.id = id;
        this.number = number;
    }


}
