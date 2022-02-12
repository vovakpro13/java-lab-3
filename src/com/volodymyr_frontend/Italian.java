package com.volodymyr_frontend;

public class Italian extends Person {
    public boolean canCookePizza;
    private Cars car;

    {
        canCookePizza = false;
        car = null;
    }

    public Italian() {
        this(true);
    }

    public Italian(boolean canCookePizza) {
        this.canCookePizza = canCookePizza;
    }

    public Cars getCar() {
        return this.car;
    }

    public void printCar() {
        if (this.car == null) {
            System.out.println("Italian person hasn`t a car :(");

            return;
        }

        System.out.println("Italian person has a " + this.car);
    }

    private void sellMyCar() {
        if (this.car == null) {
            System.out.println("Car was not sold, because you haven`t a car :(");
            return;
        }

        System.out.println("Car " + this.car + " was sold !");

        this.car = null;
    }

    public void askToSellCar() {
        if (this.car != null) {
            double mood = Math.random();

            if (mood >= 0.5) {
                this.sellMyCar();
                return;
            }

            System.out.println("Person don`t wanna sell the car now :( mood is " + mood);
            return;
        }

        System.out.println("Person have not a car(");

    }

    protected void giftCar(Cars car) {
        this.car = car;
    }

    public void compareItaliansCars(Italian italian) {
        if (this.car == italian.car) {
            System.out.println("Cars are same");
        } else {
            System.out.println("Cars are different");
        }
    }

    @Override
    public void printCountryName() {
        System.out.println("Italia");
    }

    @Override
    public void speak() {
        System.out.println("Buona giornata!");
    }
}
