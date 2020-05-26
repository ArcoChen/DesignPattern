package com.hjc.creativePattern.prototype.WeeklyLog.concretePrototype;

import java.io.Serializable;

/**
 * 附件类
 */
public class Attachment implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void download(){
        System.out.println("下载附件，文件名为："+name);
    }
}
