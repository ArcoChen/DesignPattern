package com.hjc.creativePattern.builder.ConcreteBuilder;

import com.hjc.creativePattern.builder.builder.ActorBuilder;

public class HeroBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("勇士");
    }

    @Override
    public void buildSex() {
        actor.setSex("男");
    }

    @Override
    public void buildFace() {
        actor.setFace("霸气");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("大锤");
    }
}
