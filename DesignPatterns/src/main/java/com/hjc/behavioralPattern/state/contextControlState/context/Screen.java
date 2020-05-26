package com.hjc.behavioralPattern.state.contextControlState.context;

import com.hjc.behavioralPattern.state.contextControlState.concreteState.LargerState;
import com.hjc.behavioralPattern.state.contextControlState.concreteState.LargestState;
import com.hjc.behavioralPattern.state.contextControlState.concreteState.NormalState;
import com.hjc.behavioralPattern.state.contextControlState.state.State;

public class Screen {
    //枚举所有状态，其中currentState为当前状态
    private State currentState,normalState,largerState,largestState;

    public Screen(){
        this.normalState = new NormalState(); //创建正常状态对象
        this.largerState = new LargerState(); //创建二倍放大状态对象
        this.largestState = new LargestState(); //创建四倍放大状态对象
        this.currentState = normalState; //设置初始状态
    }

    public void setState(State state){
        this.currentState=state;
    }

    //单击事件处理方法，封装了对状态中业务方法的调用和状态转换
    public void onClick(){
        if(this.currentState==normalState){
            this.setState(largerState);
            this.currentState.display();
        }else if(this.currentState==largerState){
            this.setState(largestState);
            this.currentState.display();
        }else if(this.currentState==largestState){
            this.setState(normalState);
            this.currentState.display();
        }
    }
}
