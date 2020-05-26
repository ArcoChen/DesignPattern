package com.hjc.creativePattern.builder;

import com.hjc.creativePattern.builder.builder.ActorBuilder;
import com.hjc.creativePattern.builder.director.ActorController;
import com.hjc.creativePattern.builder.ConcreteBuilder.HeroBuilder;
import com.hjc.creativePattern.builder.product.Actor;

public class Client {
    public static void main(String[] args) {
        //创建指挥者对象
        ActorController actorController=new ActorController();
        //创建建造者对象
        ActorBuilder ab=new HeroBuilder();
        //通过指挥者指挥建造者获取产品对象
        Actor actor=actorController.construct(ab);

        System.out.println(actor.getType());
        System.out.println(actor.getSex());
        System.out.println(actor.getFace());
        System.out.println(actor.getCostume());
    }
}
