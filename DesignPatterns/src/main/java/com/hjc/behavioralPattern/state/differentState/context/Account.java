package com.hjc.behavioralPattern.state.differentState.context;

import com.hjc.behavioralPattern.state.differentState.state.AccountState;
import com.hjc.behavioralPattern.state.differentState.concreteState.NormalState;

/**
 * 银行账户：环境类
 */
public class Account {
    //维持一个对抽象状态对象的引用
    private AccountState state;

    //开户名
    private String owner;

    //账户余额
    private double balance=0;

    public Account(String owner,double balance){
        this.owner=owner;
        this.balance=balance;
        //设置初始状态
        this.state=new NormalState(this);
    }

    public AccountState getState() {
        return state;
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //存款
    public void deposit(double amount){
        System.out.println(this.owner+"存款"+amount);
        //调整状态对象的deposit()方法
        state.deposit(amount);
        System.out.println("现在余额为："+this.balance);
        System.out.println("现在账户状态为："+this.state.getClass().getName());
        System.out.println("------------");
    }

    //取款
    public void withdraw(double amount){
        System.out.println(this.owner+"存款"+amount);
        //调整状态对象的deposit()方法
        state.withdraw(amount);
        System.out.println("现在余额为："+this.balance);
        System.out.println("现在账户状态为："+this.state.getClass().getName());
        System.out.println("------------");
    }

    //计算利息
    public void computeInterest(){
        //调用状态对象的computeInterest()方法
        state.computeInterest();
    }
}
