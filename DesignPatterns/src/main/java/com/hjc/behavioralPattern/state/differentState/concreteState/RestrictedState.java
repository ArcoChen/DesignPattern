package com.hjc.behavioralPattern.state.differentState.concreteState;

import com.hjc.behavioralPattern.state.differentState.state.AccountState;

/**
 * 受限状态：具体状态类
 */
public class RestrictedState extends AccountState {
    public RestrictedState(AccountState state){
        this.account=state.account;
    }

    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance()+amount);
        stateCheck();
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("账号受限制，取款失败");
    }

    @Override
    public void computeInterest() {
        System.out.println("计算利息！");
    }

    //状态转换
    @Override
    public void stateCheck() {
        if(account.getBalance()>0){
            account.setState(new NormalState(this));
        }else if(account.getBalance()>-2000){
            account.setState(new OverdraftState(this));
        }
    }
}
