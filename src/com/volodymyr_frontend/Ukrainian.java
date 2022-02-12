package com.volodymyr_frontend;

public class Ukrainian extends Person {
    public static final String SlavaUkraini = "Geroyam Slava!";
    public String name;
    protected String favoriteDish;
    private int money;

    {
        name = "name";
        favoriteDish = "";
        money = 0;
    }

    public Ukrainian() {
        this("Petro", "Borsch");
    }

    public Ukrainian(String name) {
        this.name = name;

    }

    public Ukrainian(String name, String favoriteDish) {
        this.name = name;
        this.favoriteDish = favoriteDish;
    }

    private void setMoney(int amount) {
        this.money += amount;

        if (amount > 0) {
            System.out.println(this.name + " got $" + amount);
            return;
        }

        System.out.println(this.name + " spent $" + amount);
    }

    public String getMoney() {
        return "$" + this.money;
    }

    public void goToWork(Works workType) {
        System.out.println(this.name + " is working for " + workType);

        switch (workType) {
            case IT -> {
                this.setMoney(3000);
            }

            case Teacher -> {
                this.setMoney(400);
            }

            case McDonalds -> {
                this.setMoney(600);
            }

        }
    }

    protected void goToVacation(String country) {
        if (this.money >= 1000) {
            this.setMoney(-1000);

            System.out.println(this.name + " is relaxing at " + country);

            return;
        }

        System.out.println("Sorry, but you need more than $1000 for vacation :(");
    }

    @Override
    public void printCountryName() {
        System.out.println("Україна");
    }

    @Override
    public void speak() {
        System.out.println("День добрий!");
    }
}
