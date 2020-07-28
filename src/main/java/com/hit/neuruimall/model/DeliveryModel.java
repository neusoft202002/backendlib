package com.hit.neuruimall.model;

import org.apache.ibatis.type.Alias;

@Alias("delivery")
public class DeliveryModel {

    private int deliveryId;
    private int orderId;
    private int userId;
    private String username;
    private int deliveryStatusId;
    private String deliveryStatusInfo;

    public int getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getDeliveryStatusId() {
        return deliveryStatusId;
    }

    public void setDeliveryStatusId(int deliveryStatusId) {
        this.deliveryStatusId = deliveryStatusId;
    }

    public String getDeliveryStatusInfo() {
        return deliveryStatusInfo;
    }

    public void setDeliveryStatusInfo(String deliveryStatusInfo) {
        this.deliveryStatusInfo = deliveryStatusInfo;
    }

    @Override
    public String toString() {
        return "DeliveryModel{" +
                "deliveryId=" + deliveryId +
                ", orderId=" + orderId +
                ", userId=" + userId +
                ", username='" + username + '\'' +
                ", deliveryStatusId=" + deliveryStatusId +
                ", deliveryStatusInfo='" + deliveryStatusInfo + '\'' +
                '}';
    }
}
