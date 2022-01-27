package com.company;

public class Seller implements Out {
    private String name;

    public Seller (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String out() {

        return ("Продавец: " + name + "\n");
    }
}
