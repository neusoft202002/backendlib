package com.hit.neuruimall.model;

import org.apache.ibatis.type.Alias;

import java.util.List;

@Alias("order")
public class OrderModel {

    private int orderId;
    private int userId;
    private String username;
    private int allAccount;
    private int statusId;
    private String statusInfo;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public String getStatusInfo() {
        return statusInfo;
    }

    public void setStatusInfo(String statusInfo) {
        this.statusInfo = statusInfo;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAllAccount() {
        return allAccount;
    }

    public void setAllAccount(int allAccount) {
        this.allAccount = allAccount;
    }

    @Override
    public String toString() {
        return "OrderModel{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", username='" + username + '\'' +
                ", allAccount=" + allAccount +
                ", statusId=" + statusId +
                ", statusInfo='" + statusInfo + '\'' +
                '}';
    }
}
