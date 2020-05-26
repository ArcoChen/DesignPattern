package com.hjc.creativePattern.builder.ConcreteBuilder;

import com.hjc.creativePattern.builder.builder.ActorBuilder;

public class AngelBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("奶妈");
    }

    @Override
    public void buildSex() {
        actor.setSex("女");
    }

    @Override
    public void buildFace() {
        actor.setFace("可爱");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("咖啡");
    }
}
