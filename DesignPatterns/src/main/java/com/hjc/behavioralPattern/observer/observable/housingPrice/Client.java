package com.hjc.behavioralPattern.observer.observable.housingPrice;

public class Client {
    public static void main(String[] args) {
        House house=new House(1000);

        HousePriceObserver a=new HousePriceObserver("A");
        HousePriceObserver b=new HousePriceObserver("B");
        HousePriceObserver c=new HousePriceObserver("C");

        house.addObserver(a);
        house.addObserver(b);
        house.addObserver(c);

        house.setPrice(1000);
        System.out.println("-------");
        house.setPrice(3000);
    }
}
