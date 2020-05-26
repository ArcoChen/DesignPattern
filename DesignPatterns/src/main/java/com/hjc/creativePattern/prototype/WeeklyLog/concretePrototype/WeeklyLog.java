package com.hjc.creativePattern.prototype.WeeklyLog.concretePrototype;

/**
 * 工作周报
 */
public class WeeklyLog implements Cloneable{
    private String name;
    private String date;
    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public WeeklyLog clone(){
        Object obj=null;
        try {
            obj=super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制");
            return null;
        }
        return (WeeklyLog) obj;
    }
}
