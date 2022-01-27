package com.company;

public class Purchase extends Shop implements Out {



    @Override
    public int getInfo(){
        return getId();
    }




    public Purchase(int id, double number, double Price,double sum) {
        setId(id);
        setNumber(number);
        setPrice(Price);
        setSum(sum);
    }


    @Override
    public String out() {
        return ("Товар: " + getInfo() + ", Количество: " + getNumber() + ", Цена: " + getPrice() + ", Стоимость: " + getSum() + "\n");

    }
}
