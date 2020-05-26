package com.hjc.behavioralPattern.state.differentState.concreteState;

import com.hjc.behavioralPattern.state.differentState.context.Account;
import com.hjc.behavioralPattern.state.differentState.state.AccountState;

/**
 * 正常状态：具体状态类
 */
public class NormalState extends AccountState {
    public NormalState(Account account) {
        this.account = account;
    }

    public NormalState(AccountState state) {
        this.account = state.account;
    }

    @Override
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
        System.out.println("账户处于正常状态，无需支付利息！");
    }

    @Override
    public void stateCheck() {
        if (account.getBalance() > -2000 && account.getBalance() <= 0){
            account.setState(new OverdraftState(this));
        }else if(account.getBalance()==-2000){
            account.setState((new RestrictedState(this)));
        }else if(account.getBalance()<-2000){
            System.out.println("操作受限制！");
        }
    }
}
