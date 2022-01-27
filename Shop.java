package com.company;

public abstract class Shop implements Out {
    private int id;
    private double number;
    private double price;
    private double sum;

    public int getId(){
        return id;
    }

    public double getNumber(){
        return number;
    }

    public double getPrice() { return price; }

    public double getSum() { return sum; }




    public void setId(int id){
        this.id = id;
    }

    public void setNumber(double number){
        this.number = number;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSum(double sum){
        this.sum = sum;
    }

    public abstract int getInfo();
}
