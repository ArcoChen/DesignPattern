package com.hjc.behavioralPattern.state.differentState.concreteState;

import com.hjc.behavioralPattern.state.differentState.state.AccountState;

/**
 * 透支状态：具体状态类
 */
public class OverdraftState extends AccountState {
    public OverdraftState(AccountState state){
        this.account=state.account;
    }

    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        stateCheck();
    }

    @Override
    public void withdraw(double amount) {
        account.setBalance(account.getBalance() - amount);
        stateCheck();
    }

    @Override
    public void computeInterest() {
        System.out.println("计算利息！");
    }

    @Override
    public void stateCheck() {
        if(account.getBalance()>0){
            account.setState(new NormalState(this));
        }else if(account.getBalance()==-2000){
            account.setState(new OverdraftState(this));
        }else if(account.getBalance()<-2000){
            System.out.println("操作受限制");
        }
    }
}
