package com.hjc.creativePattern.builder.builder;

import com.hjc.creativePattern.builder.product.Actor;

/**
 * 角色建造器
 */
public abstract class ActorBuilder {
    protected Actor actor=new Actor();

    public abstract void buildType();
    public abstract void buildSex();
    public abstract void buildFace();
    public abstract void buildCostume();

    //工厂方法，返回一个完整的角色对象
    public Actor createActor(){
        return actor;
    }
}
