package com.youliang.model;

import java.io.Serializable;

/**
 * Created by youliang.cheng on 2017/12/25.
 */
public class Sender implements Serializable {

    private String sender;
    private String nickName;
    private String password;

    public Sender(String sender, String nickName, String password) {
        this.sender = sender;
        this.nickName = nickName;
        this.password = password;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "sender{" +
                "sender='" + sender + '\'' +
                ", nickName='" + nickName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
