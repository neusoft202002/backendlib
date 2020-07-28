package com.hit.neuruimall.model;

import org.apache.ibatis.type.Alias;

@Alias("product")
public class ProductModel {

    private int proId;
    private String proName;
    private String producer;
    private String proAddress;
    private StocksModel stocks;

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

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getProAddress() {
        return proAddress;
    }

    public void setProAddress(String proAddress) {
        this.proAddress = proAddress;
    }

    public StocksModel getStocks() {
        return stocks;
    }

    public void setStocks(StocksModel stocks) {
        this.stocks = stocks;
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "proId=" + proId +
                ", proName='" + proName + '\'' +
                ", producer='" + producer + '\'' +
                ", proAddress='" + proAddress + '\'' +
                ", stocks=" + stocks +
                '}';
    }
}
