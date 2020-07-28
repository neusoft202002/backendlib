package com.hit.neuruimall.model;

import org.apache.ibatis.type.Alias;

@Alias("cart")
public class CartModel {

    private int userId;
    private int proId;
    private String proName;
    private int amount;
    private int price;
    private int account;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "CartModel{" +
                "proId=" + proId +
                ", proName='" + proName + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                ", account=" + account +
                '}';
    }
}
