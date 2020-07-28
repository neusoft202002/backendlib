package com.hit.neuruimall.model;

import org.apache.ibatis.type.Alias;

@Alias("orderItem")
public class OrderItemModel {

    private int userId;
    private String username;
    private int proId;
    private String proName;
    private int price;
    private int amount;
    private int account;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getProId() {
        return proId;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "OrderItemModel{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", proId=" + proId +
                ", proName='" + proName + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", account=" + account +
                '}';
    }
}
