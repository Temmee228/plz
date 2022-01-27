package com.company;

public class MyExeption extends Exception{
    private String error777;

    public MyExeption(String error777){
        this.error777 = error777;
    }
    public String getErrorMessage(){
        return error777;
    }
}
