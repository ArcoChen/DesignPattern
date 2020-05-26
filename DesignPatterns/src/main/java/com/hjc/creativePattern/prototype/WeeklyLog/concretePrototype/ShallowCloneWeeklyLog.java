package com.hjc.creativePattern.prototype.WeeklyLog.concretePrototype;

public class ShallowCloneWeeklyLog implements Cloneable{
    private Attachment attachment;
    private String name;
    private String date;
    private String content;

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

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

    //使用clone()方法实现浅克隆
    public ShallowCloneWeeklyLog clone(){
        Object obj=null;
        try {
            obj=super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制");
            return null;
        }
        return (ShallowCloneWeeklyLog)obj;
    }
}
