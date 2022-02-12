package com.volodymyr_frontend;

public class Ukrainian extends Person {

    @Override
    public void printCountryName() {
        System.out.println("Україна");
    }

    @Override
    public void speak() {
        System.out.println("День добрий!");
    }
}
