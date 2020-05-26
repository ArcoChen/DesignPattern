package com.hjc.structuralPattern.adapter.twoWay;

public class Adapter implements ICat,IDog {
    ICat cat=null;
    IDog dog=null;

    public Adapter(ICat cat){
        this.cat=cat;
    }

    public Adapter(IDog dog){
        this.dog=dog;
    }

    @Override
    public void catLooks() {
        dog.dogLooks();
    }

    @Override
    public void catSkill() {
        dog.dogKill();
    }

    @Override
    public void dogLooks() {
        cat.catLooks();
    }

    @Override
    public void dogKill() {
        cat.catSkill();
    }
}
