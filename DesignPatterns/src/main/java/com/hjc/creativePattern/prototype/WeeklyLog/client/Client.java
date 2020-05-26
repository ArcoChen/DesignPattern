package com.hjc.creativePattern.prototype.WeeklyLog.client;

import com.hjc.creativePattern.prototype.WeeklyLog.concretePrototype.Attachment;
import com.hjc.creativePattern.prototype.WeeklyLog.concretePrototype.DeepCloneWeeklyLog;
import com.hjc.creativePattern.prototype.WeeklyLog.concretePrototype.ShallowCloneWeeklyLog;
import com.hjc.creativePattern.prototype.WeeklyLog.concretePrototype.WeeklyLog;

import java.io.IOException;

public class Client {
    public static void main(String[] args) {
        WeeklyLog log=new WeeklyLog();
        log.setName("Huang");
        log.setDate("第一周");
        log.setContent("加油！");

        System.out.println("*****周报*****");
        System.out.println("周次："+log.getDate());
        System.out.println("姓名："+log.getName());
        System.out.println("内容："+log.getContent());
        System.out.println("---------------");

        WeeklyLog log_new=log.clone();
        log_new.setDate("第二周");
        System.out.println("*****周报*****");
        System.out.println("周次："+log_new.getDate());
        System.out.println("姓名："+log_new.getName());
        System.out.println("内容："+log_new.getContent());
        System.out.println("---------------");

        System.out.println(log==log_new);
        System.out.println(log.getDate()==log_new.getDate());
        System.out.println(log.getName()==log_new.getName());
        System.out.println(log.getContent()==log_new.getContent());

        System.out.println("*******浅克隆********");
        ShallowCloneWeeklyLog shallowCloneWeeklyLog, shallowCloneWeeklyLog1;
        Attachment attachment=new Attachment();
        shallowCloneWeeklyLog =new ShallowCloneWeeklyLog();
        shallowCloneWeeklyLog.setAttachment(attachment);
        shallowCloneWeeklyLog1 = shallowCloneWeeklyLog.clone();
        System.out.println("周报是否相同："+(shallowCloneWeeklyLog == shallowCloneWeeklyLog1));
        System.out.println("附件是否相同："+(shallowCloneWeeklyLog.getAttachment()== shallowCloneWeeklyLog1.getAttachment()));

        System.out.println("*******深克隆********");
        DeepCloneWeeklyLog deepCloneWeeklyLog, deepCloneWeeklyLog1=null;
        Attachment attachment1=new Attachment();
        deepCloneWeeklyLog =new DeepCloneWeeklyLog();
        deepCloneWeeklyLog.setAttachment(attachment1);
        try {
            deepCloneWeeklyLog1 = deepCloneWeeklyLog.deepClone();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("周报是否相同："+(deepCloneWeeklyLog == deepCloneWeeklyLog1));
        System.out.println("附件是否相同："+(deepCloneWeeklyLog.getAttachment()== deepCloneWeeklyLog1.getAttachment()));

    }
}
