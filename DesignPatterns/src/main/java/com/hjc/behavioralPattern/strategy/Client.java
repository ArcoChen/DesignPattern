package com.hjc.behavioralPattern.strategy;

import com.hjc.behavioralPattern.strategy.concreteStrategy.StudentDiscount;
import com.hjc.behavioralPattern.strategy.concreteStrategy.VIPDiscount;
import com.hjc.behavioralPattern.strategy.context.MovieTicket;
import com.hjc.behavioralPattern.strategy.strategy.Discount;

public class Client {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        double price = 60.0;

        ticket.setPrice(price);
        System.out.println("原始票价为：" + price);
        System.out.println("----------------------");

        Discount discount;
        discount=new StudentDiscount();
        ticket.setDiscount(discount);
        System.out.println(ticket.getPrice());

        discount=new VIPDiscount();
        ticket.setDiscount(discount);
        System.out.println(ticket.getPrice());
    }
}
