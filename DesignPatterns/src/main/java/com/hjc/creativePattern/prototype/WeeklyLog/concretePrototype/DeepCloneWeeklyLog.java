package com.hjc.creativePattern.prototype.WeeklyLog.concretePrototype;

import java.io.*;

public class DeepCloneWeeklyLog implements Serializable {
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

    //对象需要实现Serializable接口，然后把对象（实际上只是对象的一个拷贝）写到一个流里，再从流里读出来，便可以重建对象。
    public DeepCloneWeeklyLog deepClone() throws IOException,ClassNotFoundException {
        //将对象写入流中
        ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(byteArrayOutputStream);
        oos.writeObject(this);

        //从流中读取
        ByteArrayInputStream bis=new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream ois=new ObjectInputStream(bis);
        return (DeepCloneWeeklyLog)ois.readObject();
    }
}
