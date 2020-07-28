package com.hit.neuruimall.model;

import org.apache.ibatis.type.Alias;

@Alias("stocks")
public class StocksModel {

    private int proId;
    private int quantity;
    private String warehouse;

    public int getProId() {
        return proId;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public String toString() {
        return "StocksModel{" +
                "proId=" + proId +
                ", quantity=" + quantity +
                ", warehouse='" + warehouse + '\'' +
                '}';
    }
}
