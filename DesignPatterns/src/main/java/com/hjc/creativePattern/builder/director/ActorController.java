package com.hjc.creativePattern.builder.director;

import com.hjc.creativePattern.builder.builder.ActorBuilder;
import com.hjc.creativePattern.builder.product.Actor;

/**
 * 角色创建器：指挥者
 */
public class ActorController {
    public Actor construct(ActorBuilder ab){
        Actor actor;
        //创建流程
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildCostume();
        actor=ab.createActor();
        return actor;
    }
}
