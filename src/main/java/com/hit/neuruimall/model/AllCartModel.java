package com.hit.neuruimall.model;

import org.apache.ibatis.type.Alias;

@Alias("allCart")
public class AllCartModel {

    private int userId;
    private String userName;
    private int account;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "AllCartModel{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", account=" + account +
                '}';
    }
}
