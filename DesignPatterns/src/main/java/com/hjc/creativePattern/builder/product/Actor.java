package com.hjc.creativePattern.builder.product;

/**
 * 角色类
 */
public class Actor {
    //角色类型
    private String type;
    //角色性别
    private String sex;
    //角色脸型
    private String face;
    //角色服饰
    private String costume;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getCostume() {
        return costume;
    }

    public void setCostume(String costume) {
        this.costume = costume;
    }
}
