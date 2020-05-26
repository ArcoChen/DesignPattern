package com.hjc.creativePattern.builder.builder;

import com.hjc.creativePattern.builder.product.Actor;

/**
 * 将指挥者和抽象建造者合并，在Builder中提供逐步构建复杂产品对象的construct()方法
 */
public abstract class ComboActorBuilder {
    protected static Actor actor=new Actor();

    public abstract void buildType();
    public abstract void buildSex();
    public abstract void buildFace();
    public abstract void buildCostume();

    public static Actor construct(ComboActorBuilder ab){
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildCostume();
        return actor;
    }
}
