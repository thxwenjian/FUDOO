package com.xfiler.fudoo.model;

/**
 * Created by Administrator on 2015/5/17.
 */
public class Account {
    private String name;
    private String sex;
    private int age;
    private String address;
    private String school;
    private int contentTotal;//微博文本数目
    private int messageTotal;//消息 ：大于0 则有未读消息，并显示未读消息数
    private int followTotal;//关注数
    private int fenceTotal;//粉丝数
    private int followClassify;//关注类别 外键？
    private int contentClassify;//文本类别：1原创 2转发 2原创带图

    public Account() {
    }

    public Account(String name, int contentClassify, String sex, int age, String address, String school, int contentTotal, int messageTotal, int followTotal, int fenceTotal, int followClassify) {
        this.name = name;
        this.contentClassify = contentClassify;
        this.sex = sex;
        this.age = age;
        this.address = address;
        this.school = school;
        this.contentTotal = contentTotal;
        this.messageTotal = messageTotal;
        this.followTotal = followTotal;
        this.fenceTotal = fenceTotal;
        this.followClassify = followClassify;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getContentTotal() {
        return contentTotal;
    }

    public void setContentTotal(int contentTotal) {
        this.contentTotal = contentTotal;
    }

    public int getMessageTotal() {
        return messageTotal;
    }

    public void setMessageTotal(int messageTotal) {
        this.messageTotal = messageTotal;
    }

    public int getFollowTotal() {
        return followTotal;
    }

    public void setFollowTotal(int followTotal) {
        this.followTotal = followTotal;
    }

    public int getFenceTotal() {
        return fenceTotal;
    }

    public void setFenceTotal(int fenceTotal) {
        this.fenceTotal = fenceTotal;
    }

    public int getFollowClassify() {
        return followClassify;
    }

    public void setFollowClassify(int followClassify) {
        this.followClassify = followClassify;
    }

    public int getContentClassify() {
        return contentClassify;
    }

    public void setContentClassify(int contentClassify) {
        this.contentClassify = contentClassify;
    }
}
