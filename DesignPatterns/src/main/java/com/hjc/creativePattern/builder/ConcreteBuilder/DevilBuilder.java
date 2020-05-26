package com.hjc.creativePattern.builder.ConcreteBuilder;

import com.hjc.creativePattern.builder.builder.ActorBuilder;

public class DevilBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("恶魔");
    }

    @Override
    public void buildSex() {
        actor.setSex("男");
    }

    @Override
    public void buildFace() {
        actor.setFace("邪气");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("法杖");
    }
}
