package com.xfiler.fudoo.model;

/**
 * Created by Administrator on 2015/5/17.
 */
public class Content {
    private String accountName;
    private String contentSource;
    private String contentTime;
    private String conentText;
    private String contentImage;
    private int forward;
    private int comment;

    public Content() {
    }

    public Content(String accountName, String contentSource, String contentTime, String conentText, String contentImage, int forward, int comment) {
        this.accountName = accountName;
        this.contentSource = contentSource;
        this.contentTime = contentTime;
        this.conentText = conentText;
        this.contentImage = contentImage;
        this.forward = forward;
        this.comment = comment;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getComment() {
        return comment;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }

    public String getContentSource() {
        return contentSource;
    }

    public void setContentSource(String contentSource) {
        this.contentSource = contentSource;
    }

    public String getContentTime() {
        return contentTime;
    }

    public void setContentTime(String contentTime) {
        this.contentTime = contentTime;
    }

    public String getConentText() {
        return conentText;
    }

    public void setConentText(String conentText) {
        this.conentText = conentText;
    }

    public String getContentImage() {
        return contentImage;
    }

    public void setContentImage(String contentImage) {
        this.contentImage = contentImage;
    }

    public int getForward() {
        return forward;
    }

    public void setForward(int forward) {
        this.forward = forward;
    }
}
