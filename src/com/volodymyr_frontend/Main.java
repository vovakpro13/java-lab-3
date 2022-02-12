package com.volodymyr_frontend;

public class Main {

    public static void main(String[] args) {
        Ukrainian volodka = new Ukrainian("Volodymyr");
        Italian adalberto = new Italian();

        volodka.printCountryName();
        volodka.speak();

        adalberto.printCountryName();
        adalberto.speak();

        System.out.println("\n\n");

        volodka.goToVacation("Egypt");
        volodka.goToWork(Works.McDonalds);
        volodka.goToVacation("Egypt");
        volodka.goToWork(Works.IT);

        System.out.println(volodka.name + " has " + volodka.getMoney() + " before Egypt vacation");

        volodka.goToVacation("Egypt");

        System.out.println(volodka.name + " has " + volodka.getMoney() + " after Egypt vacation");

        volodka.goToVacation("Maldives");

        System.out.println("\n\n");

        adalberto.printCar();
        adalberto.giftCar(Cars.Opel);
        adalberto.printCar();

        System.out.println("\n\n");

        Italian violleta = new Italian(true);
        violleta.askToSellCar();

        adalberto.compareItaliansCars(violleta);

        violleta.giftCar(Cars.Opel);
        adalberto.compareItaliansCars(violleta);

        adalberto.giftCar(Cars.Volvo);
        violleta.compareItaliansCars(adalberto);

        System.out.println("\n");

        violleta.askToSellCar();
        adalberto.askToSellCar();

        System.out.println("\n" + Ukrainian.SlavaUkraini);

    }
}
