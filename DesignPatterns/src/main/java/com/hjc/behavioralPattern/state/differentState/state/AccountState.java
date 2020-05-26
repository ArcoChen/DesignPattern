package com.hjc.behavioralPattern.state.differentState.state;

import com.hjc.behavioralPattern.state.differentState.context.Account;

public abstract class AccountState {
    public Account account;

    //存款
    public abstract void deposit(double amount);

    //取款
    public abstract void withdraw(double amount);

    //计算利息
    public abstract void computeInterest();

    //状态转换
    public abstract void stateCheck();

}
