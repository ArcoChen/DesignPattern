package com.hjc.structuralPattern.adapter.twoWay;

public class Client {
    public static void main(String[] args) {
        ICat fakerCat=new Adapter(new MyDog());
        IDog fakerDog=new Adapter(new MyCat());

        fakerCat.catLooks();
        fakerCat.catSkill();
        System.out.println("***********");
        fakerDog.dogLooks();
        fakerDog.dogKill();
    }
}
