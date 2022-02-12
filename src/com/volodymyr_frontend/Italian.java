package com.volodymyr_frontend;

public class Italian extends Person{

    @Override
    public void printCountryName() {
        System.out.println("Italia");
    }

    @Override
    public void speak() {
        System.out.println("Buona giornata!");
    }
}
